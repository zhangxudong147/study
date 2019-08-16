package JianZhiOffer;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/**
 * @file: test25.java
 * @author: 张旭东
 * @version 创建时间：2019-5-16 上午09:38:33
 * @description:
	题目描述
输入一个复杂链表（每个节点中有节点值，以及两个指针，一个指向下一个节点，另一个特殊指针指向任意一个节点），
返回结果为复制后复杂链表的head。（注意，输出结果中请不要返回参数中的节点引用，否则判题程序会直接返回空）
思路：
	1、先用next讲链表复制下来，并用map记录每个节点对应的random节点的数字
	2、在遍历map将每个节点的random节点连起来
 */

class RandomListNode {
    int label;
    RandomListNode next = null;
    RandomListNode random = null;

    RandomListNode(int label) {
        this.label = label;
    }
}

public class test25 {
	public RandomListNode Clone(RandomListNode pHead){
		if(pHead==null)
			return null;
		
		Map<RandomListNode, Integer> m=new HashMap<RandomListNode, Integer>();
		
		RandomListNode result=new RandomListNode(pHead.label);
		result.next=null;
		result.random=null;
		if(pHead.random!=null)
			m.put(result, pHead.random.label);
		else
			m.put(result, null);
		RandomListNode r=result;
		
		pHead=pHead.next;
		while(pHead!=null){
			RandomListNode temp=new RandomListNode(pHead.label);
			temp.next=null;
			temp.random=null;
			if(pHead.random!=null)
				m.put(temp, pHead.random.label);
			else
				m.put(temp, null);
			
			r.next=temp;
			r=r.next;
			pHead=pHead.next;
		}

		r=result;
		for (Entry<RandomListNode, Integer> entry : m.entrySet()) {
			RandomListNode key=entry.getKey();
			Integer value=entry.getValue();
	
			r=result;
			while(r!=null){
				if(value==null){
					key.random=null;
					break;
				}
				else if(r.label==value){
					key.random=r;
					break;
				}else
					r=r.next;
			}
		}
		
		return result;
    }
}
