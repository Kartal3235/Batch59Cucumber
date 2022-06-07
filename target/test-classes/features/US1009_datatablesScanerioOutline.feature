
  Feature: US1009 kullanıcı
    Scenario Outline: TC14 kullanıcı 5 farklı kayıt girişi yapabilmeli

      When kullanici "DataTablesUrl" anasayfasinda
      Then new butonuna basar
      And isim bolumune "<firstName>" yazar
      And soyisim bolumune "<lastName>" yazar
      And kullanici 1 sn bekler
      And position bolumune "<position>" yazar
      And kullanici 1 sn bekler
      And ofis bolumune "<office>" yazar
      And kullanici 1 sn bekler
      And extension bolumune "<extension>" yazar
      And kullanici 1 sn bekler
      And startDate bolumune "<startDate>" yazar
      And kullanici 1 sn bekler
      And salary bolumune "<salary>" yazar
      And kullanici 1 sn bekler
      And Create tusuna basar
      And kullanici 1 sn bekler
      When kullanici "<firstName>"  ile arama yapar
      And kullanici 1 sn bekler
      Then isim bolumunde "<firstName>" oldugunu test eder
      And sayfayi kapatir

      Examples:
        | firstName | lastName | position | office | extension | startDate  | salary |
        | Alim      | Alim     | QA       | ankara | UI        | 2021-10-11 | 10000  |
        | Berk      | Can      | tester   | ankara | api       | 2022-5-5   | 11000  |
        | Bahadır   | Korkmaz  | BA       | berlin | -         | 2022-07-10 | 40000  |
        | Fatih     | Sahin    | PO       | berlin | -         | 2022-03-12 | 45000  |
        | Ahmet     | Kaya     | Tester   | ankara | database  | 2022-06-03 | 11000  |

