user1= input("Enter the player 1's Name: ")
user2 = input("Enter the player 2nd Name: ")

while(True):
    user1_choice = input(user1 + " Enter the choice either Rock r Sessors: ").upper()
    user2_choice = input(user2 + " Enter the choice either Rock r Sessors: ").upper()

    if (user1_choice == user2_choice):
         print("Tie")
    elif user1_choice == 'ROCK':
        if user2_choice == 'SCISSORS':
            print("Rock wins!")
        else:
            print("Paper wins!")
    elif user1_choice == 'SCISSORS':
        if user2_choice == 'PAPER':
            print("Scissors win!")
        else:
            print("Rock wins!")
    elif user1_choice == 'PAPER':
        if user2_choice == 'ROCK':
            print("Paper wins!")
        else:
            print("Scissors win!")
    else:
        print("Invalid input! You have not entered rock, paper or scissors, try again.")
    repeat = input("Do u wnat to play another round? Yes/No: ").upper()
    if(repeat =="YES"):
        pass
    elif(repeat == "NO"):
        raise SystemExit
    else:
        print("you entered wrong "+ repeat)
        raise SystemExit
