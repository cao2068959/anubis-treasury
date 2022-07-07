package org.chy.anubis.treasury.testcase.leetcode.divide_two_integers.template.case01;

import org.chy.anubis.treasury.Exector;
import org.chy.anubis.treasury.log.Logger;
import org.chy.anubis.treasury.testcase.leetcode.divide_two_integers.Algorithm;
import org.chy.anubis.treasury.utils.ArrayUtils;
import org.chy.anubis.treasury.utils.AssertUtils;

public class TestCase implements Exector<Algorithm> {

    @Override
    public void run(Algorithm algorithm) {
        {
            int d = 10;
            int d2 = 3;
            Logger.info(" 计算 [" + d + "/" + d2 + " = ?]");
            int result = algorithm.divide(d,d2);
            AssertUtils.assertInt(result, d/d2);
            Logger.info("");
        }


        {
            int d = 32342;
            int d2 = 556;
            Logger.info(" 计算 [" + d + "/" + d2 + " = ?]");
            int result = algorithm.divide(d,d2);
            AssertUtils.assertInt(result, d/d2);
            Logger.info("");
        }
    }
}
