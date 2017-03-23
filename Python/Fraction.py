#Lazaro Herrera

# modify the fraction shown below
# NOTE, you should indent by using 4 spaces for each indent, and not tab
#       and the gcd is different below than in the book you will need to call it as in the __add__ method
#       we have made the gcd method part of the class so it is now called as self.gcd(n1,n2)

class Fraction:
    
    def __init__(self, n, d):
        if isinstance(n, int) and isinstance(d, int):
            cd = self.gcd(n, d)
            self.num = n // cd
            self.den = d // cd
        else:
            raise RuntimeError("Enter integers only")

    def __repr__(self):
        return str(self.num) + "/" + str(self.den)

    def getNum(self):
        return self.num

    def getDen(self):
        return self.den

    def gcd(self, m, n):
        while m % n != 0:
            oldm = m
            oldn = n

            m = oldn
            n = oldm % oldn
        return n

    def __add__(self, other):
        newnum = self.num * other.den + self.den * other.num
        newden = self.den * other.den
        return Fraction(newnum, newden)

    def __sub__(self, other):
        newnum = self.num * other.den - self.den * other.num
        newden = self.den * other.den
        return Fraction(newnum, newden)

    def __mul__(self, other):
        newnum = self.num * other.num
        newden = self.den * other.den
        return Fraction(newnum, newden)

    def __truediv__(self, other):
        newnum = self.num * other.den
        newden = self.den * other.num
        return Fraction(newnum, newden)
        
    def __eq__(self, other):
        firstnum = self.num * other.den
        secondnum = self.den * other.num
        return firstnum == secondnum

    def __lt__(self, other):
        firstnum = self.num * other.den
        secondnum = self.den * other.num
        return firstnum < secondnum

    def __le__(self, other):
        firstnum = self.num * other.den
        secondnum = self.den * other.num
        return firstnum <= secondnum

    def __gt__(self, other):
        firstnum = self.num * other.den
        secondnum = self.den * other.num
        return firstnum > secondnum

    def __ge__(self, other):
        firstnum = self.num * other.den
        secondnum = self.den * other.num
        return firstnum >= secondnum

    def __ne__(self, other):
        firstnum = self.num * other.den
        secondnum = self.den * other.num
        return firstnum != secondnum

# The code below will test each feature, it should not print any assert errors
# it will test the new features in the order of the exercises 1,2,3,4 and then 5
# exercise 5 should result in a RunTime error of your making

def main():
    print("asserts to test that student did not break __add__, __eq__, or __repr__")

    half = Fraction(1, 3)
    assert str(half) == "1/3", "str(half) returned %s" % str(half)
    x = half + half
    assert str(x) == "2/3", "str(x) returned %s" % str(x)
    assert x == Fraction(2, 3)
    
    print("asserts to test Exercise #1 getNum,getDen")
    x = Fraction(1, 2)
    y = Fraction(3, 4)

    assert x.getDen() == 2
    assert y.getNum() == 3

    print("asserts to test Exercise #2 GCD in __init__")

    z = Fraction(10, 20)
    assert z.getNum() == 1 # Num should have been reduced to 1
    
    assert x+y == Fraction(5, 4) # test original Fraction

    print("asserts to test Exercise #3 + - / ")
    assert x-y == Fraction(-1, 4)
    assert x*y == Fraction(3, 8)
    assert x/y == Fraction(2, 3)

    print("asserts to test Exercise #4 comparisons" )
    assert not (x > y)
    assert (x >= x)
    assert (y > x)
    assert (x <= y)
    assert (x <= x)
    assert not(x != x)
    assert (x != y)
    assert not (y <= x)

    print("asserts to test Exercise #5 integers only" )
    print("-- init should print or raise an error from next call" )

    Fraction(1, 3)

main()

x = 10.0 / 3.0
print( "$ %.2f" % (x))