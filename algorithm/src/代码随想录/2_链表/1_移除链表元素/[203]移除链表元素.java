package 代码随想录//给你一个链表的头节点 head 和一个整数 val ，请你删除链表中所有满足 Node.val == val 的节点，并返回 新的头节点 。
//
//
// 示例 1：
//
//
//输入：head = [1,2,6,3,4,5,6], val = 6
//输出：[1,2,3,4,5]
//
//
// 示例 2：
//
//
//输入：head = [], val = 1
//输出：[]
//
//
// 示例 3：
//
//
//输入：head = [7,7,7,7], val = 7
//输出：[]
//
//
//
//
// 提示：
//
//
// 列表中的节点数目在范围 [0, 10⁴] 内
// 1 <= Node.val <= 50
// 0 <= val <= 50
//
// Related Topics 递归 链表 👍 959 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        // 新建一个 作为头结点
        ListNode dummy = new ListNode(-1,head);
        // 虚拟结点, 一个指向前面的 一个指向当前的
        ListNode curr = head;
        ListNode prev = dummy;
        // 当前的不为空
        while (curr != null){
            // 遇到了要删除的结点, 就把前面的next 直接指向当前的next
            if (curr.val == val){
                prev.next = curr.next;
            }else{
                // 不是要删除的结点,就把现在的结点 赋给前面
                prev = curr;
            }
            // 统一逻辑: curr指向下一个
            curr = curr.next;
        }

        // 返回头结点的后一个
        return dummy.next;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
