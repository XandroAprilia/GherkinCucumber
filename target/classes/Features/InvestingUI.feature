@InvestingUI
Feature: Find All Title Content

  #TC1
  Scenario: First title content about invite users
    Given Go to Website
    And Click Investing Board
    When First Title must "Daftar 100% OnlineTanpa Minimum Deposit"
    And The First Content Text is "Akun rekening kamu akan diproses secara digital tanpa perlu mengirim dokumen fisik."
    Then I validate the Title Text and Content Text

  #TC2
  Scenario: Second title content about Rute Investasi
    Given Go to Website
    And Click Investing Board
    When Second Title must "3 Langkah Mudah Investasi Saham di Stockbit"
    And The Second Content is Picture
    Then I validate the Title Text and Content Picture
    
  #TC3
  Scenario: Third title content about Cost
    Given Go to Website
    And Click Investing Board
    When Third Title must "Biaya Komisi"
    And The Third Content First Text is "Fee Beli" and Komisi Cost "0,10%"
    And The Third Content Second Text is "Fee Jual" and Komisi Cost "0,20%"
    Then I validate the Title Text and Content Text
    
  #TC4
  Scenario: Fourth title content about Comparison
    Given Go to Website
    And Click Investing Board
    When Fourth Title must "Grafik Pembanding"
    And The Fouth Content is Chart Comparison
    Then I validate the Title Text and Cart Comparison
  
