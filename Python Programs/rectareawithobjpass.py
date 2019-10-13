#WAP to calculate the area of a rectangle by passing an object as parameters to method.

class Rectangle:
    l=0
    b=0
    def __init__(self,x,y):
        self.l=x
        self.b=y
    def area (self,obj):
        a=obj.l*obj.b
        return a
r=Rectangle(10,20)
z=r.area(r)
print("Area of Rectangle is: ",z)
    
