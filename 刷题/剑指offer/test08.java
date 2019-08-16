package JianZhiOffer;
/**
 * @author 张旭东
 * @version 创建时间：2019-5-6 下午04:05:41
 * 类说明:
	题目描述
一只青蛙一次可以跳上1级台阶，也可以跳上2级。求该青蛙跳上一个n级的台阶总共有多少种跳法（先后次序不同算不同的结果）
 */
public class test08 {
	public static int JumpFloor(int target) {
		if(target==1)
			return 1;
		if(target==2)
			return 2;
		return JumpFloor(target-1)+JumpFloor(target-2);
    }
	public static int JumpFloor2(int target) {
		if(target<=2)
			return target;
		int a=1;
		int b=2;
		int sum=0;
		for(int i=3;i<=target;i++){
			sum=a+b;
			a=b;
			b=sum;
		}
		return sum;
    }
	public static void main(String[] args) {
		System.out.println(JumpFloor2(4));
	}
}
