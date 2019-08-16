package JianZhiOffer;
/*
 * 题目描述
在一个二维数组中（每个一维数组的长度相同），每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。
请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
规律：每一行都使用一次折半查找
 */

public class test01 {
	public static boolean Find(int target, int [][] array) {
		//检测是否是正常的数组
		if(array==null || array.length<1 || array[0].length<1)
			return false;
		for(int i=0;i<array.length;i++){
			int a=0;
			int b=array[i].length-1;
			while(a<=b){
				int mid=(a+b)/2;
				if(array[i][mid]==target)
					return true;
				else if(array[i][mid]<target){
					a=mid+1;
				}else{
					b=mid-1;
				}
			}
		}
        return false;
	}
	public static void main(String[] args) {
		int target=7;
		int [][] array = {{}};
		System.out.println(Find(target,array));
		
	}
}
