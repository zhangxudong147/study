package JianZhiOffer;
/**
 * @author 张旭东
 * @version 创建时间：2019-5-6 下午04:34:04
 * 类说明:
	题目描述
我们可以用2*1的小矩形横着或者竖着去覆盖更大的矩形。请问用n个2*1的小矩形无重叠地覆盖一个2*n的大矩形，总共有多少种方法？
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
