fruits= {
    "orange" : 12,
    "mango" : 20
}

check = input("Which one u wnt to check: ").lower()

if check in fruits:
    print("Yes")
else:
    print("No")