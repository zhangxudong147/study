package JianZhiOffer;

import java.util.ArrayList;

/**
 * @file: test39.java
 * @author: ����
 * @version ����ʱ�䣺2019-6-6 ����11:05:10
 * @description:
	����һ����������������һ������S���������в�����������ʹ�����ǵĺ�������S������ж�����ֵĺ͵���S������������ĳ˻���С�ġ�
�ҵ��ĵ�һ�飨������ģ����ǳ˻���С�ġ���������֤��������x+y=C��C�ǳ�������x*y�Ĵ�С��
������y>=x��y-x=d>=0����y=x+d, 2x+d=C, x=(C-d)/2, x*y=x(x+d)=(C-d)(C+d)/4=(C^2-d^2)/4��
Ҳ����x*y��һ�����ڱ���d�Ķ��κ������Գ�����y�ᣬ�������¡�d��>=0�ģ�dԽ��, x*yҲ��ԽС��
 */
public class test39 {
	public ArrayList<Integer> FindNumbersWithSum(int [] array,int sum) {
        ArrayList<Integer> result=new ArrayList<Integer>();
        int left=0;
        int right=array.length-1;
        while(left<right){
            if((array[left]+array[right])>sum)
                right--;
            if((array[left]+array[right])<sum)
                left++;
            if((array[left]+array[right])==sum){
                result.add(array[left]);
                result.add(array[right]);
                break;  //����֤��
            }
        }
        return result;
    }
}
