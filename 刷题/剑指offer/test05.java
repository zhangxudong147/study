package JianZhiOffer;
//题目描述
//用两个栈来实现一个队列，完成队列的Push和Pop操作。 队列中的元素为int类型。
import java.util.Stack;

class Solution {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();
    
    public void push(int node) {
    	stack1.push(node);
    }
    
    public int pop() {
    	while(!stack1.isEmpty()){
        	stack2.push(stack1.pop());
        }
    	int p=stack2.pop();
    	while(!stack2.isEmpty()){
        	stack1.push(stack2.pop());
        }
    	return p;
    }
}

public class test05 {
	public static void main(String[] args) {
		Solution so=new Solution();
		so.push(1);
		so.push(2);
		System.out.println(so.pop());
		so.push(3);
		System.out.println(so.pop());
		System.out.println(so.pop());
	}
	
	
	
}
