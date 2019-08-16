package JianZhiOffer;

import java.util.Arrays;

/**
 * @file: test43.java
 * @author: 张旭东
 * @version 创建时间：2019-6-12 下午08:37:44
 * @description:
	随机指定一个数m,让编号为0的小朋友开始报数。每次喊到m-1的那个小朋友要出列唱首歌,然后可以在礼品箱中任意的挑选礼物,并且不再回到圈中,
	从他的下一个小朋友开始,继续0...m-1报数....这样下去....直到剩下最后一个小朋友,
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
