'''program to print the following Pattern.
****
 ***
  **
   *'''

for i in range(5,1,-1):
    for j in range(5,1,-1):
        if(j>i):
            print(' ',end='')
        else:
            print('*', end='')
    print()
