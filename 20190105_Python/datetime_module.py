import datetime # datetime 모듈 임포트


print(datetime.datetime.now())

start_time = datetime.datetime.now()
print(type(start_time))
start_time.replace(year = 2017, month = 2, day = 1)
print(start_time)
start_time = datetime.datetime(2016,2,1)
print(start_time)

start_time = datetime.datetime(2020,2,1)
how_long = start_time - datetime.datetime.now()
print(type(how_long))
print(how_long)
print(how_long.days)
print(how_long.seconds)

print("2월 1일까지는 {}일 {}시간이 남았습니다.".format(how_long.days, how_long.seconds//3600))

def days_until_christmas():
    christmas_2030 = datetime.datetime(2030, 12, 25)
    days = christmas_2030 - datetime.datetime.now()
    return days.days


print("{}일".format(days_until_christmas()))