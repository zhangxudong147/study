package JianZhiOffer;
/**
 * @file: test48.java
 * @author: ����
 * @version ����ʱ�䣺2019-6-14 ����03:59:32
 * @description:
	��ʵ��һ����������ƥ�����'.'��'*'��������ʽ��ģʽ�е��ַ�'.'��ʾ����һ���ַ�����'*'��ʾ��ǰ����ַ����Գ�������Σ�����0�Σ��� 
	�ڱ����У�ƥ����ָ�ַ����������ַ�ƥ������ģʽ�����磬�ַ���"aaa"��ģʽ"a.a"��"ab*ac*a"ƥ�䣬������"aa.a"��"ab*a"����ƥ��

��1�����ڶ����ַ���Ϊ��*��ʱ��ƥ����ǽ��ַ�����ģʽ��ָ�붼����һ������ƥ���ֱ�ӷ���false
��2�����ڶ����ַ�Ϊ'*'ʱ��
        ƥ�䣺
                a.�ַ�������һ����ģʽ����
                b.�ַ�������һ����ģʽ��������
                c.�ַ���������ģʽ��������
        ��ƥ�䣺�ַ������Ʋ�����ģʽ��������
 */
public class test48 {
	public boolean match(char[] str, char[] pattern)
    {
        if((str==null && pattern==null)) //��Ϊ�գ���ƥ��
        	return false;
        int strIndex=0;
        int patIndex=0;
        return match1(strIndex,str,patIndex,pattern);
    }
	public boolean match1(int strIndex, char[] str,int patIndex, char[] pattern){
		//ȫ����ƥ�����ˣ�������ȷ
		if(strIndex==str.length && patIndex==pattern.length)
			return true;
		//�ַ������ܱ�ģʽ���Ƚ���
		if(strIndex<str.length && patIndex==pattern.length)
			return false;
		
		//���ڶ����ַ�Ϊ��*��ʱ
		if((patIndex+1)<pattern.length && pattern[patIndex+1]=='*'){
			if(strIndex<str.length && str[strIndex]==pattern[patIndex] ||
					(strIndex<str.length && '.'==pattern[patIndex])){ //ƥ��
				return match1(strIndex+1,str,patIndex,pattern)
					 ||match1(strIndex+1,str,patIndex+2,pattern)
				     ||match1(strIndex,str,patIndex+2,pattern);
			}
			else
				return match1(strIndex,str,patIndex+2,pattern);
		}

		//���ڶ����ַ���Ϊ��*��ʱ�����Ǹ����ϣ���Ϊ��Ĭ�ϵĵڶ�����Ϊ*���������ж�
		if((strIndex<str.length && str[strIndex]==pattern[patIndex]) ||
				(strIndex<str.length && '.'==pattern[patIndex]) ) //ƥ��
			return match1(strIndex+1,str,patIndex+1,pattern);
		else
			return false;
	}
}
