package org.chy.anubis.treasury.testcase.leetcode.remove_nth_node_from_end_of_list.template.case02;

import org.chy.anubis.treasury.Exector;
import org.chy.anubis.treasury.log.Logger;
import org.chy.anubis.treasury.testcase.dto.ListNode;
import org.chy.anubis.treasury.testcase.leetcode.remove_nth_node_from_end_of_list.Algorithm;
import org.chy.anubis.treasury.utils.AssertUtils;

public class TestCase implements Exector<Algorithm> {

    @Override
    public void run(Algorithm algorithm) {
        ListNode data = ListNode.of(1);
        int deleteNum = 1;
        Logger.info(" 链表: {" + data.toString() + "},  删除倒数第 {" + deleteNum + "}个元素");
        ListNode result = algorithm.removeNthFromEnd(data, deleteNum);
        AssertUtils.assertListNode(result, null);
        Logger.info("");
    }
}
