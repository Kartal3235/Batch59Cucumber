Feature: Amazon Search

  Scenario: TC01 kullanici amazonda kelime aratir

    Given kullanici amazon anasayfasinda
    Then kullanici Nutella icin arama yapar
    And sonuclarin Nutella icerdini test eder
    And sayfayi kapatir