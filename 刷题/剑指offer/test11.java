package JianZhiOffer;
/**
 * @author 张旭东
 * @version 创建时间：2019-5-7 上午10:15:16
 * 类说明:
	题目描述
输入一个整数，输出该数二进制表示中1的个数。其中负数用补码表示。
 */
public class test11 {
	 public static int NumberOf1(int n) {
		 //int a = 0b11;   //声明二进制变量
	     //int b = 011;    //声明八进制变量
	     //int c = 11;     //声明十进制变量
	     int d = 0xffffffff;   //声明十六进制变量
	     int a=d & n;
	     String s=Integer.toBinaryString(a);
	     int count=0;
	     for(int i=0;i<s.length();i++){
	    	 if(s.charAt(i)=='1')
	    		 count++;
	     }
		 return count;
	 }
	 public static int NumberOf11(int n) {
		 /*
		  * 把一个整数减去1，再和原整数做与运算，会把该整数最右边一个1变成0.那么一个整数的二进制有多少个1，就可以进行多少次这样的操作。
		  */
		 int count = 0;
		 while(n!= 0){
			 count++;
			 n = n & (n - 1);
			 }
		 return count;
	 }
	 
	 public static void main(String[] args) {
		 System.out.println(NumberOf1(-1));
	}
}
