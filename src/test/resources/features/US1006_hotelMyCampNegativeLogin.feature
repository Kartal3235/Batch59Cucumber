
  #hotel my camp sitesinde 3 adet negatif test senoryosu olusturalim
  #1-dogru sifre yanlis password
  #2-yanlıs username dogru password
  #3-yanlıs username yanlıs password

    Feature: US1006 yanlış bilgilerle siteye giriş yapılmaz

      Scenario: TC09 yanlıs password ile giriş yapılamaz
        Given kullanici "HMCUrl" anasayfasinda
        Then Log in yazisina tiklar
        And gecerli username girer
        And gecersiz password girer
        And Login butonuna basar
        Then sayfaya giris yapılamadığını test eder
        And sayfayi kapatir


      Scenario: TC10 yanlıs username ile giriş yapılamaz
        Given kullanici "HMCUrl" anasayfasinda
        Then Log in yazisina tiklar
        And gecersiz username girer
        And gecerli password girer
        And Login butonuna basar
        Then sayfaya giris yapılamadığını test eder
        And sayfayi kapatir


      Scenario: TC11 yanlış kullanıcı adi ve yanlış şifre ile giriş yapılamaz
        Given kullanici "HMCUrl" anasayfasinda
        Then Log in yazisina tiklar
        And gecersiz username girer
        And gecersiz password girer
        And Login butonuna basar
        Then sayfaya giris yapılamadığını test eder
        And sayfayi kapatir