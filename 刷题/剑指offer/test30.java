package JianZhiOffer;

import java.util.Arrays;

/**
 * @file: test30.java
 * @author: ����
 * @version ����ʱ�䣺2019-5-23 ����03:34:09
 * @description:
	����:{6,-3,-2,7,-15,1,2,2},����������������Ϊ8(�ӵ�0����ʼ,����3��Ϊֹ)��
	��һ�����飬��������������������еĺͣ���᲻�ᱻ������ס��(�������ĳ���������1)
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
