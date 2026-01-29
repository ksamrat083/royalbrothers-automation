Feature: Royal Brothers Bike Booking

  Scenario: Validate booking filters and location results
    Given user navigates to Royal Brothers website
    When user selects city "Bangalore"
    And user selects pickup date "26 Feb 2026" and time "9:30 AM"
    And user selects dropoff date "27 Feb 2026" and time "9:30 AM"
    And user clicks on search
    Then selected date and time filter should be visible
    When user applies location filter "Indiranagar"
    Then all bikes should belong to location "Indiranagar"
