package JianZhiOffer;
/**
 * @file: test52.java
 * @author: ����
 * @version ����ʱ�䣺2019-6-19 ����09:40:35
 * @description:
	��һ������������У������ظ��Ľ�㣬��ɾ�����������ظ��Ľ�㣬�ظ��Ľ�㲻��������������ͷָ�롣 ���磬����1->2->3->3->4->4->5 
	�����Ϊ 1->2->5
 */
public class test52 {
    public static ListNode deleteDuplication(ListNode pHead)
    {
    	if(pHead==null ||pHead.next==null)
    		return pHead;
    	
    	if(pHead.next.next==null){
    		if(pHead.val==pHead.next.val)
    			pHead=null;
    		return pHead;    			
    	}
    	ListNode head=new ListNode(-1);
    	head.next=pHead;
    	
    	ListNode p=head;
    	ListNode c=pHead;
    	ListNode f=pHead.next;
    	
    	while(f!=null){
    		if(c.val!=f.val){
    			p.next=c;
    			p=c;
    			c=f;
    			f=f.next;
    		}
    		else{
    			while( f!=null && c.val==f.val){
    				c=f;
    				f=f.next;
    			}
    			if(f!=null){
    				c=f;
    				p.next=c;
    				f=f.next;
    			}else{
    				p.next=null;
    				return head.next;
    			}	
    		}
    	}
    	return head.next;
    }
    public static void main(String[] args) {
		ListNode head=new ListNode(1);
		ListNode p1=new ListNode(2);
		ListNode p2=new ListNode(2);
		ListNode p3=new ListNode(3);
		ListNode p4=new ListNode(4);
		head.next=p1;
		p1.next=p2;
		p2.next=p3;
		p3.next=p4;
		p4.next=null;
		
		ListNode head2=deleteDuplication(head);
		while(head2!=null){
			System.out.println(head2.val);
			head2=head2.next;
		}
	}
}
