package JianZhiOffer;
/**
 * @file: test45.java
 * @author: ����
 * @version ����ʱ�䣺2019-6-13 ����04:46:42
 * @description:
	��һ���ַ���ת����һ������(ʵ��Integer.valueOf(string)�Ĺ��ܣ�����string����������Ҫ��ʱ����0)��Ҫ����ʹ���ַ���ת�������Ŀ⺯����
	 ��ֵΪ0�����ַ�������һ���Ϸ�����ֵ�򷵻�0��
 */
public class test45 {
	public static int StrToInt(String str) {
        if(str == null || str.length() ==0)
        	return 0;
        int f=1,i=1,sum=0;
        if(str.charAt(0)!='-' && str.charAt(0)!='+' && str.charAt(0)<'0' && str.charAt(0)>'9'){
        	return 0;
        }
        if(str.charAt(0)=='-'){
        	f=-1;
        }
        if(str.charAt(0)>='0' && str.charAt(0)<='9'){
        	i=0;
        }
        for(;i<str.length();i++){
        	char a=str.charAt(i);
        	if(a>='0' && a<='9'){
        		sum=sum*10+(a-'0');
        	}
        	else
        		return 0;
        }
        return sum*f;
    }
	public static void main(String[] args) {
		System.out.println(StrToInt("2  "));
	}
}
