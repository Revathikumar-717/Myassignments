package week1.day2;

public class FindFirstMissingElementInAnArray {

	public static void main(String[] args) {
		int arr[]={1,2,3,4,7,6,8};
	    int sum=0,sum1=0;
 		for (int i = 0; i < arr.length; i++) {
               sum=sum+arr[i];
    	  }
    	  for (int i=1;i<=8;i++) {
    		  sum1=sum1+i;
    	  }
    		 
    		System.out.println("the missing number is:"+ (sum1-sum));
    }
	}


