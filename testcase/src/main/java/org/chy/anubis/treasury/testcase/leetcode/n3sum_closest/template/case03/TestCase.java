package org.chy.anubis.treasury.testcase.leetcode.n3sum_closest.template.case03;

import org.chy.anubis.treasury.Exector;
import org.chy.anubis.treasury.log.Logger;
import org.chy.anubis.treasury.testcase.leetcode.n3sum_closest.Algorithm;
import org.chy.anubis.treasury.utils.ArrayUtils;
import org.chy.anubis.treasury.utils.AssertUtils;

import java.util.List;


public class TestCase implements Exector<Algorithm> {

    @Override
    public void run(Algorithm algorithm) {
        {
            int[] data = {-45784, 34, -76, 343};
            int target = 3494;
            Logger.info("[3数之和]测试字符串为: [" + ArrayUtils.toString(data) + "]");
            int result = algorithm.threeSumClosest(data, target);
            AssertUtils.assertInt(result, 301);
        }

        Logger.info("");

        {
            int[] data = {1, 2, 3};
            int target = 100;
            Logger.info("[3数之和]测试字符串为: [" + ArrayUtils.toString(data) + "]");
            int result = algorithm.threeSumClosest(data, target);
            AssertUtils.assertInt(result, 6);
        }
    }
}
