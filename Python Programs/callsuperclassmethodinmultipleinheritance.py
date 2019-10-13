class Z:
    def display(self):
        print('In class Z')
class A(Z):
    def display(self):
        print('In class A')
        Z.display(self)
class B(Z):
    def display(self):
        print('In class B')
        Z.display(self)
class C(A,B):
    def display(self):
        print('In class C')
        A.display(self)
        B.display(self)
c1=C()
c1.display()
