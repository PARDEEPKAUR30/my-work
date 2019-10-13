# WAP for multilevel inheritance
class A:
    name=' '
    age=0
class B(A):
    height=' '
class C(B):
    weight=' '
    def read(self):
        print('Enter the values for name, age, height and weight: ')
        self.name=input('Enter Name:')
        self.name=int(input('Enter Age:'))
        self.name=input('Enter Height:')
        self.name=eval(input('Enter Weight:'))
    def display(self):
        print('Entered values are:')
        print(self.name,'\n', self.age,'\n',self.height,'\n',self.weight)
c1=C()
c1.read()
c1.display()
