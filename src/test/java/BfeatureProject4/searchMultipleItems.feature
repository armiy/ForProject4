Feature: This is a search for multiple items function
  #Background: Before every  scenario
    #Given users are on ebay website
  Scenario Template: searching for multiple items and verifying
    When users search for this <ItemName> on a search field
    Then users land on a page with this <PageTitle>

      Examples:
        | ItemName        | PageTitle      |
        | Samsung Mobiles | Samsung Phones |
        |Boys Shoes       |Boys Shoes      |