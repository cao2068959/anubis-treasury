package org.chy.anubis.treasury.testcase.leetcode.reverse_nodes_in_k_group.template.case03;

import org.chy.anubis.treasury.Exector;
import org.chy.anubis.treasury.log.Logger;
import org.chy.anubis.treasury.testcase.dto.ListNode;
import org.chy.anubis.treasury.testcase.leetcode.reverse_nodes_in_k_group.Algorithm;
import org.chy.anubis.treasury.utils.AssertUtils;

public class TestCase implements Exector<Algorithm> {

    @Override
    public void run(Algorithm algorithm) {
        ListNode data = ListNode.of(34, 72, 13, 34, 15, 26, 75, 18);
        int group = 2;
        Logger.info("[链表翻转] 每[" + group + "]个为一组翻转,数据为:" + data);
        ListNode result = algorithm.reverseKGroup(data, group);
        AssertUtils.assertListNode(result, ListNode.of(72, 34, 34, 13, 26, 15, 18, 75));

        Logger.info("");

    }
}
