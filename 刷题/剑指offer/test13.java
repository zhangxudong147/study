package JianZhiOffer;

import java.util.Arrays;

/**
 * @file: test13.java
 * @author: ����
 * @version ����ʱ�䣺2019-5-7 ����11:02:38
 * @description:
	��Ŀ����
����һ���������飬ʵ��һ�����������������������ֵ�˳��ʹ�����е�����λ�������ǰ�벿�֣�
���е�ż��λ������ĺ�벿�֣�����֤������������ż����ż��֮������λ�ò��䡣
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
