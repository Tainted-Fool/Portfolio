def reverse(data):
    if len(data) == 0:
        return []
    else:                                                   #slice syntax [begin:end:step]
        return reverse(data[1:]) + data[:1]                 #[:1] takes the first, [1:] takes the rest (just like book example but backwards)

def recursive(n):

    if n == 1:
        return 1
    return n * recursive(n-1)

def again(i):
    print("+")
    if i < 0:
        return 0
    return again(i-3) * 4 + 2

again(10)

print("this is answer", recursive(4))

print(reverse([1, 2, 'middle', 10, 12, "end"]))

assert reverse([1, 2, 3]) == [3, 2, 1]
assert reverse(["a", "b"]) == ["b", "a"]
assert reverse(list(range(1, 101))) == list(range(100, 0, -1))

#examples
print("\nThese are example of slices")
rev = [1, 2, 'middle']
print(rev[1:])
print(rev[:1])
