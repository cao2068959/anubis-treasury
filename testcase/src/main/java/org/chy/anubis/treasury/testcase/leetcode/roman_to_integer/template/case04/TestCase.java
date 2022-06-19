package org.chy.anubis.treasury.testcase.leetcode.roman_to_integer.template.case04;

import org.chy.anubis.treasury.Exector;
import org.chy.anubis.treasury.log.Logger;
import org.chy.anubis.treasury.testcase.leetcode.roman_to_integer.Algorithm;
import org.chy.anubis.treasury.utils.AssertUtils;


public class TestCase implements Exector<Algorithm> {

    @Override
    public void run(Algorithm algorithm) {
        {
            int resultNum = 94;
            String data = "XCIV";
            Logger.info("[罗马数转整数]测试字符串为: [" + data + "]");
            int result = algorithm.romanToInt(data);
            AssertUtils.assertInt(result, resultNum);
        }
    }
}
