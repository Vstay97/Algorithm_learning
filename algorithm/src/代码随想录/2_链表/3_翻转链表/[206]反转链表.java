package 代码随想录//给你单链表的头节点 head ，请你反转链表，并返回反转后的链表。
//
//
//
//
// 示例 1：
//
//
//输入：head = [1,2,3,4,5]
//输出：[5,4,3,2,1]
//
//
// 示例 2：
//
//
//输入：head = [1,2]
//输出：[2,1]
//
//
// 示例 3：
//
//
//输入：head = []
//输出：[]
//
//
//
//
// 提示：
//
//
// 链表中节点的数目范围是 [0, 5000]
// -5000 <= Node.val <= 5000
//
//
//
//
// 进阶：链表可以选用迭代或递归方式完成反转。你能否用两种方法解决这道题？
//
//
// Related Topics 递归 链表 👍 2621 👎 0


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
    /**
     * 双指针法:
     *      首先定义一个cur指针，指向头结点，再定义一个pre指针，初始化为null(节省时间, 不用重复创建)。
     *      然后就要开始反转了，首先要把 cur->next 节点用tmp指针保存一下，也就是保存一下这个节点。
     *
     *      为什么要保存一下这个节点呢，因为接下来要改变 cur->next 的指向了，将cur->next 指向pre ，此时已经反转了第一个节点了。
     *      接下来，就是循环走如下代码逻辑了，继续移动pre和cur指针。
     *      最后，cur 指针已经指向了null，循环结束，链表也反转完毕了。 此时我们return pre指针就可以了，pre指针就指向了新的头结点。
     */
    public ListNode reverseList(ListNode head) {
        ListNode curr = head;
        ListNode prev = null;
        // 在这里创建是因为: 如果写到while里 就要重复创建
        ListNode tmp = null;
        while (curr != null){
            // 先把最后curr要指向的结点保存一下
            tmp = curr.next;
            // 开始反转的逻辑
            curr.next = prev;
            prev = curr;
            curr = tmp;
        }
        return prev;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
