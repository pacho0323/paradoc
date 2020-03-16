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
  Quiero cargar los insumos (spools) en carpeta de entrada de Paradoc
  Para realizar el procesamiento de la información

 @tag1
Scenario: Carga de insumos para Paradoc con igual cantidad de insumos
    Given El cliente se loguea en la pagina de ingreso al modulo MAM
    When El cliente copia los insumos a procesar y en la carpeta de Entrada pega los insumos 
    Then debe comparar la cantidad de insumos que se encuentra en la carpeta de entrada con la cantidad de archivos recibidos en paradoc
  
  @tag2
Scenario: Carga de insumos para Paradoc con estado Aceptado
    Given El cliente se loguea en la pagina de ingreso al modulo MAM
    When El cliente copia los insumos a procesar y en la carpeta de Entrada pega los insumos 
    Then debe visualizar que los insumos se encuentran en estado Aceptado en el modulo EUC de Paradoc
  
  @tag3
Scenario: Carga de insumos para Paradoc con estado Con Incosistencias
    Given El cliente se loguea en la pagina de ingreso al modulo MAM
    When El cliente copia los insumos a procesar y en la carpeta de Entrada pega los insumos 
    Then debe ver que los insumos estan en estado Con Inconsistencias en el modulo EUC de Paradoc
  
  @tag4
Scenario: Carga de insumos para Paradoc con estado Rechazado
    Given El cliente se loguea en la pagina de ingreso al modulo MAM
    When El cliente copia los insumos a procesar y en la carpeta de Entrada pega los insumos 
    Then visualizar los insumos que se encuentran en estado Rechazado en el modulo EUC de Paradoc
  