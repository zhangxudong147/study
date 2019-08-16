package JianZhiOffer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;

/**
 * @file: test21.java
 * @author: 张旭东
 * @version 创建时间：2019-5-10 下午12:48:08
 * @description:
	题目描述
输入两个整数序列，第一个序列表示栈的压入顺序，请判断第二个序列是否可能为该栈的弹出顺序。假设压入栈的所有数字均不相等。
例如序列1,2,3,4,5是某栈的压入顺序，序列4,5,3,2,1是该压栈序列对应的一个弹出序列，但4,3,5,1,2就不可能是该压栈序列的弹出序列。
（注意：这两个序列的长度是相等的）
	思路：
	1、判断pop中的值是不是和push中的值一样的，不一样返回false；
	2、先找到pop中的最大值的位置i，如果i后面存在一个序列（长度大于1）是push序列中的子集，那么这个pop序列就是错误的，返回false；
	3、如果不存在这样的序列，返回true。
	
	有更简单的：
	直接新建一个栈来模仿入栈操作，看栈顶是不是符合出栈操作
 */
public class test21 {
	//判断数字b是不是在数组a中
	public static boolean IsInArray(int [] a,int b){
		for(int i=0;i<a.length;i++){
			if(a[i]==b)
				return true;
		}
		return false;
	}
	//判断数组b是不是数组a的子集
	public static boolean IsSubArray(int [] a,int [] b) {
		StringBuffer sa = new StringBuffer();
		for(int j=0;j<a.length;j++)
			sa.append(Integer.toString(a[j]));            
		
		for(int i=2;i<=b.length;i++){ //子集的长度从2开始
			int start=0;
			int end=start+i-1;
			while(end<b.length){
				StringBuffer sb = new StringBuffer();
				for(int j=start;j<=end;j++)
					sb.append(Integer.toString(b[j]));            
				if(sa.toString().indexOf(sb.toString())!=-1) //是子集
					return true;
				start++;
				end=start+i-1;
 			}
		}
        return false; //不是子集
	}
	
	public static boolean IsPopOrder(int [] pushA,int [] popA) {
        for(int i=0;i<popA.length;i++)
        	if(!IsInArray(pushA, popA[i]))
        		return false;
        
        int max=0;
        for(int i=1;i<popA.length;i++)
        	if(popA[i]>popA[max])
        		max=i;
        
        if((popA.length-1-max)==1)
        	return true;
        //长度大于1才考虑
        if(IsSubArray(pushA,Arrays.copyOfRange(popA, max+1, popA.length))){
        	return false;
        }
        return true;
    }
	
	public static boolean IsPopOrder2(int [] pushA,int [] popA) {
        Stack<Integer> s=new Stack<Integer>();
        for(int i=0,j=0;i<pushA.length;i++){
        	s.push(pushA[i]);
        	while(!s.isEmpty() && s.peek()==popA[j]){
        		s.pop();
        		j++;
        	}
        }
        if(s.isEmpty())
        	return true;
        return false;
    }
	
	public static void main(String[] args) {
		int a[]={1,2,3,4,5};
		int b[]={3,5,4,1,2};
		System.out.println(IsPopOrder2(a,b));
	}
}
