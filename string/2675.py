index = int(input())

for i in range(index):
    line = input().split()

    for j in line[1]:
        print(j * int(line[0]), end="")
    print()