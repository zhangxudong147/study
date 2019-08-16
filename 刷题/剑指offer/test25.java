package JianZhiOffer;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/**
 * @file: test25.java
 * @author: ����
 * @version ����ʱ�䣺2019-5-16 ����09:38:33
 * @description:
	��Ŀ����
����һ����������ÿ���ڵ����нڵ�ֵ���Լ�����ָ�룬һ��ָ����һ���ڵ㣬��һ������ָ��ָ������һ���ڵ㣩��
���ؽ��Ϊ���ƺ��������head����ע�⣬���������벻Ҫ���ز����еĽڵ����ã�������������ֱ�ӷ��ؿգ�
˼·��
	1������next������������������map��¼ÿ���ڵ��Ӧ��random�ڵ������
	2���ڱ���map��ÿ���ڵ��random�ڵ�������
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
