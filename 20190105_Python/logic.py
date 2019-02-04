a = 10
if a < 0 and 2**a > 1000 and a%5 == 2 and round(a) == a:
	print('복잡한 식')

def return_false():
	print('함수 return_false')
	return False

def return_true():
	print('함수 return_true')
	return True
	
print('테스트1')
a = return_false()
b = return_true()
if a and b :
	print(True)
else:
	print(False)

# 단락평가	
print('테스트2')
if return_false() and return_true(): # return_false가 false임에 따라 return_true 가 실행되지 않음.
	print("True")
else:
	print(False)
	
dic = {"Key2":"Value1"}

if "Key1" in dic and dic['Key1'] == "Value1":
	print("Key1도 있고, 그 값은 Value네")
else:
	print("아니네")

# if dic['Key1'] == "Value1" and "Key1" in dic:
	# print("Key1도 있고, 그 값은 Value네")
# else:
	# print("아니네")
	
# Traceback (most recent call last):
  # File "logic.py", line 35, in <module>
    # if dic['Key1'] == "Value1" and "Key1" in dic:
# KeyError: 'Key1'
#	dic['Key1'] == "Value1" 와 Key1" in dic의 순서를 바꿀경우 앞에 구분에서 오류가 나기 떄문에 실행오류가 발생함.