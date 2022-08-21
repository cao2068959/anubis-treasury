package org.chy.anubis.treasury.testcase.leetcode.permutations_ii.template.case02;

import org.chy.anubis.treasury.Exector;
import org.chy.anubis.treasury.log.Logger;
import org.chy.anubis.treasury.testcase.leetcode.permutations_ii.Algorithm;
import org.chy.anubis.treasury.utils.ArrayUtils;
import org.chy.anubis.treasury.utils.AssertUtils;

import java.util.List;

public class TestCase implements Exector<Algorithm> {

    public void run(Algorithm algorithm) {
        int[] nums = {1, 1, 2};
        Logger.info("[全排列] ---> " + ArrayUtils.toString(nums));
        List<List<Integer>> result = algorithm.permute(nums);

        AssertUtils.assertCollection(result, "[[1,1,2],[1,2,1],[2,1,1]]", true);
    }
}
