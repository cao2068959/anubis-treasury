package org.chy.anubis.treasury.testcase.leetcode.valid_parentheses.template.case03;

import org.chy.anubis.treasury.Exector;
import org.chy.anubis.treasury.log.Logger;
import org.chy.anubis.treasury.testcase.leetcode.valid_parentheses.Algorithm;
import org.chy.anubis.treasury.utils.AssertUtils;

public class TestCase implements Exector<Algorithm> {

    @Override
    public void run(Algorithm algorithm) {
        String data = "{{{{{{[{[{[(()()()()()()()()()()()()({{{{{}}}}}))]}]}]}}}}}}";
        Logger.info(" 输入括号为: {" + data + "}");
        boolean result = algorithm.isValid(data);
        AssertUtils.assertBoolean(result, true);
        Logger.info("");
    }
}
