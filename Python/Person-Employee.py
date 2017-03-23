# UML:
# -------------------
# | Person          |
# -------------------
# | name:string     |
# | age:int         |
# -------------------
# | std constructor |
# | and __str__     |
# -------------------

class Person :
    def __init__(self,n,a):
        self.name = n
        self.age = a

    def __str__(self):
        return "%s age: %d" % \
        (self.name, self.age)

# UML:
#          |
#          V
# -------------------
# | Employee        |
# -------------------
# | payAmount:float |
# | hireDate:string |
# -------------------
# | std constructor |
# | and __str__     |
# -------------------

class Employee(Person):
    def __init__(self,n,a,pay,hire):
        super().__init__(n, a)
        self.payAmount = pay
        self.hireDate = hire
    def __str__(self):

        return super().__str__() + (" pay: %.2f, hire date: %s" \
        % (self.payAmount, self.hireDate))


def main():
    p1 = Person("Gerry Jenkins",26)
    p2 = Person("Mary Jones",32)
    print(p1)
    print(p2)

    e1 = Employee("Gerry Jenkins",26, 100000.0, "1/1/2000")
    print(e1)

main()

