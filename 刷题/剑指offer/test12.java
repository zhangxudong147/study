package JianZhiOffer;
/**
 * @file: test12.java
 * @author: 张旭东
 * @version 创建时间：2019-5-7 上午10:52:02
 * @description:
	题目描述
给定一个double类型的浮点数base和int类型的整数exponent。求base的exponent次方。
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
