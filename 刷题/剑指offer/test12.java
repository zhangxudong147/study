package JianZhiOffer;
/**
 * @file: test12.java
 * @author: ����
 * @version ����ʱ�䣺2019-5-7 ����10:52:02
 * @description:
	��Ŀ����
����һ��double���͵ĸ�����base��int���͵�����exponent����base��exponent�η���
 */
public class test12 {
	public static double Power(double base, int exponent) {
		double sum=1;
		for(int i=1;i<=(exponent<0 ? -exponent : exponent);i++){
			sum*=base;
		}
		return exponent<0 ? 1/sum : sum;
	}
	public static void main(String[] args) {
		System.out.println(Power(0.1, -2));
	}
}
