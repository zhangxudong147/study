package JianZhiOffer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;


/**
 * @file: test22.java
 * @author: 张旭东
 * @version 创建时间：2019-5-10 下午02:21:07
 * @description:
	题目描述
从上往下打印出二叉树的每个节点，同层节点从左至右打印。
就是一个用队列对树进行层次遍历
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
