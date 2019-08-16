package JianZhiOffer;

import java.util.ArrayList;

/**
 * @file: test38.java
 * @author: 张旭东
 * @version 创建时间：2019-6-5 下午04:36:12
 * @description:
	输出所有和为S的连续正数序列。序列内按照从小至大的顺序，序列间按照开始数字从小到大的顺序
 */
public class test38 {
	public static ArrayList<ArrayList<Integer>> FindContinuousSequence(int s) {
		ArrayList<ArrayList<Integer>> result=new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> a=new ArrayList<Integer>();
		
		int i,j,sum;
		for(i=1;i<=(s/2)+1;i++){
			sum=i;
			a.add(i);
			for(j=i+1;j<=(s/2)+1;j++){
				sum+=j;
				a.add(j);
				if(sum==s){
					ArrayList<Integer> temp=new ArrayList<Integer>(a);
					result.add(temp);
					a.clear();
					break;
				}
				if(sum>s){
					a.clear();
					break;
				}
			}
			if(j>(s/2)+1){
				break;
			}
		}
		return result;
    }
	
	public static void main(String[] args) {
		ArrayList<ArrayList<Integer>> result=FindContinuousSequence(9);
		for(ArrayList<Integer> a : result){
			for(int i : a){
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}
}
