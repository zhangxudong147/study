package JianZhiOffer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Vector;

/**
 * @file: test33.java
 * @author: ����
 * @version ����ʱ�䣺2019-5-24 ����03:42:27
 * @description:
	��ֻ����������2��3��5��������������Ugly Number��������6��8���ǳ�������14���ǣ���Ϊ������������7�� 
	ϰ�������ǰ�1�����ǵ�һ���������󰴴�С�����˳��ĵ�N��������
 */
public class test33 {
	public static int GetUglyNumber_Solution2(int index) {
		// 0-6�ĳ����ֱ�Ϊ0-6
		if(index < 7) return index;
		//p2��p3��p5�ֱ�Ϊ�������е�ָ�룬newNumΪ�Ӷ���ͷѡ��������С��
		int p2 = 0, p3 = 0, p5 = 0, newNum = 1;
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(newNum);
		while(arr.size() < index) {
			//ѡ����������ͷ��С����
			newNum = min(arr.get(p2) * 2, min(arr.get(p3) * 3, arr.get(p5) * 5));
			//������if�п��ܽ���һ�����߶��������������������ͷ��С�����ж�������
			if(arr.get(p2) * 2 == newNum) p2++;
			if(arr.get(p3) * 3 == newNum) p3++;
			if(arr.get(p5) * 5 == newNum) p5++;
			arr.add(newNum);
		}
		return newNum;
	}
	public static int min(int i, int j) {
		// TODO Auto-generated method stub
		return (i>j) ? j : i;
	}
	
	//�ҵ������⣬���о�Ӧ��û�д�ѽ
	public static int GetUglyNumber_Solution(int index) {
		if(index<7) 
			return index;
		ArrayList<Integer> list = new ArrayList<Integer>();
		ArrayList<Integer> que=new ArrayList<Integer>();
		que.add(1);
		while(list.size()<index){
			int a=que.get(0);
			que.remove(0);
			list.add(a);
			if(!que.contains(a*2))
				que.add(a*2);
			if(!que.contains(a*3))
				que.add(a*3);
			if(!que.contains(a*5))
				que.add(a*5);
			
			Collections.sort(que);
		}
		return list.get(index-1);
    }
	public static void main(String[] args) {
		System.out.println(GetUglyNumber_Solution2(1500));
	}
}
