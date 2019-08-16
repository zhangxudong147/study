package JianZhiOffer;

import java.util.Arrays;

/**
 * @file: test49.java
 * @author: 张旭东
 * @version 创建时间：2019-6-19 下午05:38:41
 * @description:
	请实现一个函数用来判断字符串是否表示数值（包括整数和小数）。例如，字符串"+100","5e2","-123","3.1416"和"-1E-16"都表示数值。
	但是"12e","1a3.14","1.2.3","+-5"和"12e+4.3"都不是。
 */
public class test49 {
    public static boolean isNumeric(char[] str) {
    	int index=-1;
    	for(int i=0;i<str.length;i++){
    		if(str[i]=='e' || str[i]=='E'){
    			index=i;
    		}
    	}
    	
    	if(index!=-1){
    		if(index==(str.length-1) || index==0)
    			return false;
    		
    		char[] s1;
    		if(str[0]=='+' || str[index+1]=='-')
    			s1=Arrays.copyOfRange(str, 1, index);
    		else
    			s1=Arrays.copyOfRange(str, 0, index);
    		if(s1.length<=0)
    			return false;
    		
    		
    		char[] s2;
    		if(str[index+1]=='+' || str[index+1]=='-')
    			s2=Arrays.copyOfRange(str, index+2, str.length);
    		else
    			s2=Arrays.copyOfRange(str, index+1, str.length);
    		if(s2.length<=0 || !isNumeric2(s2))
    			return false;
    		
    		
    		index=-1;
        	for(int i=0;i<s1.length;i++){
        		if(s1[i]=='.'){
        			index=i;
        		}
        	}
        	if(index!=-1){
        		char[] s11=Arrays.copyOfRange(s1, 0, index);
            	char[] s12=Arrays.copyOfRange(s1, index+1, s1.length);
            	return isNumeric2(s11)&&isNumeric2(s12);
        	}
        	else{
        		return isNumeric2(s1);
        	}
    	}
    	else{
            if(str[0]=='+' || str[index+1]=='-'){
                str[0]='9';
            }
            index=-1;
            for(int i=0;i<str.length;i++){
                if(str[i]=='.'){
                    index=i;
                }
            }
            if(index!=-1){
                char[] s11=Arrays.copyOfRange(str, 0, index);
                char[] s12=Arrays.copyOfRange(str, index+1, str.length);
                return isNumeric2(s11)&&isNumeric2(s12);
            }
            else{
                return isNumeric2(str);
            }
        }
    }
    
    public static boolean isNumeric2(char[] str) { //判断是不是正整数
    	if(str.length<=0)
    		return false;
    	if(str.length>1 && str[0]=='0')
    		return false;
    	for(int i=0;i<str.length;i++){
    		if(!(str[i]<='9' && str[i]>='0'))
    			return false;
    	}
    	return true;
    }
    public static void main(String[] args) {
    	char[] str="-.123".toCharArray();
    	System.out.println(isNumeric(str));
	}
}
