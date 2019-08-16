package JianZhiOffer;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @file: test31.java
 * @author: 张旭东
 * @version 创建时间：2019-5-24 上午10:43:31
 * @description:
	可以很快的求出任意非负整数区间中1出现的次数（从1 到 n 中1出现的次数）。
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
