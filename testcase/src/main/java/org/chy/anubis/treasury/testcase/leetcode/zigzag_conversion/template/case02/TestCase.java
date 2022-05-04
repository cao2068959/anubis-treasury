package org.chy.anubis.treasury.testcase.leetcode.zigzag_conversion.template.case02;

import org.chy.anubis.treasury.Exector;
import org.chy.anubis.treasury.log.Logger;
import org.chy.anubis.treasury.testcase.leetcode.zigzag_conversion.Algorithm;
import org.chy.anubis.treasury.testcase.leetcode.zigzag_conversion.ZUtils;
import org.chy.anubis.treasury.utils.ArrayUtils;
import org.chy.anubis.treasury.utils.AssertUtils;

public class TestCase implements Exector<Algorithm> {

    @Override
    public void run(Algorithm algorithm) {
        String data = "PAYPALISHIRING";
        int num = 3;
        Logger.info("测试的Z行字符为:");
        ZUtils.zPrint(data, num);
        String convert = algorithm.convert(data, num);
        AssertUtils.assertString(convert, "PAHNAPLSIIGYIR");

        Logger.info("");

        data = "PAYPALISHIRING";
        num = 4;
        Logger.info("测试的Z行字符为:");
        ZUtils.zPrint(data, num);
        convert = algorithm.convert(data, num);
        AssertUtils.assertString(convert, "PINALSIGYAHRPI");
    }
}
