package week1.day1;

public class Mobile {

	public void makeCall() {
		String mobileModel="Samsung S1" ;
		float mobileWeight=15.7f ;
		System.out.println(mobileModel+mobileWeight);
	}
	
	public void sendMsg() {
		boolean fullCharged=true;
		int mobileCost=31325;
		System.out.println(fullCharged);
		System.out.println(mobileCost);
	}
	
	public static void main(String[] args) {
		Mobile mb = new Mobile();
		mb.makeCall();
		mb.sendMsg();
		System.out.println("This is my mobile");
		
		
	}

}
