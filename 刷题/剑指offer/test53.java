package JianZhiOffer;
/**
 * @file: test53.java
 * @author: ����
 * @version ����ʱ�䣺2019-6-20 ����11:21:07
 * @description:
	����һ�������������е�һ����㣬���ҳ��������˳�����һ����㲢�ҷ��ء�ע�⣬���еĽ�㲻�����������ӽ�㣬ͬʱ����ָ�򸸽���ָ�롣
	˼·��
	1��Ϊ�գ�����Null
	2�����ұߺ��ӣ�����������������ߵ�
	3��û���Һ��ӣ�
		a��p�ڸ��ڵ����ߣ��򷵻ظ��ڵ�
		b�����ϱ����������ڵ�����һ���ڵ�q�����������򷵻�q������������q�ڵ���ڣ��򷵻ؿա�
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
