selected = None
while selected not in ['가위','바위','보']:
	selected = input('가위, 바위, 보 중에 선택하세요>')

print('선택된 값은: ',selected)

patterns = ['가위','보','보']

for i in range(len(patterns)):
	print(patterns[i])

## 상황에 따라 for문이나 while중 편한쪽으로 골라서 하면됨.
lengh = len(patterns)
i = 0
while i < lengh:			
	print(patterns[i])
	i = i + 1
