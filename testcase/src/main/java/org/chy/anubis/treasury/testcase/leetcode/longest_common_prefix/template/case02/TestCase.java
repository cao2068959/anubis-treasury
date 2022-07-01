package org.chy.anubis.treasury.testcase.leetcode.longest_common_prefix.template.case02;

import org.chy.anubis.treasury.Exector;
import org.chy.anubis.treasury.log.Logger;
import org.chy.anubis.treasury.testcase.leetcode.longest_common_prefix.Algorithm;
import org.chy.anubis.treasury.utils.ArrayUtils;
import org.chy.anubis.treasury.utils.AssertUtils;


public class TestCase implements Exector<Algorithm> {

    @Override
    public void run(Algorithm algorithm) {

        {
            String[] data = {"rwerewd", "gfdhtgfh", "hjkghkhj"};
            Logger.info("[罗马数转整数]测试字符串为: [" + ArrayUtils.toString(data, d -> d) + "]");
            String result = algorithm.longestCommonPrefix(data);
            AssertUtils.assertString(result, "");
        }

        Logger.info("");

        {
            String[] data = {"sdfvcsdf123fdgdfg", "hgfhgf123fhgfdgh", "756123bchgf"};
            Logger.info("[罗马数转整数]测试字符串为: [" + ArrayUtils.toString(data, d -> d) + "]");
            String result = algorithm.longestCommonPrefix(data);
            AssertUtils.assertString(result, "");
        }
    }
}
