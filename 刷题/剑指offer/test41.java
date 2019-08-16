package JianZhiOffer;
/**
 * @file: test41.java
 * @author: ����
 * @version ����ʱ�䣺2019-6-12 ����03:38:37
 * @description:
	��һ�ԭ���Ѿ��ӵ��ʵ�˳��ת�ˣ���ȷ�ľ���Ӧ���ǡ�I am a student.����Cat��һһ�ķ�ת��Щ����˳��ɲ����У����ܰ�����ô��
	˼·��
	�Ȱ�ÿһС���ַ�ת��Ȼ�����巴ת
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
