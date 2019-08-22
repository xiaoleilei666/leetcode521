package deleteNode;

public class Main {
    public static void main(String[] args) {
        ListNode listNode = new ListNode(4);
        deleteNode(listNode);
    }
    public static void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
