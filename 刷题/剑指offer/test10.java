package JianZhiOffer;
/**
 * @author ����
 * @version ����ʱ�䣺2019-5-6 ����04:34:04
 * ��˵��:
	��Ŀ����
���ǿ�����2*1��С���κ��Ż�������ȥ���Ǹ���ľ��Ρ�������n��2*1��С�������ص��ظ���һ��2*n�Ĵ���Σ��ܹ��ж����ַ�����
 */
public class test10 {
	 public int RectCover(int target) {
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
}
