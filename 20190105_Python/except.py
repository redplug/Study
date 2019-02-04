try:
	# list = []
	# list[0]

	text = 'abc'
	number = int(text)
except Exception as ex:  # Exception as e 뭐가 에러나ㅣㅆ는지 확인
	print('에러가 발생했습니다.',ex)
	
	
# C:\Python>python except.py
# 에러가 발생했습니다. list index out of range

# C:\Python>python except.py
# 에러가 발생했습니다. invalid literal for int() with base 10: 'abc'