package com.problems;

import com.helpers.Input;
import com.library.ListNode;

import java.util.HashSet;
import java.util.Set;

public class lc0142 {
    public static void main(String[] args) {
        Input input = new Input();
        ListNode head = input.inputSinglyLinkedList();
        ListNode result = detectCycle(head);
        System.out.println(result);
    }
    public static ListNode detectCycle(ListNode head) {
        ListNode curr = head;
        Set<ListNode> set = new HashSet<>();
        while (curr != null) {
            if (set.contains(curr))
                return curr;
            set.add(curr);
            curr = curr.next;
        }
        return null;
    }
}
