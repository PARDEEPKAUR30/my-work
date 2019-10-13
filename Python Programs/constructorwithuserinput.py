# WAP to display working of parameterize constuructor with default keyword

class Circle:
    p=0
    radius=0
    def __init__(self, r):
        self.p=3.14
        self.radius=r
    def area(self):
        a=self.p*self.radius**2
        print("Area of circle=",a)
radi=eval(input("Enter radius of circle:") )     
c=Circle(radi)
c.area()
