

package auto;

public class calling_class {

	
	public static void main(String[] args) throws InterruptedException {
		reusable_method re=new reusable_method();
		re.lunchapp();
		Thread.sleep(3000);
		re.closeapp();
		
		
	}
	
}
