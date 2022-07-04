package org.chy.anubis.treasury.testcase.leetcode.merge_two_sorted_lists.template.case01;

import org.chy.anubis.treasury.Exector;
import org.chy.anubis.treasury.log.Logger;
import org.chy.anubis.treasury.testcase.dto.ListNode;
import org.chy.anubis.treasury.testcase.leetcode.merge_two_sorted_lists.Algorithm;
import org.chy.anubis.treasury.utils.AssertUtils;


public class TestCase implements Exector<Algorithm> {

    @Override
    public void run(Algorithm algorithm) {

        ListNode listNode1 = ListNode.of(1, 3, 5, 7, 9);
        ListNode listNode2 = ListNode.of(2, 4, 6, 8, 10);
        Logger.info("[合并链表] 链表1为: {" + listNode1 + "} 链表2为: {" + listNode2 + "}");
        ListNode result = algorithm.mergeTwoLists(listNode1, listNode2);
        AssertUtils.assertListNode(result, ListNode.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        Logger.info("");

        listNode1 = ListNode.of(1, 3, 5, 7, 9);
        listNode2 = ListNode.of(2, 10);
        Logger.info("[合并链表] 链表1为: {" + listNode1 + "} 链表2为: {" + listNode2 + "}");
        result = algorithm.mergeTwoLists(listNode1, listNode2);
        AssertUtils.assertListNode(result, ListNode.of(1, 2, 3, 5, 7, 9, 10));

    }
}
