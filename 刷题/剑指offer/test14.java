package JianZhiOffer;
/**
 * @file: test14.java
 * @author: ����
 * @version ����ʱ�䣺2019-5-7 ����11:18:50
 * @description:
	��Ŀ����
����һ����������������е�����k����㡣
 */


class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}

public class test14 {
	 public ListNode FindKthToTail(ListNode head,int k) {
		 int len=0;
		 ListNode p=head;
		 while(p!=null){
			 len++;
			 p=p.next;
		 }
		 
		 p=head;
		 int i=1;
		 while(p!=null){
			 if(i==(len-k+1))
				 return p;
			 i++;
			 p=p.next;
		 }
		 return null;
	 }
	 public static ListNode FindKthToTail2(ListNode head,int k) {
		 int l=0;
		 ListNode p=head;
		 ListNode q=head;
		 while(p!=null){
			 l++;
			 if(l==k){
				 while(p.next!=null){
					 p=p.next;
					 q=q.next;
				 } 
				 return q;
			 } 	 
			 p=p.next;
		 }
		 return null;
	 }
	 public static void main(String[] args) {
		ListNode list=new ListNode(0);
		ListNode temp=list;
		for(int i=1;i<=10;i++){
			ListNode node=new ListNode(i);
			temp.next=node;
			temp=temp.next;
		}
		temp=FindKthToTail2(list,10);
		System.out.println(temp.val);
	}
}
