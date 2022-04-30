package org.chy.anubis.treasury.testcase.dto;

import java.util.Iterator;


public class ListNode implements Iterable<Integer> {
    int val;
    ListNode next;


    ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    /**
     * 按照顺序生成链表
     */
    public static ListNode of(int... datas) {
        if (datas == null || datas.length == 0) {
            return null;
        }
        ListNode currentNode = null;
        ListNode result = null;
        for (int data : datas) {
            ListNode listNode = new ListNode(data);
            if (result == null) {
                result = listNode;
                currentNode = result;
                continue;
            }
            currentNode.next = listNode;
            currentNode = listNode;
        }
        return result;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public ListNode getNext() {
        return next;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }

    public boolean equals(ListNode listNode) {
        if (listNode == null) {
            return false;
        }
        ListNode target = listNode;
        for (Integer value : this) {
            if (target == null || target.val != value) {
                return false;
            }
            target = target.next;
        }
        return true;
    }


    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("[");
        boolean first = true;
        for (Integer value : this) {
            if (!first) {
                result.append(" , ");
            }
            result.append(value);
            first = false;
        }
        result.append("]");
        return result.toString();
    }

    @Override
    public Iterator<Integer> iterator() {
        return new ListNodeIterator(this);
    }

    class ListNodeIterator implements Iterator<Integer> {
        ListNode data;

        public ListNodeIterator(ListNode data) {
            this.data = data;

        }

        @Override
        public boolean hasNext() {
            return data != null;
        }

        @Override
        public Integer next() {
            int val = data.val;
            data = data.next;
            return val;
        }
    }


}
