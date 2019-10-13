#program to print odd numbers in the range specified by the user

s=int(input('Enter staring value for range:'))
e=int(input('Enter ending value for range:'))
print('Odd numbers between ',s,'-',e,' are:')
for i in range(s,e):
    if i%2!=0:
        print(i)
