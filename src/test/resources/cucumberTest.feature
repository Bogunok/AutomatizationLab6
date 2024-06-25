Feature: String concatenation

  Scenario Outline: Concatenating two strings
    Given I have strings "<string1>" and "<string2>"
    When I concatenate them
    Then the result should be "<result>"

    Examples:
      | string1 | string2 | result      |
      | Hello   | World   | HelloWorld  |
      | Harry   | Styles  | HarryStyles |
      | Emi     | nem     | Eminem      |