package org.chy.anubis.treasury.testcase.leetcode.n3sum_closest.template.case02;

import org.chy.anubis.treasury.Exector;
import org.chy.anubis.treasury.log.Logger;
import org.chy.anubis.treasury.testcase.leetcode.n3sum_closest.Algorithm;
import org.chy.anubis.treasury.utils.ArrayUtils;
import org.chy.anubis.treasury.utils.AssertUtils;

import java.util.List;


public class TestCase implements Exector<Algorithm> {

    @Override
    public void run(Algorithm algorithm) {
        int[] data = {-8, -8, -8, 0, 8, 8, 8};
        int target = 0;
        Logger.info("[3数之和]测试字符串为: [" + ArrayUtils.toString(data) + "]");
        int result = algorithm.threeSumClosest(data,target);
        AssertUtils.assertInt(result, 0);
    }
}
