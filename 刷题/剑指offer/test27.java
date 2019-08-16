package JianZhiOffer;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @file: test27.java
 * @author: ����
 * @version ����ʱ�䣺2019-5-21 ����03:36:12
 * @description:
	����һ���ַ���,���ֵ����ӡ�����ַ������ַ����������С����������ַ���abc,���ӡ�����ַ�a,b,c
	�������г����������ַ���abc,acb,bac,bca,cab��cba��
 */
public class test27 {
	public static ArrayList<String> Permutation(String str) {
		ArrayList<String> list=new ArrayList<String>();
		
		if(str==null)
			return null;
		if(str.length()==1){
			list.add(str);
		}
		for(int i=0;i<str.length();i++){
			String sub=str.substring(i, i+1);
			String newsub=str.substring(0, i)+str.substring(i+1,str.length());

			ArrayList<String> sublist=Permutation(newsub);
			if(sublist!=null){
				for(int j=0;j<sublist.size();j++){
					String temp=sub+sublist.get(j);
					if(!list.contains(temp))
						list.add(sub+sublist.get(j));
				}
			}	
		}
		Collections.sort(list);
		return list;
    }
	
	public static void main(String[] args) {
		ArrayList<String> list=Permutation("aba");
		System.out.println(list.size());
		if(list!=null){
			for(String s:list)
				System.out.println(s);
		}else
			System.out.println(111);
	}
}
