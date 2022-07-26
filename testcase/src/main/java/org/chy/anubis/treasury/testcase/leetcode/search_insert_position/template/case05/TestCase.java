package org.chy.anubis.treasury.testcase.leetcode.search_insert_position.template.case05;

import org.chy.anubis.treasury.Exector;
import org.chy.anubis.treasury.log.Logger;
import org.chy.anubis.treasury.testcase.leetcode.search_insert_position.Algorithm;
import org.chy.anubis.treasury.utils.ArrayUtils;
import org.chy.anubis.treasury.utils.AssertUtils;

public class TestCase implements Exector<Algorithm> {

    @Override
    public void run(Algorithm algorithm) {
        {
            int[] nums = {1, 2, 4, 6, 7};
            int target = 3;

            Logger.info("查找的数组为:" + ArrayUtils.toString(nums) + " 查找目标为: " + target);
            int result = algorithm.searchInsert(nums, target);
            AssertUtils.assertInt(result, 2);
        }
        Logger.info("");
    }
}
