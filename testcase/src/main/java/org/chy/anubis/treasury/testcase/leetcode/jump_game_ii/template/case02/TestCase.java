package org.chy.anubis.treasury.testcase.leetcode.jump_game_ii.template.case02;

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
        int[] data = {10, 3, 1, 1, 4};
        Logger.info("{跳跃游戏} 跳跃的数组为: [" + ArrayUtils.toString(data) + "]");
        int result = algorithm.jump(data);
        AssertUtils.assertInt(result, 1);
    }

}
