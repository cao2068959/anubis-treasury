package org.chy.anubis.treasury.testcase.leetcode.trapping_rain_water.template.case07;

import org.chy.anubis.treasury.Exector;
import org.chy.anubis.treasury.log.Logger;
import org.chy.anubis.treasury.testcase.leetcode.trapping_rain_water.Algorithm;
import org.chy.anubis.treasury.utils.ArrayUtils;
import org.chy.anubis.treasury.utils.AssertUtils;

public class TestCase implements Exector<Algorithm> {

    @Override
    public void run(Algorithm algorithm) {
        int[] data = new int[]{9,6,8,8,5,6,3};
        Logger.info("[接雨水] 高度数据为:" + ArrayUtils.toString(data));
        int result = algorithm.trap(data);
        AssertUtils.assertInt(result, 3);
        Logger.info("");
    }
}
