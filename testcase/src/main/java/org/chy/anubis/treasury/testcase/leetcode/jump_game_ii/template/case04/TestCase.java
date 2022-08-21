package org.chy.anubis.treasury.testcase.leetcode.jump_game_ii.template.case04;

import org.chy.anubis.treasury.Exector;
import org.chy.anubis.treasury.log.Logger;
import org.chy.anubis.treasury.testcase.leetcode.jump_game_ii.Algorithm;
import org.chy.anubis.treasury.utils.ArrayUtils;
import org.chy.anubis.treasury.utils.AssertUtils;


public class TestCase implements Exector<Algorithm> {

    @Override
    public void run(Algorithm algorithm) {

        int[] data = {5, 9, 3, 2, 1, 0, 2, 3, 3, 1, 0, 0};
        Logger.info("{跳跃游戏} 跳跃的数组为: [" + ArrayUtils.toString(data) + "]");
        int result = algorithm.jump(data);
        AssertUtils.assertInt(result, 3);


    }

}
