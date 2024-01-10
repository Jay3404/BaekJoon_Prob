index = int(input())
intArr = input().split()
total = 0
max_score = 0

for i in intArr:
    score = int(i)
    total += score
    if max_score < score:
        max_score = score

print(total * 100 / index / max_score)