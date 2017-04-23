Feature: player activity
    I must be in the app


    Scenario: Iniciate the game
        Given splash screen in app
        When i tap the screen
        Then appears the game screen

    Scenario: Move the ship to the left
        Given gameplay screen
        When i tap in the left of the screen
        Then the spaceship moves to the left 1 unit

    Scenario: Move the ship to the right
        Given gameplay screen
        When i tap in the right of the screen
        Then the spaceship moves to the right 1 unit

    Scenario: Player shoot
        Given gameplay screen
        When i tap the ship of player
        Then the spaceship shoots a missile that moves in the screen

    Scenario: open option menu in screen principal
        Given principal screen in app
        When i tap on the option menu
        Then option menu opens