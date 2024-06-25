numbers = tuple(input("Enter a sequence of numbers: ").split(", "))

for num in numbers:
    if int(num)%5 == 0:
        print(num)