package JianZhiOffer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;


/**
 * @file: test22.java
 * @author: ����
 * @version ����ʱ�䣺2019-5-10 ����02:21:07
 * @description:
	��Ŀ����
�������´�ӡ����������ÿ���ڵ㣬ͬ��ڵ�������Ҵ�ӡ��
����һ���ö��ж������в�α���
 */
public class test22 {
	public static ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<TreeNode>();
        ArrayList<Integer> a=new ArrayList<Integer>();
        TreeNode t=root;
        if(t!=null){
        	q.offer(t);
        }
        while(!q.isEmpty()){
        	t=q.poll();
        	a.add(t.val);
        	if(t.left!=null)
        		q.offer(t.left);
        	if(t.right!=null)
        		q.offer(t.right);
        }
        return a;
    }
	
	public static void main(String[] args) {
		int pre[]={1,2,4,5,3,6};
		int in[]={4,2,5,1,6,3};
		test04 t=new test04();
		TreeNode tree1=t.reConstructBinaryTree(pre,in);
		System.out.println(PrintFromTopToBottom(tree1).toString());
	}
}
