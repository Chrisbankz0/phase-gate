import unittest
import level_four_tasks


class TestLevelFourTasks(unittest.TestCase):

	def test_add_numbers(self):
		expected_result = 5
		actual_result = level_four_tasks.add_numbers(2, 3)

		self.assertEqual(expected_result, actual_result)


	def test_add_numbers_again(self):
		expected_result = 10
		actual_result = level_four_tasks.add_numbers(5,5)

		self.assertEqual(expected_result, actual_result)


	def test_is_even_number(self):
		expected_result = True
		actual_result = level_four_tasks.is_even_number(4)

		self.assertEqual(expected_result, actual_result)


	def test_is_even_number_again(self):
		expected_result_false = False
		actual_result_false = level_four_tasks.is_even_number(5)

		self.assertEqual(expected_result_false, actual_result_false)


	def test_square_number(self):
		expected_result = 25
		actual_result = level_four_tasks.square_of_number(5)

		self.assertEqual(expected_result, actual_result)


	def test_square_number_again(self):
		expected_result = 25
		actual_result = level_four_tasks.square_of_number(5)

		self.assertEqual(expected_result, actual_result)


	def test_convert_celsius_to_fahrenheit_again(self):
		expected_result = 32
		actual_result = level_four_tasks.convert_celsius_to_fahrenheit(0)

		self.assertEqual(expected_result, actual_result)


	def test_is_prime_number(self):
		expected_result = True
		actual_result = level_four_tasks.is_prime_number(7)

		self.assertEqual(expected_result, actual_result)


	def test_is_prime_number_again(self):
		expected_result = False
		actual_result = level_four_tasks.is_prime_number(4)

		self.assertEqual(expected_result, actual_result)


	def test_largest_number(self):
		expected_result = 9
		actual_result = level_four_tasks.largest_number(4,9,5)

		self.assertEqual(expected_result, actual_result)


	def test_largest_number_again(self):
		expected_result = 8
		actual_result = level_four_tasks.largest_number(4,8,6)

		self.assertEqual(expected_result, actual_result)


	def test_calculate_rectangle_area(self):
		expected_result = 36
		actual_result = level_four_tasks.calculate_rectangle_area(6,6)

		self.assertEqual(expected_result, actual_result)


	def test_calculate_rectangle_area_again(self):
		expected_result = 25
		actual_result = level_four_tasks.calculate_rectangle_area(5,5)

		self.assertEqual(expected_result, actual_result)


	def test_calculate_simple_interest(self):
		expected_result = 100
		actual_result = level_four_tasks.calculate_simple_interest(1000,5,2)

		self.assertEqual(expected_result, actual_result)


	def test_calculate_simple_interest_again(self):
		expected_result = 150
		actual_result = level_four_tasks.calculate_simple_interest(1000,5,3)

		self.assertEqual(expected_result, actual_result)


