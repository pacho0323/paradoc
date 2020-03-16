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
@CuadrantesRetefte
Feature: Paradoc
  Como usuario
  Quiero configurar cuadrantes 
  Para el certificado tributario Retefuente

  @CrearCuadrante
  Scenario: Creacion de cuadrantes para certificado retefte
    Given El cliente se loguea en paradoc Modulo MAM e ingresa a la opcion Certificados - Configuración - CT Retefuente
    When En la parametrizacion de cuadrantes el cliente ingresa la informacion
    Then Cuando se crea el cuadrante se muestra El elemento fue insertado

	@ModificarCuadrante
  Scenario: Modificacion de  cuadrantes para el certificado retefte
    Given El cliente se loguea en paradoc Modulo MAM e ingresa a la opcion Certificados - Configuración - CT Retefuente
    When El cliente modifica la informacion en la parametrizacion de cuadrantes
    Then Al modificar el cuadrante se muestra El elemento fue actualizado
    
  @EliminarCuadrante
  Scenario: Eliminacion de  cuadrantes para el certificado retefte
    Given El cliente se loguea en paradoc Modulo MAM e ingresa a la opcion Certificados - Configuración - CT Retefuente
    When El cliente Elimina los datos ingresados en la parametrizacion del cuadrante
    Then Al eliminar el cuadrante de retefte se visualiza un mensaje El elemento fue eliminado
    
  @CancelarCuadrante
  Scenario: Cancelacion de la creaci�n o modificaci�n de cuadrantes para el certificado de retefte
    Given El cliente se loguea en paradoc Modulo MAM e ingresa a la opcion Certificados - Configuración - CT Retefuente
    When En  cuadrantes el cliente digita la informacion
    Then Se cancela el encabezad cuadrante y se deshabilita el formulario
    
   @FiltrarCuadrante
   Scenario: Filtrar de cuadrantes para el certificado de retefte
   Given El cliente se loguea en paradoc Modulo MAM e ingresa a la opcion Certificados - Configuración - CT Retefuente
    When El cliente filtra el identificador del cuadrante
    Then Al filtrar la identificacion del cuadrante se vera la descripcion del cuadrante Salario Devengado
    
   @DescargarCuadrante
   Scenario: Descargar datos de la parametrizacion de cuadrantes
    Given El cliente se loguea en paradoc Modulo MAM e ingresa a la opcion Certificados - Configuración - CT Retefuente
    When Se Descarga archivo de cuadrantes creados en la parametrizacion de Retefte
    Then Al Descargar el archivo cuadrante se almacenara en la carpeta Downloads de windows
 