
def add_10(value):
	"""value에 10을 더한 값을 돌려주는 함수 """
	if value < 10:
		print('return 앞')
		return 10 # 먼저 실행한 값이 리턴 이후는 실행되지 않음.
	else:
		print('return 뒤')
		result = value + 10
	return result

n = add_10(42)
print(n)
n = add_10(3)
print(n)

n = round(1.5)
print(n)