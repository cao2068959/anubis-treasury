package org.chy.anubis.treasury.testcase.leetcode.two_sum.template.case01;

import org.chy.anubis.treasury.Exector;
import org.chy.anubis.treasury.log.Logger;
import org.chy.anubis.treasury.testcase.leetcode.two_sum.Algorithm;
import org.chy.anubis.treasury.utils.ArrayUtils;
import org.chy.anubis.treasury.utils.AssertUtils;

public class TestCase implements Exector<Algorithm> {

    @Override
    public void run(Algorithm algorithm) {
        int[] nums = new int[]{2, 7, 11, 15};
        int target = 9;
        Logger.info("[两数之和] 数组列表为:"+ ArrayUtils.toString(nums));
        Logger.info("[两数之和] 最终目标数为: ["+target+"]");
        int[] result = algorithm.twoSum(nums, 9);

        AssertUtils.assertArray(result, new int[]{0, 1});
    }
}
