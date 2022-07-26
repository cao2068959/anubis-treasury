package org.chy.anubis.treasury.testcase.leetcode.find_first_and_last_position_of_element_in_sorted_array.template.case02;

import org.chy.anubis.treasury.Exector;
import org.chy.anubis.treasury.log.Logger;
import org.chy.anubis.treasury.testcase.leetcode.find_first_and_last_position_of_element_in_sorted_array.Algorithm;
import org.chy.anubis.treasury.utils.ArrayUtils;
import org.chy.anubis.treasury.utils.AssertUtils;

import java.util.List;


public class TestCase implements Exector<Algorithm> {

    @Override
    public void run(Algorithm algorithm) {
        {
            int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
            int target = 61;
            Logger.info("查询的数组为: " + ArrayUtils.toString(nums) + ", 查找的值为:" + target);
            int[] result = algorithm.searchRange(nums, target);
            AssertUtils.assertArray(result, new int[]{-1, -1}, true);
        }

        Logger.info("");

        {
            int[] nums = {};
            int target = 2;
            Logger.info("查询的数组为: " + ArrayUtils.toString(nums) + ", 查找的值为:" + target);
            int[] result = algorithm.searchRange(nums, target);
            AssertUtils.assertArray(result, new int[]{-1, -1}, true);
        }

    }
}
