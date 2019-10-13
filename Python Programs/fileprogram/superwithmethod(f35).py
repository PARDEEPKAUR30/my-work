#super keyword with constructor
class Operation:
    _a=0
    _b=0
    def setValues(self):
        self.a,self.b=int(input('Enter positive integer value for a and b:')),int(input())
        return self.a,self.b
class ArithOper(Operation):
    x=0
    y=0
    def takeValues(self):
        self.x,self.y=super().setValues()
    def add(self):
        ad= self.x+self.y
        print(self.x,'+',self.y,'=',ad)       
obj=ArithOper()
obj.takeValues()
obj.add()
