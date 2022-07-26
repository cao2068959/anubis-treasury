package org.chy.anubis.treasury.testcase.leetcode.search_insert_position.template.case03;

import org.chy.anubis.treasury.Exector;
import org.chy.anubis.treasury.log.Logger;
import org.chy.anubis.treasury.testcase.leetcode.search_insert_position.Algorithm;
import org.chy.anubis.treasury.utils.ArrayUtils;
import org.chy.anubis.treasury.utils.AssertUtils;

public class TestCase implements Exector<Algorithm> {

    @Override
    public void run(Algorithm algorithm) {
        int[] nums = {2, 3, 4, 5, 7, 8};
        int target = 10;

        Logger.info("查找的数组为:" + ArrayUtils.toString(nums) + " 查找目标为: " + target);
        int result = algorithm.searchInsert(nums, target);
        AssertUtils.assertInt(result, 6);

    }
}
