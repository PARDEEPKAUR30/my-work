''' WAP to calculate the area of the rectangle by assigning the value of the
attributes of rectangle i.e. length and breath.'''

class Rectangle:
    length=0
    breath=0
    def area(s):
        a=s.length*s.breath
        print("Area of the rectangle is:",a)
r1=Rectangle()
r1.length=5
r1.breath=10
r1.area()
