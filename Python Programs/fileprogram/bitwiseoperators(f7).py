'''Program that inputs two numbers define by the user and display the result
for the following Bitwise Opertaors:1. &
2.!
3.~
4.^
5.>>
6.<<'''

a=int(input('Enter an integer number: '))
b=int(input('Enter an integer number again: '))
print('Output of applying \"&\" operator on \"',a,'\" and \"',b,'\" is: ',a&b)
print('Output of applying \"!\" operator on \"',a,'\" and \"',b,'\" is: ',a|b)
print('Output of applying \"~\" operator on \"',a,'\" is: ',~a)
print('Output of applying \"^\" operator on \"',a,'\" and \"',b,'\" is: ',a^b)
print('Output of applying \">>\" operator on \"',a,'\" is: ',a>>2)
print('Output of applying \"<<\" operator on \"',a,'\" is: ',a<<2)
