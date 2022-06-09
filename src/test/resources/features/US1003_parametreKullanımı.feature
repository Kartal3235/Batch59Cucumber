Feature: US1003 kullanici parametre kullanarak arama yapabilmeli

  @parametre @sıralı @pr2
  Scenario: TC06 kullanici parametre ile amazonda arama yapabilmeli
    Given kullanici amazon anasayfasinda
    And kullanici "Java" icin arama yapar
    And sonuclarin "Java" icerdini test eder
    And sayfayi kapatir
