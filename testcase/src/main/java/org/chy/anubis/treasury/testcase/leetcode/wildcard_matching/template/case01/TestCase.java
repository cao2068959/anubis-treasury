package org.chy.anubis.treasury.testcase.leetcode.wildcard_matching.template.case01;

import org.chy.anubis.treasury.Exector;
import org.chy.anubis.treasury.log.Logger;
import org.chy.anubis.treasury.testcase.leetcode.wildcard_matching.Algorithm;
import org.chy.anubis.treasury.utils.AssertUtils;

public class TestCase implements Exector<Algorithm> {

    @Override
    public void run(Algorithm algorithm) {
        String data = "acdcb";
        String p = "a*c?b";
        Logger.info(" 正则匹配的数据为: {" + data + "} 正则表达式为: {" + p + "}");
        boolean result = algorithm.isMatch(data, p);
        AssertUtils.assertBoolean(result, false);
        Logger.info("");


        data = "acdcb";
        p = "a*c?cb";
        Logger.info(" 正则匹配的数据为: {" + data + "} 正则表达式为: {" + p + "}");
        result = algorithm.isMatch(data, p);
        AssertUtils.assertBoolean(result, true);
        Logger.info("");
    }
}
