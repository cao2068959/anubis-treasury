package org.chy.anubis.treasury.testcase.leetcode.string_to_integer_atoi.template.case03;

import org.chy.anubis.treasury.Exector;
import org.chy.anubis.treasury.log.Logger;
import org.chy.anubis.treasury.testcase.leetcode.string_to_integer_atoi.Algorithm;
import org.chy.anubis.treasury.utils.AssertUtils;

public class TestCase implements Exector<Algorithm> {

    @Override
    public void run(Algorithm algorithm) {
        String num = "9541534236469";

        Logger.info("[string转int] 测试数据为:" + num);
        int result = algorithm.myAtoi(num);
        AssertUtils.assertInt(result, Integer.MAX_VALUE);


        Logger.info("");

        num = "-934314748364823";
        Logger.info("[整数翻转] 测试数为:" + num);
        result = algorithm.myAtoi(num);
        AssertUtils.assertInt(result, Integer.MIN_VALUE);


    }
}
