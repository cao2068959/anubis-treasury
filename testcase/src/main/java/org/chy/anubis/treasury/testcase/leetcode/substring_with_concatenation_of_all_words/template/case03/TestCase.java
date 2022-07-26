package org.chy.anubis.treasury.testcase.leetcode.substring_with_concatenation_of_all_words.template.case03;

import org.chy.anubis.treasury.Exector;
import org.chy.anubis.treasury.log.Logger;
import org.chy.anubis.treasury.testcase.leetcode.substring_with_concatenation_of_all_words.Algorithm;
import org.chy.anubis.treasury.utils.ArrayUtils;
import org.chy.anubis.treasury.utils.AssertUtils;

import java.util.List;

public class TestCase implements Exector<Algorithm> {

    @Override
    public void run(Algorithm algorithm) {
        String s = "abbcabbcabcbabbcbbabcbabcbbababbaaababbabbabcbbabcbacbabcba";
        String[] words = new String[]{"ca","bb"};

        Logger.info("字符串为: " + s);
        Logger.info("需要串联的字符列表为: " + ArrayUtils.toString(words, d -> d));
        List<Integer> result = algorithm.findSubstring(s, words);
        AssertUtils.assertCollection(result, "[1,3,5]", false);


        Logger.info("");



    }
}
