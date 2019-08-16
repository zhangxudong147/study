package JianZhiOffer;
/**
 * @file: test48.java
 * @author: 张旭东
 * @version 创建时间：2019-6-14 下午03:59:32
 * @description:
	请实现一个函数用来匹配包括'.'和'*'的正则表达式。模式中的字符'.'表示任意一个字符，而'*'表示它前面的字符可以出现任意次（包含0次）。 
	在本题中，匹配是指字符串的所有字符匹配整个模式。例如，字符串"aaa"与模式"a.a"和"ab*ac*a"匹配，但是与"aa.a"和"ab*a"均不匹配

（1）当第二个字符不为‘*’时：匹配就是将字符串和模式的指针都下移一个，不匹配就直接返回false
（2）当第二个字符为'*'时：
        匹配：
                a.字符串下移一个，模式不动
                b.字符串下移一个，模式下移两个
                c.字符串不动，模式下移两个
        不匹配：字符串下移不动，模式下移两个
 */
public class test48 {
	public boolean match(char[] str, char[] pattern)
    {
        if((str==null && pattern==null)) //都为空，则匹配
        	return false;
        int strIndex=0;
        int patIndex=0;
        return match1(strIndex,str,patIndex,pattern);
    }
	public boolean match1(int strIndex, char[] str,int patIndex, char[] pattern){
		//全部都匹配完了，返回正确
		if(strIndex==str.length && patIndex==pattern.length)
			return true;
		//字符串不能比模式串先结束
		if(strIndex<str.length && patIndex==pattern.length)
			return false;
		
		//当第二个字符为‘*’时
		if((patIndex+1)<pattern.length && pattern[patIndex+1]=='*'){
			if(strIndex<str.length && str[strIndex]==pattern[patIndex] ||
					(strIndex<str.length && '.'==pattern[patIndex])){ //匹配
				return match1(strIndex+1,str,patIndex,pattern)
					 ||match1(strIndex+1,str,patIndex+2,pattern)
				     ||match1(strIndex,str,patIndex+2,pattern);
			}
			else
				return match1(strIndex,str,patIndex+2,pattern);
		}

		//当第二个字符不为‘*’时，这是个诀窍，因为是默认的第二个不为*，不用在判断
		if((strIndex<str.length && str[strIndex]==pattern[patIndex]) ||
				(strIndex<str.length && '.'==pattern[patIndex]) ) //匹配
			return match1(strIndex+1,str,patIndex+1,pattern);
		else
			return false;
	}
}
