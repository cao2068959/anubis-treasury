package org.chy.anubis.treasury.testcase.leetcode.add_two_numbers;

import org.chy.anubis.treasury.log.Logger;
import org.chy.anubis.treasury.testcase.dto.ListNode;

public class AddTwoUtils {

    /**
     * 自动把数字转成链表后, 放入算法中运行, 最后判断结果
     */
    public static void addTwo(int num1, int num2, Algorithm algorithm) {

        ListNode num1List = numToList(num1);
        ListNode num2List = numToList(num2);

        Logger.info("开始计算 [" + num1 + " + " + num2 + " ]");
        ListNode listNode = algorithm.addTwoNumbers(num1List, num2List);

        int intResult = num1 + num2;
        ListNode resultList = numToList(intResult);

        if (!resultList.equals(listNode)) {
            Logger.error("预期结果应该是: " + resultList + " 而当前计算结果为: " + listNode,true);
        }
        Logger.info("\n");
    }

    /**
     * 根据 int的每一位 逆序放入链表中
     */
    private static ListNode numToList(int num) {
        if (num == 0) {
            return new ListNode(0);
        }
        if (num < 0) {
            Logger.error("[两数之和]不支持负数, 当前数字为" + num, true);
            return null;
        }
        int data = num;
        ListNode root = null;
        ListNode currentNode = null;
        while (data != 0) {
            ListNode listNode = new ListNode(data % 10);
            data = data / 10;
            if (root == null) {
                root = listNode;
                currentNode = listNode;
                continue;
            }
            currentNode.setNext(listNode);
            currentNode = listNode;
        }
        return root;
    }

}
