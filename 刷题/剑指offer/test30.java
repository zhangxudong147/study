package JianZhiOffer;

import java.util.Arrays;

/**
 * @file: test30.java
 * @author: 张旭东
 * @version 创建时间：2019-5-23 下午03:34:09
 * @description:
	例如:{6,-3,-2,7,-15,1,2,2},连续子向量的最大和为8(从第0个开始,到第3个为止)。
	给一个数组，返回它的最大连续子序列的和，你会不会被他忽悠住？(子向量的长度至少是1)
 */
public class test30 {
	public static int FindGreatestSumOfSubArray(int[] array) {
        int len=array.length;
        int max=array[0];
        for(int i=1;i<=len;i++){
        	for(int j=0,k=j+i;j<len&&k<=len;j++,k++){
        		int temp[]=Arrays.copyOfRange(array, j, k);
        		int sum=0;
        		for(int p:temp){
        			sum+=p;
        		}
        		if(sum>max)
        			max=sum;
        	}
        }
        return max;
    }
	public static void main(String[] args) {
		int a[]={2,8,1,5,9};
		System.out.println(FindGreatestSumOfSubArray(a));
	}
}
