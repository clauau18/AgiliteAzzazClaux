#Author: Aur�lien Myriam
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

Feature: Arme
 
  Je veux que toutes mes armes aient une certaine puissance en fontion de leur nom

  
  Scenario: Am�lioration
    Given On a une arme "epee" qui inflige 5 de d�gats
    When je souhaite am�liorer mon "epee" de 5 d�gats
    Then Mon "epee" inflige maintenant 10 d�gats
    

  
  