package org.chy.anubis.treasury.testcase.leetcode.combination_sum.template.case01;

import org.chy.anubis.treasury.Exector;
import org.chy.anubis.treasury.log.Logger;
import org.chy.anubis.treasury.testcase.leetcode.combination_sum.Algorithm;
import org.chy.anubis.treasury.utils.ArrayUtils;
import org.chy.anubis.treasury.utils.AssertUtils;
import org.chy.anubis.treasury.utils.JsonUtils;

import java.util.List;
import java.util.stream.Collectors;

public class TestCase implements Exector<Algorithm> {

    @Override
    public void run(Algorithm algorithm) {
        int[] data = new int[]{2, 3, 6, 7};
        int target = 7;
        Logger.info(" 从数组: [" + ArrayUtils.toString(data) + "] 选择元素组合成 : [" + target + "]");
        List<List<Integer>> result = algorithm.combinationSum(data, target);
        AssertUtils.assertCollection(result, "[[2,2,3],[7]]", true,
                item-> JsonUtils.toJson(item.stream().sorted().collect(Collectors.toList())));
        Logger.info("");

    }
}
