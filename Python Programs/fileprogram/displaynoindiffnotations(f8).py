'''Program that takes input as decimal number from user and display the number
in following notations:
1. octal
2. hexadecimal
3. scientific
4. binary'''

n=int(input('Enter any decimal number: '))
print('The given number display in Octal notation: ',format(n,'o'))
print('The given number display in Hexadecimal notation: ',format(n,'x'))
print('The given number display in Scientific notation: ',format(n,'e'))
print('The given number display in binary notation: ',format(n,'b'))
