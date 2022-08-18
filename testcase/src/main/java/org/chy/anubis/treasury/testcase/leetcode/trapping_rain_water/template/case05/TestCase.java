package org.chy.anubis.treasury.testcase.leetcode.trapping_rain_water.template.case05;

import org.chy.anubis.treasury.Exector;
import org.chy.anubis.treasury.log.Logger;
import org.chy.anubis.treasury.testcase.leetcode.trapping_rain_water.Algorithm;
import org.chy.anubis.treasury.utils.ArrayUtils;
import org.chy.anubis.treasury.utils.AssertUtils;

public class TestCase implements Exector<Algorithm> {

    @Override
    public void run(Algorithm algorithm) {
        int[] data = new int[]{0,1,2,0,3,0,1,2,0,0,4,2,1,2,5,0,1,2,0,2};
        Logger.info("[接雨水] 高度数据为:" + ArrayUtils.toString(data));
        int result = algorithm.trap(data);
        AssertUtils.assertInt(result, 26);
        Logger.info("");
    }
}
