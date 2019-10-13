# WAP in which make some private attributes

class Reet:
    x=5
    __y=10
    def add(self):
        print('x+y=',self.x+self.y)
    def display(self):
        print("x=",x)
        print('y=',y)
ob=Reet()
ob.add()
        

