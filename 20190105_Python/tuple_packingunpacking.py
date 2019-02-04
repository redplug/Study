a, b = 1, 2 ## a와 b로 만들어진 튜플이 만들어짐

c = (3,4)
print(c)

d, e = c ## 언패킹 : 패킹된 변수에 여러개의 값을 꺼내 오는 것
print(d)
print(e)

f = d, e
print(f) ## 패킹 : 하나의 변수에 여러개의 값을 넣는 것

x = 5
y = 10
print(x)
print(y)

x, y = y, x ## 맞바꿀대 유용함.
print(x)
print(y)

def tuple_func():
	return 1, 2
	
q,w = tuple_func()

print(q)
print(w)