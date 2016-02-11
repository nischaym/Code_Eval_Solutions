package ctci_stack_queues;

import java.util.Stack;

//import java.util.Stack;

public class Q_2 extends Stack <Integer>{

	Stack<Integer> s2 ;
	
	public Q_2()
	{
		s2= new Stack<Integer>();
	}
	
	public void push(int value)
	{
		if(value < min())
		{
			s2.push(value);
		}
		
		super.push(value);
	}
	
	public int min() {
		
		if(s2.isEmpty())
		{
			return Integer.MAX_VALUE;
		}
		else
		{
			return s2.peek();
		}
		//return 1;
			
	}

	public Integer pop()
	{
		int value = super.pop();
		if(min() == value)
		{
			s2.pop();
		}
		return value;
	}
	
	
	public static void main(String[] args)
	{
		Q_2 s = new Q_2();

		s.push(1);
		s.push(2);
		s.push(30);
		System.out.println(s.min());
	}
}


