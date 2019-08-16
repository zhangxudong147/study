package JianZhiOffer;
/**
 * @author 张旭东
 * @version 创建时间：2019-5-6 下午04:24:32
 * 类说明:
	题目描述
一只青蛙一次可以跳上1级台阶，也可以跳上2级……它也可以跳上n级。求该青蛙跳上一个n级的台阶总共有多少种跳法。
 */
public class test09 {
	public static int JumpFloorII(int target) {
        if(target<=2)
        	return target;
        int sum=0;
        for(int i=1;i<target;i++)
        	sum+=JumpFloorII(i);
        return sum+1;
    }
	public static int JumpFloorII2(int target) {
        int sum=1;
        for(int i=1;i<target;i++)
        	sum*=2;
        return sum;
    }
	
	public static void main(String[] args) {
		System.out.println(JumpFloorII2(2));
	}
}
