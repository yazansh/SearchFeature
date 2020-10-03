package acceptance_tests;

import static org.junit.Assert.assertEquals;

import java.util.Scanner;

import fall2020Project.Checkout;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CheakoutSteps {
	private int c;//total apple
	private int t;//total banana
	private int price ;
	private int itemCount;
	private Checkout checkout=new Checkout();
	
	//checkout=new Checkout();
	

	@Given("the price of a {string} is {int}")
	public void thePriceOfAIs(String string, Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
		itemCount=0;
		price =0;
		 t=0;
		 c=0;
	}


	//Some other steps were also undefined:

	@When("I checkout {int} {string}")
	public void iCheckout(Integer int1, String string) {
	
		// Write code here that turns the phrase above into concrete actions
		
	System. out.println("enter the fruit");
		
		Scanner	f=new Scanner(System.in)	;
		String fruit=f.nextLine();
		if(fruit.equals("banana")) {price=40;
		System. out. println("enter the item count");
		Scanner	l=new Scanner(System.in)	;
		itemCount=l.nextInt();
		 t=checkout.totalbanana(itemCount,price);
		}
		else if(fruit.equals("apple")) { price=25;
		System. out. println("enter the item count");
		Scanner	p=new Scanner(System.in)	;
		itemCount=p.nextInt();
		 c=checkout.totalapple(itemCount,price);
		
		}
		else if(fruit.equals("apple and banana")) {
			System. out. println(" enter how many apple");
			Scanner	p=new Scanner(System.in)	;
			itemCount=p.nextInt();
			 c=checkout.totalapple(itemCount,25);
			 System. out. println("enter how many banana");
				Scanner	l=new Scanner(System.in)	;
				itemCount=l.nextInt();
				 t=checkout.totalbanana(itemCount,40);
			
		}
		//general case
		else {
			
			System. out. println(" enter the price");
			Scanner	m=new Scanner(System.in)	;
			price=m.nextInt();
			
			System. out. println("enter the item count");
			Scanner	p=new Scanner(System.in)	;
			itemCount=p.nextInt();
		t=0;
		c=checkout.totalapple(itemCount,price);
			
			
			
		}
		
	   // throw new io.cucumber.java.PendingException();
	}
	@Then("the total price should be {int}")
	public void theTotalPriceShouldBe(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
		
		assertEquals(price,checkout.total(c, t));
	   // throw new io.cucumber.java.PendingException();
	}





}
