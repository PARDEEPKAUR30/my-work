#method overriding
class Area:
    def area(self,s=1):
        a=s**2
        print('Area of Square is:',a)
class CircleArea(Area):
    pi=3.14
    def area(self,r=1):
        a=self.pi*r**2        # a=self.pi*self.r*self.r
        print('Area of Circle is:',a)  
c=CircleArea()
r=eval(input('Enter the radius of circle:'))
c.area(r)

