package org.chy.anubis.treasury.testcase.leetcode.implement_strstr.template.case02;

import org.chy.anubis.treasury.Exector;
import org.chy.anubis.treasury.log.Logger;
import org.chy.anubis.treasury.testcase.leetcode.implement_strstr.Algorithm;
import org.chy.anubis.treasury.utils.AssertUtils;

import java.util.List;


public class TestCase implements Exector<Algorithm> {

    @Override
    public void run(Algorithm algorithm) {
        {
            String data = "babba";
            String needle = "bbb";
            Logger.info("[匹配字符串]生成的括号数为: [" + data + "]");
            Integer result = algorithm.strStr(data,needle);
            AssertUtils.assertInt(result, -1);
        }

        Logger.info("");

        {
            String data = "12345678";
            String needle = "ac";
            Logger.info("[匹配字符串]生成的括号数为: [" + data + "]");
            Integer result = algorithm.strStr(data,needle);
            AssertUtils.assertInt(result, -1);
        }

    }
}
