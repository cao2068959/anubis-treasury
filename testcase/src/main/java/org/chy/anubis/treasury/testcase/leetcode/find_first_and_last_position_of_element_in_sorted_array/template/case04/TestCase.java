package org.chy.anubis.treasury.testcase.leetcode.find_first_and_last_position_of_element_in_sorted_array.template.case04;

import org.chy.anubis.treasury.Exector;
import org.chy.anubis.treasury.log.Logger;
import org.chy.anubis.treasury.testcase.leetcode.find_first_and_last_position_of_element_in_sorted_array.Algorithm;
import org.chy.anubis.treasury.utils.ArrayUtils;
import org.chy.anubis.treasury.utils.AssertUtils;


public class TestCase implements Exector<Algorithm> {

    @Override
    public void run(Algorithm algorithm) {
        int[] nums = {7};
        int target = 7;
        Logger.info("查询的数组为: " + ArrayUtils.toString(nums) + ", 查找的值为:" + target);
        int[] result = algorithm.searchRange(nums, target);
        AssertUtils.assertArray(result, new int[]{0, 0}, true);

    }
}
