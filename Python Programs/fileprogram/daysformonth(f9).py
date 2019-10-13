'''Program to findout the no. of days corresponding to a perticular month
entered by the user'''

m=int(input('Enter any Integer value from 1-12 for month:'))
y=int(input('Enter a 4 digit value for year:'))

if m in(1,3,5,7,8,10,12):
    print('Given month has \'31 days\'.')
elif m==2:
    if y%4==0 and y%100==0 and y%400==0:
       print('Given month has \'29 days\'.')
    else:
        print('Given month has \'28 days\'.')
elif m in(4,6,9,11):
     print('Given month has \'30 days\'.')
else:
    print('You entered the wrong value. Please try again.')
     
    
    
    
