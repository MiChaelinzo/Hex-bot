def minimax(board, depth, alpha, beta, player):
    if depth == 0 or game_over(board):
        return evaluate(board)

    if player == MAX:
        best_value = -float("inf")
        for move in possible_moves(board):
            board[move[0]][move[1]] = player
            value = minimax(board, depth - 1, alpha, beta, MIN)
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
            value = minimax(board, depth - 1, alpha, beta, MAX)
            board[move[0]][move[1]] = EMPTY
            best_value = min(best_value, value)
            beta = min(beta, best_value)
            if alpha >= beta:
                break
        return best_value

def best_move(board, depth):
    best_value = -float("inf")
    best_move = None
    for move in possible_moves(board):
        board[move[0]][move[1]] = MAX
        value = minimax(board, depth - 1, -float("inf"), float("inf"), MIN)
        board[move[0]][move[1]] = EMPTY
        if value > best_value:
            best_value = value
            best_move = move
    return best_move
