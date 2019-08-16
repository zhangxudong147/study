package JianZhiOffer;

import java.util.HashMap;
import java.util.Map;

/**
 * @file: test37.java
 * @author: 张旭东
 * @version 创建时间：2019-5-28 下午09:22:41
 * @description:
	一个整型数组里除了两个数字之外，其他的数字都出现了两次。请写程序找出这两个只出现一次的数字。
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
