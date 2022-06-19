package org.chy.anubis.treasury.testcase.leetcode.palindrome_number.template.case01;

import org.chy.anubis.treasury.Exector;
import org.chy.anubis.treasury.log.Logger;
import org.chy.anubis.treasury.testcase.leetcode.palindrome_number.Algorithm;
import org.chy.anubis.treasury.utils.AssertUtils;

public class TestCase implements Exector<Algorithm> {

    @Override
    public void run(Algorithm algorithm) {
        int num = 4;
        Logger.info("[回文数判断] ---> 测试数为:" + num);
        boolean result = algorithm.isPalindrome(num);
        AssertUtils.assertBoolean(result, true);

        num = -4;
        Logger.info("[回文数判断] ---> 测试数为:" + num);
        result = algorithm.isPalindrome(num);
        AssertUtils.assertBoolean(result, false);
    }
}
