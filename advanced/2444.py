index = int(input())

for i in range(index):
    print(" " * (index - i - 1) + "*" * (2 * i + 1))
for j in range(index - 1):
    print(" " * (j + 1) + "*" * (2 * (index - j) - 3))