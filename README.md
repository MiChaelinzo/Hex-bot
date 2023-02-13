# Hex-bot
This project involves the creation of a computer program that plays the game of Hex, a two-player strategy game where the goal is to connect opposite sides of a hexagonal board. The Hex bot was built using the minimax algorithm with alpha-beta pruning and an evaluation function that assigns a score to each board state. The result is a strong AI player that can effectively compete and beat human players, demonstrating the bot's ability to make intelligent decisions and strategy. This project provides a valuable learning experience in game AI, Python programming, and problem-solving.

Minimax is a decision-making algorithm that recursively evaluates all possible game states to determine the best move. It uses the principle of maximizing the player's score while minimizing the opponent's score. Alpha-beta pruning is an optimization technique that helps speed up the minimax algorithm by discarding branches of the game tree that are not relevant to the final decision. 

- Note that you'll need to define the game_over, evaluate, possible_moves, MAX, MIN, and EMPTY functions to make this code work. The game_over function should return True if the game has ended, False otherwise. The evaluate function should return a score for the given board state, where a positive score is favorable for the player and a negative score is favorable for the opponent. The possible_moves function should return a list of all valid moves for the current player. MAX and MIN should be constants that represent the two players, and EMPTY should represent an empty cell on the board.

- This updated version allows you to specify a custom evaluation function, eval_fn, which can be used to determine the score of a board state. By default, it uses the basic_eval function, but you can replace it with a more sophisticated evaluation function if you like.

- Note that the implementation of the game_over, basic_eval, and possible_moves functions will depend on the specific game you are playing, and will need to be adjusted accordingly.

![DALL·E 2023-02-09 11 06 46 - hex bot ](https://user-images.githubusercontent.com/68110223/217753297-400520cd-0b71-4dd6-bbe5-00bd66ca4dcc.png)



![a1f6ae96-3ce1-4af1-a91a-3254317eec72](https://user-images.githubusercontent.com/68110223/218071451-dd4ec178-23bb-4772-a2a4-c89c25281bb9.png)
