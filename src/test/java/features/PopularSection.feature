#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template     /html/body/div[1]/main/section[2]/header/h2
@tag
Feature: Check News & Popular Topics
  I want to check News & Popular Topics and links

  @tag1
  Scenario: News & Popular Topics section
    When I load LoveToKnow page
    When I access News and Populars Topics section
    Then News and Popular Topics section is displayed
