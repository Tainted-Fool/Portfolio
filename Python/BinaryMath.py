__author__ = 'Alberto'
#Group members
#Lazaro Herrera
#Marvin T
#Danny P

import sys

def addBinary(bit1, bit2):                  #Function to add the bits
    maxLen = max(len(bit1), len(bit2))      #Find the max length of both of the numbers entered
    bit1 = bit1.zfill(maxLen)               #Fills the number with zeros if they are not the same length
    bit2 = bit2.zfill(maxLen)
    result = ""                             #Empty string
    carry = 0
    i = maxLen - 1                          #Makes i start from the last index

    while (i >= 0):                         #While loop so we do not go out of bounds
        total = int(bit1[i]) + int(bit2[i]) #Turns the string into int and then adds the last two numbers

        if total == 2 and carry == 0:
            carry = 1
            result = "%s%s" % (result, "0") #Concates the string

        elif total == 2 and carry == 1:
            carry = 1
            result = "%s%s" % (result, "1")

        elif total == 1 and carry == 1:
            carry = 1
            result = "%s%s" % (result, "0")

        elif total == 1 and carry == 0:
            carry = 0
            result = "%s%s" % (result, "1")

        elif total == 0 and carry == 1:
            carry = 0
            result = "%s%s" % (result, "1")

        else:
            result = "%s%s" % (result, "0")
        i -= 1                              #Decrease i by 1

    if carry > 0:                           #If we have still a carry after we added everything, we append it (overflow issue)
        result = "%s%s" % (result, "1")
        print("Overflow")

    return result[::-1]                     #::-1 gives a slice of the string but backwards "a[begin:end:steps]"

def flipBits(x):                            #Function to flip the bits
    newBit = ""                             #Empty string
    i = len(x) - 1                          #Makes i start from the last index

    while (i >= 0):                         #While loop so we do not go out of bounds
        if x[i] == "0":                     #If index [i] is 0 it will flip it into a 1
            newBit = "%s%s" % (newBit, "1") #Concates the string

        if x[i] == "1":                     #If index [i] is 1 it will flip it into a 0
            newBit = "%s%s" % (newBit, "0")
        i -= 1                              #Decrease i by 1

    return newBit[::-1]

def checkMag(x):                            #Function to check the magnitude of bit
    addOne = "1"                            #This is used for two's compliment

    if x[0] == "1":                         #If the first index is 1, then it must be negative
        a = flipBits(x)                     #Send to flipBits function
        twosComp = addBinary(a, addOne)     #Get the flip bit and add 1 to it
        return twosComp

    else:
        return x

#########################Run program with input instead of script##################################
a = input("")                               #Remove the comment on this a and b
b = input("")                               #Add comment on a and b that is under here
#a = str(sys.argv[1])
#b = str(sys.argv[2])

bit1 = checkMag(a)
bit2 = checkMag(b)
print(addBinary(bit1, bit2))

if len(sys.argv) != 2:                      #If statement for the command line
    print("Usage: java Lab1 a b")
    exit()



