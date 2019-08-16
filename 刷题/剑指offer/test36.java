package JianZhiOffer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @file: test36.java
 * @author: ����
 * @version ����ʱ�䣺2019-5-28 ����08:25:00
 * @description:
	����һ�ö����������������ȡ��Ӹ���㵽Ҷ������ξ����Ľ�㣨������Ҷ��㣩�γ�����һ��·�����·���ĳ���Ϊ������ȡ�
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
