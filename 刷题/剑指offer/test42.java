package JianZhiOffer;

import java.util.Arrays;

/**
 * @file: test42.java
 * @author: 张旭东
 * @version 创建时间：2019-6-12 下午04:45:20
 * @description:
	
 */
public class test42 {
	 public static boolean isContinuous(int [] numbers) {
		 if(numbers.length!=5)
			 return false;
		 
		 Arrays.sort(numbers);
		 int numOfZero=0;
		 int max=numbers[4];
		 int min=0;
		 int i=0;
		 for(;i<5;i++){
			 if(numbers[i]!=0){
				 numOfZero=i;
				 min=numbers[i];
				 break;
			 }
		 }
		 if((max-min)>4)
			 return false;
		 int next=min+1;
		 for(i=i+1;i<5;){
			 if(numbers[i]!=next){
				 if(numOfZero!=0){
					 numOfZero--;
				 }
				 else{
					 return false;
				 }
			 }
			 else{
				 i++;
			 }
			 next++;
		 }
		 return true;
	 }
	 public static void main(String[] args) {
		 int a[]={1,2,3,4,5};
		 System.out.println(isContinuous(a));
	}
}
