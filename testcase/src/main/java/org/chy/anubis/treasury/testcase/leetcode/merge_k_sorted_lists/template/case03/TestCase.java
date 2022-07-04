package org.chy.anubis.treasury.testcase.leetcode.merge_k_sorted_lists.template.case03;

import org.chy.anubis.treasury.Exector;
import org.chy.anubis.treasury.log.Logger;
import org.chy.anubis.treasury.testcase.dto.ListNode;
import org.chy.anubis.treasury.testcase.leetcode.merge_k_sorted_lists.Algorithm;
import org.chy.anubis.treasury.utils.ArrayUtils;
import org.chy.anubis.treasury.utils.AssertUtils;


public class TestCase implements Exector<Algorithm> {

    @Override
    public void run(Algorithm algorithm) {
        ListNode[] data = new ListNode[]{ListNode.of(1, 3, 5, 7, 9), ListNode.of(2, 14, 26, 128, 300),
                ListNode.of(123, 133, 324, 332, 544), ListNode.of(4, 5, 13, 28, 265), ListNode.of(17, 34, 164, 183, 1230),
                ListNode.of(67, 188, 424, 1222, 1333),
                ListNode.of(2, 4, 6, 8, 10, 30, 40, 80, 90, 100, 345, 420, 500)};
        Logger.info("[合并链表] 链表为: {" + ArrayUtils.toString(data, ListNode::toString) + "}");
        ListNode result = algorithm.mergeKLists(data);
        AssertUtils.assertListNode(result, ListNode.of(1 , 2 , 2 , 3 , 4 , 4 , 5 , 5 , 6 , 7 , 8 , 9 , 10 , 13 , 14 , 17 , 26 , 28 , 30 , 34 , 40 , 67 , 80 , 90 , 100 , 123 , 128 , 133 , 164 , 183 , 188 , 265 , 300 , 324 , 332 , 345 , 420 , 424 , 500 , 544 , 1222 , 1230 , 1333));
        Logger.info("");
    }
}
