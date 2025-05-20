# 2292번
# 첫 번째 -> 1
# 두 번째 -> 6
# 세 번째 -> 12
# 네 번째 -> 18
# 다섯 번째 -> 24

n = int(input())
idx = 0

if n == 1:
    print(1)
else:
    while n - 1 > 0:
        idx = idx + 1
        n = n - idx * 6

    print(idx + 1)