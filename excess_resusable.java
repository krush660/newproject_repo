package auto;

public class excess_resusable {
	
	public static void main(String[] args) {
        // Create an object of reusable_method
		reusable_method obj = new reusable_method();

        // Call the methods
        obj.lunchapp();

        // Wait for 5 seconds before closing the browser (optional)
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        obj.closeapp();
    }
}
	

