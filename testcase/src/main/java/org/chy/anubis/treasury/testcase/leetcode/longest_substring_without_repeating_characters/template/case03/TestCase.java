package org.chy.anubis.treasury.testcase.leetcode.longest_substring_without_repeating_characters.template.case03;

import org.chy.anubis.treasury.Exector;
import org.chy.anubis.treasury.log.Logger;
import org.chy.anubis.treasury.testcase.leetcode.longest_substring_without_repeating_characters.Algorithm;
import org.chy.anubis.treasury.utils.AssertUtils;


public class TestCase implements Exector<Algorithm> {

    @Override
    public void run(Algorithm algorithm) {

        String data = "pwwkew";
        Logger.info("测试字符串为: [" + data + "]");
        int result = algorithm.lengthOfLongestSubstring(data);
        AssertUtils.assertInt(result, 3);

    }
}
