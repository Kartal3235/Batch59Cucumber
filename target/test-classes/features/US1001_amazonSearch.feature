
@tumu
Feature: US1001 Kullanici Amazon Sayfasinda Arama Yapar

  @nutella @ikisi
  Scenario: TC01 kullanici amazonda kelime aratir

    Given kullanici amazon anasayfasinda
    Then kullanici Nutella icin arama yapar
    And sonuclarin Nutella icerdini test eder
    And sayfayi kapatir

    @iphone @ikisi @sıralı
    Scenario: TC02 kullanici amazonda iphone aratir

      Then kullanici amazon sayfasina gider
      And kullanici iphone 13 arama yapar
      And sonuclarin iphone 13 icerdiğini test eder
      And sayfayi kapatir

    @java @pr1
    Scenario: TC02 kullanici amazonda java aratir

      Given kullanici amazon anasayfasina gider
      Then kullanici amazonda java aratir
      And sonuclarin Java icerdiğini test eder
      And sayfayi kapatir
