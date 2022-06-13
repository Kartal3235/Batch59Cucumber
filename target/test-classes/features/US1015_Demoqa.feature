Feature: US1014 kullanici uyarı yazısı hakkında calısması

  @tools
  Scenario:TC14 kullanici uyarı yazısını test etmesi
    Given kullanici "DemoqaUrl" anasayfasinda
    Then kullanici alerts butonuna tıklar
    And kullanici On button click, alert will appear after 5 seconds karsisindaki click me butonuna tıklar
    And kullanici alert yazısının gorunur olmasını bekler
    And kullanici Alert uzerindeki yazinin "This alert appeared after 5 seconds" oldugunu test eder
    And kullanici Ok cilick eder








