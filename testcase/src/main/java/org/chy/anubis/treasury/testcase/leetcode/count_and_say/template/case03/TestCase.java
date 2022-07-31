package org.chy.anubis.treasury.testcase.leetcode.count_and_say.template.case03;

import org.chy.anubis.treasury.Exector;
import org.chy.anubis.treasury.log.Logger;
import org.chy.anubis.treasury.testcase.leetcode.count_and_say.Algorithm;
import org.chy.anubis.treasury.utils.AssertUtils;

public class TestCase implements Exector<Algorithm> {

    @Override
    public void run(Algorithm algorithm) {
        int n = 15;
        Logger.info(" 输出外观数列的第 [" + n + "] 项");
        String result = algorithm.countAndSay(n);
        AssertUtils.assertString(result, "311311222113111231131112132112311321322112111312211312111322212311322113212221");
        Logger.info("");

    }
}
