package org.chy.anubis.treasury.testcase.leetcode.count_and_say.template.case02;

import org.chy.anubis.treasury.Exector;
import org.chy.anubis.treasury.log.Logger;
import org.chy.anubis.treasury.testcase.leetcode.count_and_say.Algorithm;
import org.chy.anubis.treasury.utils.ArrayUtils;
import org.chy.anubis.treasury.utils.AssertUtils;

public class TestCase implements Exector<Algorithm> {

    @Override
    public void run(Algorithm algorithm) {
        int n = 5;
        Logger.info(" 输出外观数列的第 ["+n+"] 项");
        String result = algorithm.countAndSay(n);
        AssertUtils.assertString(result, "111221");
        Logger.info("");

    }
}
