#Program to implement the Pythagoras Theorem

import math
b=eval(input('Enter the value for the base of the triangle: '))
p=eval(input('Enter the value for the perpendicular of the triangle: '))
h=math.sqrt(b*b+p*p)
print('Hypotenous=',format(h,'.2f'))
