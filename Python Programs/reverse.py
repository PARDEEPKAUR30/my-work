#Program that prints the reverse of any given number.

n=int(input('Enter an Interger number to which you want to find the reverse:'))
count=n
r=0
while count>0:
    r=r*10+count%10
    count=count//10
print('Reverse of',n,'is: ',r)    
