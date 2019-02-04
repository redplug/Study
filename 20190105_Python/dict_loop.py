ages = {'tod':35,'Jane':23,'Paul':62}

for key in ages.keys(): ## keys는 삭제를 하더라도 무방함.
	print('{}의 나이는 {} 입니다.'.format(key,ages[key]))

for key,value in ages.items():
	print('{}의 나이는 {} 입니다.'.format(key,value))
	
#for value in age.values():
#	print(value)