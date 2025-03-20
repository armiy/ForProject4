Feature: This is a product searching and verification function
  #Background: Before every scenario
    #Given Users are in ebay webpage
  Scenario: Search and verify a product
    When users search for this Boys Shoes in the search field
    And users search for this Specific Product among list of products
    Then users land on this eBay with a list of the selected product
