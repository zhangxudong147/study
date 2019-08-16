package JianZhiOffer;

import java.util.HashMap;

/**
 * @file: test46.java
 * @author: ����
 * @version ����ʱ�䣺2019-6-13 ����08:16:54
 * @description:
	��һ������Ϊn����������������ֶ���0��n-1�ķ�Χ�ڡ� ������ĳЩ�������ظ��ģ�����֪���м����������ظ��ġ�Ҳ��֪��ÿ�������ظ����Ρ�
	���ҳ�����������һ���ظ������֡� ���磬������볤��Ϊ7������{2,3,1,0,2,5,3}��
	��ô��Ӧ������ǵ�һ���ظ�������2
 */
public class test46 {
    // Parameters:
    //    numbers:     an array of integers
    //    length:      the length of array numbers
    //    duplication: (Output) the duplicated number in the array number,length of duplication array is 1,
	//			so using duplication[0] = ? in implementation;
    //                  Here duplication like pointor in C/C++, duplication[0] equal *duplication in C/C++
    //    ����Ҫ�ر�ע��~���������ظ���һ������ֵduplication[0]
    // Return value:       true if the input is valid, and there are some duplications in the array number
    //                     otherwise false
    public boolean duplicate(int numbers[],int length,int [] duplication) {
    	if(numbers!=null && length>0 && numbers.length==length ){
    		HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
    		for(int i=0;i<length;i++){
    			int a=numbers[i];
    			if(a>=0 && a<length){
    				if(map.containsKey(a)){
    					duplication[0]=a;
    					return true;    					
    				}
    				else{
    					map.put(a, 1);
    				}
    			}
    			else{
    				return false;
    			}
    		}
    		return false;    		
    	}
    	else
    		return false;
    }
}
