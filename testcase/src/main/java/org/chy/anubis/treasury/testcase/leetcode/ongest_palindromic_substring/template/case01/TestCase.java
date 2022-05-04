package org.chy.anubis.treasury.testcase.leetcode.ongest_palindromic_substring.template.case01;

import org.chy.anubis.treasury.Exector;
import org.chy.anubis.treasury.log.Logger;
import org.chy.anubis.treasury.testcase.leetcode.ongest_palindromic_substring.Algorithm;
import org.chy.anubis.treasury.utils.AssertUtils;

public class TestCase implements Exector<Algorithm> {

    @Override
    public void run(Algorithm algorithm) {
        String data = "eaaaaabaaaaaf";
        Logger.info("测试字符串为: [" + data + "]");
        String result = algorithm.longestPalindrome(data);
        AssertUtils.assertString(result, "aaaaabaaaaa");

    }
}
