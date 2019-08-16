package JianZhiOffer;
/**
 * @file: test45.java
 * @author: 张旭东
 * @version 创建时间：2019-6-13 下午04:46:42
 * @description:
	将一个字符串转换成一个整数(实现Integer.valueOf(string)的功能，但是string不符合数字要求时返回0)，要求不能使用字符串转换整数的库函数。
	 数值为0或者字符串不是一个合法的数值则返回0。
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
