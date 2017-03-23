# do a comparison of the in operator
# in a list vs a dict
# this is the best starter code to use for assignment

from timeit import Timer

def build_list(n):
    return list(range(n))  # create list of 1 to n

def build_dict(n): # build dict = { 0:"0", 1:"1", 2:"2", ... n:"n" }
    return {i : str(i) for i in range(n)}  # from last listing in this chapter

def deleteList(n): # He recommends deleting last item, the middle, and the first item
    list = build_list(n)
    del list[n - 1]
    del list[n // 2]
    del list[0]

def deleteDict(n): # He recommends deleting last item, the middle, and the first item
    dict = build_dict(n)
    del dict[n - 1]
    del dict[n // 2]
    del dict[0]

timeList = Timer(
    "deleteList(n)", # time this
    "from __main__ import n, build_list, deleteList") # setup

timeDict = Timer(
    "deleteDict(n)", # time this
    "from __main__ import n, build_dict, deleteDict") # setup

# get min of 5 runs of 5
print("N", "\t\t\t\t", "List", "\t\t\t\t\t", "Dict") # print headers
for size in range(1000, 100001, 5000):  # sizes to graph for n:
    n = size
    list_secs = timeList.repeat(5, 5)
    dict_sect = timeDict.repeat(5, 5)
    print(n, "\t", min(list_secs), "\t", min(dict_sect))