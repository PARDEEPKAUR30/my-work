#program to print the table of any number till 20 entered by the user.

n=int(input('Enter an integer number to which you want to print the table:'))

print('Table for \'',n,'\' upto \'20\' is:')
for i in range(1,21):
    if i<10:
        print('0',end='')
    print(i,'*',n,'=',i*n)
