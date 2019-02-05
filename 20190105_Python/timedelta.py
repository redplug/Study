import datetime
hundred = datetime.timedelta(days = 100)
print(datetime.datetime.now() + hundred)
print(type(datetime.datetime.now()))
hundred_before = datetime.timedelta(days = -100)

print(datetime.datetime.now() + hundred_before)
print(datetime.datetime.now() - hundred) # 그냥 빼줘도 됨.

tomorrow = datetime.datetime.now().replace(hour = 9, minute = 0, second = 0) + datetime.timedelta(days=1)
print(tomorrow)

