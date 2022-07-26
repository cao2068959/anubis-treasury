package org.chy.anubis.treasury.testcase.leetcode.substring_with_concatenation_of_all_words.template.case01;

import org.chy.anubis.treasury.Exector;
import org.chy.anubis.treasury.log.Logger;
import org.chy.anubis.treasury.testcase.leetcode.substring_with_concatenation_of_all_words.Algorithm;
import org.chy.anubis.treasury.utils.ArrayUtils;
import org.chy.anubis.treasury.utils.AssertUtils;

import java.util.List;

public class TestCase implements Exector<Algorithm> {

    @Override
    public void run(Algorithm algorithm) {
        String s = "barfoothefoobarman";
        String[] words = new String[]{"foo", "bar"};

        Logger.info("字符串为: " + s);
        Logger.info("需要串联的字符列表为: " + ArrayUtils.toString(words, d -> d));
        List<Integer> result = algorithm.findSubstring(s, words);
        AssertUtils.assertCollection(result, "[0,9]", false);


        Logger.info("");

         s = "wordgoodgoodgoodbestword";
        words = new String[]{"word","good","best","word"};

        Logger.info("字符串为: " + s);
        Logger.info("需要串联的字符列表为: " + ArrayUtils.toString(words, d -> d));
         result = algorithm.findSubstring(s, words);
        AssertUtils.assertCollection(result, "[]", false);


    }
}
