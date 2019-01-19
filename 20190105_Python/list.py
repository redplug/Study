
# 리스트 사용

list1 = ['가위', '바위', '보']
list2 = [1,3,6,78,5,34,]

print(list1)
print(list2)
print(list1[1])
print(list1[2])
# print(list1[3]) // 0부터 시작하기 때문에 오류가 남
print(list1[0])

list1[0] = '바위'
print(list1[0])
print(list1)

print(list1[-1])
print(list1[-2])
print(list1[-3])
# print(list1[-4]) # 오류남