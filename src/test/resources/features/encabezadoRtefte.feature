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
  Quiero configurar encabezados 
  Para el certificado tributario retenci�n en la fuente

  @tag1
  Scenario: Crear encabezados para el certificado
  Given El cliente se loguea en paradoc Modulo MAM e ingresa a la opcion Certificados - Configuración - CT Retefuente
    When El cliente Ingresa la informacion que va a estar en el encabezado
    Then Y al crear el encabezado se mostrara El elemento fue insertado

	@tag2
  Scenario: Modificar encabezados para el certificado
Given El cliente se loguea en paradoc Modulo MAM e ingresa a la opcion Certificados - Configuración - CT Retefuente
    When El cliente Modifica la informacion del Encabezado
    Then Al modificar el encabezado se visualizara El elemento fue actualizado
    
  @tag3
  Scenario: Eliminar encabezados para el certificado
 Given El cliente se loguea en paradoc Modulo MAM e ingresa a la opcion Certificados - Configuración - CT Retefuente
    When El cliente Elimina la informacion que no quiere ver en los encabezados
    Then Al eliminar el encabezado mostrara un mensaje El elemento fue eliminado
    
  @tag4
  Scenario: Cancelar la creaci�n o modificaci�n de encabezados para el certificado
 Given El cliente se loguea en paradoc Modulo MAM e ingresa a la opcion Certificados - Configuración - CT Retefuente
    When El cliente Digita los datos para el encabezado
    Then Al cancelar el encabezado se deshabilitara el formulario de encabezado
    
   @tag5
   Scenario: Filtrar encabezados para el certificado
   Given El cliente se loguea en paradoc Modulo MAM e ingresa a la opcion Certificados - Configuración - CT Retefuente
    When El cliente Filtra el codigo del Encabezado
    Then Al filtrar el codigo del encabezado mostrara la el nombre de la compania Bancolombia
    
   @tag6
   Scenario: Descargar encabezados creados
 Given El cliente se loguea en paradoc Modulo MAM e ingresa a la opcion Certificados - Configuración - CT Retefuente
    When El cliente Descarga el archivo de encabezados creados de Retefuente
    Then El archivo encabezado que se descargo se guardara en la carpeta Downloads

 