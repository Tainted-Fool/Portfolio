import turtle
import random

t = turtle.Turtle()
myWin = turtle.Screen()

def tree(branchLen, t):
    ranNum = random.randrange(15, 20)                       #random number
    ranAngle = random.randrange(20, 40)                     #random angle
    double = ranAngle * 2
    t.width(5)

    if branchLen > 5:                                       #default = 5
        t.forward(branchLen)                                #moves forward
        t.right(ranAngle)                                   #default = 20 rotates right  (subtracts by random number)
        tree(branchLen - (ranNum), t)                       #default = -15  (subtracts by random number)
        t.left(double)                                      #default = 40 rotates left
        tree(branchLen - (ranNum), t)                       #default = -10  (subtracts by random number)
        t.right(ranAngle)                                   #default = 20 rotates right  (subtracts by random angle)
        t.backward(branchLen)                               #moves backwards

    if branchLen < 5:
        t.color("green")                                    #changes color to green (leaf color)
    else:
        t.color("black")


t.speed(0)                                                  #default = 0
t.left(random.randrange(90, 95))                            #default = 90 position of beginning tree (left and right adjust)
t.up()                                                      #moves up
t.backward(random.randrange(100, 200))                      #default = 200 position of beginning tree (up and down adjust)
t.down()                                                    #moves down
tree(100, t)                                                #default = 100
myWin.exitonclick()
