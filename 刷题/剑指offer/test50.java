package JianZhiOffer;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * @file: test50.java
 * @author: 张旭东
 * @version 创建时间：2019-6-19 下午08:40:33
 * @description:
	请实现一个函数用来找出字符流中第一个只出现一次的字符。例如，当从字符流中只读出前两个字符"go"时，第一个只出现一次的字符是"g"。
	当从该字符流中读出前六个字符“google"时，第一个只出现一次的字符是"l"。
	如果当前字符流没有存在出现一次的字符，返回#字符。
 */
public class test50 {
	private static ArrayList<Character> c=new ArrayList<Character>();
	//Insert one char from stringstream
    public static void Insert(char ch)
    {
        c.add(ch);
    }
  //return the first appearence once char in current stringstream
    public static char FirstAppearingOnce()
    {
    	HashMap<Character,Integer> map=new HashMap<Character, Integer>();
    	for(int i=0;i<c.size();i++){
    		char temp=c.get(i);
    		if(map.containsKey(temp)){
    			map.put(temp, map.get(temp)+1);
    		}else{
    			map.put(temp,1);
    		}
    	}
    	
    	int index=c.size();
    	for(char key:map.keySet()){
    		if(map.get(key)==1 && c.indexOf(key)<index){
    			index=c.indexOf(key);
    		}
    	}
    	if(index<c.size())
    		return c.get(index);
    	return '#';
    }
    public static void main(String[] args) {
    	Insert('g');System.out.println("\n"+FirstAppearingOnce());
    	Insert('o');System.out.println("\n"+FirstAppearingOnce());
    	Insert('o');System.out.println("\n"+FirstAppearingOnce());
    	Insert('g');System.out.println("\n"+FirstAppearingOnce());
    	Insert('l');System.out.println("\n"+FirstAppearingOnce());
    	Insert('e');System.out.println("\n"+FirstAppearingOnce());

	}
}
