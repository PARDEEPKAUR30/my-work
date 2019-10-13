#WAP to call super class's method from child class.
class A:
    def display(self):
        print('In class A')
class B(A):
    def display(self):
        print('In class B')
class C(B):
    def display(self):
        print('In class C')
        super().display()
        A.display(self)
c1=C()
c1.display()
