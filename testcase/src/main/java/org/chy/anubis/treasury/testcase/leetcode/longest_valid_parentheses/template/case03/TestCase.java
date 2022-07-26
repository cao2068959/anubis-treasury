package org.chy.anubis.treasury.testcase.leetcode.longest_valid_parentheses.template.case03;

import org.chy.anubis.treasury.Exector;
import org.chy.anubis.treasury.log.Logger;
import org.chy.anubis.treasury.testcase.leetcode.longest_valid_parentheses.Algorithm;
import org.chy.anubis.treasury.utils.AssertUtils;


public class TestCase implements Exector<Algorithm> {

    @Override
    public void run(Algorithm algorithm) {

        String data = "(()()()(()(()))()())";
        Logger.info("需要匹配的括号字符串为: " + data);
        int result = algorithm.longestValidParentheses(data);
        AssertUtils.assertInt(result, 20);

        Logger.info("");

    }
}
