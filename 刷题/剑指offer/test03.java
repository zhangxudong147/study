package JianZhiOffer;

import java.util.ArrayList;
//输入一个链表，按链表值从尾到头的顺序返回一个ArrayList。

/*
class ListNode {
	int val;
	ListNode next = null;
	
	ListNode(int val) {
		this.val = val;
		}
}*/

public class test03 {
	public static ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
		ArrayList list=new ArrayList<Integer>();
		ArrayList list2=new ArrayList<Integer>();
		while(listNode!=null){
			list.add(listNode.val);
			listNode=listNode.next;
		}
		for(int i=list.size()-1;i>=0;i--){
			list2.add(list.get(i));
		}
		return list2;
    }
	
	public static void main(String[] args) {
		ListNode listnode=new ListNode(0);
		ListNode temp1=listnode;
		
		for(int i=1;i<=10;i++){
			ListNode temp2=new ListNode(i);
			temp1.next=temp2;
			temp1=temp2;
		}
		
		ArrayList list=new ArrayList<Integer>();
		list= printListFromTailToHead(listnode);
		
		System.out.println(list.toString());
		
	}
}
