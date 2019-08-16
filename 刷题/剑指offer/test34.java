package JianZhiOffer;

import java.util.Map;
import java.util.HashMap;

/**
 * @file: test34.java
 * @author: ����
 * @version ����ʱ�䣺2019-5-25 ����10:32:25
 * @description:
	��һ���ַ���(0<=�ַ�������<=10000��ȫ������ĸ���)���ҵ���һ��ֻ����һ�ε��ַ�,����������λ��, ���û���򷵻� -1����Ҫ���ִ�Сд��
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
