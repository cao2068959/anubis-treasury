package org.chy.anubis.treasury.testcase.leetcode.string_to_integer_atoi.template.case02;

import org.chy.anubis.treasury.Exector;
import org.chy.anubis.treasury.log.Logger;
import org.chy.anubis.treasury.testcase.leetcode.string_to_integer_atoi.Algorithm;
import org.chy.anubis.treasury.utils.AssertUtils;

public class TestCase implements Exector<Algorithm> {

    @Override
    public void run(Algorithm algorithm) {
        String num = "      1234 frfgrehyh";

        Logger.info("[string转int] 测试数据为:" + num);
        int result = algorithm.myAtoi(num);
        AssertUtils.assertInt(result, 1234);


        Logger.info("");

        num = "  +-+-5456";
        Logger.info("[整数翻转] 测试数为:" + num);
        result = algorithm.myAtoi(num);
        AssertUtils.assertInt(result, 0);

        Logger.info("");

        num = "frfr 54 gtgtgt 56";
        Logger.info("[整数翻转] 测试数为:" + num);
        result = algorithm.myAtoi(num);
        AssertUtils.assertInt(result, 0);

        Logger.info("");

        num = "  +45465+oofjdkfk";
        Logger.info("[整数翻转] 测试数为:" + num);
        result = algorithm.myAtoi(num);
        AssertUtils.assertInt(result, 45465);



    }
}
