package LeetCode;

public class Test21 {
    public static void main(String[] args) {

    }

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);//哑结点
        ListNode l = dummy;
        while(l1 == null && l2 == null){//如果有一个链表已经遍历完了，就退出
            if(l1.val > l2.val){
                l.next = l2;
                l2 = l2.next;

            }else{
                l.next = l1;
                l1 = l1.next;
            }
            l = l.next;
        }
        if(l1.next!=null){
            l.next = l1;
        }
        if(l2.next!=null){
            l.next = l2;
        }

        return dummy.next;
    }

}
