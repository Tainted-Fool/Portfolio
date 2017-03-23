from pythonds.basic.stack import Stack

def isfloat(value):             #Create an isfloat method to check for floats
    try:
        float(value)
        return True
    except ValueError:
        return False

def infixToPostfix(infixexpr):  # fix this code to do floats
    prec = {}
    prec["*"] = 3
    prec["/"] = 3
    prec["+"] = 2
    prec["-"] = 2
    prec["("] = 1
    opStack = Stack()
    postfixList = []
    tokenList = infixexpr.split()
    alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"

    for token in tokenList:
        if token in alphabet:
            postfixList.append(token)
        elif isfloat(token):
            postfixList.append(token)
        elif token == '(':
            opStack.push(token)
        elif token == ')':
            topToken = opStack.pop()
            while topToken != '(':
                postfixList.append(topToken)
                topToken = opStack.pop()
        else:
            while (not opStack.isEmpty()) and \
               (prec[opStack.peek()] >= prec[token]):
                  postfixList.append(opStack.pop())
            opStack.push(token)

    while not opStack.isEmpty():
        postfixList.append(opStack.pop())
    return " ".join(postfixList)

def postfixEval(postfixexpr):  # also fix this to do floats
    operandStack = Stack()
    tokenList = postfixexpr.split()

    for token in tokenList:
        if isfloat(token):
            operandStack.push(float(token))
        else:
            operand2 = operandStack.pop()
            operand1 = operandStack.pop()
            result = doMath(token,operand1,operand2)
            operandStack.push(result)
    return operandStack.pop()

def doMath(op, op1, op2):
    if op == "*":
        return op1 * op2
    elif op == "/":
        return op1 / op2
    elif op == "+":
        return op1 + op2
    else:
        return op1 - op2

def eval_infix(s):
    expression = infixToPostfix(s)
    evaluation = postfixEval(expression)
    return evaluation



### Keep all this code AS-IS, do not modify
###   This code runs a unit test and will report errors
###   when it detects your result is different than the expected result
###
### do not modify the following, if you get an error, it is in
### your code

import math

import unittest
class TestEvalInfix(unittest.TestCase):

    def setUp(self):
        self.tests = tests = (
            "1", "1 + 2", "3 * 2 + 1", "1 + 2 * 3",
            "( 0.5 + 1.5 + 2.0 )", "( 2.0 * 3 ) - 1",
            "( 1.0 - .5 ) * ( 2.5 / .5 )", "( 1 ) * ( .33333333 ) * ( 3.00000 )"
        )

    def test_expressions(self):
        for expression in self.tests:
            print("Testing expression '%s'" % (expression))
            expected = eval(expression)
            got = eval_infix(expression)
            self.assertAlmostEqual(got, expected, "got: "+ str(got) + " expect: " + str(expected))
#                             "Expression '%s' resulted in value %.4f, expected value was %.4f" %
#                             (expression,got,expected) )

if __name__ == '__main__':
    print("STARTING TESTS")
    unittest.main()

