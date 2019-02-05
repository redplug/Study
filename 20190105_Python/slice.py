list = [1,2,3,4,5]
print(list[1])

text = "hello world"
print(text[1])

print(text[1:5])

list = ['영','일','이','삼','사','오']

print(list[1:3])

print(list[0:2])

print(list[2:len(list)])

print(list[:2]) #처음부터 2까지
print(list[2:]) #2부터 끝까지

list1 = [123,53432,645,2342,567,]
list2 = list1[:] # 리스트 복제하기
print(list1)
print(list2)
list1.sort()
print(list1)
