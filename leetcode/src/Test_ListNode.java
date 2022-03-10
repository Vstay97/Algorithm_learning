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

        int[] x = {1, 2, 4};
        int[] y = {1, 3, 4};
        ListNode list1 = createLinkedList(x);
        ListNode list2 = createLinkedList(y);
        printLinkedList(list1);
        printLinkedList(list2);

        ListNode res = test.mergeTwoLists(list1, list2);
        printLinkedList(res);
    }


    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null || list2 == null)
            return list1 == null ? list2 : list1;
        ListNode dummy = new ListNode(-1);
        ListNode p = dummy;
        ListNode p1 = list1, p2 = list2;

        while (p1 != null && p2 != null) {
            if(p1.val <= p2.val){
                p.next = p1;
                p1 = p1.next;
            }
            else if (p1.val > p2.val){
                p.next = p2;
                p2 = p2.next;
            }
            p =p.next;
        }
        if (p2 == null)
            p.next = p1;
        if (p1 == null)
            p.next = p2;

        return dummy.next;
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
