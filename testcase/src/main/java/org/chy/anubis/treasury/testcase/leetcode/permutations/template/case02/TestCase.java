package org.chy.anubis.treasury.testcase.leetcode.permutations.template.case02;

import org.chy.anubis.treasury.Exector;
import org.chy.anubis.treasury.log.Logger;
import org.chy.anubis.treasury.testcase.leetcode.permutations.Algorithm;
import org.chy.anubis.treasury.utils.ArrayUtils;
import org.chy.anubis.treasury.utils.AssertUtils;
import org.chy.anubis.treasury.utils.JsonUtils;

import java.util.List;
import java.util.stream.Collectors;

public class TestCase implements Exector<Algorithm> {

    public void run(Algorithm algorithm) {
        int[] nums = {0, 1};
        Logger.info("[全排列] ---> " + ArrayUtils.toString(nums));
        List<List<Integer>> result = algorithm.permute(nums);

        AssertUtils.assertCollection(result, "[[0,1],[1,0]]", true);
    }
}
