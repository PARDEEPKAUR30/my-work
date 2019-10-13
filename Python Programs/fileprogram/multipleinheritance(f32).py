# multiple inheritance
class Area:
    a=0
    def area(self,l,w):
        self.a=l*w
        return self.a
class Volume:
    v=0
    def volume (self,l,w,h):
        self.v=l*w*h
        return self.v
class Rectangle(Area,Volume):
    l=0
    w=0
    h=0
    def takeInput(self):
        self.l=eval(input('Enter Length:'))
        self.w=eval(input('Enter Width:'))
        self.h=eval(input('Enter Height:'))
    def values(self):
        return self.l,self.w,self.h
    
    
r=Rectangle()
r.takeInput()
l1,w1,h1=r.values()
print('Length of Rectangle is: ',l1)
print('Width of Rectangle is: ',w1)
print('Height of Rectangle is: ',h1)
ar=r.area(l1,w1)
vo=r.volume(l1,w1,h1)
print('Area of Rectangle is: ',ar)
print('Volume of Rectangle is: ',vo)


    

    
        
