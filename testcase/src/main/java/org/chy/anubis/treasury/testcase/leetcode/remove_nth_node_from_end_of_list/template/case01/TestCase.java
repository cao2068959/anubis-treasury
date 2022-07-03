package org.chy.anubis.treasury.testcase.leetcode.remove_nth_node_from_end_of_list.template.case01;

import org.chy.anubis.treasury.Exector;
import org.chy.anubis.treasury.log.Logger;
import org.chy.anubis.treasury.testcase.dto.ListNode;
import org.chy.anubis.treasury.testcase.leetcode.remove_nth_node_from_end_of_list.Algorithm;
import org.chy.anubis.treasury.utils.AssertUtils;

public class TestCase implements Exector<Algorithm> {

    @Override
    public void run(Algorithm algorithm) {
        ListNode data = ListNode.of(1, 2, 3, 4, 5, 6, 7, 8);
        int deleteNum = 3;

        Logger.info(" 链表: {" + data.toString() + "},  删除倒数第 {" + deleteNum + "}个元素");
        ListNode result = algorithm.removeNthFromEnd(data, deleteNum);
        AssertUtils.assertListNode(result, ListNode.of(1, 2, 3, 4, 5, 7, 8));
        Logger.info("");


        deleteNum = 1;
        Logger.info(" 链表: {" + data.toString() + "},  删除倒数第 {" + deleteNum + "}个元素");
        result = algorithm.removeNthFromEnd(data, deleteNum);
        AssertUtils.assertListNode(result, ListNode.of(1, 2, 3, 4, 5, 6, 7));
        Logger.info("");


        deleteNum = 8;
        Logger.info(" 链表: {" + data.toString() + "},  删除倒数第 {" + deleteNum + "}个元素");
        result = algorithm.removeNthFromEnd(data, deleteNum);
        AssertUtils.assertListNode(result, ListNode.of(2, 3, 4, 5, 6, 7, 8));
        Logger.info("");

    }
}
