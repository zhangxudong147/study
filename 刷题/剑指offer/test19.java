package JianZhiOffer;

import java.util.ArrayList;

/**
 * @file: test19.java
 * @author: ����
 * @version ����ʱ�䣺2019-5-8 ����03:54:18
 * @description:
	��Ŀ����
����һ�����󣬰��մ���������˳ʱ���˳�����δ�ӡ��ÿһ�����֣����磬�����������4 X 4���� 
1  2  3  4 
5  6  7  8 
9  10 11 12 
13 14 15 16 �����δ�ӡ������
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
			 case 1: //����
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
			 case 2: //����
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
			 case 3: //����
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
			 case 4: //����
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
