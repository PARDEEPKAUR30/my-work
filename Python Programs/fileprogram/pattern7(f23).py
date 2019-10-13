''' program to print the following pattern:
    1
   121
  12321
 1234321
123454321 
'''

j=0
for r in range(6,0,-1):
    k=1
    i=11
    for c in range(1,10):
        if c<r or c>10-r:
            print(' ',end='')     
        else: 
            if c>=r and c<i-r:
                print(k,end='')
                k=k+1
                i=i-1
                j=k-2
            else:
                print(j,end='')
                j=j-1       
    print()       
