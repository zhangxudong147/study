package JianZhiOffer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/**
 * @file: test32.java
 * @author: 张旭东
 * @version 创建时间：2019-5-24 下午02:06:03
 * @description:
	输入一个正整数数组，把数组里所有数字拼接起来排成一个数，打印能拼接出的所有数字中最小的一个。例如输入数组{3，32，321}，
	则打印出这三个数字能排成的最小数字为321323。
	思路：
	链接：https://www.nowcoder.com/questionTerminal/8fecd3f8ba334add803bf2a06af1b993
来源：牛客网

 解题思路：
 * 先将整型数组转换成String数组，然后将String数组排序，最后将排好序的字符串数组拼接出来。关键就是制定排序规则。
 * 排序规则如下：
 * 若ab > ba 则 a > b，
 * 若ab < ba 则 a < b，
 * 若ab = ba 则 a = b；
 * 解释说明：
 * 比如 "3" < "31"但是 "331" > "313"，所以要将二者拼接起来进行比较
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
