package JianZhiOffer;

import java.util.HashMap;
import java.util.Map;

/**
 * @file: test37.java
 * @author: ����
 * @version ����ʱ�䣺2019-5-28 ����09:22:41
 * @description:
	һ�����������������������֮�⣬���������ֶ����������Ρ���д�����ҳ�������ֻ����һ�ε����֡�
 */
public class test37 {
	public void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
        Map<Integer,Integer> map=new HashMap<Integer,Integer>();
        for(int i=0;i<array.length;i++)
        {
            if(map.containsKey(array[i])){
                if(map.get(array[i])==1)
                   map.remove(array[i]);
                else
                   map.put(array[i],map.get(array[i]+1));
             }
            else
                map.put(array[i],1);
        }
        int i=0;
        for(int key: map.keySet()){
        	num1[i]=map.get(key);
        	i++;
        }
        num2[0]=num1[1];
    }
}
