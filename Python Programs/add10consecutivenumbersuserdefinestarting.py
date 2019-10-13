''' Program to add 10 consecutive number using while loop
 take begining number from user'''

sum=0
n=int(input('Enter an Integer number from which you want to find sum of 10 consecutive numbers:'))
count=n
while count<n+10:
    sum=sum+count
    count=count+1
print('Sum of cosecutive numbers from ',n,'-',n+9,'=',sum)    
