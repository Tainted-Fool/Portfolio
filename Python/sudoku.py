def cint(s):
    ''' helper to convert strings in constructor of Sudoku '''
    if s == ' ':
        return None
    else:
        return int(s)


class Sudoku:

    def __init__(self,rows):
        ''' takes list of 9 strings, each with len of 9 of space or digit '''
        self.board = []
        for i in range(9):
            self.board.append( [cint(x) for x in list(rows[i])] )
        self.empties = self.empty_list()

    def __str__(self):
        ''' return board formated for console '''
        s = ""
        for r in range(9):
            if r % 3 == 0:
                s += "+=========+=========+=========+\n"
            for c in range(9):
                if c % 3 == 0:
                    s += "|"
                x = self.board[r][c]
                if x is None:
                    s += " . "
                else:
                    s += " %d " % x
            s += "|\n"
        s += "+=========+=========+=========+\n"
        return s

    def empty_list(self):
        ''' find list of empty cells in (r,c) form '''
        elist = []
        for r in range(9):
            for c in range(9):
                if self.board[r][c] is None:
                    elist.append((r,c))
        return elist


    def local_set(self,cell):
        ''' return set of number in local block of cell'''
        r,c = cell
        r0 = r - ( r % 3)
        c0 = c - ( c % 3)
        s = set()
        for r in range(r0,r0+3):
            for c in range( c0, c0+3):
                x = self.board[r][c]
                if x is not None:
                    s.add(x)
        return s

    def row_set(self,cell):
        ''' return set of number in row of cell'''
        r0,c0 = cell
        s = set()
        for c in range(9):
                x = self.board[r0][c]
                if x is not None:
                    s.add(x)
        return s

    def column_set(self,cell):
        ''' return set of number in column of cell'''
        r0,c0 = cell
        s = set()
        for r in range(9):
            x = self.board[r][c0]
            if x is not None:
                s.add(x)
        return s


    def possible_for_cell(self,cell):
        ''' return list of pairs for open cell  '''
        return set(range(1,10)) - self.local_set(cell) - self.row_set(cell) - self.column_set(cell)

    def solve(self):
        ''' recursive solve, return when solution, or raise error
            try each cell combo, back out by clearing cell to none and return
            unless solve, then keep filled board.
        '''

        if len(self.empties) == 0:
            print("FOUND SOLUTION")
            print(self)
            return True

        r,c = self.empties.pop()
        to_try = self.possible_for_cell((r,c))
        if len(to_try) == 0:
            # can't succeed, no number possible
            self.empties.append((r,c))
            self.board[r][c] = None
            return False;

        for n in to_try:
                self.board[r][c] = n
                if self.solve():
                    return True; # found number for cell r,c
                    
		# failed if we got here
        self.empties.append((r,c)) # add failed try cell back to empties
        self.board[r][c] = None # clear last try from it
        return False;
        
        
##----------- solve a soduku puzzle:
import time

rows = [
    "   3  7  ",
    "   91  32",
    "     26  ",
    " 7 6  4  ",
    " 6  5  7 ",
    "  5  3 6 ",
    "  18     ",
    "78  46   ",
    "  3  1   ",


    ]
s = Sudoku(rows)
print(s)

#for r in range(9):
#    for c in range(9):
#        print("cell:", (r+1,c+1), "  try:", s.possible_for_cell((r,c)))

start = time.clock()
s.solve()
t = time.clock()-start
print( '(%.2f seconds)\n' % t )
