#WAP for hybrid inheritance
class A:
    a=0
    def display(self):
        print('a=',self.a)
class B:
    a=0
    b=0
    def display(self):
        print('a=',self.a)
        print('b=',self.b)
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
class D(C):
    d=0
    def read(self):
        self.d=eval(input('Enter value for d:'))
    def display(self):
        print('a=',self.a)
        print('b=',self.b)
        print('c=',self.c)
        print('d=',self.d)
a1=A()
b1=B()
c1=C()
d1=D()
c1.read()
c1.display()
a1.display()
b1.display()
d1.read()
d1.display()
