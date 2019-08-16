package JianZhiOffer;
/**
 * @file: test18.java
 * @author: 张旭东
 * @version 创建时间：2019-5-8 下午03:34:59
 * @description:
	题目描述
操作给定的二叉树，将其变换为源二叉树的镜像。
输入描述:
二叉树的镜像定义：源二叉树 
    	    8
    	   /  \
    	  6   10
    	 / \  / \
    	5  7 9 11
    	镜像二叉树
    	    8
    	   /  \
    	  10   6
    	 / \  / \
    	11 9 7  5
 */
public class test18 {
	public static void Mirror(TreeNode root) {
        if(root!=null){
        	TreeNode temp=root.left;
        	root.left=root.right;
        	root.right=temp;
        	
        	if(root.left!=null)
        		Mirror(root.left);
        	if(root.right!=null)
        		Mirror(root.right);
        }
    }
	
	public static void main(String[] args) {
		 int pre[]={1,2,3,4,5,6,7};
		 int in[]={3,2,4,1,6,5,7};
		 test04 t=new test04();
		 TreeNode tree1=t.reConstructBinaryTree(pre,in);
		 Mirror(tree1);
		 t.print_tree(tree1);
	}
}
