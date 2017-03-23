__author__ = 'Alberto'
import random

Choice = ""
Choices = ["rock", "paper", "scissors"]

def intro():
    print("Enter you choice:")
    print("R or r for rock")
    print("P or p for paper")
    print("S or s for scissors")
    print("Q or q to quit")

def winner():
    if (Choice == "r" and Computer == "scissors"):
        print("You win against the computer")

    elif (Choice == "r" and Computer == "paper"):
        print("You lose against the computer")

    elif (Choice == "p" and Computer == "rock"):
        print("You win against the computer")

    elif (Choice == "p" and Computer == "scissors"):
        print("You lose against the computer")

    elif (Choice == "s" and Computer == "paper"):
        print("You win against the computer")

    elif (Choice == "s" and Computer == "rock"):
        print("You lose against the computer")

    else:
        print("You tie against the computer")

while Choice != "q":
    intro()
    Choice = input("")
    Choice = Choice.lower()  #makes all choices lowercase
    Computer = random.choice(Choices)

    if Choice != "q":
        print("Computer picked:", Computer)
        winner()
        print()