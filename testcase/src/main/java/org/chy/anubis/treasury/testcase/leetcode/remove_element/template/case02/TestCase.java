package org.chy.anubis.treasury.testcase.leetcode.remove_element.template.case02;

import org.chy.anubis.treasury.Exector;
import org.chy.anubis.treasury.log.Logger;
import org.chy.anubis.treasury.testcase.dto.ListNode;
import org.chy.anubis.treasury.testcase.leetcode.remove_element.Algorithm;
import org.chy.anubis.treasury.utils.ArrayUtils;
import org.chy.anubis.treasury.utils.AssertUtils;

public class TestCase implements Exector<Algorithm> {

    @Override
    public void run(Algorithm algorithm) {
        int[] data = new int[]{1, 2, 45, 2, 34, 2, 675, 2, 76, 2, 45, 2, 2, 2, 2, 2, 2, 2};
        int deleteNum = 2;
        Logger.info(" 数组: {" + ArrayUtils.toString(data) + "},  删除值为 {" + deleteNum + "}的元素");
        int result = algorithm.removeElement(data, deleteNum);
        AssertUtils.assertInt(result, 6);
        AssertUtils.assertArray(data, result, new int[]{1, 45, 34, 675, 76, 45}, true);
        Logger.info("");
    }
}
