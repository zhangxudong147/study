package JianZhiOffer;
/**
 * @file: test16.java
 * @author: 张旭东
 * @version 创建时间：2019-5-7 下午02:37:18
 * @description:
	题目描述
输入两个单调递增的链表，输出两个链表合成后的链表，当然我们需要合成后的链表满足单调不减规则
 */
public class test16 {
	public static ListNode Merge(ListNode list1,ListNode list2) {
        if(list1 == null && list2 == null)
        	return null;
        ListNode newList=new ListNode(-1);
        ListNode currNode=newList;
        while(list1 != null && list2 != null){
        	if(list1.val<list2.val){
        		currNode.next=list1;
        		currNode=list1;
        		list1=list1.next;
        	}
        	else{
        		currNode.next=list2;
        		currNode=list2;
        		list2=list2.next;
        	}
        }
        currNode.next= (list1 == null ? list2 : list1);
        
        return newList.next;
    }
	
	public static void main(String[] args) {
		ListNode list1=new ListNode(1);
		ListNode temp=list1;
		for(int i=3;i<=10;i+=2){
			ListNode node=new ListNode(i);
			temp.next=node;
			temp=temp.next;
		}
		ListNode list2=new ListNode(0);
		temp=list2;
		for(int i=2;i<=10;i+=2){
			ListNode node=new ListNode(i);
			temp.next=node;
			temp=temp.next;
		}
		temp=Merge(list1,list2);
		while(temp!=null){
			System.out.println(temp.val);
			temp=temp.next;
		}
	}
}
