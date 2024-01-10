index = int(input())
str_list = []
check = 0

for i in range(index):
    word = input()
    new_word = ""
    idx = 0

    for j in word:
        if len(word) == idx + 1:
            new_word += j
        elif word[idx] != word[idx + 1]:
            new_word += j
        idx += 1
    str_list.append(new_word)

for word in str_list:
    is_duplicate = False

    for char in word:
        if word.count(char) > 1:
            is_duplicate = True

    if not is_duplicate:
        check += 1

print(check)