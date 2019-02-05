class Animal():
	
	def walk(self):
		print("걷는다")
	
	def eat(self):
		print("먹는다")
	
	def greet(self):
		print("인사하다")

class Cow(Animal):
	''' 소 '''
		
class Human(Animal): # Animal 클래스를 상속받음

	def wave(self):
		print("손을 흔든다")
	
	def greet(self): #  오버라이드
		self.wave()

class Dog(Animal):
	
	def wag(self):
		print("꼬리를 흔든다")
	
	def greet(self):
		self.wag()

person = Human()
person.greet()

dog = Dog()
dog.greet()

cow =  Cow()
cow.greet()