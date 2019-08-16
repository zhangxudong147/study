package JianZhiOffer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;


/**
 * @file: test54.java
 * @author: 张旭东
 * @version 创建时间：2019-6-20 上午11:42:55
 * @description:
	请实现一个函数，用来判断一颗二叉树是不是对称的。注意，如果一个二叉树同此二叉树的镜像是同样的，定义其为对称的。

出队的时候也是成对成对的 
               1.若都为空，继续；
                2.一个为空，返回false;
                3.不为空，比较当前值，值不等，返回false；
     * 2.确定入队顺序，每次入队都是成对成对的，如left.left， right.right ;left.rigth,right.left
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
