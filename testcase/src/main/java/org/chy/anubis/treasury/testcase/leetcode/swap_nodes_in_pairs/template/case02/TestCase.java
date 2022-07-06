package org.chy.anubis.treasury.testcase.leetcode.swap_nodes_in_pairs.template.case02;

import org.chy.anubis.treasury.Exector;
import org.chy.anubis.treasury.log.Logger;
import org.chy.anubis.treasury.testcase.dto.ListNode;
import org.chy.anubis.treasury.testcase.leetcode.swap_nodes_in_pairs.Algorithm;
import org.chy.anubis.treasury.utils.AssertUtils;

public class TestCase implements Exector<Algorithm> {

    @Override
    public void run(Algorithm algorithm) {
        ListNode data = ListNode.of(1);

        Logger.info("[链表节点交换] 测试数据为:" + data);
        ListNode result = algorithm.swapPairs(data);
        AssertUtils.assertListNode(result, ListNode.of(1));

        Logger.info("");


    }
}
