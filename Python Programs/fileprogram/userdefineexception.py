#user define exception
class Enter(Exception):
    def value(self):
        v=int(input('Enter a value that is greater than 10:'))
        if v>10:
            print('You entered the value:',v)
        else:
            raise LessValue()    
e=Enter()
try:
    e.value()
except LessValue:
    print('You should enter the value that is greater than 10')

