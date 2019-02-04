test = bool(0)
print(test)
test = bool(1)
print(test)
test = bool(-1)
print(test)
test = bool(-13131)
print(test)

test2 = []
print(bool(test2))
test2 = [3]
print(bool(test2))

test3 = bool(None)
print(test3)
test3 = bool('')
print(test3)
test3 = bool('hi')
print(test3)

if 'Hi' :
	print('hello')

if '':
	print('hello')
	
value = input('입력해주세요>') or '아무것도 못받았어'
print('입력받은 값>',value)
