#WAP to dispaly working of destructor
class Rect:
    l=0
    b=0
    def __init__(self,x,y):
        self.l=x
        self.b=y
    def area(self):
        a=self.l*self.b
        return a
    def __del__(self):
        print('Destructor executed')
r1=Rect(10,20)
print('Area of Rectangle: ',r1.area())
r2=r1
r3=r2
print(id (r1))
print(id (r2))
del r1
del r2
del r3
