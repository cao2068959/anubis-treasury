package org.chy.anubis.treasury.testcase.leetcode.next_permutation.template.case01;

import org.chy.anubis.treasury.Exector;
import org.chy.anubis.treasury.log.Logger;
import org.chy.anubis.treasury.testcase.leetcode.next_permutation.Algorithm;
import org.chy.anubis.treasury.utils.ArrayUtils;
import org.chy.anubis.treasury.utils.AssertUtils;

public class TestCase implements Exector<Algorithm> {

    @Override
    public void run(Algorithm algorithm) {
        int[] nums = new int[]{1, 2, 3};

        Logger.info("[下一个排列] 测试数据为:" + ArrayUtils.toString(nums));
        algorithm.nextPermutation(nums);
        AssertUtils.assertArray(nums, new int[]{1, 3, 2}, true);

        Logger.info("");

        Logger.info("[下一个排列] 测试数据为:" + ArrayUtils.toString(nums));
        algorithm.nextPermutation(nums);
        AssertUtils.assertArray(nums, new int[]{2, 1, 3}, true);

        Logger.info("");

        Logger.info("[下一个排列] 测试数据为:" + ArrayUtils.toString(nums));
        algorithm.nextPermutation(nums);
        AssertUtils.assertArray(nums, new int[]{2, 3, 1}, true);

        Logger.info("");

        Logger.info("[下一个排列] 测试数据为:" + ArrayUtils.toString(nums));
        algorithm.nextPermutation(nums);
        AssertUtils.assertArray(nums, new int[]{3, 1, 2}, true);


        Logger.info("");

        Logger.info("[下一个排列] 测试数据为:" + ArrayUtils.toString(nums));
        algorithm.nextPermutation(nums);
        AssertUtils.assertArray(nums, new int[]{3, 2, 1}, true);


        Logger.info("");

        Logger.info("[下一个排列] 测试数据为:" + ArrayUtils.toString(nums));
        algorithm.nextPermutation(nums);
        AssertUtils.assertArray(nums, new int[]{1, 2, 3}, true);

    }
}
