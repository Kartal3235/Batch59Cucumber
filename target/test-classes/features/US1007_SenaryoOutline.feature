

  Feature: US1007 kullanıcı amazonda istediği kelimeleri aratır

    Scenario Outline: TC12 amazonda listedeki elementleri aratma

      Given kullanici "amazonUrl" anasayfasinda
      Then kullanici "<istenenKelime>" icin arama yapar
      And sonuclarin "<istenenKelimeKontrol>" icerdini test eder
      And sayfayi kapatir

      Examples:
      |istenenKelime|istenenKelimeKontrol|
      |nutella      |nutella             |
      |java         |java                |
      |elma         |elma                |
      |armut        |armut               |