line = input()

basket = list(range(1, int(line.split()[0]) + 1))
index = int(line.split()[1])

for i in range(index):
    line = input()
    start_num = int(line.split()[0]) - 1
    end_num = int(line.split()[1])
    basket[start_num:end_num] = reversed(basket[start_num:end_num])

for i in basket:
    print(i, end=' ')