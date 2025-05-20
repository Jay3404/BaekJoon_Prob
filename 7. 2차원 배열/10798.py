max_int = 0
matrix = [["" for _ in range(15)] for _ in range(5)]

for i in range(5):
    idx = 0
    word = input()
    length = len(word)
    if length > max_int:
        max_int = length

    for char in word:
        matrix[i][idx] = char
        idx += 1

for i in range(max_int):
    for j in range(5):
        print(matrix[j][i], end="")