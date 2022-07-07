package org.chy.anubis.treasury.testcase.leetcode.divide_two_integers.template.case02;

import org.chy.anubis.treasury.Exector;
import org.chy.anubis.treasury.log.Logger;
import org.chy.anubis.treasury.testcase.leetcode.divide_two_integers.Algorithm;
import org.chy.anubis.treasury.utils.ArrayUtils;
import org.chy.anubis.treasury.utils.AssertUtils;

public class TestCase implements Exector<Algorithm> {

    @Override
    public void run(Algorithm algorithm) {
        int d = -2147483648;
        int d2 = -1;
        Logger.info(" 计算 [" + d + "/" + d2 + " = ?]");
        int result = algorithm.divide(d,d2);
        AssertUtils.assertInt(result, 2147483647);
        Logger.info("");
    }
}
