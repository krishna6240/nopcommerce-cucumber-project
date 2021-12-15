Feature: ComputerPageTest
  As a User I want to order computer

  @Sanity @Regression
  Scenario: Verify User Should Navigate To Computer Page Successfully
    Given I am on HomePage
    When I Click on Computer tab
    Then I Verify "Computers" text

  @Sanity @Regression
  Scenario: Verify User Should Navigate To Desktops Page Successfully
    Given I am on HomePage
    When I Click on Computer tab
    And I Click on Desktops link
    Then I Verify "Desktops" page

  @Smoke @Regression
  Scenario Outline: Verify That User Should Build Your Own Computer And Add Them To Cart Successfully
    Given I am on HomePage
    When I Click on Computer tab
    And I Click on Desktops link
    And I Click on product name "Build your own computer"
    And Select processor "<processor>"
    And Select RAM "<ram>"
    And Select HDD "<hdd>"
    And Select OS "<os>"
    And Select Software "<software>"
    And Click on ADD TO CART Button
    Then Verify message "The product has been added to your shopping cart"

    Examples:
      | processor                                       | ram           | hdd               | os                      | software                   |
      | 2.2 GHz Intel Pentium Dual-Core E2200           | 2 GB          | 320 GB            | Vista Home [+$50.00]    | Microsoft Office [+$50.00] |
      | 2.5 GHz Intel Pentium Dual-Core E2200 [+$15.00] | 4GB [+$20.00] | 400 GB [+$100.00] | Vista Premium [+$60.00] | Acrobat Reader [+$10.00]   |
      | 2.5 GHz Intel Pentium Dual-Core E2200 [+$15.00] | 8GB [+$60.00] | 320 GB            | Vista Home [+$50.00]    | Total Commander [+$5.00]   |

