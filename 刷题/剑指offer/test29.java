package JianZhiOffer;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @file: test29.java
 * @author: ����
 * @version ����ʱ�䣺2019-5-23 ����03:08:46
 * @description:
	����n���������ҳ�������С��K��������������4,5,1,6,2,7,3,8��8�����֣�����С��4��������1,2,3,4,��
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
