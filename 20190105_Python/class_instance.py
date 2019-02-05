print(type(5))
# <class 'int'>

print(isinstance(5,float))

numbers1 = []
print(type(numbers1))

numbers2 = list(range(10))

charcters = list("Hello")
print(charcters)


print(type(numbers2))
print(type(charcters))
print(isinstance(numbers1,list))
print(numbers1 == list)
# 다른 인스턴스이나 동일한 lsit 클래스를 가지고 있음

list1 = [1, 2, 3]
list2 = [1, 2, 3]

if list1 is list1:
    print("당연히 list1과 list1은 같은 인스턴스입니다.")

if type(list1) is type(list2):
    print("list1과 list2은 같은 list클래스입니다.")

if list1 == list2:
    print("list1과 list2의 값은 같습니다.")
    if list1 is list2:
        print("그리고 list1과 list2는 같은 인스턴스입니다.")
    else:
        print("하지만 list1과 list2는 다른 인스턴스입니다.")
		
