package com.哈希表;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class _817_链表组件 {

    public int numComponents2(ListNode head, int[] nums) {
        int ans = 0;
        Set<Integer> set = new HashSet<>();
        for (int x : nums) set.add(x);
        while (head != null) {
            if (set.contains(head.val)) {
                while (head != null && set.contains(head.val)) head = head.next;
                ans++;
            } else {
                head = head.next;
            }
        }
        return ans;
    }

    public int numComponents(ListNode head, int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int max = 0;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }

        Integer oldIndex = map.get(head.val);
        if (oldIndex != null) max = 1;
        head = head.next;

        while (head != null) {
            Integer index = map.get(head.val);
            if (index != null) {
                if (oldIndex == null) {
                    count = 1;
                } else {
                    if (index - oldIndex > 0) {
                        if (count == 0) {
                            count = 2;
                        } else {
                            count += 1;
                        }
                        max = Math.max(max, count);
                    } else {
                        count = 1;
                    }
                }
                oldIndex = index;
            } else {
                count = 0;
            }
            head = head.next;
        }

        return max;
    }

    private class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
