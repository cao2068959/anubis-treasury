package org.chy.anubis.treasury.testcase.leetcode.reverse_integer.template.case01;

import org.chy.anubis.treasury.Exector;
import org.chy.anubis.treasury.log.Logger;
import org.chy.anubis.treasury.testcase.leetcode.reverse_integer.Algorithm;
import org.chy.anubis.treasury.utils.ArrayUtils;
import org.chy.anubis.treasury.utils.AssertUtils;

public class TestCase implements Exector<Algorithm> {

    @Override
    public void run(Algorithm algorithm) {
        int num = 1234567;

        Logger.info("[整数翻转] 测试数为:" + num);
        int result = algorithm.reverse(num);
        AssertUtils.assertInt(result, 7654321);

        Logger.info("");

        num = -1234567;
        Logger.info("[整数翻转] 测试数为:" + num);
        result = algorithm.reverse(num);
        AssertUtils.assertInt(result, -7654321);
    }
}
