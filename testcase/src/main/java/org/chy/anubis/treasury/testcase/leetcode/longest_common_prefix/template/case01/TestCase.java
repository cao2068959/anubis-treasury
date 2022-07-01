package org.chy.anubis.treasury.testcase.leetcode.longest_common_prefix.template.case01;

import org.chy.anubis.treasury.Exector;
import org.chy.anubis.treasury.log.Logger;
import org.chy.anubis.treasury.testcase.leetcode.longest_common_prefix.Algorithm;
import org.chy.anubis.treasury.utils.ArrayUtils;
import org.chy.anubis.treasury.utils.AssertUtils;


public class TestCase implements Exector<Algorithm> {

    @Override
    public void run(Algorithm algorithm) {
        {
            String[] data = {"abcdfrfrfrgt", "abc349dfsk", "abc02302,dxc"};
            Logger.info("[罗马数转整数]测试字符串为: [" + ArrayUtils.toString(data, d -> d) + "]");
            String result = algorithm.longestCommonPrefix(data);
            AssertUtils.assertString(result, "abc");
        }

        Logger.info("");

        {
            String[] data = {"abcdfrfrfrgt", "ab", "a"};
            Logger.info("[罗马数转整数]测试字符串为: [" + ArrayUtils.toString(data, d -> d) + "]");
            String result = algorithm.longestCommonPrefix(data);
            AssertUtils.assertString(result, "a");
        }


        Logger.info("");

        {
            String[] data = {"1111111", "111", "111111111"};
            Logger.info("[罗马数转整数]测试字符串为: [" + ArrayUtils.toString(data, d -> d) + "]");
            String result = algorithm.longestCommonPrefix(data);
            AssertUtils.assertString(result, "111");
        }

    }
}
