package org.chy.anubis.treasury.testcase.leetcode.find_first_and_last_position_of_element_in_sorted_array.template.case03;

import org.chy.anubis.treasury.Exector;
import org.chy.anubis.treasury.log.Logger;
import org.chy.anubis.treasury.testcase.leetcode.find_first_and_last_position_of_element_in_sorted_array.Algorithm;
import org.chy.anubis.treasury.utils.ArrayUtils;
import org.chy.anubis.treasury.utils.AssertUtils;

import java.util.List;


public class TestCase implements Exector<Algorithm> {

    @Override
    public void run(Algorithm algorithm) {
        int[] nums = {8, 8, 8, 8, 8, 8, 8, 8};
        int target = 8;
        Logger.info("查询的数组为: " + ArrayUtils.toString(nums) + ", 查找的值为:" + target);
        int[] result = algorithm.searchRange(nums, target);
        AssertUtils.assertArray(result, new int[]{0, 7}, true);

    }
}
