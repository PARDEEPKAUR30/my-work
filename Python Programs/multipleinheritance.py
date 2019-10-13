#WAP for multiple inheritance
class A:
    a=0
class B:
    b=0
class C(A,B):
    c=0
    def read(self):
        print('Enter the values:')
        self.a=eval(input('Enter value for a:'))
        self.b=eval(input('Enter value for b:'))
        self.c=eval(input('Enter value for c:'))
    def display(self):
        print('a=',self.a)
        print('b=',self.b)
        print('c=',self.c)
c1=C()
c1.read()
c1.display()
        
    
    
