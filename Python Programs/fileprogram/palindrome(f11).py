#program to tell the no. enter by the user is palindrome or not.

n=int(input('Enter any Integer number:'))
num=n
rev=0
while num>0:
    rev=rev*10+num%10
    num=num//10
if(n==rev):
    print('Given number \'',n,'\' is a palindrome number.')
else:
    print('Given number \'',n,'\' is not a palindrome number.')
    
