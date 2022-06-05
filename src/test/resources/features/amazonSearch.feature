Feature: Amazon Search

  Scenario: TC01 kullanici amazonda kelime aratir

    Given kullanici amazon anasayfasinda
    Then kullanici Nutella icin arama yapar
    And sonuclarin Nutella icerdini test eder
    And sayfayi kapatir

    Scenario: TC02 kullanici amazonda iphone aratir

      Then kullanici amazon sayfasina gider
      And kullanici iphone 13 arama yapar
      And sonuclarin iphone 13 icerdiğini test eder
      And sayfayi kapatir