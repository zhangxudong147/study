package JianZhiOffer;

import java.util.Arrays;

/**
 * @file: test43.java
 * @author: ����
 * @version ����ʱ�䣺2019-6-12 ����08:37:44
 * @description:
	���ָ��һ����m,�ñ��Ϊ0��С���ѿ�ʼ������ÿ�κ���m-1���Ǹ�С����Ҫ���г��׸�,Ȼ���������Ʒ�����������ѡ����,���Ҳ��ٻص�Ȧ��,
	��������һ��С���ѿ�ʼ,����0...m-1����....������ȥ....ֱ��ʣ�����һ��С����,
 */
public class test43 {
	public static int LastRemaining_Solution(int n, int m) {
		if(n==0 || m==0)
			return -1;
        int a[]=new int[n];
        Arrays.fill(a, 0);
        
        int count=0;
        int i=0,j=0;
        
        while(count<(n-1)){
        	if(i==n)
        		i=0;
        	
        	if(a[i]==0){
        		if(j==(m-1)){
        			a[i]=1;
        			j=0;
        			count++;
        		}
        		else{
        			i++;
            		j++;
        		}
        	}
        	else
        		i++;
        }
        for(i=0;i<n;i++){
        	if(a[i]!=1)
        		break;
        }
        return i;
    }
	
	public static void main(String[] args) {
		System.out.println(LastRemaining_Solution(7, 3));
	}
}
