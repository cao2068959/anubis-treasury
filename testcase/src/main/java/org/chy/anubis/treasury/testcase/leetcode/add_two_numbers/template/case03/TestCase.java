package org.chy.anubis.treasury.testcase.leetcode.add_two_numbers.template.case03;

import org.chy.anubis.treasury.Exector;
import org.chy.anubis.treasury.testcase.leetcode.add_two_numbers.AddTwoUtils;
import org.chy.anubis.treasury.testcase.leetcode.add_two_numbers.Algorithm;

public class TestCase implements Exector<Algorithm> {

    @Override
    public void run(Algorithm algorithm) {
        AddTwoUtils.addTwo(453, 546, algorithm);
    }
}
