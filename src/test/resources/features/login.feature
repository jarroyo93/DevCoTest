#Autor José Arroyo

@Login
Feature: Como cliente de SwagLabs
  Quiero ingresar a la App desde el navegador
  Con el objetivo de realizar compras


  @LoginExitoso
  Scenario Outline: Intento de realizar login exitoso en la App de SWAGLABS
    Given Que <nombre> este en la app de SWAGLABS
    When  Diligencie el formulario de ingreso con <user> y <pass>
    Then Vera el mensaje de <msg_home>

    Examples:
      |nombre|user|pass|msg_home|
      |Jose|standard_user|secret_sauce|PRODUCTS|