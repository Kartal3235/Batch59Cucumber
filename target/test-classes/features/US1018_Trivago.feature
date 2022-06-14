
Feature:US1018 trivago sitesinde test yapılır
  @trivago
  Scenario:TC18 kullanici trivago sitesinde test eder

    Given kullanici "TrivagoUrl" anasayfasinda
    Then kullanici Tepe menüdeki Flights linkine tıklar
    Then kullanici 2 sn bekler
    Then kullanici  yeni sekmede açılacak. Oraya gidecek.
    And kullanici sayfayi asağiya kaydır sonra tekrar en yukarı kaydır
    And kullanici 2 sn bekler
    And kullanici "TrivagoUrl" anasayfasina gider
    And kullanici All stays - Hotel - House / Apartment sekmelerinden Hotel sekmesine tıklar
    And kullanici Arama kutusuna Seychelles yazar
    And kullanici 2 sn bekler
    And kullanici 2022 yazı için 2 haftalık bir tarih aralığı seçer
    And kullanici 2 yetiskin secer
    And kullanici search'e tıklar
    And kullanici 2 sn bekler
    And kullanici Gelen sonuçlarda Guest rating üzerine gel ve Very good'u seçer
    And kullanici More filters üzerine gel, Hotel class'ta 4 ve 5 yıldızı seç, popular filters'tan Beach seçer
    And kullanici En üstteki sonucun resmi üzerine gelir, More photos linkinin göründüğünü doğrular, Linke tıklar
    And kullanici Resimlerin altta göründüğünü doğrular
    And kullanici En üstteki sonucun adının ve yıldızlarının altında konumu yazıyor, tıklar
    And kullanici  Sağ taraftaki haritada oteli işaretler, Haritayı locate eder
    And kullanici Hoteli haritada drag & drop yaparak ortalar, + tuşuyla zoom yapar


















