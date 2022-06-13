Feature: US1013 kullanici excell dosyasına islem yapar

  @write
  Scenario: TC13 kullanici excell bilgilerini kullanir
    Given kullanici baslık satırında ilk bos hucreye "ulke nufusu" yazdırır
    Then "2".satir ulke nufusu sutununa "1.5"milyar yazdırır
    And "8".satir ulke nufus sutununa "250" milyon yazdırır
    And kullanici dosyayi kaydeder
    * Dosyayi kapatir
