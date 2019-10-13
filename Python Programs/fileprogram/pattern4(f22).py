'''program to print the following Pattern.
a
ab
abc
abcd'''


for i in range(1,5):
    c=97
    for j in range(0,i):
        print(chr(c),end='')
        c=c+1
        
    print()
