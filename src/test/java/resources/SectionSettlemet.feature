Feature: Seccion de ofertas
  Scenario: usuario ingresa a la pagina
    Given usuario ingresa a la pagina de mercado libre
    When usuario ingresa a la seccion de ofertas
    And click en todas en Liquidacion
    Then Todos los productos se muestran