input_list = input().split()
chess_list = [1, 1, 2, 2, 2, 8]

for i in range(6):
    print(chess_list[i] - int(input_list[i]), end=" ")