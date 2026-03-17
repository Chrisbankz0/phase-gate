def add_numbers(num_one, num_two):
	return num_one + num_two


def is_even_number(input_number):
	return input_number % 2 == 0


def square_of_number(number):
	return number * number


def convert_celsius_to_fahrenheit(number):
	return (number * 9/5) + 32


def is_prime_number(number):
	if number <= 1:
		return False

	for index in range(2, number):
		if number % index == 0:
			return False

	return True


def largest_number(number_one, number_two, number_three):
	largest = number_one

	if number_two > largest:
		largest = number_two

	elif number_two > largest:
		largest = number_three

	return largest

def calculate_simple_interest(amount, rate, time):
	return (amount * rate * time) / 100


def calculate_rectangle_area(num_one, num_two):
	return num_one * num_two


def reverse_number(number):
	reversed_number = 0

	while number > 0:
		digit = number % 10
		reversed_number = (reversed_number * 10) + digit
		number = number // 10

	return reversed_number

