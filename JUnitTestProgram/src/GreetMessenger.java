
public class GreetMessenger {

	private String greeting;
	GreetMessenger(String greet){
		this.greeting=greet;		
	}
	public String getGreeting() {
		System.out.println("greeting : "+greeting);
		return greeting;
	}	
}
