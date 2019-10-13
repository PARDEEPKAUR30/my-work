# WAP to display working of parameterize constuructor

class Circle:
    p=0
    radius=0
    def __init__(self, r):
        self.p=3.14
        self.radius=r
    def area(self):
        a=self.p*self.radius**2
        print("Area of circle=",a)
c=Circle(10)
c.area()
        
