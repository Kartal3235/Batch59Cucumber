Feature: US1004 universite sayfasinda cesitli actionlari yapar

  @unv
  Scenario: TC06 universite sayfasinda istenen actionlari yapabilmeli
    Given kullanici "WDUUrl" anasayfasinda
    Then kullanici Login portala kadar asagi iner
    And kullanici 2 sn bekler
    Then kullanici login portal butonuna basar
    Then kullanici diger window'a gecer
    And kullanici bir username girer
    And kullanici bir password girer
    Then kullanici login butonuna basar
    Then kullanici Popup'ta cikan