class Deque:
    def __init__(self):
        self.items = []

    def isEmpty(self):
        return self.items == []

    def addFront(self, item):
        self.items.append(item)

    def addRear(self, item):
        self.items.insert(0,item)

    def removeFront(self):
        return self.items.pop()

    def removeRear(self):
        return self.items.pop(0)

    def size(self):
        return len(self.items)

    def __str__(self):
        return str(self.items)

d=Deque()
print(d)
print(d.isEmpty())
d.addRear(4)
print(d)
d.addRear('dog')
print(d)
d.addFront('cat')
print(d)
d.addFront(True)
print(d)
print(d.size())
print(d.isEmpty())
d.addRear(8.4)
print(d)
print(d.removeRear())
print(d.removeFront())