index = input().split()
x = int(index[0])
y = int(index[1])
matrix = [[0 for _ in range(y)] for _ in range(x)]

for i in range(x):
    line = input().split()
    for j in range(y):
        matrix[i][j] = int(line[j])

for i in range(x):
    line = input().split()
    for j in range(y):
        matrix[i][j] += int(line[j])

for i in range(x):
    for j in range(y):
        print(int(matrix[i][j]), end=" ")
    print()