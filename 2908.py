num = input().split()

num1 = int(num[0][2]) * 100 + int(num[0][1]) * 10 + int(num[0][0])
num2 = int(num[1][2]) * 100 + int(num[1][1]) * 10 + int(num[1][0])

if num1 > num2:
    print(num1)
else:
    print(num2)