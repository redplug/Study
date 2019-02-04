list1 = [1, 2, 3, 4]
list1.append(5)
print(list1)
list1.remove(1)
print(list1)

dict1 = {'one':1, 'two':2}

print(dict1)

tuple1 = (1,2,3,4)
print(type(tuple1))
tuple2 = 1,2,3
print(type(tuple2))

list1 = [1,2,3]
tuple3 = tuple(list1) ## list를 튜플로 변경함
print(list1)
print(tuple3)

print(tuple3[0])

## tuple3[0] = 5 ## 튜플은 변경을 할 수 없기 때문에 변경할 경우 에러가 난다.
## del tuple3[0] ## 변경이 불가
## tuple3.pop(0) ## 역시 불가함.
