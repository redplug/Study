list1 = list(range(20))
print(list1)

print(list1[5:15])

print(list1[5:15:2]) #하나 건너 하나씩 (step)
print(list1[5:15:3]) # 3개마다 하나씩 (step)
print(list1[15:5:-1]) # 거꾸로 시작은 포함 끝은 포함이 안되기 때문에 값이 달라짐
print(list1[14:4:-1]) # 거꾸로 시작은 포함 끝은 포함이 안되기 때문에 값이 달라짐
print(list1[::3])  # 전체 step
print(list1[::-3]) # 전체 step 거꾸로
