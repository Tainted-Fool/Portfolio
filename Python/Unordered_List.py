# from Text Book

class Node:
    def __init__(self,initdata):
        self.data = initdata
        self.next = None

    def getData(self):
        return self.data

    def getNext(self):
        return self.next

    def setData(self,newdata):
        self.data = newdata

    def setNext(self,newnext):
        self.next = newnext


class UnorderedList:
    def __init__(self):
        self.head = None

    def isEmpty(self):
        return self.head == None

    def add(self,item):
        temp = Node(item)
        temp.setNext(self.head)
        self.head = temp

    def size(self):
        current = self.head
        count = 0

        while current != None:
            count = count + 1
            current = current.getNext()

        return count

    def search(self,item):
        current = self.head
        found = False

        while current != None and not found:
            if current.getData() == item:
                found = True
            else:
                current = current.getNext()

        return found

    def remove(self,item):
        current = self.head
        previous = None
        found = False

        while not found:
            if current.getData() == item:
                found = True
            else:
                previous = current
                current = current.getNext()

        if previous == None:
            self.head = current.getNext()
        else:
            previous.setNext(current.getNext())

    def __str__(self): # return string with items
        current = self.head
        s = "[ "

        while current != None:
            s = s + str(current.getData())
            current = current.getNext()
            if current:
                s = s + ", "
        return s + " ]"

    _nodes = {} # dictinary to map node id to n1, n2, n2 to make reading dump easier
    _index = 1 # used to keep track of first n that is not used in node names

    def dump(self): # new version to name the nodes found n1, n2, etc.
        # instead of dumping raw id numbers

            def addr(x):
                if x is None:
                    return "None"
                else:
                    if id(x) in self._nodes:
                        return self._nodes[id(x)]
                    else:
                        self._nodes[id(x)] = "n%d"%(self._index)
                        self._index += 1
                        return self._nodes[id(x)]

            print ("  ","-"*20," DUMP of Deque ","-"*20)
            print ("    self.head: " , addr(self.head))
            node = self.head

            while node is not None:
                print ("\n     Node: ",addr(node))
                print ("         data: ",node.data)
                print ("         next: ",addr(node.next))
                node = node.next
            print( "  ", "-"*50)


l = UnorderedList()
l.add(1)
l.add('B')
l.add('C')
l.add('last')
print(l)
#l.dump()