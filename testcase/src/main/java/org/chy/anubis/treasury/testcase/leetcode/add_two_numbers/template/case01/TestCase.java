package org.chy.anubis.treasury.testcase.leetcode.add_two_numbers.template.case01;

import org.chy.anubis.treasury.Exector;
import org.chy.anubis.treasury.testcase.leetcode.add_two_numbers.AddTwoUtils;
import org.chy.anubis.treasury.testcase.leetcode.add_two_numbers.Algorithm;

public class TestCase implements Exector<Algorithm> {

    @Override
    public void run(Algorithm algorithm) {
        AddTwoUtils.addTwo(454, 56553, algorithm);
        AddTwoUtils.addTwo(1234215, 234, algorithm);
        AddTwoUtils.addTwo(45, 64, algorithm);
    }
}
