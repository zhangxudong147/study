package JianZhiOffer;
/**
 * @author ����
 * @version ����ʱ�䣺2019-5-6 ����04:05:41
 * ��˵��:
	��Ŀ����
һֻ����һ�ο�������1��̨�ף�Ҳ��������2���������������һ��n����̨���ܹ��ж������������Ⱥ����ͬ�㲻ͬ�Ľ����
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
