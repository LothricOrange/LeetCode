package leetCodeA.剑指Offer.第2天_链表;

import java.util.HashMap;

public class 剑指Offer35_复杂链表的复制 {
    public Node copyRandomList(Node head) {
        HashMap<Node, Node> map = new HashMap<>();
        Node node = head;
        while (node != null) {
            map.put(node, new Node(node.val));
            node = node.next;
        }

        node = head;
        while (node != null) {
            Node cloneNode = map.get(node);
            cloneNode.next = map.get(node.next);
            cloneNode.random = map.get(node.random);
            node = node.next;
        }
        return map.get(head);
    }
}

class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
