package org.chy.anubis.treasury.testcase.leetcode.palindrome_number.template.case02;

import org.chy.anubis.treasury.Exector;
import org.chy.anubis.treasury.log.Logger;
import org.chy.anubis.treasury.testcase.leetcode.palindrome_number.Algorithm;
import org.chy.anubis.treasury.utils.AssertUtils;

public class TestCase implements Exector<Algorithm> {

    @Override
    public void run(Algorithm algorithm) {
        int num = 201;
        Logger.info("[回文数判断] ---> 测试数为:" + num);
        boolean result = algorithm.isPalindrome(num);
        AssertUtils.assertBoolean(result, false);


        num = 202;
        Logger.info("[回文数判断] ---> 测试数为:" + num);
        result = algorithm.isPalindrome(num);
        AssertUtils.assertBoolean(result, true);

        num = -202;
        Logger.info("[回文数判断] ---> 测试数为:" + num);
        result = algorithm.isPalindrome(num);
        AssertUtils.assertBoolean(result, false);

        num = -205;
        Logger.info("[回文数判断] ---> 测试数为:" + num);
        result = algorithm.isPalindrome(num);
        AssertUtils.assertBoolean(result, false);
    }
}
