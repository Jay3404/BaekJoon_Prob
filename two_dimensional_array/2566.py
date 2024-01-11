index = 0
max_int = 0
matrix = [[0 for _ in range(9)] for _ in range(9)]
answer = "1 1"

for i in range(9):
    int_arr = input().split()
    for j in range(9):
        matrix[i][j] = int(int_arr[j])
        if int(int_arr[j]) > max_int:
            max_int = int(int_arr[j])
            answer = str((i + 1)) + " " + str((j + 1))

print(max_int)
print(answer)