package org.chy.anubis.treasury.testcase.leetcode.regular_expression_matching.template.case03;

import org.chy.anubis.treasury.Exector;
import org.chy.anubis.treasury.log.Logger;
import org.chy.anubis.treasury.testcase.leetcode.regular_expression_matching.Algorithm;
import org.chy.anubis.treasury.utils.AssertUtils;

public class TestCase implements Exector<Algorithm> {

    @Override
    public void run(Algorithm algorithm) {
        String target = "abc95682nfrgttttttogtgf";
        String pattern = "abc.*frgt*.gtgf";

        Logger.info("[正则表达式匹配] 正则模版为: {" + pattern + "},  匹配字段为 {" + target + "}");
        Boolean result = algorithm.isMatch(target, pattern);
        AssertUtils.assertBoolean(result, true);

        Logger.info("");

        target = "abc95682nfrgtttttt1ogtgf";
        Logger.info("[正则表达式匹配] 正则模版为: {" + pattern + "},  匹配字段为 {" + target + "}");
        result = algorithm.isMatch(target, pattern);
        AssertUtils.assertBoolean(result, false);

    }
}
