package JianZhiOffer;
/*
 * 题目描述
输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树。假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
例如输入前序遍历序列{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}，则重建二叉树并返回。
 */

//Definition for binary tree
class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode(int x) { val = x; }
}

public class test04 {
	public static TreeNode reConstructBinaryTree(int [] pre,int [] in) {
		if(pre==null || in==null || pre.length==0 || in.length==0)
			return null;
		
        TreeNode tree=new TreeNode(pre[0]);
        
        if(pre.length==1 || in.length==1){
        	tree.left=null;
        	tree.right=null;
        	return tree;
        }
        	
        int index=-1;
        for(int i=0;i<in.length;i++){
        	if(in[i]==pre[0]){
        		index=i;
        		break;
        	}        	
        }
        if(index==-1)
        	return null;
        
        int left_len=index;
        int right_len=in.length-index-1;
        
        int pre_left[]=null;
        int in_left[]=null;
        int pre_right[]=null;
        int in_right[]=null;
        
        if(left_len>0){
        	pre_left=new int[index];
            System.arraycopy(pre, 1, pre_left, 0, index);
            in_left=new int[index];
            System.arraycopy(in, 0, in_left, 0, index);
        }
        else
        	tree.left=null;
        
        if(right_len>0){
        	pre_right=new int[in.length-index-1];
            System.arraycopy(pre, index+1, pre_right, 0, in.length-index-1);
            in_right=new int[in.length-index-1];
            System.arraycopy(in, index+1, in_right, 0, in.length-index-1);
        }
        else
        	tree.right=null;
        
        tree.left=reConstructBinaryTree(pre_left,in_left);
        tree.right=reConstructBinaryTree(pre_right,in_right); 
        return tree;
    }
	
	public static void print_tree(TreeNode tree){
		if(tree==null){
			System.out.print("#");
			return;
		}
		System.out.print(tree.val);
		print_tree(tree.left);
		print_tree(tree.right);
	}
	
	public static void main(String[] args) {
		int pre[]={1,2,4,3,5,6};
		int in[]={4,2,1,5,3,6};
		TreeNode tree=reConstructBinaryTree(pre,in);
		print_tree(tree);
		
	}
}
