def get_prime_number(number):

	prime_number = []

	for num in number:
		if num <= 1:
			continue

		is_prime = True

		for index in range(2, num):
			if num % index == 0:
				is_prime = False
				break
		if is_prime == True:
			prime_number.append(num)

	result = sorted(prime_number, reverse = True)

	return result


def replace_negative(number):

	result = [] 

	for num in number:
		if num < 0:
			value = 0
		else:
			value = num

		result.append(value)

	return result



def move_zeros_to_the_back(number):
	zeros = []
	non_zeros = []

	for num in number:
		if num == 0:
			zeros.append(num)
		else:
			non_zeros.append(num)

	result = non_zeros + zeros
	return result



def add_only_duplicate_numbers(number):
	number.sort()

	duplicate_number = []

	for index in range(len(number) -1):
		if number[index] == number[index +1]:
			if number[index] not in duplicate_number:
				duplicate_number.append(number[index])

	result = duplicate_number
	return result
 
		
