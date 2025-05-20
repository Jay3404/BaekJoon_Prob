user_input = []
while True:
    try:
        char = input()
        if char:
            user_input.append(char)
        else:
            break
    except EOFError:
        break

for sentence in user_input:
    print(sentence)
