package JianZhiOffer;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @file: test31.java
 * @author: ����
 * @version ����ʱ�䣺2019-5-24 ����10:43:31
 * @description:
	���Ժܿ���������Ǹ�����������1���ֵĴ�������1 �� n ��1���ֵĴ�������
 */
public class test31 {
	public static int NumberOf1Between1AndN_Solution(int n) {
	    int count=0;
	    ArrayList<String> list=new ArrayList<String>();
	    for(int i=1;i<=n;i++){
	    	list.add(Integer.toString(i));
	    }
	    for(String temp:list){
	    	count+=temp.replaceAll("[0,2-9]", "").length();
	    }
	    return count;
    }
	public static void main(String[] args) {
		System.out.println(NumberOf1Between1AndN_Solution(11));
	}
}
