package JianZhiOffer;

import java.util.Arrays;

/**
 * @file: test28.java
 * @author: ����
 * @version ����ʱ�䣺2019-5-23 ����02:53:54
 * @description:
	��������һ�����ֳ��ֵĴ����������鳤�ȵ�һ�룬���ҳ�������֡���������һ������Ϊ9������{1,2,3,2,2,2,5,4,2}��
	��������2�������г�����5�Σ��������鳤�ȵ�һ�룬������2����������������0��
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
