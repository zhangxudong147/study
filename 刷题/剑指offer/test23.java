package JianZhiOffer;

import java.util.ArrayList;

/**
 * @file: test23.java
 * @author: 张旭东
 * @version 创建时间：2019-5-10 下午05:17:49
 * @description:
	题目描述
输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历的结果。如果是则输出Yes,否则输出No。假设输入的数组的任意两个数字都互不相同。
 */
public class test23 {
	public static boolean VerifySquenceOfBST(int [] sequence) {
		if(sequence==null || sequence.length==0) 
        	return false;
        if(sequence.length==1) 
        	return true;
       
        ArrayList<Integer> small=new ArrayList<Integer>();
        ArrayList<Integer> big=new ArrayList<Integer>();
        int last=sequence[sequence.length-1];
        int index=0;
        
        for(int k=0;k<sequence.length;k++){
        	if(sequence[k]>=last){
        		index=k;
        		break;
        	}
        }
        for(int k=0;k<index;k++){
        	small.add(sequence[k]);
        }
        for(int k=index;k<sequence.length-1;k++){
        	if(sequence[k]<last)
        		return false;
        	else
        		big.add(sequence[k]);
        }
        
        int sm[]=new int[small.size()];
        for(int i=0;i<small.size();i++)
        	sm[i]=small.get(i);
        int bi[]=new int[big.size()];
        for(int i=0;i<big.size();i++)
        	bi[i]=big.get(i);
        
        if(small.size()==0){
        	return VerifySquenceOfBST(bi);
        }
        else if(big.size()==0){
        	return VerifySquenceOfBST(sm);
        }
        else  
        	return VerifySquenceOfBST(sm) && VerifySquenceOfBST(bi);
    }
	public static void main(String[] args) {
		int a[]={4,6,7,5};
		System.out.println(VerifySquenceOfBST(a));
	}
}
