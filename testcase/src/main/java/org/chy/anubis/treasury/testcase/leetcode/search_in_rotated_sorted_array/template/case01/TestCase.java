package org.chy.anubis.treasury.testcase.leetcode.search_in_rotated_sorted_array.template.case01;

import org.chy.anubis.treasury.Exector;
import org.chy.anubis.treasury.log.Logger;
import org.chy.anubis.treasury.testcase.leetcode.search_in_rotated_sorted_array.Algorithm;
import org.chy.anubis.treasury.utils.ArrayUtils;
import org.chy.anubis.treasury.utils.AssertUtils;

public class TestCase implements Exector<Algorithm> {

    @Override
    public void run(Algorithm algorithm) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8};
        int target = 7;

        Logger.info("查找的数组为:" + ArrayUtils.toString(nums) + " 查找目标为: " + target);
        int result = algorithm.search(nums, target);
        AssertUtils.assertInt(result, 6);


        Logger.info("");

        nums = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
        target = 1;
        Logger.info("查找的数组为:" + ArrayUtils.toString(nums) + " 查找目标为: " + target);
        result = algorithm.search(nums, target);
        AssertUtils.assertInt(result, 0);

        Logger.info("");

        nums = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
        target = 100;
        Logger.info("查找的数组为:" + ArrayUtils.toString(nums) + " 查找目标为: " + target);
        result = algorithm.search(nums, target);
        AssertUtils.assertInt(result, -1);

    }
}
