package JianZhiOffer;

import java.util.Arrays;

/**
 * @file: test28.java
 * @author: 张旭东
 * @version 创建时间：2019-5-23 下午02:53:54
 * @description:
	数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。例如输入一个长度为9的数组{1,2,3,2,2,2,5,4,2}。
	由于数字2在数组中出现了5次，超过数组长度的一半，因此输出2。如果不存在则输出0。
 */
public class test28 {
	public static int MoreThanHalfNum_Solution(int [] array) {
        int len=array.length;
        int a[]=Arrays.copyOf(array, len);
        for(int i=0;i<len;i++){
        	int temp=array[i];
        	array[i]=1;
        	for(int j=i+1;j<len;j++){
        		if(array[j]==temp)
        			array[i]++;
        	}
        }
        for(int i=0;i<len;i++){
        	if(array[i]>len/2)
        		return a[i];
        }
        return 0;
    }
	public static void main(String[] args) {
		int a[]={1,2,3,2,2,2,5,4,2};
		System.out.println(MoreThanHalfNum_Solution(a));
	}
}
