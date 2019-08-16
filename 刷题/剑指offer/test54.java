package JianZhiOffer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;


/**
 * @file: test54.java
 * @author: ����
 * @version ����ʱ�䣺2019-6-20 ����11:42:55
 * @description:
	��ʵ��һ�������������ж�һ�Ŷ������ǲ��ǶԳƵġ�ע�⣬���һ��������ͬ�˶������ľ�����ͬ���ģ�������Ϊ�ԳƵġ�

���ӵ�ʱ��Ҳ�ǳɶԳɶԵ� 
               1.����Ϊ�գ�������
                2.һ��Ϊ�գ�����false;
                3.��Ϊ�գ��Ƚϵ�ǰֵ��ֵ���ȣ�����false��
     * 2.ȷ�����˳��ÿ����Ӷ��ǳɶԳɶԵģ���left.left�� right.right ;left.rigth,right.left
 */
public class test54 {
	 boolean isSymmetrical(TreeNode pRoot)
	 {
		 if(pRoot==null || (pRoot.left==null && pRoot.right==null)){
			 return true;
		 }
		 Queue<TreeNode> s=new LinkedList<TreeNode>();
		 ArrayList<TreeNode> a=new ArrayList<TreeNode>();
		 
		 s.offer(pRoot.left);
		 s.offer(pRoot.right);
		 
		 while(!s.isEmpty()){
			 TreeNode t1=s.poll();
			 TreeNode t2=s.poll();
			 
			 if(t1==null &&t2==null)continue;
			 if(t1==null ||t2==null)return false;
			 if(t1.val!=t2.val) return false;
			 
			 s.offer(t1.left);
			 s.offer(t2.right);
			 s.offer(t1.right);
			 s.offer(t2.left);
		 }
		 return true;
	 }
	
}
