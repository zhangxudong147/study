package JianZhiOffer;
/*
 * ��Ŀ����
��һ����ά�����У�ÿ��һά����ĳ�����ͬ����ÿһ�ж����մ����ҵ�����˳������ÿһ�ж����մ��ϵ��µ�����˳������
�����һ������������������һ����ά�����һ���������ж��������Ƿ��и�������
���ɣ�ÿһ�ж�ʹ��һ���۰����
 */

public class test01 {
	public static boolean Find(int target, int [][] array) {
		//����Ƿ�������������
		if(array==null || array.length<1 || array[0].length<1)
			return false;
		for(int i=0;i<array.length;i++){
			int a=0;
			int b=array[i].length-1;
			while(a<=b){
				int mid=(a+b)/2;
				if(array[i][mid]==target)
					return true;
				else if(array[i][mid]<target){
					a=mid+1;
				}else{
					b=mid-1;
				}
			}
		}
        return false;
	}
	public static void main(String[] args) {
		int target=7;
		int [][] array = {{}};
		System.out.println(Find(target,array));
		
	}
}
