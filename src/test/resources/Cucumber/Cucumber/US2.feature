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
Feature: Changer armer
	Je veux que mon héros change darme
   Scenario: Changer arme
    Given Le personnage porte une "epee" a 10 degats
    When Le personnage ramasse une nouvelle arme 
    Then Le personnage possede maintenant une  "lance" a 15 degats
    
 

