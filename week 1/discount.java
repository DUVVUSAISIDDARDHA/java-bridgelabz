public class discount{
    public static void main(String[] args){
	
	int fee = 125000;
	int discount_percientage = 10;
	double discount = (fee/100 *10);
	double total_fee = fee - discount;
	
	System.out.println("discount:" + discount + "\n" + "total fee :" + total_fee);
	}
}
	