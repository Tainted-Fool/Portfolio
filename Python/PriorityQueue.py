from pythonds.trees.binheap import BinHeap

class PriorityQueue:

    def __init__(self):
        self.queue = BinHeap()

    def enqueue(self, item):
        BinHeap.insert(self.queue, item)

    def dequeue(self):
        return BinHeap.delMin(self.queue)


#Testing code, add to end of your code
import random
for n in [1,2,5,10,20]: # do sequence of each of these lengths
    l1 = [ i+1 for i in range(n)] # list from 1 to n
    l2 = l1.copy() # duplicate the list l1
    random.shuffle(l2) # shuffle it before adding to priority queue pq
    pq = PriorityQueue()
    print("test inserts from: ",l2)
    for i in l2: # add each element from l2
        pq.enqueue(i)
    for i in l1: # check that when dequeued they are lowest to highest [1,2,3...n]
        assert i == pq.dequeue()

print("ALL PASSED")

pq = PriorityQueue()
pq.enqueue(10)
pq.enqueue(2)
pq.enqueue(11)
pq.enqueue(4)
pq.enqueue(5)
pq.enqueue(3)
print(pq)

