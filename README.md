Overview
This is a simple Java-based cricket game simulation where the user plays a single-over match against a computer opponent. The game includes a coin toss, batting, and bowling choices, along with an outcome based on probability.

FEATURES:-
Toss Mechanism: The user chooses "Heads" or "Tails" for the toss. If they win, they decide whether to bat or bowl first.
Batting Mode: The user selects different shot types, and the game determines the outcome based on probability.
Bowling Mode: The user selects different types of deliveries, and the game determines how the opponent plays.
Match Outcome: The game announces the winner based on the scores.

HHOW TO PLAY:-
Run the program in a Java-supported environment.
Enter "Heads" or "Tails" to take part in the toss.
If you win the toss, choose to bat or bowl first.
If batting, select your shots:

Defensive (0)
Normal Shot (1)
Aggressive Shot (2)

If bowling, select your ball type:
Yorker (0)
Bouncer (1)
Full Toss (2)

The game will simulate a single over (6 balls per innings) and announce the result.

CODE STRUCTURE:-
Main Class (Main.java)
Handles the toss and game flow.

Batting Function (batting())
Allows the user to play their batting innings.

Bowling Function (bowling())
Simulates the user's bowling session.

Runs Calculation (runs(int bat, int ball))
Determines the outcome based on the user's choice and random probability.
