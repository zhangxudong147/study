package JianZhiOffer;
import java.util.HashMap;
/**
 * @file: test51.java
 * @author: ����
 * @version ����ʱ�䣺2019-6-19 ����09:17:44
 * @description:
��һ�����������а����������ҳ�������Ļ�����ڽ�㣬�������null��

//��˵����������ָ��һ��fast��һ��slowͬʱ��һ�������ͷ������
//fastһ����2����slowһ����һ��������������л�������ָ���Ȼ�ڻ�������
//��ʱֻ��Ҫ�����е�һ��ָ������ָ������ͷ������һ�����䣨���ڻ��ڣ���
//�������ָ��һ����һ���������ĵط�������ڽڵ㡣
//�����������Լ�ȥ���Ͽ���֤����
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
