#program to tell the no. enter by the user is armstrong or not.

n=int(input('Enter any Integer number:'))
num=n
sum=0
while num>0:
    rem=num%10
    sum=sum+rem*rem*rem
    num=num//10
if(n==sum):
    print('Given number \'',n,'\' is an armstrong number.')
else:
    print('Given number \'',n,'\' is not an armstrong number.')
