index = int(input())
total = 0
num = input()

for i in range(index):
    total += int(num[i - 1])

print(total)