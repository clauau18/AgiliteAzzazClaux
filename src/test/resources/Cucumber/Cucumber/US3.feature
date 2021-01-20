#Author: Aurélien Myriam
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
#Sample Feature Definition Template
@tag
Feature: Soigner heros

		Scenario pour tester le soin du héros
  	Scenario: Soigner le héros
    Given Le personnage veut recuperer des points de vie, ses points de vie sont de 95
    When Le personnage se soigne  de 5 points de vie
    Then Les points de vie du personnage remonte a 100
  
