package com.链表;
/**
* https://leetcode-cn.com/problems/split-linked-list-in-parts/
*
*/
public class _725_分隔链表 {
    public ListNode[] splitListToParts(ListNode head, int k) {
        int len = 0;
        ListNode node= head;
        ListNode[] nodeArr = new ListNode[k];
        while (node != null) {
            len++;
            node = node.next;
        }
        node= head;
        int a = len / k, b = len % k;
        for(int i = 0; i < k; i++) {
            nodeArr[i] = node;
            if(node == null) continue; // ans[i] = [], 后边都是 []
            ListNode temp = node;
            for(int j = 0; j < a + (b > 0? 1 : 0) - 1; ++j) { // 已经放了一个, 所以 -1
                temp = temp.next;
            }
            node = temp.next; // 因为 len = a * k + b, temp 一定不是 null
            temp.next = null;
            b--;
        }
        return nodeArr;
    }
}
