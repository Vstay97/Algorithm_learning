//给你一个链表，删除链表的倒数第 n 个结点，并且返回链表的头结点。 
//
// 
//
// 示例 1： 
//
// 
//输入：head = [1,2,3,4,5], n = 2
//输出：[1,2,3,5]
// 
//
// 示例 2： 
//
// 
//输入：head = [1], n = 1
//输出：[]
// 
//
// 示例 3： 
//
// 
//输入：head = [1,2], n = 1
//输出：[1]
// 
//
// 
//
// 提示： 
//
// 
// 链表中结点的数目为 sz 
// 1 <= sz <= 30 
// 0 <= Node.val <= 100 
// 1 <= n <= sz 
// 
//
// 
//
// 进阶：你能尝试使用一趟扫描实现吗？ 
// Related Topics 链表 双指针 👍 1853 👎 0


package QuestionTemp.leetcode.editor.cn;

public class RemoveNthNodeFromEndOfList {
    public static void main(String[] args) {
        Solution solution = new RemoveNthNodeFromEndOfList().new Solution();

    }
    //leetcode submit region begin(Prohibit modification and deletion)

    /**
     * Definition for singly-linked list.
     * public class ListNode {
     * int val;
     * ListNode next;
     * ListNode() {}
     * ListNode(int val) { this.val = val; }
     * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */
    class Solution {
        public ListNode removeNthFromEnd(ListNode head, int n) {
            // 虚拟头节点
            ListNode dummy = new ListNode(-1);
            dummy.next = head;

            // 要删除倒数第n个，就要找到倒数第n+1个
            ListNode x = findFromEnd(dummy, n + 1);
            x.next = x.next.next;

            return dummy.next;
        }

        public ListNode findFromEnd(ListNode head, int n) {
            ListNode p1 = head, p2 = head;
            // p1 先走 k 步
            for (int i = 0; i < n; i++) {
                p1 = p1.next;
            }
            // p1 p2 同时走 n-k步
            while (p1 != null) {
                p1 = p1.next;
                p2 = p2.next;
            }
            // 返回倒数第k个节点(正数第n-k个结点)
            return p2;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}