Sure, here's a sample `README.md` file to provide an overview and explanation of the code you've provided:

# Number Guessing Game

This is a simple Java console-based number guessing game where the player tries to guess a randomly chosen number between 1 and 100. The player has a limited number of attempts to guess the correct number and earn points. The goal is to guess the number correctly and maximize the points.

## How to Play

1. **Compilation and Execution**: Make sure you have a Java compiler installed on your system. Compile the `task1.java` file using the following command:

   ```
   javac task1.java
   ```

   Run the compiled program with:

   ```
   java task1
   ```

2. **Game Rules**:

   - The game will display a message indicating that a random number between 1 and 100 has been chosen.
   - You will be prompted to guess the number.
   - You have 5 attempts to guess the correct number.
   - After each incorrect guess, the game will provide feedback on whether the guessed number is too high or too low.
   - You earn 10 points for guessing the correct number.
   - You lose 2 points for each incorrect guess.
   - If you use all 5 attempts without guessing the correct number, you lose the game.

3. **Play Again**:

   - After a game ends (either due to a correct guess or after 5 attempts), you will be asked if you want to play again.
   - Enter `YES` to play another round or `NO` to exit the game.
   - Your total score will be displayed when you choose to exit the game.

## Code Overview

- The game logic is implemented in the `task1.java` file.
- The program utilizes a recursive approach to allow the player to play again if desired.
- A random number is generated using the `java.util.Random` class to keep each game session unique.

## Author

This number guessing game was created by Tithi Bera

