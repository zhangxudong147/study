package JianZhiOffer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/**
 * @file: test32.java
 * @author: ����
 * @version ����ʱ�䣺2019-5-24 ����02:06:03
 * @description:
	����һ�����������飬����������������ƴ�������ų�һ��������ӡ��ƴ�ӳ���������������С��һ����������������{3��32��321}��
	���ӡ���������������ųɵ���С����Ϊ321323��
	˼·��
	���ӣ�https://www.nowcoder.com/questionTerminal/8fecd3f8ba334add803bf2a06af1b993
��Դ��ţ����

 ����˼·��
 * �Ƚ���������ת����String���飬Ȼ��String������������ź�����ַ�������ƴ�ӳ������ؼ������ƶ��������
 * ����������£�
 * ��ab > ba �� a > b��
 * ��ab < ba �� a < b��
 * ��ab = ba �� a = b��
 * ����˵����
 * ���� "3" < "31"���� "331" > "313"������Ҫ������ƴ���������бȽ�
 */
public class test32 {
	@SuppressWarnings("unchecked")
	public static String PrintMinNumber2(int [] numbers){
		ArrayList<String> list =new ArrayList<String>();
		String result="";
		for(int i : numbers){
			list.add(Integer.toString(i));
		}
		
		Collections.sort(list, new Comparator<String>(){
			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				return (o1+o2).compareTo(o2+o1);
			}
		});
		
		for(String i : list){
			result+=i;
		}
		return result;
	}
	
	public static String PrintMinNumber(int [] numbers) {
		ArrayList<String> list =new ArrayList<String>();
		String result="";
		for(int i : numbers){
			list.add(Integer.toString(i));
		}
		Collections.sort(list);
		
		while(!list.isEmpty()){
			String min=list.get(0);
			
			for(int i=1;i<list.size();i++){
				String temp=list.get(i);
				int len=temp.length()<min.length() ? temp.length(): min.length();
				int j=0;
				for(;j<len;j++){
					if(temp.charAt(j)<min.charAt(j)){
						min=temp;
						break;
					}
					if(temp.charAt(j)>min.charAt(j)){
						break;
					}
				}
				if(j>=len){
					for(int k=j;k<temp.length();k++){
						if(temp.charAt(k)<min.charAt(0))
							min=temp;
					}
				}
					
			}
			result+=min;
			list.remove(min);
		}
		return result;
    }
	
	public static void main(String[] args) {
		int a[]={3,32,321};
		System.out.println(PrintMinNumber2(a));
	}
}
