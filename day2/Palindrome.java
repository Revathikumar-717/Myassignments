package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
        int num =34343,temp=0;
        
    for (;num!=0;num=num/10){
        	int rem=num%10;
             temp=(temp*10)+rem;
    
        	if (temp==num) {
        	System.out.println("the number is palindrome");
        }
        	
    }
      }
}




