package JianZhiOffer;
/**
 * @file: test40.java
 * @author: ����
 * @version ����ʱ�䣺2019-6-12 ����11:11:47
 * @description:
	�ַ�����S=��abcXYZdef��,Ҫ�����ѭ������3λ��Ľ��������XYZdefabc�����ǲ��Ǻܼ򵥣�OK���㶨����
 */
public class test40 {
	public String LeftRotateString(String str,int n) {
		if(str==null || str.length()==0)
			return "";
        String sub=str.substring(0, n);
        String s=str.replace(sub, "");
        return s+sub;
    }
}
