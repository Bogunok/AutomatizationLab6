package com.mohyla;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import static org.junit.jupiter.api.Assertions.*;
public class CucumberTest {
    private String string1;
    private String string2;
    private String result;

    @Given("I have strings {string} and {string}")
    public void given(String string1, String string2) {
        this.string1 = string1;
        this.string2 = string2;
    }

    @When("I concatenate them")
    public void when() {
        this.result = string1 + string2;
    }

    @Then("the result should be {string}")
    public void then(String expectedResult) {
        assertEquals(expectedResult, result);
    }
}
