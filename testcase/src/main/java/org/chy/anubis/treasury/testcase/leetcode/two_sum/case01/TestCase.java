package org.chy.anubis.treasury.testcase.leetcode.two_sum.case01;

import org.chy.anubis.treasury.Exector;
import org.chy.anubis.treasury.testcase.leetcode.two_sum.Algorithm;
import org.chy.anubis.treasury.utils.ArrayUtils;
import org.chy.anubis.treasury.utils.AssertUtils;

public class TestCase implements Exector<Algorithm> {

    @Override
    public void run(Algorithm algorithm) {
        int[] nums = new int[]{2, 7, 11, 15};

        int[] result = algorithm.twoSum(nums, 9);

        AssertUtils.assertArray(result, new int[]{0, 1});
    }
}
