package org.chy.anubis.treasury.testcase.leetcode.wildcard_matching.template.case03;

import org.chy.anubis.treasury.Exector;
import org.chy.anubis.treasury.log.Logger;
import org.chy.anubis.treasury.testcase.leetcode.wildcard_matching.Algorithm;
import org.chy.anubis.treasury.utils.AssertUtils;

public class TestCase implements Exector<Algorithm> {

    @Override
    public void run(Algorithm algorithm) {
        String data = "12345678";
        String p = "123?5678";
        Logger.info(" 正则匹配的数据为: {" + data + "} 正则表达式为: {" + p + "}");
        boolean result = algorithm.isMatch(data, p);
        AssertUtils.assertBoolean(result, true);
        Logger.info("");

        p = "1234?5678";
        Logger.info(" 正则匹配的数据为: {" + data + "} 正则表达式为: {" + p + "}");
        result = algorithm.isMatch(data, p);
        AssertUtils.assertBoolean(result, false);
        Logger.info("");
    }
}
