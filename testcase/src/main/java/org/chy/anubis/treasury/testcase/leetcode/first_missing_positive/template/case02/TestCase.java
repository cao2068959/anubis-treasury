package org.chy.anubis.treasury.testcase.leetcode.first_missing_positive.template.case02;

import org.chy.anubis.treasury.Exector;
import org.chy.anubis.treasury.log.Logger;
import org.chy.anubis.treasury.testcase.leetcode.first_missing_positive.Algorithm;
import org.chy.anubis.treasury.utils.ArrayUtils;
import org.chy.anubis.treasury.utils.AssertUtils;

import java.util.List;


public class TestCase implements Exector<Algorithm> {

    @Override
    public void run(Algorithm algorithm) {
        {
            int[] data = {-34, -65, -232, -76, -675};
            Logger.info("未排序的整数数组为: [" + ArrayUtils.toString(data) + "]");
            int result = algorithm.firstMissingPositive(data);
            AssertUtils.assertInt(result, 1);
        }
        Logger.info("");

    }
}
