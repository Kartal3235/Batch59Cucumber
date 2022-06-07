
  Feature: US1008 kullanıcı farklı yanlış ve kullanıcı adıyla giremez

    Scenario Outline:TC13 yanlı kullanıcı adı ve sifrelerle giriş yapamaz

      Given kullanici "HMCUrl" anasayfasinda
      Then Log in yazisina tiklar
      And gecersiz username olarak "<username>" girer
      And gecersiz password olarak "<password>" girer
      And Login butonuna basar
      Then sayfaya giris yapilamadigini test eder
      And  sayfayi kapatir

      Examples:
        | username | password |
        |Manager5  |Manager5! |
         |Manager6  |Manager6! |
        |Manager7  |Manager7! |
        |Manager8   |Manager8!|
        |Manager9   |Manager9!|