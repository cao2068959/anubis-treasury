package org.chy.anubis.treasury.testcase.leetcode.sudoku_solver.template.case01;

import org.chy.anubis.treasury.Exector;
import org.chy.anubis.treasury.log.Logger;
import org.chy.anubis.treasury.testcase.leetcode.sudoku_solver.Algorithm;
import org.chy.anubis.treasury.utils.AssertUtils;
import org.chy.anubis.treasury.utils.TableUtils;

public class TestCase implements Exector<Algorithm> {

    @Override
    public void run(Algorithm algorithm) {
        char[][] board = {
                {'5','3','.','.','7','.','.','.','.'},
                {'6','.','.','1','9','5','.','.','.'},
                {'.','9','8','.','.','.','.','6','.'},
                {'8','.','.','.','6','.','.','.','3'},
                {'4','.','.','8','.','3','.','.','1'},
                {'7','.','.','.','2','.','.','.','6'},
                {'.','6','.','.','.','.','2','8','.'},
                {'.','.','.','4','1','9','.','.','5'},
                {'.','.','.','.','8','.','.','7','9'}};

        Logger.info(" 对应的数独为:");
        Logger.info(TableUtils.gen9Table(board, '.'));
        algorithm.solveSudoku(board);
        TableUtils.checkSudoku(board);
        Logger.info("");
    }
}
