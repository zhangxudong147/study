package JianZhiOffer;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Stack;

/**
 * @file: test24.java
 * @author: 张旭东
 * @version 创建时间：2019-5-14 下午04:04:03
 * @description:
	题目描述
输入一颗二叉树的跟节点和一个整数，打印出二叉树中结点值的和为输入整数的所有路径。路径定义为从树的根结点开始往下一直到叶结点所经过的结点形成一条路径。
(注意: 在返回值的list中，数组长度大的数组靠前)
 */
public class test24 {
	public static ArrayList<ArrayList<Integer>> FindPath(TreeNode root,int target) {
		ArrayList<ArrayList<Integer>> listAll=new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> list=new ArrayList<Integer>();
		int sum=0;
		Stack<TreeNode> s=new Stack<TreeNode>();
		ArrayList<Integer> visited=new ArrayList<Integer>();
		
		if(root==null)
			return listAll;
		s.push(root);
		while(!s.isEmpty()){
			TreeNode temp=s.peek();
			
			if(!visited.contains(temp.val)){
				list.add(temp.val);
				visited.add(temp.val);
				sum+=temp.val;
			}

			if(temp.left!=null && !visited.contains(temp.left.val)){
				s.push(temp.left);
			}
			else if(temp.right!=null && !visited.contains(temp.right.val)){
				s.push(temp.right);
			}
			else{
				if(sum==target && temp.left==null && temp.right==null){
					ArrayList<Integer> list2=new ArrayList<Integer>();
					list2.addAll(list);
					listAll.add(list2);
				}	
				list.remove(list.size()-1);
				sum-=temp.val;
				s.pop();
			}
		}
        return listAll;
    }
	
	
	public static void main(String[] args) {
		 int pre[]={10,5,4,7,12};
		 int in[]={4,5,7,10,12};
		 test04 t=new test04();
		 TreeNode tree1=t.reConstructBinaryTree(pre,in);
		 
		 ArrayList<Integer> path=new ArrayList<Integer>();
		 
		 ArrayList<ArrayList<Integer>> listAll=FindPath(tree1,22);
		 for(ArrayList<Integer> a: listAll ){
			 for(int i=0;i<a.size();i++)
			 {
				 System.out.println(a.get(i));
			 }
			 System.out.println();
		 }
		
	}
}
