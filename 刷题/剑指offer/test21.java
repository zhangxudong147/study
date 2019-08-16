package JianZhiOffer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;

/**
 * @file: test21.java
 * @author: ����
 * @version ����ʱ�䣺2019-5-10 ����12:48:08
 * @description:
	��Ŀ����
���������������У���һ�����б�ʾջ��ѹ��˳�����жϵڶ��������Ƿ����Ϊ��ջ�ĵ���˳�򡣼���ѹ��ջ���������־�����ȡ�
��������1,2,3,4,5��ĳջ��ѹ��˳������4,5,3,2,1�Ǹ�ѹջ���ж�Ӧ��һ���������У���4,3,5,1,2�Ͳ������Ǹ�ѹջ���еĵ������С�
��ע�⣺���������еĳ�������ȵģ�
	˼·��
	1���ж�pop�е�ֵ�ǲ��Ǻ�push�е�ֵһ���ģ���һ������false��
	2�����ҵ�pop�е����ֵ��λ��i�����i�������һ�����У����ȴ���1����push�����е��Ӽ�����ô���pop���о��Ǵ���ģ�����false��
	3��������������������У�����true��
	
	�и��򵥵ģ�
	ֱ���½�һ��ջ��ģ����ջ��������ջ���ǲ��Ƿ��ϳ�ջ����
 */
public class test21 {
	//�ж�����b�ǲ���������a��
	public static boolean IsInArray(int [] a,int b){
		for(int i=0;i<a.length;i++){
			if(a[i]==b)
				return true;
		}
		return false;
	}
	//�ж�����b�ǲ�������a���Ӽ�
	public static boolean IsSubArray(int [] a,int [] b) {
		StringBuffer sa = new StringBuffer();
		for(int j=0;j<a.length;j++)
			sa.append(Integer.toString(a[j]));            
		
		for(int i=2;i<=b.length;i++){ //�Ӽ��ĳ��ȴ�2��ʼ
			int start=0;
			int end=start+i-1;
			while(end<b.length){
				StringBuffer sb = new StringBuffer();
				for(int j=start;j<=end;j++)
					sb.append(Integer.toString(b[j]));            
				if(sa.toString().indexOf(sb.toString())!=-1) //���Ӽ�
					return true;
				start++;
				end=start+i-1;
 			}
		}
        return false; //�����Ӽ�
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
        //���ȴ���1�ſ���
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
