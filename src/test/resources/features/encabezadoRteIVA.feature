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
@EncabezadosRteiva
Feature: Paradoc
  Como usuario
  Quiero configurar encabezados 
  Para el certificado tributario reteiva

  @CrearRteiva
  Scenario: Creacion de encabezados para certificado reteiva
    Given El cliente se loguea en paradoc Modulo MAM e ingresa a la opcion Certificados - Configuración - CT ReteIVA
    When En la parametrizacion de encabezados el cliente ingresa la informacion
    Then Cuando se crea el encabezado se muestra El elemento fue insertado

	@ModificarRteiva
  Scenario: Modificacion de  encabezados para el certificado reteiva
    Given El cliente se loguea en paradoc Modulo MAM e ingresa a la opcion Certificados - Configuración - CT ReteIVA
    When En la parametrizacion del encabezado el cliente modifica la informacion
    Then Cuando se modifica el encabezado de reteiva se mostrara El elemento fue actualizado
    
  @EliminarRteiva
  Scenario: Eliminacion de  encabezados para el certificado reteiva
    Given El cliente se loguea en paradoc Modulo MAM e ingresa a la opcion Certificados - Configuración - CT ReteIVA
    When En la parametrizacion del encabezado el cliente Elimina la informacion que no requiere de los encabezados
    Then Al eliminar el encabezado de reteiva muestra un mensaje El elemento fue eliminado
    
  @CancelarRteiva
  Scenario: Cancelar la creaci�n o modificaci�n de encabezadospara el certificado de reteiva 
    Given El cliente se loguea en paradoc Modulo MAM e ingresa a la opcion Certificados - Configuración - CT ReteIVA
    When Se digita la informacion para el encabezado
    Then Se cancela el encabezado y se deshabilita el formulario de encabezado
    
   @FiltrarRteiva
   Scenario: Realizar filtro de encabezados para el certificado de reteiva
    Given El cliente se loguea en paradoc Modulo MAM e ingresa a la opcion Certificados - Configuración - CT ReteIVA
    When Se filtra el codigo del Encabezado por el cliente
    Then Cuando se filtra el codigo del encabezado se visualizara el nombre de la compania Bancolombia
    
   @DescargarRteiva
   Scenario: Descargar archivo de encabezados de certificado de reteiva
    Given El cliente se loguea en paradoc Modulo MAM e ingresa a la opcion Certificados - Configuración - CT ReteIVA
    When Se Descarga el archivo de encabezados creados de ReteIVA por el cliente
    Then Cuando se Descarga el archivo encabezado se almacenara en la carpeta Downloads de windows

 