package JianZhiOffer;
/**
 * @file: test41.java
 * @author: 张旭东
 * @version 创建时间：2019-6-12 下午03:38:37
 * @description:
	这家伙原来把句子单词的顺序翻转了，正确的句子应该是“I am a student.”。Cat对一一的翻转这些单词顺序可不在行，你能帮助他么？
	思路：
	先把每一小部分反转，然后整体反转
 */
public class test41 {
	public static String ReverseSentence(String str) {
        if(str==null || str.trim().equals(""))
        	return str;
        String s[]=str.split(" ");
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length-1;i++){
        	sb.append(Reverse(s[i])).append(" ");
        }
        sb.append(Reverse(s[s.length-1]));
       
        return Reverse(sb.toString());
    }
	
	public static String Reverse(String str) {
        if(str==null || str.length()==0)
        	return "";
        StringBuilder sb=new StringBuilder(str);
        int l=0;
        int r=sb.length()-1;
        while(l<r){
        	char temp=sb.charAt(l);
        	sb.setCharAt(l, sb.charAt(r));
        	sb.setCharAt(r, temp);
        	l++;
        	r--;
        }
        return sb.toString();
    }
	public static void main(String[] args) {
		System.out.println(ReverseSentence(" 1 2"));
	}
}
