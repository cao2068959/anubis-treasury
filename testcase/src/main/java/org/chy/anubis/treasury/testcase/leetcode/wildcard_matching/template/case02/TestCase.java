package org.chy.anubis.treasury.testcase.leetcode.wildcard_matching.template.case02;

import org.chy.anubis.treasury.Exector;
import org.chy.anubis.treasury.log.Logger;
import org.chy.anubis.treasury.testcase.leetcode.wildcard_matching.Algorithm;
import org.chy.anubis.treasury.utils.AssertUtils;

public class TestCase implements Exector<Algorithm> {

    @Override
    public void run(org.chy.anubis.treasury.testcase.leetcode.wildcard_matching.Algorithm algorithm) {
        String data = "rtrdfdhgfasdsfd";
        String p = "*d";
        Logger.info(" 正则匹配的数据为: {" + data + "} 正则表达式为: {" + p + "}");
        boolean result = algorithm.isMatch(data, p);
        AssertUtils.assertBoolean(result, true);
        Logger.info("");

        p = "*r";
        Logger.info(" 正则匹配的数据为: {" + data + "} 正则表达式为: {" + p + "}");
        result = algorithm.isMatch(data, p);
        AssertUtils.assertBoolean(result, false);
        Logger.info("");
    }
}
