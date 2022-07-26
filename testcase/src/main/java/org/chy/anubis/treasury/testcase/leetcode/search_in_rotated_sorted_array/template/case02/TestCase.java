package org.chy.anubis.treasury.testcase.leetcode.search_in_rotated_sorted_array.template.case02;

import org.chy.anubis.treasury.Exector;
import org.chy.anubis.treasury.log.Logger;
import org.chy.anubis.treasury.testcase.leetcode.search_in_rotated_sorted_array.Algorithm;
import org.chy.anubis.treasury.utils.ArrayUtils;
import org.chy.anubis.treasury.utils.AssertUtils;

public class TestCase implements Exector<Algorithm> {

    @Override
    public void run(Algorithm algorithm) {
        int[] nums = {4, 5, 6, 7, 8, 1, 2, 3};
        int target = 2;

        Logger.info("查找的数组为:" + ArrayUtils.toString(nums) + " 查找目标为: " + target);
        int result = algorithm.search(nums, target);
        AssertUtils.assertInt(result, 6);


        nums = new int[]{4, 5, 6, 7, 8, 1, 2, 3};
        target = 6;

        Logger.info("查找的数组为:" + ArrayUtils.toString(nums) + " 查找目标为: " + target);
         result = algorithm.search(nums, target);
        AssertUtils.assertInt(result, 2);
    }
}
