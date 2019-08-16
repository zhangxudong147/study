package JianZhiOffer;

import java.util.Map;
import java.util.HashMap;

/**
 * @file: test34.java
 * @author: 张旭东
 * @version 创建时间：2019-5-25 上午10:32:25
 * @description:
	在一个字符串(0<=字符串长度<=10000，全部由字母组成)中找到第一个只出现一次的字符,并返回它的位置, 如果没有则返回 -1（需要区分大小写）
 */
public class test34 {
	public static int FirstNotRepeatingChar(String str) {
		Map<Character,Integer> map=new HashMap<Character,Integer>();
		for(int i=0;i<str.length();i++){
			char c=str.charAt(i);
			if(!map.containsKey(c)){
				map.put(c, 1);
			}else{
				map.put(c, map.get(c)+1);
			}
		}
		for(int i=0;i<str.length();i++){
			if(map.get(str.charAt(i))==1)
				return i;
		}
		return -1;
    }
	public static void main(String[] args) {
		System.out.println(FirstNotRepeatingChar("google"));
	}
}
