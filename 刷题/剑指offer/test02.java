package JianZhiOffer;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

/*
 * ��Ŀ����
��ʵ��һ����������һ���ַ����е�ÿ���ո��滻�ɡ�%20�������磬���ַ���ΪWe Are Happy.�򾭹��滻֮����ַ���ΪWe%20Are%20Happy��
 */
public class test02 {
//	public static String replaceSpace(StringBuffer str){
//		String s=str.toString();
//		if(s.indexOf(" ")!=-1)
//			return s.replace(" ", "%20");
//		else return s;
//    }
	public static String replaceSpace(StringBuffer str) {
		StringBuffer list = new StringBuffer();
        String s=str.toString();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=' ')
                list.append(s.charAt(i));
            else{
                list.append('%');
                list.append('2');
                list.append('0');
            }
        }
        
        return list.toString();
    }
	public static void main(String[] args){
		// TODO Auto-generated method stub
		String s;
		Scanner in =new Scanner(System.in);
		s=in.nextLine();
		StringBuffer str=new StringBuffer(s);
		System.out.println(replaceSpace(str));
	}
}
