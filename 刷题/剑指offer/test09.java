package JianZhiOffer;
/**
 * @author ����
 * @version ����ʱ�䣺2019-5-6 ����04:24:32
 * ��˵��:
	��Ŀ����
һֻ����һ�ο�������1��̨�ף�Ҳ��������2��������Ҳ��������n���������������һ��n����̨���ܹ��ж�����������
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
