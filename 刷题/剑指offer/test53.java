package JianZhiOffer;
/**
 * @file: test53.java
 * @author: 张旭东
 * @version 创建时间：2019-6-20 上午11:21:07
 * @description:
	给定一个二叉树和其中的一个结点，请找出中序遍历顺序的下一个结点并且返回。注意，树中的结点不仅包含左右子结点，同时包含指向父结点的指针。
	思路：
	1、为空：返回Null
	2、有右边孩子：返回右子树的最左边的
	3、没有右孩子：
		a、p在父节点的左边，则返回父节点
		b、向上遍历，弱父节点是另一个节点q的左子树，则返回q；若无这样的q节点存在，则返回空。
 */
class TreeLinkNode {
    int val;
    TreeLinkNode left = null;
    TreeLinkNode right = null;
    TreeLinkNode next = null;

    TreeLinkNode(int val) {
        this.val = val;
    }
}

public class test53 {
	public TreeLinkNode GetNext(TreeLinkNode pNode)
    {
        if(pNode==null)
        	return null;

        if(pNode.right!=null){
        	TreeLinkNode p=pNode.right;
        	while(p.left!=null){
        		p=p.left;
        	}
        	return p;
        }else{
        	TreeLinkNode par=pNode.next;
        	if(par==null){
        		return null;
        	}
        	if(par.left==pNode)
        		return par;
        	else{
        		TreeLinkNode parpar=par.next;
        		while(parpar!=null && parpar.left!=par){
        			par=parpar;
        			parpar=parpar.next;
        		}
        		return parpar;
        	}
        }
    }
}
