package org.chy.anubis.treasury.testcase.leetcode.reverse_integer.template.case02;

import org.chy.anubis.treasury.Exector;
import org.chy.anubis.treasury.log.Logger;
import org.chy.anubis.treasury.testcase.leetcode.reverse_integer.Algorithm;
import org.chy.anubis.treasury.utils.AssertUtils;

public class TestCase implements Exector<Algorithm> {

    @Override
    public void run(Algorithm algorithm) {
        int num = 8;

        Logger.info("[整数翻转] 测试数为:" + num);
        int result = algorithm.reverse(num);
        AssertUtils.assertInt(result, 8);


        Logger.info("");

        num = -3;
        Logger.info("[整数翻转] 测试数为:" + num);
        result = algorithm.reverse(num);
        AssertUtils.assertInt(result, -3);
    }
}
