def split_arrays(number):
	odd_number = []
	even_number =[]

	for num in range(len(number)):
		if number[num] % 2 == 0:
			even_number.append(number[num])
		else:
			odd_number.append(number[num])

	return [odd_number, even_number]


def check_that_number_is_palindrome(number):
	reversed_number = []

	for index in range(len(number) -1,-1,-1):
		reversed_number.append(number[index])
	if number == reversed_number:
		return True
	else:
		return False



def get_the_perfect_square(number):
	result = []

	for num in range(len(number)):
		root = int(number[num] ** 0.5)

		if root * root == number[num]:
			result.append(number[num])
	return result	


def replace_the_perfect_square(number):
	result = []

	for num in range(len(number)):
		root = int(number[num] ** 0.5)

		if root * root == number[num]:
			result.append(number[num])
		else:
			result.append(-1)
	return result	