numbers = list(range(10))
print(numbers)
del numbers[0] 
print(numbers)
print(numbers[:5])
del numbers[:5] # 5번까지 삭제
print(numbers)
print(numbers[1:3])
numbers[1:3] = [77,88] # 여러개를 한번에 변경
print(numbers)
numbers[1:3] = [77,88,99] # 변경하려는 리스트가 더 많을 경우 insert시켜줌
print(numbers)
numbers[1:4] = [8] # 적을 경우 적은 수만큼 줄어듬
print(numbers)

list1 = [0, 1, 2, 3, 4, 5]
# list1의 1부터 3까지를 slice를 이용해서 각각 11, 22, 33으로 바꿔보세요.
# 바꾸고 나면 list1은 [0, 11, 22, 33, 4, 5]가 되어야 합니다.

list1[1:4] = [11, 22, 33]

list2 = [0, 1, 2, 3, 4, 5]
# list2의 1부터 3까지를 del과 slice를 이용해서 지워보세요
# 바꾸고 나면 list2은 [0, 4, 5]가 되어야 합니다.
del list2[1:4]

print("list1 : {}, list2 : {}".format(list1, list2))