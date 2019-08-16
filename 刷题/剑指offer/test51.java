package JianZhiOffer;
import java.util.HashMap;
/**
 * @file: test51.java
 * @author: 张旭东
 * @version 创建时间：2019-6-19 下午09:17:44
 * @description:
给一个链表，若其中包含环，请找出该链表的环的入口结点，否则，输出null。

//先说个定理：两个指针一个fast、一个slow同时从一个链表的头部出发
//fast一次走2步，slow一次走一步，如果该链表有环，两个指针必然在环内相遇
//此时只需要把其中的一个指针重新指向链表头部，另一个不变（还在环内），
//这次两个指针一次走一步，相遇的地方就是入口节点。
//这个定理可以自己去网上看看证明。
 */
public class test51 {
	public ListNode EntryNodeOfLoop(ListNode pHead)
    {
		HashMap<ListNode,Integer> map=new HashMap<ListNode, Integer>();
		ListNode p=pHead;
		while(p!=null){
			if(!map.containsKey(p)){
				map.put(p, 1);
			}else{
				return p;
			}
			p=p.next;
		}
        return null;
    }
}
