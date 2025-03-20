Feature: This is a product searching and verification function
  Background: Before every scenario
    Given Users are in ebay webpage
  Scenario: Search and verify a product
    When users search for this ProductName in the search field
    And users search for this SpecificProduct among list of products
    Then users land on this Page with a list of the selected product
