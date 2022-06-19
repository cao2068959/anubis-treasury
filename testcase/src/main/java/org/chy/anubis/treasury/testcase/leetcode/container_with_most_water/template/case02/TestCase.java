package org.chy.anubis.treasury.testcase.leetcode.container_with_most_water.template.case02;

import org.chy.anubis.treasury.Exector;
import org.chy.anubis.treasury.log.Logger;
import org.chy.anubis.treasury.testcase.leetcode.container_with_most_water.Algorithm;
import org.chy.anubis.treasury.testcase.leetcode.zigzag_conversion.ZUtils;
import org.chy.anubis.treasury.utils.ArrayUtils;
import org.chy.anubis.treasury.utils.AssertUtils;

public class TestCase implements Exector<Algorithm> {

    @Override
    public void run(Algorithm algorithm) {
        int[] data = new int[]{0,14,6,2,10,9,4,1,10,3};
        Logger.info(" 盛最多水的容器入参: ["+ ArrayUtils.toString(data) +"]");
        int result = algorithm.maxArea(data);
        AssertUtils.assertInt(result, 70);
        Logger.info("");
    }
}
