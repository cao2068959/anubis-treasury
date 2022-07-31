package org.chy.anubis.treasury.utils;

import org.chy.anubis.treasury.log.Logger;

import java.util.HashSet;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;

public class TableUtils {


    /**
     * 生成一个表格
     *
     * @param row     表格的行
     * @param column  表格的列
     * @param dataFun 表格数据源, 函数中的 参数1: 行 参数2: 列 返回: 对应的数据
     * @param minWith 最小的宽度
     * @return
     */
    public static String genTable(int row, int column, int minWith, BiFunction<Integer, Integer, String> dataFun) {
        String[][] data = new String[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                String realData = dataFun.apply(i, j);
                data[i][j] = realData;
                if (realData == null) {
                    continue;
                }
                int length = realData.length();
                if (length > minWith) {
                    minWith = length;
                }
            }
        }
        int with = minWith;
        String top = genRow("┏", count -> line(with, "━"), "┳", "┓", column);
        StringBuilder result = new StringBuilder(top);

        for (int i = 0; i < row; i++) {
            String[] rowData = data[i];
            String dataLine = genRow("┃", count -> {
                String cellData = rowData[count];
                return " " + getText(cellData, with) + " ";
            }, "│", "┃", column);
            result.append("\n").append(dataLine);

            // 最后一行
            if (i == row - 1) {
                String s = genRow("┗", count -> line(with, "━"), "┻", "┛", column);
                result.append("\n").append(s);
            } else {
                String s = genRow("┣", count -> line(with, "━"), "╋", "┫", column);
                result.append("\n").append(s);
            }
        }

        return result.toString();
    }

    public static String gen9Table(int minWith, BiFunction<Integer, Integer, String> dataFun) {
        return gen9Table(minWith, dataFun, null);
    }

    /**
     * 九宫格生成
     *
     * @param minWith
     * @param dataFun
     * @return
     */
    public static String gen9Table(int minWith, BiFunction<Integer, Integer, String> dataFun, TableItemHandle tableItemHandle) {
        String[][] data = new String[9][9];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                String realData = dataFun.apply(i, j);
                data[i][j] = realData;
                if (realData == null) {
                    continue;
                }
                int length = realData.length();
                if (length > minWith) {
                    minWith = length;
                }
            }
        }
        int with = minWith;
        String top = gen9Row("┏", count -> line(with, "━"), "┯", "┳", "┓");
        StringBuilder result = new StringBuilder(top);
        for (int i = 0; i < 9; i++) {
            String[] rowData = data[i];
            int finalI = i;
            String dataLine = gen9Row("┃", count -> {
                String cellData = rowData[count];
                String text = " " + getText(cellData, with) + " ";
                if (tableItemHandle != null) {
                    text = tableItemHandle.run(count, finalI, text);
                }
                return text;
            }, "┊", "┃", "┃");
            result.append("\n").append(dataLine);

            // 最后一行
            if (i == 8) {
                String s = gen9Row("┗", count -> line(with, "━"), "┷", "┻", "┛");
                result.append("\n").append(s);
            } else {
                String fill = (i + 1) % 3 == 0 ? "━" : "┄";
                String fill2 = (i + 1) % 3 == 0 ? "┿" : "┼";

                String s = gen9Row("┣", count -> line(with, fill), fill2, "╋", "┫");
                result.append("\n").append(s);
            }
        }

        return result.toString();
    }


    public static String gen9Table(char[][] datas, char nullChar) {
        return gen9Table(1, (x, y) -> {
            char datum = datas[x][y];
            if (datum == nullChar) {
                return "";
            }
            return datum + "";
        });
    }

    public static void main(String[] args) {
        String s = gen9Table(1, (row, colunm) -> {
            return row * colunm * colunm + "";
        });
        System.out.println(s);
    }

    private static String getText(String data, int with) {
        if (data == null) {
            return blank(with);
        }
        int fixCount = with - data.length();
        return data + blank(fixCount);
    }

    private static String blank(int count) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < count; i++) {
            result.append(" ");
        }
        return result.toString();
    }

    private static String line(int with, String value) {
        StringBuilder result = new StringBuilder("");
        with = with + 2;
        for (int i = 0; i < with; i++) {
            result.append(value);
        }
        return result.toString();
    }

    private static String genRow(String start, Function<Integer, String> fill, String itemEnd, String allEnd, int count) {
        StringBuilder result = new StringBuilder(start);
        for (int i = 0; i < count; i++) {
            String fillData = fill.apply(i);
            result.append(fillData);
            // 最后一个
            if (count - 1 == i) {
                result.append(allEnd);
            } else {
                result.append(itemEnd);
            }
        }
        return result.toString();
    }


    private static String gen9Row(String start, Function<Integer, String> fill, String itemEnd, String itemEnd3, String end) {
        StringBuilder result = new StringBuilder(start);
        for (int i = 0; i < 9; i++) {
            String fillData = fill.apply(i);
            result.append(fillData);

            if (i == 8) {
                result.append(end);
                continue;
            }

            if ((i + 1) % 3 == 0) {
                result.append(itemEnd3);
            } else {
                result.append(itemEnd);
            }

        }
        return result.toString();
    }


    public static void checkSudoku(char[][] board) {
        Set<String> validSudoku = isValidSudoku(board);
        Logger.info(" 生成的数独为:");

        String sudoku = gen9Table(1, (y, x) -> {
            char datum = board[y][x];
            String result = datum + "";
            return result;
        }, (x, y, value) -> {
            if (validSudoku.contains(x + "-" + y)) {
                return font(value, 31);
            }
            return value;
        });
        System.out.println(sudoku);

        if (!validSudoku.isEmpty()) {
            Logger.error("生成的数独不正确", true);
        }

    }

    public static Set<String> isValidSudoku(char[][] board) {
        String[][] row = new String[9][10];
        String[][] colunm = new String[9][10];
        String[][] block = new String[9][10];
        Set<String> result = new HashSet<>();
        for (int i = 0; i < board.length; i++) {
            char[] lineData = board[i];
            String[] lineRows = row[i];

            int yBlock = i / 3;
            for (int j = 0; j < lineData.length; j++) {
                char data = lineData[j];
                int dataInt = data - '0';
                if (!(dataInt >= 1 && dataInt <= 9)) {
                    result.add(j + "-" + i);
                }

                int xBlock = j / 3;
                isInArray(dataInt, j, i, result, lineRows);
                isInArray(dataInt, j, i, result, colunm[j]);
                isInArray(dataInt, j, i, result, block[xBlock + yBlock * 3]);
            }
        }
        return result;
    }

    private static boolean isInArray(int value, int x, int y, Set<String> result, String[] array) {
        String oldValue = array[value];
        if (oldValue != null) {
            result.add(oldValue);
            return false;
        }
        array[value] = x + "-" + y;
        return true;
    }

    private static String font(String content, int color) {
        StringBuilder result = new StringBuilder("\033[");
        result.append(color).append(";2m").append(content).append("\033[0m");
        return result.toString();
    }

    static class Coordinate {
        public int x;
        public int y;

        public Coordinate(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public interface TableItemHandle {
        public String run(int x, int y, String value);
    }


}
