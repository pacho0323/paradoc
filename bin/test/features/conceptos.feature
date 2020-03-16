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
@Conceptos
Feature: Configuracion conceptos
  Como usuario
  Quiero configurar los conceptos 
  Para los certificados tributarios Unificados

 @CrearConceptos
  Scenario: Creacion de conceptos para certificados tributarios unificados
    Given El cliente se loguea en paradoc Modulo MAM e ingresa a la opcion Certificados - Configuración - CT Retefuente
    When El cliente ingresa informacion para la parametrizacion de los conceptos
    Then Al crear el concepto se muestra El elemento fue insertado
    
  @ModificarConceptos
  Scenario: Modificar conceptos para certificados tributarios unificados
Given El cliente se loguea en paradoc Modulo MAM e ingresa a la opcion Certificados - Configuración - CT Retefuente
    When Modificar la informacion de los conceptos
    Then Al modificar el concepto se muestra actualizado
    
      @EliminarConceptos
  Scenario: Eliminar conceptos para certificados tributarios unificados
Given El cliente se loguea en paradoc Modulo MAM e ingresa a la opcion Certificados - Configuración - CT Retefuente
    When Elimina la informacion de los conceptos
    Then Al eliminar el concepto se muestra eliminado
    
       @FiltrarCuadranteRetefuente
   Scenario: Filtrar de cuadrantes para el certificado Retefuente
    Given El cliente se loguea en paradoc Modulo MAM e ingresa a la opcion Certificados - Configuración - CT Retefuente
    When El cliente filtra el codigo del concepto
    Then Al filtrar el codigo del concepto este debe ser igual 1
    
      @CancelarConceptoRetefuente
  Scenario: Cancelacion de la creacion o modificacion de cuadrantes para el certificado de Retefuente
Given El cliente se loguea en paradoc Modulo MAM e ingresa a la opcion Certificados - Configuración - CT Retefuente
    When En  cuadrantes el cliente digita la informacion de Retefuente
    Then Se cancela el encabezado cuadrante y se deshabilita el formulario
    
 @CrearConceptosReteIva
  Scenario: Crear conceptos ReteIva para certificados tributarios unificados
Given El cliente se loguea en paradoc Modulo MAM e ingresa a la opcion Certificados - Configuración - CT ReteIVA
    When El cliente ingresa informacion para la parametrizacion de los conceptos Reteiva
    Then Al crear el concepto se muestra El elemento fue insertado
    
     @ModificarConceptosReteIva
  Scenario: Modificar conceptos ReteIva para certificados tributarios unificados
Given El cliente se loguea en paradoc Modulo MAM e ingresa a la opcion Certificados - Configuración - CT ReteIVA
    When Modifica la informacion de los conceptos reteiva
    Then Al modificar el concepto se muestra actualizado
    
     @EliminarConceptosReteIva
  Scenario: Eliminar conceptos Reteiva para certificados tributarios unificados
Given El cliente se loguea en paradoc Modulo MAM e ingresa a la opcion Certificados - Configuración - CT ReteIVA
    When Elimina la informacion de los conceptos reteiva
    Then Al eliminar el concepto se muestra eliminado
    
           @FiltrarCuadranteReteiva
   Scenario: Filtrar de cuadrantes para el certificado Reteiva
    Given El cliente se loguea en paradoc Modulo MAM e ingresa a la opcion Certificados - Configuración - CT ReteIVA
    When El cliente filtra el codigo del concepto Reteiva
    Then Al filtrar el codigo del concepto este debe ser igual AWR61
    
          @CancelarConceptoReteiva
  Scenario: Cancelacion de la creacion o modificacion de cuadrantes para el certificado de Reteiva
Given El cliente se loguea en paradoc Modulo MAM e ingresa a la opcion Certificados - Configuración - CT ReteIVA
    When En  cuadrantes el cliente digita la informacion de Reteiva
    Then Se cancela el encabezado cuadrante y se deshabilita el formulario
    
    
    @CrearConceptosReteICA
  Scenario: Crear conceptos ReteICA para certificados tributarios unificados
Given El cliente se loguea en paradoc Modulo MAM e ingresa a la opcion Certificados - Configuración - CT ReteICA
    When El cliente ingresa informacion para la parametrizacion de los conceptos ReteICA
    Then Al crear el concepto se muestra El elemento fue insertado
    
     @ModificarConceptosReteIca
  Scenario: Modificar conceptos ReteICA para certificados tributarios unificados
Given El cliente se loguea en paradoc Modulo MAM e ingresa a la opcion Certificados - Configuración - CT ReteICA
    When Modifica la informacion de los conceptos ReteICA
    Then Al modificar el concepto se muestra actualizado
    
     @EliminarConceptosReteIca
  Scenario: Eliminar conceptos ReteICA para certificados tributarios unificados
Given El cliente se loguea en paradoc Modulo MAM e ingresa a la opcion Certificados - Configuración - CT ReteICA
    When Elimina la informacion de los conceptos ReteICA
    Then Al eliminar el concepto se muestra eliminado
    
               @FiltrarCuadranteReteica
   Scenario: Filtrar de cuadrantes para el certificado Reteica
    Given El cliente se loguea en paradoc Modulo MAM e ingresa a la opcion Certificados - Configuración - CT ReteICA
    When El cliente filtra el codigo del concepto Reteica
    Then Al filtrar el codigo del concepto este debe ser igual AWR61
    
              @CancelarConceptoReteica
  Scenario: Cancelacion de la creacion o modificacion de cuadrantes para el certificado de Reteica
Given El cliente se loguea en paradoc Modulo MAM e ingresa a la opcion Certificados - Configuración - CT ReteICA
    When En  cuadrantes el cliente digita la informacion de Reteica
    Then Se cancela el encabezado cuadrante y se deshabilita el formulario
    
    @DescargarConceptoRetefuente
   Scenario: Descargar datos de la parametrizacion de cuadrantes de retefuente
    Given El cliente se loguea en paradoc Modulo MAM e ingresa a la opcion Certificados - Configuración - CT Retefuente
    When Se Descarga archivo de cuadrantes creados en la parametrizacion de retefuente
    Then Al Descargar el archivo cuadrante se almacenara en la carpeta Downloads de windows con el nombre reporte_CONCEPTO.txt
    
     @DescargarConceptoReteIVA
   Scenario: Descargar datos de la parametrizacion de cuadrantes de retefuente
    Given El cliente se loguea en paradoc Modulo MAM e ingresa a la opcion Certificados - Configuración - CT ReteIVA
    When Se Descarga archivo de cuadrantes creados en la parametrizacion de ReteIVA
    Then Al Descargar el archivo cuadrante se almacenara en la carpeta Downloads de windows con el nombre reporte_CONCEPTO.txt
        
    @DescargarConceptoReteICA
   Scenario: Descargar datos de la parametrizacion de cuadrantes de retefuente
    Given El cliente se loguea en paradoc Modulo MAM e ingresa a la opcion Certificados - Configuración - CT ReteICA
    When Se Descarga archivo de cuadrantes creados en la parametrizacion de ReteICA
    Then Al Descargar el archivo cuadrante se almacenara en la carpeta Downloads de windows con el nombre reporte_CONCEPTO.txt
    

    
    

  