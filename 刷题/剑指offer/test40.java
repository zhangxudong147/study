package JianZhiOffer;
/**
 * @file: test40.java
 * @author: 张旭东
 * @version 创建时间：2019-6-12 上午11:11:47
 * @description:
	字符序列S=”abcXYZdef”,要求输出循环左移3位后的结果，即“XYZdefabc”。是不是很简单？OK，搞定它！
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
