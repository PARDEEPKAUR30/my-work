#default exception
class Calculation:
    a=1
    b=1
    def __init__(self):
        self.a,self.b=int(input('Enter two positive integer values: ')),int(input())
    def division(self):
        d=self.a//self.b
        print('Division of ',self.a,' and ',self.b,' is: ',d)
c=Calculation()
c.division()
    
