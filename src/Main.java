import java.util.*;

public class Main {
	public static void main(String[] args) {
		
		System.out.println("Enter the maximum size of the Stack:");
		Scanner scan = new Scanner(System.in);
		 int i = scan.nextInt();
	
		Stack mystack = new Stack(i);
		
		
		mystack.push("a");
		System.out.println(mystack.peek());
		
		mystack.push("b");
		System.out.println(mystack.pop());
		
		mystack.push("c");
		System.out.println(mystack.peek());
		
		mystack.push("d");
		System.out.println(mystack.peek());
		
		mystack.push("e");
		System.out.println(mystack.peek());
		
		
	}
}
