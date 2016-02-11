package data_structures;

public class stack {

		static int[] st = new int[10];
		static int top = 0;
		
		void push(int n)
		{
			st[top] = n;
			System.out.println(st[top]);
			top++;
		}
		
		int pop()
		{
			top--;
			int n = st[top];
			return n;
		}
		
		public static void main(String[] args)
		{
			stack s = new stack();
			s.push(10);
			int a = s.pop();
			System.out.println(a);
		}
}
