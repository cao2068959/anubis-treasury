package org.chy.anubis.treasury.testcase.leetcode.merge_k_sorted_lists.template.case02;

import org.chy.anubis.treasury.Exector;
import org.chy.anubis.treasury.log.Logger;
import org.chy.anubis.treasury.testcase.dto.ListNode;
import org.chy.anubis.treasury.testcase.leetcode.merge_k_sorted_lists.Algorithm;
import org.chy.anubis.treasury.utils.ArrayUtils;
import org.chy.anubis.treasury.utils.AssertUtils;


public class TestCase implements Exector<Algorithm> {

    @Override
    public void run(Algorithm algorithm) {

        ListNode[] data = new ListNode[]{ListNode.of(6, 10, 33)};
        Logger.info("[合并链表] 链表为: {" + ArrayUtils.toString(data, ListNode::toString) + "}");
        ListNode result = algorithm.mergeKLists(data);
        AssertUtils.assertListNode(result, ListNode.of(6, 10, 33));
        Logger.info("");

        Logger.info("[合并链表] 链表为: {[]}");
        result = algorithm.mergeKLists(new ListNode[0]);
        AssertUtils.assertListNode(result, null);
        Logger.info("");


        Logger.info("[合并链表] 链表为: {null}");
        result = algorithm.mergeKLists(null);
        AssertUtils.assertListNode(result, null);
        Logger.info("");

    }
}
