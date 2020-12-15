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
#Sample Feature Definition Template
@tag
Feature: Personnage

   Scenario: Porter 2 armes
    Given Le personnage porte 1 arme
    When Le personnage doit pouvoir porter 2 armes
    Then Le personnage poss�de 2 armes
    
   Scenario: Soigner le h�ros
    Given Le personnage veut r�cup�rer des points de vie, ses points de vie sont de 5
    When Le personnage se soigne  de 5 points de vie
    Then Les points de vie du personnage remonte � 10
  

