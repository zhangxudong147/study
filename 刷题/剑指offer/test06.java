package JianZhiOffer;
/*
 * ��Ŀ����
��һ�������ʼ�����ɸ�Ԫ�ذᵽ�����ĩβ�����ǳ�֮Ϊ�������ת�� 
����һ���Ǽ�����������һ����ת�������ת�������СԪ�ء� ��������{3,4,5,1,2}Ϊ{1,2,3,4,5}��һ����ת��
���������СֵΪ1�� NOTE������������Ԫ�ض�����0���������СΪ0���뷵��0��
 */
public class test06 {
	public static int minNumberInRotateArray(int [] array) {
	    if(array.length==0)
	    	return 0;
	    int index=0;
	    for(int i=1;i<array.length;i++){
	    	if(array[i-1]>array[i]){
	    		index=i;
	    		break;
	    	}
	    }
	    return array[index];
    }
	
	public static void main(String[] args) {
		int a[]={3,4,5,0,1,2};
		System.out.println(minNumberInRotateArray(a));
	}
}
