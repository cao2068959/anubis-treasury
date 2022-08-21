package org.chy.anubis.treasury.testcase.leetcode.permutations.template.case01;

import org.chy.anubis.treasury.Exector;
import org.chy.anubis.treasury.log.Logger;
import org.chy.anubis.treasury.testcase.leetcode.permutations.Algorithm;
import org.chy.anubis.treasury.utils.ArrayUtils;
import org.chy.anubis.treasury.utils.AssertUtils;
import org.chy.anubis.treasury.utils.JsonUtils;

import java.util.List;
import java.util.stream.Collectors;

public class TestCase implements Exector<Algorithm> {

    @Override
    public void run(Algorithm algorithm) {
        int[] nums = {1, 2, 3};
        Logger.info("[全排列] ---> " + ArrayUtils.toString(nums));
        List<List<Integer>> result = algorithm.permute(nums);

        AssertUtils.assertCollection(result, "[[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]", true);
    }
}
