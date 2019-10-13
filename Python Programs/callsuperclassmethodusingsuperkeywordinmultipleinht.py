class Z:
    def display(self):
        print('In class Z')
class A(Z):
    def display(self):
        print('In class A')
        super().display()
class B(Z):
    def display(self):
        print('In class B')
        super().display()
class C(A,B):
    def display(self):
        print('In class C')
        A.display(self)
        B.display(self)
c1=C()
c1.display()
