list = [1, 2, 3, 4, 5]
dict = {'one':1,'two':2}

print(list[0])
print(dict['one'])

del(list[0])
print(list)

del(dict['one'])
print(dict)

print(len(list))
print(len(dict))

print(2 in list)
print(7 in list)
print('two' in dict.keys())
print('ww' in dict.keys())
print(2 in dict.values())
print(23 in dict.values())

dict.clear()
list.clear()
print(dict)
print(list)

list = [1, 2, 3, 4, 5]
dict = {'one':1,'two':2}

print(list[2])
list.pop(0)
print(list[2]) ## 삭제 할 경우 lsit는 값이 바뀔수도 있음.

print(dict['two'])
dict.pop('one')
print(dict['two']) ##삭제 하더라도 키값으로 확인하기 떄문에 값이 변하지 않음

big_list = [1,2,3] + [4,5,6] ## list를 합치는 방법
print(big_list) 

dict1 = {1:100, 2:200}
dict2 = {1:1000, 3:300}
dict1.update(dict2) ## 동일한 키가 있을 경우 update되는 항목으로 대체됨
print(dict1)

dict1 = {1:100, 2:200}
dict2 = {1:1000, 3:300}
dict2.update(dict1)
print(dict2)



