package JianZhiOffer;
/**
 * @file: test47.java
 * @author: 张旭东
 * @version 创建时间：2019-6-13 下午09:07:04
 * @description:
	给定一个数组A[0,1,...,n-1],请构建一个数组B[0,1,...,n-1],其中B中的元素B[i]=A[0]*A[1]*...*A[i-1]*A[i+1]*...*A[n-1]。
	不能使用除法。
 */
public class test47 {
	public int[] multiply(int[] A) {
		int B[]=new int[A.length];
		int i=0;
		int temp=1;
        for(i=0;i<A.length;temp*=A[i++]){
        	B[i]=temp;
        }
        temp=1;
        for(i=A.length-1;i>=0;temp*=A[i--]){
        	B[i]*=temp;
        }
        return B;
    }
}
