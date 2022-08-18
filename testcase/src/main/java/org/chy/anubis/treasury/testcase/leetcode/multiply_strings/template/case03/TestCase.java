package org.chy.anubis.treasury.testcase.leetcode.multiply_strings.template.case03;

import org.chy.anubis.treasury.Exector;
import org.chy.anubis.treasury.log.Logger;
import org.chy.anubis.treasury.testcase.dto.ListNode;
import org.chy.anubis.treasury.testcase.leetcode.multiply_strings.Algorithm;
import org.chy.anubis.treasury.utils.AssertUtils;


public class TestCase implements Exector<Algorithm> {

    @Override
    public void run(Algorithm algorithm) {

        int num = 0;
        long num2 = 345;
        Logger.info("[字符串相乘] " + num + " * " + num2 + " ");
        String result = algorithm.multiply(num + "", num2 + "");
        AssertUtils.assertString(result, (num * num2) + "");
        Logger.info("");
    }
}
