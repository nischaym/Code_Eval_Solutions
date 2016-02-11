package ctci_stack_queues;

public class Q_3 {

	int[] stack1 = (int[ ]) new int[10];
	int[] stack2 = (int[ ]) new int[10];
	int[] stack3 = (int[ ]) new int[10];
	int[][] stacks = new int[][]{stack1, stack2,stack3};
	int top[] = new int[3];
	int cs = -1;
	//private char[] pop();
	
	public int popAt(int sn)
	{
		if(cs == -1 || (sn == 2 && cs < 10) || (sn == 3 && cs < 20))
		{
			return Integer.MIN_VALUE;
		}
		
		int value = Integer.MIN_VALUE;
		switch(sn)
		{
		case 1 :
			value = stacks[0][cs];
			break;
			
		case 2 : 
			value = stacks[1][cs-10];
			break;
		case 3:
			value = stacks[2][cs-20];
		}
		cs --;
		
		return value;
//		if(top[sn-1] >-1)
//		{
//			int value =  stacks[sn-1][top[sn-1]];
//			top[sn-1]--;
//			return value;
//		}
//		else
//		{
//			return Integer.MIN_VALUE;
//		}
	}
	
	public Integer push(int data)
	{
		cs++;
		
		if(cs == 30)
		{
			System.out.println("stack full");
			return 0;
		}
		
		if(cs>=0 && cs<=9)
		{
			stacks[0][cs] = data;
			
		}
		else if(cs>9 && cs<=19)
		{
			stacks[0][cs-10] = data;
			
		}
		else if(cs>19 && cs<=29)
		{
			stacks[0][cs-20] = data;
		}
		return data;
		
	}

	public Integer pop()
	{
		int value = 0;
		if(cs == -1)
		{
			 value =  Integer.MIN_VALUE;
		}
		
		else if(cs>=0 && cs<=9)
		{
			value =  stacks[0][cs];
			
		}
		else if(cs>9 && cs<=19)
		{
			value =  stacks[1][cs-10];
			
		}
		else if(cs>19 && cs<=29)
		{
			value =  stacks[2][cs-20];
		}

		return value;
	}
	
	public static void main(String[] args)
	{
		Q_3 s = new Q_3();
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		s.push(5);
		System.out.println(s.popAt(1));
	}
	
}
