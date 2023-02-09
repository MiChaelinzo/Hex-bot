def minimax(board, depth, alpha, beta, player, eval_fn):
    if depth == 0 or game_over(board):
        return eval_fn(board)

    if player == MAX:
        best_value = -float("inf")
        for move in possible_moves(board):
            board[move[0]][move[1]] = player
            value = minimax(board, depth - 1, alpha, beta, MIN, eval_fn)
            board[move[0]][move[1]] = EMPTY
            best_value = max(best_value, value)
            alpha = max(alpha, best_value)
            if alpha >= beta:
                break
        return best_value
    else:
        best_value = float("inf")
        for move in possible_moves(board):
            board[move[0]][move[1]] = player
            value = minimax(board, depth - 1, alpha, beta, MAX, eval_fn)
            board[move[0]][move[1]] = EMPTY
            best_value = min(best_value, value)
            beta = min(beta, best_value)
            if alpha >= beta:
                break
        return best_value

def best_move(board, depth, eval_fn=basic_eval):
    best_value = -float("inf")
    best_move = None
    for move in possible_moves(board):
        board[move[0]][move[1]] = MAX
        value = minimax(board, depth - 1, -float("inf"), float("inf"), MIN, eval_fn)
        board[move[0]][move[1]] = EMPTY
        if value > best_value:
            best_value = value
            best_move = move
    return best_move

def game_over(board):
    # Return True if the game is over, False otherwise.
    pass

def basic_eval(board):
    # Return a score for the current board state.
    pass

def possible_moves(board):
    # Return a list of all valid moves for the current player.
    pass

MAX = 1
MIN = -1
EMPTY = 0
