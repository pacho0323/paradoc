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
@MensajesGraficos
Feature: Listado de Mensajes graficos
  Como usuario 
  Quiero configurar mensajes graficos de Certificados
  Para los certificados Retefte, Reteiva, Reteica

  @CrearMensajeGrafico
  Scenario: Crear los mensajes graficos para los certificados
    Given El cliente se loguea en la pagina de paradoc ingresa al modulo MAM en la opcion Mensajes Graficos
    When El cliente ingresa la informacion en el formulario
    Then Al crear el mensaje grafico mostrara que el mensaje correctamente.
    
  @EliminaMensajeGrafico
  Scenario: Eliminar mensajes graficos para los certificados tributarios
    Given El cliente se loguea en la pagina de paradoc ingresa al modulo MAM en la opcion Mensajes Graficos
    When El cliente elimina el mensaje grafico creado
    Then Al eliminar el mensaje grafico se vera Mensaje eliminado.
  
  @CancelarMensajeGrafico
  Scenario: Cancelar los mensajes graficos para los certificados
    Given El cliente se loguea en la pagina de paradoc ingresa al modulo MAM en la opcion Mensajes Graficos
    When El cliente digita la informacion 
    Then Se cancela el mensaje y se 
