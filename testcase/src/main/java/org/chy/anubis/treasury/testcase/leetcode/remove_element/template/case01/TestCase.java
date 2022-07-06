package org.chy.anubis.treasury.testcase.leetcode.remove_element.template.case01;

import org.chy.anubis.treasury.Exector;
import org.chy.anubis.treasury.log.Logger;
import org.chy.anubis.treasury.testcase.dto.ListNode;
import org.chy.anubis.treasury.testcase.leetcode.remove_element.Algorithm;
import org.chy.anubis.treasury.utils.ArrayUtils;
import org.chy.anubis.treasury.utils.AssertUtils;

public class TestCase implements Exector<Algorithm> {

    @Override
    public void run(Algorithm algorithm) {
        int[] data = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
        int deleteNum = 5;
        Logger.info(" 数组: {" + ArrayUtils.toString(data) + "},  删除值为 {" + deleteNum + "}的元素");
        int result = algorithm.removeElement(data, deleteNum);
        AssertUtils.assertInt(result, 7);
        AssertUtils.assertArray(data, result, new int[]{1, 2, 3, 4, 6, 7, 8}, true);
        Logger.info("");


        data = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
        deleteNum = 7;
        Logger.info(" 数组: {" + ArrayUtils.toString(data) + "},  删除值为 {" + deleteNum + "}的元素");
        result = algorithm.removeElement(data, deleteNum);
        AssertUtils.assertInt(result, 7);
        AssertUtils.assertArray(data, result, new int[]{1, 2, 3, 4, 5, 6, 8}, true);
        Logger.info("");


        data = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
        deleteNum = 10;
        Logger.info(" 数组: {" + ArrayUtils.toString(data) + "},  删除值为 {" + deleteNum + "}的元素");
        result = algorithm.removeElement(data, deleteNum);
        AssertUtils.assertInt(result, 8);
        AssertUtils.assertArray(data, result, new int[]{1, 2, 3, 4, 5, 6, 7, 8}, true);
        Logger.info("");

    }
}
