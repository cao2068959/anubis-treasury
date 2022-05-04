package org.chy.anubis.treasury.testcase.leetcode.ongest_palindromic_substring.template.case03;

import org.chy.anubis.treasury.Exector;
import org.chy.anubis.treasury.log.Logger;
import org.chy.anubis.treasury.testcase.leetcode.ongest_palindromic_substring.Algorithm;
import org.chy.anubis.treasury.utils.AssertUtils;

public class TestCase implements Exector<Algorithm> {

    @Override
    public void run(Algorithm algorithm) {
        String data = "123rrtrrbbrrtrr321";
        Logger.info("测试字符串为: [" + data + "]");
        String result = algorithm.longestPalindrome(data);
        AssertUtils.assertString(result, "123rrtrrbbrrtrr321");

        data = "123rrtrrb5brrtrr321";
        Logger.info("测试字符串为: [" + data + "]");
        result = algorithm.longestPalindrome(data);
        AssertUtils.assertString(result, "123rrtrrb5brrtrr321");

    }
}
