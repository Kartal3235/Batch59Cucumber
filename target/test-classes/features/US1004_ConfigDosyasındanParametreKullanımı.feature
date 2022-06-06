Feature: US1004 kullanici parametre ile configration file'i kullanabilmeli

  Scenario: TC07 configration properties dosyasından parametre kullanimi

    Given kullanici "techproeducationUrl" anasayfasinda
    Then kullanici 10 sn bekler
    And url'in "techproeducation" icerdiğini test eder
    Then sayfayi kapatir