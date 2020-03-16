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
@MensajesTexto
Feature: Listado de Mensajes de texto
  Como usuario 
  Quiero configurar mensajes de texto 
  Para los certificados Retefte, Reteiva, Reteica

  @CrearMensajeTexto
  Scenario: Crear los mensajes de texto para los certificados
    Given El cliente se loguea en la pagina de paradoc ingresa al modulo MAM en la opcion Mensajes de texto
    When El cliente ingresa la informacion en el formulario de mensajes de texto
    Then Podra crear mensaje de texto y vera el mensaje correctamente.
    
  @ModificarMensajeTexto
  Scenario: Modificar los mensajes de texto para los certificados
    Given El cliente se loguea en la pagina de paradoc ingresa al modulo MAM en la opcion Mensajes de texto
    When El cliente modifica los mensajes de texto
    Then al modificar el mensaje se muestra Se actualizo el mensaje correctamente.
    
  @EliminarMensajeTexto
  Scenario: Eliminar los mensajes de texto para los certificados
    Given El cliente se loguea en la pagina de paradoc ingresa al modulo MAM en la opcion Mensajes de texto
    When El cliente elimina mensajes de texto
    Then cuando se elimina el mensaje muestra Mensaje eliminado.
    
  @CancelarMensajeTexto
  Scenario: Cancelar los mensajes de texto para los certificados
    Given El cliente se loguea en la pagina de paradoc ingresa al modulo MAM en la opcion Mensajes de texto
    When El cliente ingresa informacion 
    Then al cancelar no hay informacion en los campos