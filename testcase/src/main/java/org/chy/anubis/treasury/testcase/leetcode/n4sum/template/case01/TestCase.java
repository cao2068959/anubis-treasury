package org.chy.anubis.treasury.testcase.leetcode.n4sum.template.case01;

import org.chy.anubis.treasury.Exector;
import org.chy.anubis.treasury.log.Logger;
import org.chy.anubis.treasury.testcase.leetcode.n4sum.Algorithm;
import org.chy.anubis.treasury.utils.ArrayUtils;
import org.chy.anubis.treasury.utils.AssertUtils;

import java.util.List;


public class TestCase implements Exector<Algorithm> {

    @Override
    public void run(Algorithm algorithm) {
        int[] data = {-1, 0, 1, 2, -1, -4};
        Logger.info("[4数之和]测试字符串为: [" + ArrayUtils.toString(data) + "]");
        List<List<Integer>> result = algorithm.fourSum(data, 0);

        AssertUtils.assertCollection(result, "[[-1,-1,0,2]]", true);
        Logger.info("");
    }
}
