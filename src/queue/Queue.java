import java.util.*;

class Queue
{
    int arrQ[] ;
    int front, rear, size, len;

    // Constructor 
    public Queue(int n) 

    {
        size = n;
        len = 0;
        arrQ = new int[size];
        front = -1;
        rear = -1;

    }    

    //check if the queue is empty
    public boolean isEmpty() 
    {
        return front == -1;
    }    

    //check if the queue is full
    public boolean isFull() 
    {
      return front==0 && rear == size -1 ;
    }    

    //Size of the queue

    public int getSize()
    {
    	return len ;
    }    

    //check the front o queue

    public int peek() 
    {
       if (isEmpty())
           System.out.println("Underflow occured");
       return arrQ[front];

    }    

    //enqueue operation
    public void enqueue(int i) 
    {

        if (rear == -1) {
            front = 0;
            rear = 0;

            arrQ[rear] = i;

        }

        else if(rear + 1 >= size) {
            System.out.println("Overflow occured");}
        else if ( rear + 1 < size)
        	arrQ[++rear] = i;    
        len++ ;    
    }    

    //Dequeue operation

    public int dequeue() 
    {
        if (isEmpty())
           System.out.println("Underflow occured");
        
        else 
        {

            len-- ;
            int ele = arrQ[front];
            if ( front == rear) 
            {
                front = -1;
                rear = -1;
            }

            else  
                front++;
          
        return ele;
            
        }
        return -1;
    }

    //display the status of queue
    public void display()
    {
        System.out.print("\nQueue = ");
        if (len == 0)
        {
            System.out.print("The queue is empty\n");
            return ;

        }

        for (int i = front; i <= rear; i++)
            System.out.print(arrQ[i]+" ");
        System.out.println();        

    }

}
