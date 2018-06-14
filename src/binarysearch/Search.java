import java.util.ArrayList;
import java.util.Random;

public class Search
{
	ArrayList<Integer> list;
	public Search(ArrayList<Integer> list) {
		
		this.list = list;
	}
	
    public boolean binarySearch()
    {	
    	int low = 0;
    	int item = 1555;
		int high = this.list.size()-1;
		
        while(true)
        {
        	int mid = low + (high-low)/2;
        	if(low > high) {
        	return false;}
        	
            if (mid == item)
               return true;
 
            
            else if (mid > item)
               high = mid -1;
            else low = mid + 1; 
            
        }
 
        
       
    }
}
    