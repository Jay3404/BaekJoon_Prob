word = input()
index = round(len(word) / 2)
str_list = []
is_true = True

for i in range(index):
    if word[i] != word[-1 - i]:
        is_true = False
        break

if is_true:
    print(1)
else:
    print(0)