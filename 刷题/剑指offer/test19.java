package JianZhiOffer;

import java.util.ArrayList;

/**
 * @file: test19.java
 * @author: 张旭东
 * @version 创建时间：2019-5-8 下午03:54:18
 * @description:
	题目描述
输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字，例如，如果输入如下4 X 4矩阵： 
1  2  3  4 
5  6  7  8 
9  10 11 12 
13 14 15 16 则依次打印出数字
1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10.
 */
public class test19 {
	 public static ArrayList<Integer> printMatrix(int [][] matrix) {
		 if(matrix.length <=0 || matrix[0].length <=0)
			 return null;
		 int len1=matrix.length;
		 int i=0,i_min=0,i_max=len1-1;
		 int len2=matrix[0].length;
		 int j=0,j_min=0,j_max=len2-1;

		 int totalNum=0;
		 int nextStep=1;
		 ArrayList<Integer> a=new ArrayList<Integer>();
		 
		 while(totalNum < len1*len2){
			 switch(nextStep){
			 case 1: //向右
				 while(j<=j_max){
					 a.add(matrix[i][j]);
					 totalNum++;
					 j++;
				 }
				 nextStep=2;
				 j=j_max;
				 
				 i++;
				 i_min++;
				 break;
			 case 2: //向下
				 while(i<=i_max){
					 a.add(matrix[i][j]);
					 totalNum++;
					 i++;
				 }
				 nextStep=3;
				 i=i_max;
				 
				 j--;
				 j_max--;
				 break;
			 case 3: //向左
				 while(j>=j_min){
					 a.add(matrix[i][j]);
					 totalNum++;
					 j--;
				 }
				 nextStep=4;
				 j=j_min;

				 i--;
				 i_max--;
				 break;
			 case 4: //向上
				 while(i>=i_min){
					 a.add(matrix[i][j]);
					 totalNum++;
					 i--;
				 }
				 nextStep=1;
				 i=i_min;
				 
				 j++;
				 j_min++;
				 break;
			 }
		 }
		 return a;
	 }
	 
	 public static void main(String[] args) {
		int a[][]={
				{1,2,3,4},
				{5,6,7,8},
				{9,10,11,12},
				{13,14,15,16}
		};
		ArrayList<Integer> b=printMatrix(a);
		System.out.println(b);
	}
}
