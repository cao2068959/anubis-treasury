package org.chy.anubis.treasury.testcase.leetcode.integer_to_roman.template.case03;

import org.chy.anubis.treasury.Exector;
import org.chy.anubis.treasury.log.Logger;
import org.chy.anubis.treasury.testcase.leetcode.integer_to_roman.Algorithm;
import org.chy.anubis.treasury.utils.AssertUtils;


public class TestCase implements Exector<Algorithm> {

    @Override
    public void run(Algorithm algorithm) {
        {
            int data = 1994;
            Logger.info("[整数转罗马数]测试字符串为: [" + data + "]");
            String result = algorithm.intToRoman(data);
            AssertUtils.assertString(result, "MCMXCIV");
        }

        {
            int data = 1765;
            Logger.info("[整数转罗马数]测试字符串为: [" + data + "]");
            String result = algorithm.intToRoman(data);
            AssertUtils.assertString(result, "MDCCLXV");
        }

        {
            int data = 3278;
            Logger.info("[整数转罗马数]测试字符串为: [" + data + "]");
            String result = algorithm.intToRoman(data);
            AssertUtils.assertString(result, "MMMCCLXXVIII");
        }

        {
            int data = 1211;
            Logger.info("[整数转罗马数]测试字符串为: [" + data + "]");
            String result = algorithm.intToRoman(data);
            AssertUtils.assertString(result, "MCCXI");
        }
    }
}
