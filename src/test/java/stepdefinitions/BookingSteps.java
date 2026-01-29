package stepdefinitions;

import base.PlaywrightFactory;
import com.microsoft.playwright.*;
import io.cucumber.java.en.*;
import org.junit.jupiter.api.Assertions;

import java.util.List;

public class BookingSteps {

    Page page;

    @Given("user navigates to Royal Brothers website")
    public void user_navigates_to_website() {
        page = PlaywrightFactory.initBrowser();
        page.navigate("https://www.royalbrothers.com/");
        Assertions.assertTrue(page.title().contains("Royal Brothers"));
    }

    @When("user selects city {string}")
    public void user_selects_city(String city) {
        page.locator("input[placeholder='Search city']").fill(city);
        page.locator("text=" + city).click();
    }

    @When("user selects pickup date {string} and time {string}")
    public void pickup_date_time(String date, String time) {
        page.locator("text=Select Date & Time").click();
        page.locator("text=" + date).click();
        page.locator("select[name='pickupTime']").selectOption(time);
    }

    @When("user selects dropoff date {string} and time {string}")
    public void dropoff_date_time(String date, String time) {
        page.locator("text=" + date).click();
        page.locator("select[name='dropTime']").selectOption(time);
    }

    @When("user clicks on search")
    public void click_search() {
        page.locator("button:has-text('Search')").click();
    }

    @Then("selected date and time filter should be visible")
    public void validate_filter() {
        Assertions.assertTrue(page.locator("text=Pickup date").isVisible());
        Assertions.assertTrue(page.locator("text=Dropoff date").isVisible());
    }

    @When("user applies location filter {string}")
    public void apply_location_filter(String location) {
        page.locator("text=Location").click();
        page.locator("label:has-text('" + location + "')").click();
    }

    @Then("all bikes should belong to location {string}")
    public void validate_bike_locations(String location) {

        List<ElementHandle> bikes =
                page.querySelectorAll(".bike-card");

        for (ElementHandle bike : bikes) {
            String model =
                    bike.querySelector(".bike-model").innerText();
            String availableAt =
                    bike.querySelector(".available-at").innerText();

            Assertions.assertTrue(availableAt.contains(location));

            System.out.println("Bike Model: " + model);
            System.out.println("Available At: " + availableAt);
            System.out.println("--------------------------");
        }
    }
}
