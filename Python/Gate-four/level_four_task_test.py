import unittest
import level_four_task


class TestLevelFourTask(unittest.TestCase):

	def test_prime_numbers(self):
		expected_result = [5,3,2]
		actual_result = level_four_task.get_prime_number([5,9,3,6,2])

		self.assertEqual(expected_result, actual_result)

	def test_prime_numbers_again(self):
		expected_result = [7,5,3,2]
		actual_result = level_four_task.get_prime_number([7,5,9,3,6,2])

		self.assertEqual(expected_result, actual_result)


	def test_replace_negatives(self):
		expected_result = [5, 0, 3, 0, 2, 0]
		actual_result = level_four_task.replace_negative([5, -9, 3, -6, 2, -11])

		self.assertEqual(expected_result, actual_result)

	def test_replace_negatives_again(self):
		expected_result = [5, 0, 3, 0, 2, 0, 0]
		actual_result = level_four_task.replace_negative([5, -9, 3, -6, 2, -11, -7])

		self.assertEqual(expected_result, actual_result)


	def test_move_zeros(self):
		expected_result = [5, 3, 2, 0, 0, 0]
		actual_result = level_four_task.move_zeros_to_the_back([5, 0, 3, 0, 2, 0])

		self.assertEqual(expected_result, actual_result)

	def test_move_zeros_again(self):
		expected_result = [5, 3, 2, 0, 0, 0]
		actual_result = level_four_task.move_zeros_to_the_back([5, 0, 3, 0, 2, 0])

		self.assertEqual(expected_result, actual_result)


	def test_add_only_duplicate_numbers(self):
		expected_result = [45, 3, 0]
		actual_result = level_four_task.add_only_duplicate_numbers([45, 60, 3, 0, 67, 2, 45, 3, 22, 0])

		self.assertCountEqual(expected_result, actual_result)

	def test_add_only_duplicate_numbers_again(self):
		expected_result = [45, 3, 22, 0]
		actual_result = level_four_task.add_only_duplicate_numbers([45, 60, 3, 0, 67, 22, 45, 3, 22, 0])

		self.assertCountEqual(expected_result, actual_result)

