package org.chy.anubis.treasury.testcase.leetcode.submissions.template.case03;

import org.chy.anubis.treasury.Exector;
import org.chy.anubis.treasury.log.Logger;
import org.chy.anubis.treasury.testcase.leetcode.submissions.Algorithm;
import org.chy.anubis.treasury.utils.ArrayUtils;
import org.chy.anubis.treasury.utils.AssertUtils;

public class TestCase implements Exector<Algorithm> {

    @Override
    public void run(Algorithm algorithm) {
        int[] nums = new int[]{5, 1, 1};

        Logger.info("[下一个排列] 测试数据为:" + ArrayUtils.toString(nums));
        algorithm.nextPermutation(nums);
        AssertUtils.assertArray(nums, new int[]{1, 1, 5}, true);

    }
}
