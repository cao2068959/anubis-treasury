package org.chy.anubis.treasury.testcase.leetcode.n3sum_closest.template.case01;

import org.chy.anubis.treasury.Exector;
import org.chy.anubis.treasury.log.Logger;
import org.chy.anubis.treasury.testcase.leetcode.n3sum_closest.Algorithm;
import org.chy.anubis.treasury.utils.ArrayUtils;
import org.chy.anubis.treasury.utils.AssertUtils;

import java.util.List;


public class TestCase implements Exector<Algorithm> {

    @Override
    public void run(Algorithm algorithm) {
        int[] data = {-1, 2, 1, -4};
        int target = 1;
        Logger.info("[3数之和]测试字符串为: [" + ArrayUtils.toString(data) + "]");
        int result = algorithm.threeSumClosest(data,target);
        AssertUtils.assertInt(result, 2);
        Logger.info("");
    }
}
