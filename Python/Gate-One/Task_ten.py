numbers = 0

for i in range(1,4):
	number = int(input("Enter number: "))

	numbers += number
	
result = numbers / 3

print(f"The average is {result}")
