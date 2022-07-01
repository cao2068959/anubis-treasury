package org.chy.anubis.treasury.testcase.leetcode.n3sum.template.case01;

import org.chy.anubis.treasury.Exector;
import org.chy.anubis.treasury.log.Logger;
import org.chy.anubis.treasury.testcase.leetcode.n3sum.Algorithm;
import org.chy.anubis.treasury.utils.ArrayUtils;
import org.chy.anubis.treasury.utils.AssertUtils;

import java.util.Collection;
import java.util.List;


public class TestCase implements Exector<Algorithm> {

    @Override
    public void run(Algorithm algorithm) {
        int[] data = {-1, 0, 1, 2, -1, -4};
        Logger.info("[3数之和]测试字符串为: [" + ArrayUtils.toString(data) + "]");
        List<List<Integer>> result = algorithm.threeSum(data);

        AssertUtils.assertCollection(result, "[[-1,-1,2],[-1,0,1]]", true);
        Logger.info("");
    }
}
