package JianZhiOffer;

import java.util.ArrayList;

/**
 * @file: test17.java
 * @author: 张旭东
 * @version 创建时间：2019-5-8 下午02:17:41
 * @description:
	题目描述
输入两棵二叉树A，B，判断B是不是A的子结构。（ps：我们约定空树不是任意一个树的子结构）
 */

public class test17 {
	public static boolean HasSubtree(TreeNode root1,TreeNode root2) {
        if(root1 == null || root2 == null)
	        	return false;
	        if(root1.val == root2.val){	
	        	if(IsSubTree(root1, root2))
	        		return true;
	        }
	        return HasSubtree(root1.left, root2) || HasSubtree(root1.right, root2);
    }
    
    public static boolean IsSubTree(TreeNode tree1,TreeNode tree2){
		 if(tree2 == null)
			 return true;
		 if(tree1 == null || tree1.val!=tree2.val)
			 return false;
		 else
			 return IsSubTree(tree1.left, tree2.left) && IsSubTree(tree1.right, tree2.right);
	 }
	 
	 
	 public static void main(String[] args) {
		 int pre[]={8,8,9,2,5};
		 int in[]={8,8,9,2,5};
		 test04 t=new test04();
		 TreeNode tree1=t.reConstructBinaryTree(pre,in);
		 int pre2[]={8,9,3,2};
		 int in2[]={8,3,9,2};
		 TreeNode tree2=t.reConstructBinaryTree(pre2,in2);
		 
		 System.out.println(HasSubtree(tree1,tree2));
	}
}
