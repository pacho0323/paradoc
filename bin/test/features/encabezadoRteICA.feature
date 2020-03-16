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
@ReteICA
Feature: Paradoc
  Como usuario
  Quiero configurar encabezados 
  Para el certificado tributario reteICA

  @CrearReteICA
  Scenario: Crear los encabezados para el certificado ReteICA
    Given El cliente se loguea en paradoc Modulo MAM e ingresa a la opcion Certificados - Configuración - CT ReteICA
    When El cliente digita la informacion que debe estar en el encabezado
    Then Cuando se crea el encabezado se vera El elemento fue insertado

	@ModificarReteICA
  Scenario: Modificar encabezados para el certificado ReteICA
Given El cliente se loguea en paradoc Modulo MAM e ingresa a la opcion Certificados - Configuración - CT ReteICA
    When El cliente Modifica los registros del encabezado
    Then Al modificar el encabezado se vera El elemento fue actualizado
    
  @EliminarReteICA
  Scenario: Eliminar encabezados para el certificado ReteICA
Given El cliente se loguea en paradoc Modulo MAM e ingresa a la opcion Certificados - Configuración - CT ReteICA
    When El cliente Elimina los registros que no quiere ver en el encabezado
    Then Cuando se Elimina el encabezado mostrara un mensaje El elemento fue eliminado
    
  @CancelarReteICA
  Scenario: Cancelar la creacion o modificaci�n de encabezados para el certificado
Given El cliente se loguea en paradoc Modulo MAM e ingresa a la opcion Certificados - Configuración - CT ReteICA
    When El cliente ingresa los registros para el encabezado
    Then Cuando se cancela el encabezado se deshabilitara el formulario 
    
   @FiltrarReteICA
   Scenario: Filtrar los encabezados para el certificado
Given El cliente se loguea en paradoc Modulo MAM e ingresa a la opcion Certificados - Configuración - CT ReteICA
    When Se Filtra el codigo del Encabezado por el cliente
    Then Luego de filtrar el codigo del encabezado si visualizara el nombre de la compania Bancolombia
    
   @DescargarReteICA
   Scenario: Descargar encabezados creados para el certificado
Given El cliente se loguea en paradoc Modulo MAM e ingresa a la opcion Certificados - Configuración - CT ReteICA
    When Se Descarga el archivo de encabezados creados de ReteICA por el cliente
    Then Luego de Descargar el archivo encabezado se almacena en la carpeta Downloads

 