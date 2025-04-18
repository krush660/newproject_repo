package auto;

public class CLASS_A {
	
	int a2=12;
	CLASS_A (){
		System.out.println("the given class is class_A");
		
		}
	
	CLASS_A (int a,int ab){
		this();
		System.out.println(a2);
		
		System.out.println("the given staement is for class_a and ab");
		
		
		this.a();
		
	}
	private void a() {
		
	}

	public static void main(String[] args) {
		
		
		CLASS_A a1=new CLASS_A(20,40);
		
		System.out.println(a1);
		
	}
		
	}
	
