package JianZhiOffer;
/**
 * @author ����
 * @version ����ʱ�䣺2019-5-7 ����10:15:16
 * ��˵��:
	��Ŀ����
����һ��������������������Ʊ�ʾ��1�ĸ��������и����ò����ʾ��
 */
public class test11 {
	 public static int NumberOf1(int n) {
		 //int a = 0b11;   //���������Ʊ���
	     //int b = 011;    //�����˽��Ʊ���
	     //int c = 11;     //����ʮ���Ʊ���
	     int d = 0xffffffff;   //����ʮ�����Ʊ���
	     int a=d & n;
	     String s=Integer.toBinaryString(a);
	     int count=0;
	     for(int i=0;i<s.length();i++){
	    	 if(s.charAt(i)=='1')
	    		 count++;
	     }
		 return count;
	 }
	 public static int NumberOf11(int n) {
		 /*
		  * ��һ��������ȥ1���ٺ�ԭ�����������㣬��Ѹ��������ұ�һ��1���0.��ôһ�������Ķ������ж��ٸ�1���Ϳ��Խ��ж��ٴ������Ĳ�����
		  */
		 int count = 0;
		 while(n!= 0){
			 count++;
			 n = n & (n - 1);
			 }
		 return count;
	 }
	 
	 public static void main(String[] args) {
		 System.out.println(NumberOf1(-1));
	}
}
