class Animal():
	def __init__(self,name):
		self.name = name
		
	def walk(self):
		print("걷는다")
	
	def eat(self):
		print("먹는다")
	
	def greet(self):
		print("{}이/가 인사한다".format(self.name))

class Cow(Animal):
	''' 소 '''
		
class Human(Animal): # Animal 클래스를 상속받음

	def __init__(self, name, hand):
		super().__init__(name)
		self.hand = hand

	def wave(self):
		print("{}을 흔들면서".format(self.hand))
	
	def greet(self): #  오버라이드
		self.wave()
		super().greet() # 자식 클래스에서 부모클래스의 내용을 사용하고 싶은 경우
		
person = Human("사람","왼손")
person.greet()
