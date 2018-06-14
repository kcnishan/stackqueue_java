import java.util.Scanner;

public class Mainqueue
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Implementation of queue using array\n");
        System.out.println("Enter Size of Queue:");
        int n = scan.nextInt();
        
        Queue q = new Queue(n);//object creation        
        

        char ch;
        do{

            System.out.println("Select letter for corresponding operation");

            System.out.println("1. enqueue");
            System.out.println("2. dequeue");
            System.out.println("3. peek");
            System.out.println("4. check empty");
            System.out.println("5. check full");
            System.out.println("6. size");

            int choice = scan.nextInt();
            switch (choice)
            {

            case 1 : 
                System.out.println("Enqueue integer element:");
                q.enqueue( scan.nextInt() );
                break;                         

            case 2 : 
            	System.out.println("Removed Element = "+q.dequeue());
            	break;                         

            case 3 : 
                System.out.println("Peek Element = "+q.peek());
                break;                            

            case 4 : 

                System.out.println("Empty status = "+q.isEmpty());
                break;                

            case 5 : 
            	System.out.println("Full status = "+q.isFull());
                break;                          
            case 6 : 
                System.out.println("Size = "+ q.getSize());
                break;                         

            default : System.out.println("Wrong Entry \n ");
                break;

            }

            //dispaly queue

            q.display();            

            System.out.println("\nDo you want to continue your operation (Type y or n) \n");
            ch = scan.next().charAt(0);

        } while (ch == 'Y'|| ch == 'y');                                                        

    }    

}
