
Feature: US1017  rediff sitesinde test yapar
  @rediff
  Scenario:TC17 kullanici rediff sitesinde test yapar

    Given kullanici "rediffUrl" anasayfasinda
    Then kullanici 2 sn bekler
    Then kullanici en alt sayfaya  gelip bussines butonunu tıklar
    And kullanici tekrar geri gelir
    And kullanici div conteiner'lar icinden tab yardimiyla searchbox kismina gelip dolar kurunu arat
    And kullanici kur iframe'i icinde dolar'in guncel kurunu aratır
    And kullanici cıkan sonucu yazdırır
    And kullanici diger iframe gecip sag altta bulunan google advertisemnt'a gidip cikan ürünün title ve degerini yazdir
    And kullanici  reddif sitesine geri gelir














