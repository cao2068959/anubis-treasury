package org.chy.anubis.treasury.testcase.leetcode.n3sum.template.case04;

import org.chy.anubis.treasury.Exector;
import org.chy.anubis.treasury.log.Logger;
import org.chy.anubis.treasury.testcase.leetcode.n3sum.Algorithm;
import org.chy.anubis.treasury.utils.ArrayUtils;
import org.chy.anubis.treasury.utils.AssertUtils;
import sun.security.provider.MD5;

import java.security.MessageDigest;
import java.util.List;


public class TestCase implements Exector<Algorithm> {

    @Override
    public void run(Algorithm algorithm) {
        int[] data = {0, 0, 0};
        Logger.info("[3数之和]测试字符串为: [" + ArrayUtils.toString(data) + "]");
        List<List<Integer>> result = algorithm.threeSum(data);
        AssertUtils.assertCollection(result, "[[0,0,0]]", true);
    }
}
