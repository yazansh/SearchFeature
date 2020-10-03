package acceptance_tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.awt.font.NumericShaper;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import org.junit.runner.RunWith;

import fall2020Project.Checkout;
import fall2020Project.FinderApp;
import fall2020Project.Home;
import fall2020Project.HomeAmenities;
import fall2020Project.HomeMaterial;
import fall2020Project.HomePets;
import fall2020Project.HomePlacement;
import fall2020Project.HomeType;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;


public class SearchHomeSteps {
	//public List<Home> homes;
	private FinderApp finder;
	private List<Home> byPlacementList; 
	private List<Home> byTypeList;
	private List<Home> byMaterialList;
	private List<Home> byAmenityList;
	private String spec;
	
	
	@Given("these homes are contained in the system")
	public void theseHomesAreContainedInTheSystem(DataTable dataTable) {
		this.finder = new FinderApp(dataTable);
		//finder.printHomes();
	}


	@When("I search about home by {string}")
	public void iSearchAboutHomeBy(String spec) {
		this.spec = spec;
		if(HomeType.isHomeType(spec)) {
		byTypeList= finder.byType(spec);
		}
		
		if(HomeMaterial.isHomeMaterial(spec)) {
			byMaterialList= finder.byMaterial(spec);
			}

		if(HomePlacement.isHomePlacement(spec)) {
			byPlacementList= finder.byPlacement(spec);
			}
		
		if(HomeAmenities.isHomeAmenity(spec)) {
			byAmenityList= finder.byAmenities(spec);
			}
	}
	
	@Then("A list of homes that matches the  type specification should be returned and printed on the console")
	public void aListOfHomesThatMatchesTheTypeSpecificationShouldBeReturnedAndPrintedOnTheConsole() {
	    // Write code here that turns the phrase above into concrete actions
		if(spec.equals("HOUSE")) {
			Iterator<Home>itr=byTypeList.iterator();
			assertEquals("found 2 homes of type HOUSE ", 1, byTypeList.size());
			
			while(itr.hasNext()){
				assertTrue(itr.next().getType().toString().equals(spec));
			}
		}
		
		else if(spec.equals("APARTMENT")) {
			Iterator<Home>itr=byTypeList.iterator();
			assertEquals("found 2 homes of type APARTMENT ", 1, byTypeList.size());
			
			while(itr.hasNext()){
				assertTrue(itr.next().getType().toString().equals(spec));
			}
		}
	}
}
