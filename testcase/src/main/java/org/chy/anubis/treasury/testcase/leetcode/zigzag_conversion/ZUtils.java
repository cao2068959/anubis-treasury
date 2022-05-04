package org.chy.anubis.treasury.testcase.leetcode.zigzag_conversion;

import org.chy.anubis.treasury.log.Logger;

public class ZUtils {

    /**
     * Z行 打印
     *
     * @param s
     * @param numRows
     * @return
     */
    public static void zPrint(String s, int numRows) {
        if (numRows == 1) {
            Logger.info(s);
            return;
        }
        StringBuilder[] sbs = new StringBuilder[numRows];

        int index = 0;
        int unit = 1;

        for (char c : s.toCharArray()) {
            StringBuilder sb = sbs[index];
            if (sb == null) {
                sb = new StringBuilder();
                sbs[index] = sb;
            }


            sb.append(c).append(" ");
            if (index != 0 && index != numRows - 1 && unit < 0) {
                addBlank(sbs, sb);
            }

            index = index + unit;
            //触碰到上边界了, 开始减
            if (index >= numRows) {
                unit = -1;
                index = index + unit + unit;
                //addBlank(sbs, sb);
                continue;
            }
            //触碰到下边界了
            if (index < 0) {
                unit = 1;
                index = index + unit + unit;
                continue;
            }
        }
        for (StringBuilder sb : sbs) {
            if (sb == null) {
                continue;
            }
            Logger.info(sb.toString());
        }
    }

    private static void addBlank(StringBuilder[] sbs, StringBuilder sb) {
        for (StringBuilder stringBuilder : sbs) {
            if (stringBuilder == sb) {
                continue;
            }
            stringBuilder.append("  ");
        }
    }

}
