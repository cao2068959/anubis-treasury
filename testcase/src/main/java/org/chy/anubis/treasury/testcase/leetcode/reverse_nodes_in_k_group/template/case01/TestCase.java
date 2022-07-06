package org.chy.anubis.treasury.testcase.leetcode.reverse_nodes_in_k_group.template.case01;

import org.chy.anubis.treasury.Exector;
import org.chy.anubis.treasury.log.Logger;
import org.chy.anubis.treasury.testcase.dto.ListNode;
import org.chy.anubis.treasury.testcase.leetcode.reverse_nodes_in_k_group.Algorithm;
import org.chy.anubis.treasury.utils.AssertUtils;

public class TestCase implements Exector<Algorithm> {

    @Override
    public void run(Algorithm algorithm) {
        ListNode data = ListNode.of(1, 2, 3, 4, 5, 6, 7, 8);
        int group = 4;
        Logger.info("[链表翻转] 每[" + group + "]个为一组翻转,数据为:" + data);
        ListNode result = algorithm.reverseKGroup(data, group);
        AssertUtils.assertListNode(result, ListNode.of(4, 3, 2, 1, 8, 7, 6, 5));

        Logger.info("");


        data = ListNode.of(1, 2, 3, 4, 5, 6, 7);
        group = 4;
        Logger.info("[链表翻转] 每[" + group + "]个为一组翻转,数据为:" + data);
        result = algorithm.reverseKGroup(data, group);
        AssertUtils.assertListNode(result, ListNode.of(4, 3, 2, 1, 5, 6, 7));

        Logger.info("");

    }
}
