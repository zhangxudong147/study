package JianZhiOffer;
/**
 * @file: test.java
 * @author: ����
 * @version ����ʱ�䣺2019-6-18 ����08:51:50
 * @description:
	
 */
public class test {
	public static void main(String[] args) {
		int a=-1;
		int b=2008;
		int sum=0;
		

		System.out.println(f(10));
	}
	static long f(int n){
		if(n==1)
			return 1;
		else
			return n*f(n-1);
	}
}
