word = input()
nums = [-1] * 26
index = 0

for i in word:
    if nums[ord(i) - 97] == -1:
        nums[ord(i) - 97] = index
    index += 1

for i in nums:
    print(i, end=" ")
