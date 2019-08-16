package JianZhiOffer;

import java.util.ArrayList;

/**
 * @file: test26.java
 * @author: 张旭东
 * @version 创建时间：2019-5-16 上午11:13:22
 * @description:
	题目描述
输入一棵二叉搜索树，将该二叉搜索树转换成一个排序的双向链表。要求不能创建任何新的结点，只能调整树中结点指针的指向。
 */
public class test26 {
	public static TreeNode Convert(TreeNode pRootOfTree){
        ArrayList<TreeNode> list=new ArrayList<TreeNode>();
        
        InOrder(pRootOfTree, list);
        if(list.size()==0)
        	return null;
        
        TreeNode result=pRootOfTree;
        while(result.left!=null){
			result=result.left;
		}
        
        TreeNode a=list.get(0);
        TreeNode b=null;
        a.left=null;
        
        for(int i=1;i<list.size();i++){
        	b=list.get(i);
        	
        	a.right=b;
        	b.left=a;
        	a=b;
        }
        if(b!=null)
        	b.right=null;
        return result;
    }
	
	public static void InOrder(TreeNode root,ArrayList<TreeNode> list){
		if(root != null){
			InOrder(root.left,list);
			list.add(root);
			InOrder(root.right,list);
		}
	}
	
	public static void main(String[] args) {
		int pre[]={10,6,4,8,14,12,16};
		int in[]={4,6,8,10,12,14,16};
		test04 test=new test04();
		TreeNode tree=test.reConstructBinaryTree(pre,in);
		TreeNode tree1=Convert(tree);
		
		while(tree1!=null){
			System.out.println(tree1.val);
			tree1=tree1.right;
		}
	}
}
