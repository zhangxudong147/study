package JianZhiOffer;

import java.util.ArrayList;

/**
 * @file: test39.java
 * @author: 张旭东
 * @version 创建时间：2019-6-6 上午11:05:10
 * @description:
	输入一个递增排序的数组和一个数字S，在数组中查找两个数，使得他们的和正好是S，如果有多对数字的和等于S，输出两个数的乘积最小的。
找到的第一组（相差最大的）就是乘积最小的。可以这样证明：考虑x+y=C（C是常数），x*y的大小。
不妨设y>=x，y-x=d>=0，即y=x+d, 2x+d=C, x=(C-d)/2, x*y=x(x+d)=(C-d)(C+d)/4=(C^2-d^2)/4，
也就是x*y是一个关于变量d的二次函数，对称轴是y轴，开口向下。d是>=0的，d越大, x*y也就越小。
 */
public class test39 {
	public ArrayList<Integer> FindNumbersWithSum(int [] array,int sum) {
        ArrayList<Integer> result=new ArrayList<Integer>();
        int left=0;
        int right=array.length-1;
        while(left<right){
            if((array[left]+array[right])>sum)
                right--;
            if((array[left]+array[right])<sum)
                left++;
            if((array[left]+array[right])==sum){
                result.add(array[left]);
                result.add(array[right]);
                break;  //可以证明
            }
        }
        return result;
    }
}
