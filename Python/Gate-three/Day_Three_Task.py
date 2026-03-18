def day_three_array(number_one,number_two,number_three, size):
	num_result = []
	value = number_one,number_two,number_three

	for num in range(1, size -1):
		num_result = value[num]
		if num < len(value):
			num_result.append(value)
		else:
			num_result.append(-1)

	return num_result


def day_three_string(text):

	result = ""
	count = 0
	for index in range(1, len(text)):
		if text[index] == text:
			count ++
			result += text



def find_the_largest_index(number):

	for num in numbers
			
		


