# WAP for method overriding
class A:
    def display(self):
        print('In class A')
class B(A):
    def display(self):
        print('In class B')
class C(B):
    def display(self):
        print('In class C')
c1=C()
c1.display()
