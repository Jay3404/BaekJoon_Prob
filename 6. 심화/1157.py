word = input()
alphabet_list = [0] * 26
index = 0
idx = 0
is_duplicate = False

for char in word:
    if ord(char) < 97:
        alphabet_list[ord(char) - 65] += 1
    else:
        alphabet_list[ord(char) - 97] += 1

for num in alphabet_list:
    if num == max(alphabet_list) and index == 0:
        index = idx + 65
    elif num == max(alphabet_list) and index != 0:
        is_duplicate = True
    idx += 1

if is_duplicate:
    print("?")
else:
    print(chr(index))
