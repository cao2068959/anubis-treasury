package org.chy.anubis.treasury.testcase.leetcode.two_sum.template.case02;

import org.chy.anubis.treasury.Exector;
import org.chy.anubis.treasury.testcase.leetcode.two_sum.Algorithm;
import org.chy.anubis.treasury.utils.*;

public class TestCase implements Exector<Algorithm> {

    @Override
    public void run(Algorithm algorithm) {
        int[] nums = new int[]{100, 34, 5654, 231, 645, 231321, 76567, 3123, 565, 13, 5675, 23123, 576, -43, 543, 6867,
                31, 4, 21, 65, 45, 78, 123};
        int[] result = algorithm.twoSum(nums, 522);
        AssertUtils.assertArray(result, new int[]{8, 13});
    }
}
