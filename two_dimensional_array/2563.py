index = int(input())
matrix = [[0 for _ in range(100)] for _ in range(100)]

for i in range(index):
    point = input().split()
    start = int(point[0])
    end = int(point[1])
    for j in range(start, start + 10):
        for k in range(end, end + 10):
            matrix[j][k] += 1

index = 0
for i in range(100):
    for j in range(100):
        if matrix[i][j] > 0:
            index += 1

print(index)