package JianZhiOffer;
/**
 * @file: test47.java
 * @author: ����
 * @version ����ʱ�䣺2019-6-13 ����09:07:04
 * @description:
	����һ������A[0,1,...,n-1],�빹��һ������B[0,1,...,n-1],����B�е�Ԫ��B[i]=A[0]*A[1]*...*A[i-1]*A[i+1]*...*A[n-1]��
	����ʹ�ó�����
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
