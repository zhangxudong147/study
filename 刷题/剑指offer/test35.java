package JianZhiOffer;

import java.util.Arrays;

/**
 * @file: test35.java
 * @author: ����
 * @version ����ʱ�䣺2019-5-26 ����07:44:25
 * @description:
	�������е��������֣����ǰ��һ�����ִ��ں�������֣����������������һ������ԡ�����һ������,�����������е�����Ե�����P��
	����P��1000000007ȡģ�Ľ������� �����P%1000000007

 */
public class test35 {
	//ֻ��50�֣�����ʱ�����
    public static int InversePairs(int [] array) {
    	if(array.length<=1)
    		return 0;
    	int sum=0;
    	int a=array[0];
        for(int i=1;i<array.length;i++){
        	if(array[i]<a){
        		sum++;
        	}
        }
        return (sum+InversePairs(Arrays.copyOfRange(array, 1, array.length)))%1000000007;
    }
    //ͬ��ֻ��50��
    public static int InversePairs2(int [] array) {
    	int sum=0;
        for(int i=0;i<array.length;i++){
        	for(int j=i+1;j<array.length;j++){
        		if(array[i]>array[j])
        			sum++;
        	}
        }
        return sum%1000000007;
    }
    
    //��������,ͬ����50%��ʱ�临�Ӷ�̫����
    public static int InversePairs3(int [] array) {
    	int sum=0;
    	for(int i=1;i<array.length;i++){
    		int temp=array[i];
    		int j;
    		for(j=i-1;j>=0;j--){
    			if(array[j]>temp){
    				array[j+1]=array[j];
    				sum++;
    			}else{
    				break;
    			}
    		}
    		array[j+1]=temp;
    	}
    	return sum%1000000007;
    }
    
  //�鲢�㷨�Ľ�
    public static int InversePairs4(int [] a) {
    	if(a.length<=1)
    		return 0;
    	
    	return sort(a,0,a.length-1)%1000000007;
    }
    
    public static int sort(int []a, int left, int right){
    	if(left<right){
    		int mid=(left+right)/2;
    		return (sort(a,left,mid)+sort(a,mid+1,right)+merge(a,left,mid,right))%1000000007;
    	}
    	return 0;
    }
    
    public static int merge(int []a,int left,int mid, int right){
    	int i=left;
    	int j=mid+1;
    	int k=0;
    	int temp[]=new int[right-left+1];
    	int count=0;
    	
    	while(i<=mid && j<=right){
    		if(a[i]<=a[j]){
    			temp[k++]=a[i++];
    		}else{
    			temp[k++]=a[j++];
    			count+=(mid-i+1);
    			count%=1000000007;  //�ؼ�һ������Ϊ����Ǵ�С�����˳���ź��ˣ���ô[i,mid]֮������������Ǵ���a[j]��
    		}
    	}
    	
    	while(i<=mid){
    		temp[k++]=a[i++];
    	}
    	while(j<=right){
    		temp[k++]=a[j++];
    	}
    	k=0;
    	while(left<=right){
    		a[left++]=temp[k++];
    	}
    	return count;
    }
    
    public static void main(String []args){
    	int a[]={1,2,0,3,4,5,6,7,8,0};
    	System.out.println(InversePairs4(a));
    	
    }
}
