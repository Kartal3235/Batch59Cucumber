Feature: Us1013 kullanici excel bilgilerine ulaşır

  @excel
  Scenario: TC18  kullanici excel bilgilerini kullanır
    Given kullanici excel dosyasını kullanılabilir hale getirir
    Then 1.satir 2.hucreye yazdırır
    And baskenti Jakarta olan ulke ismini yazdiralim
    And Ulke sayisinin 190 olduğunu test eder
    And Fiziki olarak kullanilan satir sayisinin 191 olduğunu test eder
    And 3.satır 2.sutundaki bilgiyi yazdirir




