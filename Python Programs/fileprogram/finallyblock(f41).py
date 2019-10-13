#try except block
class Calculation:
    a=1
    b=1
    def __init__(self):
        self.a,self.b=int(input('Enter two positive integer values:a=')),int(input('b='))
    def division(self):
        try:
            d=self.a//self.b
            print('Division of ',self.a,' and ',self.b,' is: ',d)
        except ZeroDivisionError:
            print('Please enter more than 0 value for b')
        finally:
            print('You are in Finally Block')
c=Calculation()
c.division()
