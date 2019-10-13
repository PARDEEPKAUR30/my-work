#program to generate a triangular number.

n=int(input('Enter an integer number:'))
count=2
sum=1
print('Frist \'',n,'\' Triangular numbers are:')
for i in range (1,n):
    if i<n:
        print(sum)
        sum=sum+count
        count=count+1
        
    

     
  
