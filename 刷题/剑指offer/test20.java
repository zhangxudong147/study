package JianZhiOffer;
/**
 * @file: test20.java
 * @author: 张旭东
 * @version 创建时间：2019-5-8 下午05:02:21
 * @description:
	题目描述
定义栈的数据结构，请在该类型中实现一个能够得到栈中所含最小元素的min函数（时间复杂度应为O（1））。
 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Stack;

public class test20 {
	ArrayList<Integer> data=new ArrayList<Integer>();
	
	public void push(int node) {
        data.add(node);
    }
    
    public void pop() {
        data.remove(data.size()-1);
    }
    
    public int top() {
        return data.get(data.size()-1);
    }
    
    public int min() {
    	int min=data.get(0);
    	for(int i=1;i<data.size();i++){
    		if(data.get(i)<min)
    			min=data.get(i);
    	}
        return min;
    }
    
    public static void main(String[] args) {
		test20 t=new test20();
		t.push(3);
		t.push(2);
		System.out.println(t.min());
		
	}
}
