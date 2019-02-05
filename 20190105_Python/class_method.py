class Human():
	''' 인간'''
	def __init__(self, name, weight):
		'''초기화 함수'''
		# __는 특수한 함수
		print("__init__실행")
		self.name = name
		self.weight = weight
		print("이름은 {}, 몸무게는 {} 입니다.".format(name, weight))
	
	
	def __str__(self):
		'''문자열화 함수''' # 인스턴스 자체를 출력할 떄 사용
		return "{} (몸무계 {}kg)".format(self.name,self.weight)
			
	def eat(self):
		self.weight += 0.1
		print("{}가 먹어서 {}kg가 되었습니다.".format(self.name,self.weight))

	def walk(self):
		self.weight -= 0.1
		print("{}가 걸어서 {}kg가 되었습니다.".format(self.name,self.weight))
	
	def speak(self, message):
		print(message)

person = Human("철수",60.5)
# init 함수가 자동으로 실행

person.walk()
person.eat()
person.speak("안녕하세요")

print(person.name)
print(person.weight)
print(person)
