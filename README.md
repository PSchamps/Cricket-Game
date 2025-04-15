Java Cricket Game – Console-Based Mini Match Simulation

A fun and interactive **Cricket Match Simulator** built in Java, where you play a short 2-wicket, 6-ball innings against a computer opponent. Toss the coin, choose to bat or bowl, and see if you can outscore your opponent!

--------------------------------------------------------------------------------

Game Overview

- A toss determines who bats/bowls first.
- You can choose between **Defensive**, **Normal**, and **Aggressive** shots.
- The computer chooses from **Yorker**, **Bouncer**, or **Full Toss** deliveries.
- Each side plays a **6-ball innings** with **2 wickets**.
- Runs are randomly determined based on the logic of shot type vs. ball type.
- The winner is decided based on total runs at the end of both innings.

--------------------------------------------------------------------------------

Game Mechanics

Toss:
- You choose **Heads** or **Tails**.
- The winner of the toss decides whether to bat or bowl first.

Batting Options:
- Defensive – Low risk, low reward
- Normal – Balanced
- Aggressive – High risk, high reward

Bowling Options:
- Yorker
- Bouncer
- Full Toss

Runs are computed using probabilities to simulate realistic cricket outcomes (like dot balls, runs, or wickets).

--------------------------------------------------------------------------------

Features

- Simple CLI-based UI
- Simulates a mini 6-ball cricket innings
- Toss logic with player choice
- Strategy-based gameplay
- Randomized outcome using probabilities
- Displays live scorecard and final result
