package org.chy.anubis.treasury.testcase.leetcode.swap_nodes_in_pairs.template.case01;

import org.chy.anubis.treasury.Exector;
import org.chy.anubis.treasury.log.Logger;
import org.chy.anubis.treasury.testcase.dto.ListNode;
import org.chy.anubis.treasury.testcase.leetcode.swap_nodes_in_pairs.Algorithm;
import org.chy.anubis.treasury.utils.AssertUtils;

public class TestCase implements Exector<Algorithm> {

    @Override
    public void run(Algorithm algorithm) {
        ListNode data = ListNode.of(1, 2, 3, 4, 5, 6, 7, 8);

        Logger.info("[链表节点交换] 测试数据为:" + data);
        ListNode result = algorithm.swapPairs(data);
        AssertUtils.assertListNode(result, ListNode.of(2, 1, 4, 3, 6, 5, 8, 7));

        Logger.info("");

        data = ListNode.of(1, 2, 3, 4, 5, 6, 7);
        Logger.info("[链表节点交换] 测试数据为:" + data);
        result = algorithm.swapPairs(data);
        AssertUtils.assertListNode(result, ListNode.of(2, 1, 4, 3, 6, 5, 7));

        Logger.info("");

    }
}
