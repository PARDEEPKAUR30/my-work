# WAP to display working of parameterize constuructor with default keyword

class Circle:
    p=0
    radius=0
    def __init__(self, r=5):
        self.p=3.14
        self.radius=r
    def area(self):
        a=self.p*self.radius**2
        print("Area of circle=",a)
c=Circle()
c.area()
