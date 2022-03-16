/**
 * @author Vstay
 * @date 2022/1/20 11:35
 */
public class Test_ListNode {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }//Leetcode中链表的定义
    }

    private static ListNode createLinkedList(int[] arr) {//将输入的数组输入到链表中
        if (arr.length == 0) {
            return null;
        }
        ListNode head = new ListNode(arr[0]);
        ListNode current = head;
        for (int i = 1; i < arr.length; i++) {//过程
            current.next = new ListNode(arr[i]);
            current = current.next;
        }
        return head;
    }

    private static void printLinkedList(ListNode head) {//将链表结果打印
        ListNode current = head;
        while (current != null) {
            System.out.printf("%d -> ", current.val);
            current = current.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        Test_ListNode test = new Test_ListNode();

        int[] x = {1, 2, 3, 4, 5};
        ListNode list1 = createLinkedList(x);

        printLinkedList(list1);


//        ListNode res = test.middleNode(list1);
//        printLinkedList(res);
    }

}


//class ListNode {
//    int val;
//    ListNode next;
//
//    ListNode() {
//    }
//
//    ListNode(int val) {
//        this.val = val;
//    }
//
//    ListNode(int val, ListNode next) {
//        this.val = val;
//        this.next = next;
//    }
//}
