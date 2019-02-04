list = [1, 2, 3, 4, 5]
print(list)
list[2] = 33
print(list)
list.append(6) ## 추가할 경우에 append를 값을 넣어줘야함.

dict = {'one':1, 'two':2}
print(dict)

dict['three'] = 3
print(dict)

del (list[0])
print(list)
del(dict['one'])
print(dict)

list.pop(0)
print(list)

dict.pop('two')
print(dict)
