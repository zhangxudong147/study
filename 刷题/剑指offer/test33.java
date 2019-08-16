package JianZhiOffer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Vector;

/**
 * @file: test33.java
 * @author: 张旭东
 * @version 创建时间：2019-5-24 下午03:42:27
 * @description:
	把只包含质因子2、3和5的数称作丑数（Ugly Number）。例如6、8都是丑数，但14不是，因为它包含质因子7。 
	习惯上我们把1当做是第一个丑数。求按从小到大的顺序的第N个丑数。
 */
public class test33 {
	public static int GetUglyNumber_Solution2(int index) {
		// 0-6的丑数分别为0-6
		if(index < 7) return index;
		//p2，p3，p5分别为三个队列的指针，newNum为从队列头选出来的最小数
		int p2 = 0, p3 = 0, p5 = 0, newNum = 1;
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(newNum);
		while(arr.size() < index) {
			//选出三个队列头最小的数
			newNum = min(arr.get(p2) * 2, min(arr.get(p3) * 3, arr.get(p5) * 5));
			//这三个if有可能进入一个或者多个，进入多个是三个队列头最小的数有多个的情况
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
	
	//我的有问题，但感觉应该没有错呀
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
