Feature: US1016 kullanici heroku sitesinde çalışma yapar

  @heroku
  Scenario: TC16 kullanici heroku sitesinde çalışma yapar
    Given kullanici "herokuappUrl1" anasayfasinda
    Then kullanici 2 sn bekler
    Then kullanici draganddrop mouse action ile sağ tıklayıp yeni sekmede açar
    Then kullanici 3 sn bekler
    Then kullanici drag and drop islemini yap mouse action ile degisen degerleri test et
    And kullanici elemenatal selenium ile yeni acılan sekmenin windowhandle değerini yazar
    And kullanici ponsored by Sauce Labs'a log_in_yazisina_tiklar
    And kullanici contact'in üzerine gelip contact support'u tiklar
    And kullanici ilk sayfaya geri döner










