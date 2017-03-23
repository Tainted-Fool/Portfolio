# Timing building a list from 0 to n
# from Listing 3 of Analysis chapter

def test1(): # concatenate
    l = []
    for i in range(1000):
        l = l + [i]

def test2(): # append
    l = []
    for i in range(1000):
        l.append(i)

def test3(): # comprehension
    l = [i for i in range(1000)]

def test4(): # range to list
    l = list(range(1000))

from timeit import Timer

t1 = Timer("test1()", "from __main__ import test1")
print( "       concat", "%.3f:" % t1.timeit(number=1000), "milliseconds") # number is how may experiments

t2 = Timer("test2()", "from __main__ import test2")
print( "       append", "%.3f:" % t2.timeit(number=1000), "milliseconds") # number is how may experiments

t3 = Timer("test3()", "from __main__ import test3")
print( "comprehension", "%.3f:" % t3.timeit(number=1000), "milliseconds") # number is how may experiments

t4 = Timer("test4()", "from __main__ import test4")
print( "range to list", "%.3f:" % t4.timeit(number=1000), "milliseconds") # number is how may experiments