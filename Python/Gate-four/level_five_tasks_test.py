import unittest
import level_five_tasks


class TestLeveFiveTask(unittest.TestCase):

	def test_split_arrays(self):
		expected_result = [[45, 3, 9], [60, 10, 22]]
		actual_result = level_five_tasks.split_arrays([45, 60, 3, 10, 9, 22])

		self.assertEqual(expected_result, actual_result)


	def test_split_arrays_again(self):
		expected_result = [[45, 3, 9, 7], [60, 10, 22, 8]]
		actual_result = level_five_tasks.split_arrays([45, 60, 3, 10, 9, 22, 8, 7])

		self.assertEqual(expected_result, actual_result)



	def test_check_that_number_is_palindrome(self):
		expected_result = True
		actual_result = level_five_tasks.check_that_number_is_palindrome([1, 2, 3, 2, 1])

		self.assertEqual(expected_result, actual_result)


	def test_check_that_number_is_palindrome_again(self):
		expected_result = False
		actual_result = level_five_tasks.check_that_number_is_palindrome([1, 2, 3, 4, 1])

		self.assertEqual(expected_result, actual_result)


	def test_get_the_perfect_square(self):
		expected_result = [4, 9, 16]
		actual_result = level_five_tasks.get_the_perfect_square([4, 7, 9, 10, 16, 18])

		self.assertEqual(expected_result, actual_result)


	def test_get_the_perfect_square_again(self):
		expected_result = [1, 4, 16, 25]
		actual_result = level_five_tasks.get_the_perfect_square([1, 2, 3, 4, 5, 16, 20, 25])

		self.assertEqual(expected_result, actual_result)


	def test_replace_the_imperfect_square(self):
		expected_result = [4, -1, 9, -1, 16, -1]
		actual_result = level_five_tasks.replace_the_perfect_square([4, 7, 9, 10, 16, 18])

		self.assertEqual(expected_result, actual_result)


	def test_replace_the_imperfect_square_again(self):
		expected_result = [1, -1, -1, 4, -1, 16, -1, 25]
		actual_result = level_five_tasks.replace_the_perfect_square([1, 2, 3, 4, 5, 16, 20, 25])

		self.assertEqual(expected_result, actual_result)