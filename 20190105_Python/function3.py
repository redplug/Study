
def print_sqrt():
	r1 = (-b + (b ** 2 - 4 * a * c) ** 0.5) / (2 * a)
	r2 = (-b - (b ** 2 - 4 * a * c) ** 0.5) / (2 * a)

	print('하는 {} 또는 {}'.format(r1, r2))

a = 1
b = 2
c = -8	
	
print_sqrt()


a = 2
b = -6
c = -8	

print_sqrt()