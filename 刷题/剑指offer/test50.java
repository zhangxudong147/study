package JianZhiOffer;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * @file: test50.java
 * @author: ����
 * @version ����ʱ�䣺2019-6-19 ����08:40:33
 * @description:
	��ʵ��һ�����������ҳ��ַ����е�һ��ֻ����һ�ε��ַ������磬�����ַ�����ֻ����ǰ�����ַ�"go"ʱ����һ��ֻ����һ�ε��ַ���"g"��
	���Ӹ��ַ����ж���ǰ�����ַ���google"ʱ����һ��ֻ����һ�ε��ַ���"l"��
	�����ǰ�ַ���û�д��ڳ���һ�ε��ַ�������#�ַ���
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
