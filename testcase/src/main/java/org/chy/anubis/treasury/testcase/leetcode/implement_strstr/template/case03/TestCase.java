package org.chy.anubis.treasury.testcase.leetcode.implement_strstr.template.case03;

import org.chy.anubis.treasury.Exector;
import org.chy.anubis.treasury.log.Logger;
import org.chy.anubis.treasury.testcase.leetcode.implement_strstr.Algorithm;
import org.chy.anubis.treasury.utils.AssertUtils;


public class TestCase implements Exector<Algorithm> {

    @Override
    public void run(Algorithm algorithm) {


        {
            String data = "ababcaababcaabc";
            String needle = "ababcaabc";
            Logger.info("[匹配字符串]生成的括号数为: [" + data + "]");
            Integer result = algorithm.strStr(data, needle);
            AssertUtils.assertInt(result, 6);
        }
        Logger.info("");
        {
            String data = "aabaaabaaac";
            String needle = "aabaaac";
            Logger.info("[匹配字符串]生成的括号数为: [" + data + "]");
            Integer result = algorithm.strStr(data, needle);
            AssertUtils.assertInt(result, 4);
        }


    }
}
