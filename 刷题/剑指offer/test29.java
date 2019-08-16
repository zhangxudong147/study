package JianZhiOffer;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @file: test29.java
 * @author: 张旭东
 * @version 创建时间：2019-5-23 下午03:08:46
 * @description:
	输入n个整数，找出其中最小的K个数。例如输入4,5,1,6,2,7,3,8这8个数字，则最小的4个数字是1,2,3,4,。
 */
public class test29 {
	public static ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        Arrays.sort(input);
        ArrayList<Integer> list=new ArrayList<Integer>();
        if(k>input.length || k==0)
        	return list;
        for(int i=0;i<k;i++){
        	list.add(input[i]);
        }
        return list;
    }
	public static void main(String[] args) {
		int a[]={1,2,3,4,5,6,7,8,9};
		ArrayList<Integer> list=GetLeastNumbers_Solution(a,5);
		for(Integer b : list){
			System.out.println(b);
		}
	}
}
