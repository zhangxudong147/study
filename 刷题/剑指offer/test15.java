package JianZhiOffer;
/**
 * @file: test15.java
 * @author: ����
 * @version ����ʱ�䣺2019-5-7 ����02:08:19
 * @description:
	��Ŀ����
����һ��������ת��������������ı�ͷ��
 */
public class test15 {
    public static ListNode ReverseList(ListNode head) {
    	if(head==null)
    		return null;
    	ListNode newList=head;
    	head=head.next;
    	newList.next=null;
    	
    	while(head!=null){
    		ListNode temp=head;
    		head=head.next;
    		
    		temp.next=newList;
    		newList=temp;
    	}
    	return newList;
    }
    
    public static void main(String[] args) {
    	ListNode list=new ListNode(1);
		ListNode temp=list;
		for(int i=2;i<=10;i++){
			ListNode node=new ListNode(i);
			temp.next=node;
			temp=temp.next;
		}
		temp=ReverseList(list);
		while(temp!=null){
			System.out.println(temp.val);
			temp=temp.next;
		}
	}
}
