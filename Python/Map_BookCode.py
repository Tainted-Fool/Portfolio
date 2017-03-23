
class HashTable:
    def __init__(self):
        self.size = 11
        self.slots = [list() for x in range(self.size)] #Hashtable
        self.data = [list() for x in range(self.size)]  #Values

    def put(self, key, data):
        hashvalue = self.hashfunction(key, len(self.slots))
        chainedData = self.data[hashvalue] #chainedData = list with data
        chainedSlots = self.slots[hashvalue] #chainedSlots = list with slots
        i = 0
        stop = False
        found = False

        if self.slots[hashvalue] == list():
            self.slots[hashvalue].append(key)
            self.data[hashvalue].append(data)
        else:
            while i < len(chainedSlots) and not stop:
                if chainedSlots[i] == key:
                    chainedData.append(data)
                    stop = True
                    found = True
                i = i + 1

            if found == False:
                chainedSlots.append(key)
                chainedData.append(data)

    def hashfunction(self, key, size):
         return key % size

    def get(self, key):
        startslot = self.hashfunction(key, len(self.slots))
        chainedData = self.data[startslot] #chainedData = list with data
        chainedSlots = self.slots[startslot] #chainedSlots = list with slots
        i = 0

        if self.slots[startslot] != list():
            while i < len(chainedSlots):
                if chainedSlots[i] == key:
                    return chainedData[i]
                i = i + 1
        else:
            return None

    def __getitem__(self, key):
        return self.get(key)

    def __setitem__(self, key, data):
        self.put(key, data)

## TEST FOR HashTable
h = HashTable() # create new hash table

nums = [1, 3, 5, 50, 1000] # some keys
nums = nums + [ len(h.slots)*i for i in range(20)] # some keys that have same hash
vals = vals = [ chr(x) for x in range(ord('A'),ord('Z')) ] # list of single letters from A to Z

# add key/values
for i in range(len(nums)):
    # print("adding (%d, %s)"%(nums[i],vals[i]),end=" ")
    h[nums[i]] = vals[i]

for i in range(len(nums)):
    key = nums[i]
    value = vals[i]
    gotValue = h[key]
    assert gotValue == value,"expected key: %d to lookup value: %s but got value %s instead " % (key, value, gotValue)

print("\nAll TESTS PASSED")
