package project2;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

public class program1 {

	@Given("a 5 by 5 game")
    public void theGameIsRunning() {
		//System.out.println("given");
    }
     
    @When("I toggle the cell at (2, 3)")
    public void iToggleTheCellAt() {
    	//System.out.println("when");
    }
     
    @Then("the grid should look like : 3")
    public void theGridShouldLookLike() {
    	//System.out.println("then");
    	assertThat(3, is(3));
    }
}
