package org.chy.anubis.treasury.testcase.leetcode.combination_sum_ii.template.case02;

import org.chy.anubis.treasury.Exector;
import org.chy.anubis.treasury.log.Logger;
import org.chy.anubis.treasury.testcase.leetcode.combination_sum_ii.Algorithm;
import org.chy.anubis.treasury.utils.ArrayUtils;
import org.chy.anubis.treasury.utils.AssertUtils;
import org.chy.anubis.treasury.utils.JsonUtils;

import java.util.List;
import java.util.stream.Collectors;

public class TestCase implements Exector<Algorithm> {

    @Override
    public void run(Algorithm algorithm) {
        int[] data = new int[]{10,1,2,7,6,1,5};
        int target = 8;
        Logger.info(" 从数组: [" + ArrayUtils.toString(data) + "] 选择元素组合成 : [" + target + "]");
        List<List<Integer>> result = algorithm.combinationSum(data, target);

        String expectResult = "[[1,1,6],[1,2,5],[1,7],[2,6]]";
        AssertUtils.assertCollection(result, expectResult, true,
                item-> JsonUtils.toJson(item.stream().sorted().collect(Collectors.toList())));
        Logger.info("");

    }
}
