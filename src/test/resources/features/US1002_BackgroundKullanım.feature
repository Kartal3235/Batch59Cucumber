@wip
Feature: US1001 Kullanici ortak adimlari Background ile calistirir

  Background: ortak adim
    Given kullanici amazon anasayfasinda
  @pr1
  Scenario: TC04 amazon nutella arama
    And kullanici Nutella icin arama yapar
    Then sonuclarin Nutella icerdini test eder
    And sayfayi kapatir
  @pr2
  Scenario: TC05 amazon java arama
    And kullanici amazonda java aratir
    Then sonuclarin Java icerdiğini test eder
    And sayfayi kapatir