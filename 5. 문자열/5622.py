str_list = input()
time = 0

for num in str_list:
    if ord(num)/3 < 22.5:
        time += 3
    elif ord(num)/3 < 23.5:
        time += 4
    elif ord(num)/3 < 24.5:
        time += 5
    elif ord(num)/3 < 25.5:
        time += 6
    elif ord(num)/3 < 26.5:
        time += 7
    elif ord(num)/3 < 27.7:
        time += 8
    elif ord(num)/3 < 28.7:
        time += 9
    else:
        time += 10

print(time)