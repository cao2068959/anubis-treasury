package org.chy.anubis.treasury.testcase.leetcode.n3sum.template.case02;

import org.chy.anubis.treasury.Exector;
import org.chy.anubis.treasury.log.Logger;
import org.chy.anubis.treasury.testcase.leetcode.n3sum.Algorithm;
import org.chy.anubis.treasury.utils.ArrayUtils;
import org.chy.anubis.treasury.utils.AssertUtils;

import java.util.List;


public class TestCase implements Exector<Algorithm> {

    @Override
    public void run(Algorithm algorithm) {
        int[] data = {-8, -8, -8, 0, 8, 8, 8};
        Logger.info("[3数之和]测试字符串为: [" + ArrayUtils.toString(data) + "]");
        List<List<Integer>> result = algorithm.threeSum(data);

        AssertUtils.assertCollection(result, "[[-8,0,8]]", true);
    }
}
