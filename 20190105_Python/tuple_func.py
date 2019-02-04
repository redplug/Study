list = [1,2,3,4,5]
for i, v in enumerate(list):
	print('{} 번째 값: {}'.format(i,v))
	
list = [1,2,3,4,5]
for a in enumerate(list): ## 하나로 받아도 됨.
	print('{} 번째 값: {}'.format(a[0],a[1]))
	
list = [1,2,3,4,5]
for a in enumerate(list): ## *표를 쓰면 쪼개라는 의미
	print('{} 번째 값: {}'.format(*a))

ages = {'tod':35, 'jane':23,'paul':62}
for key,val in ages.items():
	print('{}의 나이는 {} 입니다.'.format(key,val))
	
	
ages = {'tod':35, 'jane':23,'paul':62}
for a in ages.items():
	print('{}의 나이는 {} 입니다.'.format(a[0],a[1]))

ages = {'tod':35, 'jane':23,'paul':62}
for a in ages.items():
	print('{}의 나이는 {} 입니다.'.format(*a))
	