package JianZhiOffer;
/**
 * @author 张旭东
 * @version 创建时间：2019-5-6 下午04:02:30
 * 类说明:
 * 题目描述
大家都知道斐波那契数列，现在要求输入一个整数n，请你输出斐波那契数列的第n项（从0开始，第0项为0）。
n<=39
 */
public class test07 {
	public static int Fibonacci(int n) {
		if(n==0)
			return 0;
		if(n==1 || n==2)
			return 1;
		return Fibonacci(n-1)+Fibonacci(n-2);
    }
	public static void main(String[] args) {
		System.out.println(Fibonacci(10));
	}
}
