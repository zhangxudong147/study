package JianZhiOffer;
/**
 * @author ����
 * @version ����ʱ�䣺2019-5-6 ����04:02:30
 * ��˵��:
 * ��Ŀ����
��Ҷ�֪��쳲��������У�����Ҫ������һ������n���������쳲��������еĵ�n���0��ʼ����0��Ϊ0����
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
