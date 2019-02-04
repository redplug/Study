# list = [] 
# print(list[0])
# Traceback (most recent call last):
  # File "<stdin>", line 1, in <module>
# IndexError: list index out of range
# list값이 없기 때문에 오류가 나타남 IndexError

# text = 'abc'
# number = int(text)
# Traceback (most recent call last):
  # File "<stdin>", line 1, in <module>
# ValueError: invalid literal for int() with base 10: 'abc'
# 텍스트값을 숫자로 바꿀 수 없기 때문에 오류가 나타남 Value Error


text = '100%'
try : 
	number = int(text)
except ValueError : 
	print('{}는 숫자가 아니네요.'.format(text))
	
def safe_pop_print(list,index):	
	try:
		print(list.pop(index))
	except IndexError : 
		print('{} index의 값을 가져올 수 없습니다.'.format(index))

		
index = [1,2,3]
print(index)
safe_pop_print(index,2)
safe_pop_print(index,5)
print(index)

def safe_pop_print2(list,index):
	if index < len(list):
		print(ist.pop(index))
	else:
		print('{} index의 값을 가져올 수 없습니다.'.format(index))

safe_pop_print2([4,5,6],5)

try:
	import my_module2
except ImportError:
	print('모듈이 없습니다.')
	
	
# a = 3/0

# print("0으로 나눌 수 없습니다.")
# Traceback (most recent call last):
  # File "try_except.py", line 49, in <module>
    # a = 3/0
# ZeroDivisionError: division by zero