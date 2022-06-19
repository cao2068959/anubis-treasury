package org.chy.anubis.treasury.testcase.leetcode.roman_to_integer.template.case02;

import org.chy.anubis.treasury.Exector;
import org.chy.anubis.treasury.log.Logger;
import org.chy.anubis.treasury.testcase.leetcode.roman_to_integer.Algorithm;
import org.chy.anubis.treasury.utils.AssertUtils;


public class TestCase implements Exector<Algorithm> {

    @Override
    public void run(Algorithm algorithm) {
        {
            int resultNum = 58;
            String data = "LVIII";
            Logger.info("[罗马数转整数]测试字符串为: [" + data + "]");
            int result = algorithm.romanToInt(data);
            AssertUtils.assertInt(result, resultNum);
        }

        Logger.info("");

        {
            int resultNum = 44;
            String data = "XLIV";
            Logger.info("[罗马数转整数]测试字符串为: [" + data + "]");
            int result = algorithm.romanToInt(data);
            AssertUtils.assertInt(result, resultNum);

        }


        Logger.info("");

        {
            int resultNum = 41;
            String data = "XLI";
            Logger.info("[罗马数转整数]测试字符串为: [" + data + "]");
            int result = algorithm.romanToInt(data);
            AssertUtils.assertInt(result, resultNum);
        }

        Logger.info("");

        {
            int resultNum = 49;
            String data = "XLIX";
            Logger.info("[罗马数转整数]测试字符串为: [" + data + "]");
            int result = algorithm.romanToInt(data);
            AssertUtils.assertInt(result, resultNum);
        }

    }
}
