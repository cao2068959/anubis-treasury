package org.chy.anubis.treasury.testcase.leetcode.merge_k_sorted_lists.template.case01;

import org.chy.anubis.treasury.Exector;
import org.chy.anubis.treasury.log.Logger;
import org.chy.anubis.treasury.testcase.dto.ListNode;
import org.chy.anubis.treasury.testcase.leetcode.merge_k_sorted_lists.Algorithm;
import org.chy.anubis.treasury.utils.ArrayUtils;
import org.chy.anubis.treasury.utils.AssertUtils;


public class TestCase implements Exector<Algorithm> {

    @Override
    public void run(Algorithm algorithm) {
        ListNode[] data = new ListNode[]{ListNode.of(1, 3, 5, 7, 9), ListNode.of(2, 4, 6, 8, 10)};
        Logger.info("[合并链表] 链表为: {" + ArrayUtils.toString(data, ListNode::toString) + "}");
        ListNode result = algorithm.mergeKLists(data);
        AssertUtils.assertListNode(result, ListNode.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        Logger.info("");
    }
}
