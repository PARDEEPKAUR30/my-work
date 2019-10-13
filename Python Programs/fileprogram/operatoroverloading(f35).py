# Operator overloading
class RelationalOper:
    def __init__(self,x):
        self.x=x
    def __lt__(self,other):
        if(self.x<other.x):
            return self.x
        else:
            return other.x
    def __ge__(self,other):
        if(self.x>=other.x):
            return self.x
        else:
            return other.x
        
ob1= RelationalOper(10)
ob2=RelationalOper(11)
ob3=ob1<ob2
ob4=ob1>=ob2
print("Small value is",ob3)
print("Greater or equalto value is",ob4)

       
        
