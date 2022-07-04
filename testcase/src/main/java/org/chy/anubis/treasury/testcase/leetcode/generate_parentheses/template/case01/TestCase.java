package org.chy.anubis.treasury.testcase.leetcode.generate_parentheses.template.case01;

import org.chy.anubis.treasury.Exector;
import org.chy.anubis.treasury.log.Logger;
import org.chy.anubis.treasury.testcase.leetcode.generate_parentheses.Algorithm;
import org.chy.anubis.treasury.utils.AssertUtils;

import java.util.List;


public class TestCase implements Exector<Algorithm> {

    @Override
    public void run(Algorithm algorithm) {
        {
            int data = 1;
            Logger.info("[括号生成]生成的括号数为: [" + data + "]");
            List<String> result = algorithm.generateParenthesis(data);
            AssertUtils.assertCollection(result, "[()]", true);
        }

        Logger.info("");

        {
            int data = 3;
            Logger.info("[括号生成]生成的括号数为: [" + data + "]");
            List<String> result = algorithm.generateParenthesis(data);
            AssertUtils.assertCollection(result, "[((())),(()()),(())(),()(()),()()()]", true);
        }

    }
}
