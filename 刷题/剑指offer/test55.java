package JianZhiOffer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @file: test55.java
 * @author: ����
 * @version ����ʱ�䣺2019-6-20 ����07:37:07
 * @description:
	��ʵ��һ����������֮���δ�ӡ������������һ�а��մ����ҵ�˳���ӡ��
	�ڶ��㰴�մ��������˳���ӡ�������а��մ����ҵ�˳���ӡ���������Դ����ơ�
 */
public class test55 {
	public static ArrayList<ArrayList<Integer> > Print(TreeNode pRoot) {
		Queue<TreeNode> q=new LinkedList<TreeNode>();
		ArrayList<ArrayList<Integer>> result=new ArrayList<ArrayList<Integer>>();
		if(pRoot==null)
			return result;
		q.offer(pRoot);
		ArrayList<TreeNode> a=new ArrayList<TreeNode>();
		int flag=1;
		while(!q.isEmpty()){
			a.clear();
			
			ArrayList<Integer> t=new ArrayList<Integer>();
			while(!q.isEmpty()){
				TreeNode temp=q.poll();
				a.add(temp);
				t.add(temp.val);
			}
			if(flag==-1){
				for(int l=0,r=t.size()-1;l<r;l++,r--){
					int temp=t.get(l);
					t.set(l, t.get(r));
					t.set(r, temp);
				}
			}
			result.add(t);
			flag*=(-1);
			for(int l=0;l<a.size();l++){
				TreeNode temp=a.get(l);
				if(temp.left!=null)
					q.offer(temp.left);
				if(temp.right!=null)
					q.offer(temp.right);
			}
		}
		return result;
    }
	public static void main(String[] args) {
		int pre[]={};
		int in[]={};
		test04 t=new test04();
		TreeNode tree=t.reConstructBinaryTree(pre,in);
		ArrayList<ArrayList<Integer>> a=Print(tree);
		
		for(ArrayList<Integer> b:a){
			for(int i:b){
				System.out.print(i);
			}
			System.out.println();
		}
	}
}
