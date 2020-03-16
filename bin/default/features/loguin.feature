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
Feature: Paradoc
  Como usuario
  Quiero ingresar a el módulo MAM con usuario y contraseña
  Para realizar las configuraciones previas al procesamiento

  @tag1
  Scenario: Loguin de Paradoc
    Given El cliente se encuentra en la pagina de ingreso al módulo MAM
    When Ingresa las credenciales
    Then debe de visualizar el menu Certificados
  

