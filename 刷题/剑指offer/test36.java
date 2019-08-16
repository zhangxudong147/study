package JianZhiOffer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @file: test36.java
 * @author: 张旭东
 * @version 创建时间：2019-5-28 下午08:25:00
 * @description:
	输入一棵二叉树，求该树的深度。从根结点到叶结点依次经过的结点（含根、叶结点）形成树的一条路径，最长路径的长度为树的深度。
 */
public class test36 {
	public int TreeDepth(TreeNode root) {
		if(root==null){
			return 0;
		}
        
        return TreeDepth(root.left)>TreeDepth(root.right)?TreeDepth(root.left)+1:TreeDepth(root.right)+1;
    }
	
	public int TreeDepth2(TreeNode root) {
		if(root==null){
			return 0;
		}
        Queue<TreeNode> que=new LinkedList<TreeNode>();
        que.offer(root);
        int depth=0;
        int count=0;
        int curCount=1;
        while(!que.isEmpty()){
        	TreeNode a=que.poll();
        	count++;
        	
        	if(a.left!=null)
        		que.offer(a.left);
        	if(a.right!=null)
        		que.offer(a.right);
        	
        	if(count==curCount){
        		curCount=que.size();
        		depth++;
        		count=0;
        	}
        }
        return depth;
    }
}
