package org.chy.anubis.treasury.testcase.leetcode.search_in_rotated_sorted_array.template.case05;

import org.chy.anubis.treasury.Exector;
import org.chy.anubis.treasury.log.Logger;
import org.chy.anubis.treasury.testcase.leetcode.search_in_rotated_sorted_array.Algorithm;
import org.chy.anubis.treasury.utils.ArrayUtils;
import org.chy.anubis.treasury.utils.AssertUtils;

public class TestCase implements Exector<Algorithm> {

    @Override
    public void run(Algorithm algorithm) {
        int[] nums = {3, 5, 1};
        int target = 1;

        Logger.info("查找的数组为:" + ArrayUtils.toString(nums) + " 查找目标为: " + target);
        int result = algorithm.search(nums, target);
        AssertUtils.assertInt(result, 2);

        nums = new int[]{5, 1, 3};
        target = 3;

        Logger.info("查找的数组为:" + ArrayUtils.toString(nums) + " 查找目标为: " + target);
         result = algorithm.search(nums, target);
        AssertUtils.assertInt(result, 2);

    }
}
