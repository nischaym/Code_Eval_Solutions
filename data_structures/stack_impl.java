package data_structures;

public class stack_impl {

	  private int maxSize;
	   private long[] stackArray;
	   private int top;
	   
	   public stack_impl(int s) 
	   {
	      //maxSize = s;
	      stackArray = new long[s];
	      top = -1;
	   }
	   
	   public void push(long j) 
	   {
	      stackArray[++top] = j;
	   }
	   
	   public long pop() {
	      return stackArray[top--];
	   }
	   
	   public long peek() 
	   {
	      return stackArray[top];
	   }
	   public boolean isEmpty() 
	   {
	      return (top == -1);
	   }
	   public boolean isFull() 
	   {
	      return (top == maxSize - 1);
	   }
	   
	   
	   public static void main(String[] args) 
	   {
		  stack_impl theStack = new stack_impl(10); 
	      theStack.push(10);
	      theStack.push(20);
	      theStack.push(30);
	      theStack.push(40);
	      theStack.push(50);
	      while (!theStack.isEmpty()) 
	      {
	         //long value = theStack.pop();
	         System.out.print(theStack.pop());
	         System.out.print(" ");
	      }
	      System.out.println("");
	   }
	
	
	
}
