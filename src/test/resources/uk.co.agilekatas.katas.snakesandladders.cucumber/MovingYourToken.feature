Feature: Moving Your Token
  The first feature we want implemented is the ability to move your token across the board using dice rolls.
  Players will need the ability to roll a dice, move their token the number of squares indicated by the dice roll and should win if they land on the final square.

  Scenario: Starting the Game
    Given the game is started
    Then the token is on square 1

