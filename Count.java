
public class Count {

	//private int value;
	//public void counter()
	///{
	//	value +=1;
	//}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Counter tally = new Counter();
		tally.count();
		tally.count();
		 
		
		int result = tally.getValue();
		System.out.println("Value: " + result);
		tally.count();
		tally.count();
		
		result= tally.getValue();
		System.out.println("Value: "+ result);
		//end of code
	}
	//end of main

}
