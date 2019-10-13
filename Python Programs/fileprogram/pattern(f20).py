'''program to print the following Pattern.
   *
  **
 ***
****'''

for i in range(4,0,-1):
    for j in range(1,5):
        if(j<i):
            print(' ',end='')
        else:
            print('*', end='')
    print()
            
                 
