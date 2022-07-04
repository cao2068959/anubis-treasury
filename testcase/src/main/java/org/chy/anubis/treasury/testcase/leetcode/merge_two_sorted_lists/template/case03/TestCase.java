package org.chy.anubis.treasury.testcase.leetcode.merge_two_sorted_lists.template.case03;

import org.chy.anubis.treasury.Exector;
import org.chy.anubis.treasury.log.Logger;
import org.chy.anubis.treasury.testcase.dto.ListNode;
import org.chy.anubis.treasury.testcase.leetcode.merge_two_sorted_lists.Algorithm;
import org.chy.anubis.treasury.utils.AssertUtils;


public class TestCase implements Exector<Algorithm> {

    @Override
    public void run(Algorithm algorithm) {

        ListNode listNode1 = ListNode.of(10, 11, 12, 13);
        ListNode listNode2 = ListNode.of(1, 2, 3);
        Logger.info("[合并链表] 链表1为: {" + listNode1 + "} 链表2为: {" + listNode2 + "}");

        ListNode result = algorithm.mergeTwoLists(listNode1, listNode2);
        AssertUtils.assertListNode(result, ListNode.of(1, 2, 3, 10, 11, 12, 13));
        Logger.info("");

    }
}
