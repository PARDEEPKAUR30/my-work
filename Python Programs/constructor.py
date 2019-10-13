#WAP that dispaly working of constructor

class Rectangle:
    l=0
    b=0
    def __init__(self):
        self.l=10
        self.b=20
    def area(self):
        a=self.l*self.b
        return a
ob=Rectangle()
area=ob.area()
print(area)
    
