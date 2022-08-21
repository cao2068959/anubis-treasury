package org.chy.anubis.treasury.testcase.leetcode.jump_game_ii.template.case03;

import org.chy.anubis.treasury.Exector;
import org.chy.anubis.treasury.log.Logger;
import org.chy.anubis.treasury.testcase.leetcode.jump_game_ii.Algorithm;
import org.chy.anubis.treasury.utils.ArrayUtils;
import org.chy.anubis.treasury.utils.AssertUtils;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class TestCase implements Exector<Algorithm> {

    @Override
    public void run(Algorithm algorithm) {
        {
            int[] data = {0};
            Logger.info("{跳跃游戏} 跳跃的数组为: [" + ArrayUtils.toString(data) + "]");
            int result = algorithm.jump(data);
            AssertUtils.assertInt(result, 0);
        }

        Logger.info("");

        {
            int[] data = {1};
            Logger.info("{跳跃游戏} 跳跃的数组为: [" + ArrayUtils.toString(data) + "]");
            int result = algorithm.jump(data);
            AssertUtils.assertInt(result, 0);
        }
    }

}
