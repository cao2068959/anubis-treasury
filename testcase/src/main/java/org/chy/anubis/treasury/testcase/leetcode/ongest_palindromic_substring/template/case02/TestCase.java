package org.chy.anubis.treasury.testcase.leetcode.ongest_palindromic_substring.template.case02;

import org.chy.anubis.treasury.Exector;
import org.chy.anubis.treasury.log.Logger;
import org.chy.anubis.treasury.testcase.leetcode.ongest_palindromic_substring.Algorithm;
import org.chy.anubis.treasury.utils.AssertUtils;

public class TestCase implements Exector<Algorithm> {

    @Override
    public void run(Algorithm algorithm) {
        String data = "3128383437543aba3";
        Logger.info("测试字符串为: [" + data + "]");
        String result = algorithm.longestPalindrome(data);
        AssertUtils.assertString(result, "3aba3");

        data = "3128383437543abba3";
        Logger.info("测试字符串为: [" + data + "]");
        result = algorithm.longestPalindrome(data);
        AssertUtils.assertString(result, "3abba3");

    }
}
