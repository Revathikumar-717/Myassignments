package week1.day2;

public class PrimeNumber {

	public static void main(String[] args) {
         int n=13;
         boolean flag=false;
         for(int i=2;i<=6;i++) {
        	 int div=n/i;
        	 if(n%i==0) {
        		 flag=true;
        		 break;}
         }
        		
        	 if (flag==false){
        		 System.out.println("prime");}
        	 else
        	 {
        		 System.out.println("not prime");
        	 }
        	 
        	 
         }
         
	
}

         