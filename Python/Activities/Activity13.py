
def calculate_sum(numbers):
	sum = 0
	for num in numbers:
		sum += num
	return sum


numList = [10, 40, 60, 90]


result = calculate_sum(numList)


print("The sum of all the elements is: " + str(result))