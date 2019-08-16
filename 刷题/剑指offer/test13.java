package JianZhiOffer;

import java.util.Arrays;

/**
 * @file: test13.java
 * @author: 张旭东
 * @version 创建时间：2019-5-7 上午11:02:38
 * @description:
	题目描述
输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有的奇数位于数组的前半部分，
所有的偶数位于数组的后半部分，并保证奇数和奇数，偶数和偶数之间的相对位置不变。
 */
public class test13 {
	public static void reOrderArray(int [] array) {
        int a[]=new int[array.length];
        int b[]=new int[array.length];
        int a_len=0;
        int b_len=0;
        
        for(int i=0;i<array.length;i++){
        	if(array[i]%2==0){
        		a[a_len]=array[i];
        		a_len++;
        	}
        	else{
        		b[b_len]=array[i];
        		b_len++;
        	}
        }
        for(int i=0;i<b_len;i++){
        	array[i]=b[i];
        }
        for(int i=b_len,j=0;j<a_len;i++,j++)
        	array[i]=a[j];
    }
	public static void main(String[] args) {
		int a[]={0,1,2,3,4,5,6};
		reOrderArray(a);
		for(int i: a){
			System.out.println(i);
		}
	}
}
