#Program to find the difference between the ASCII code of any two character enter by the user

c1=input('Enter the first character: ')
c2=input('Enter the second character: ')
d=ord(c1)-ord(c2)
print('Difference between ASCII code of \"',c1,'\" and \"',c2,'\" is: \"',d,'\"')
