''' program to print the following pattern:
*_*_*_*
 *_*_*
  *_*
   *'''
for r in range(1,5):
    for c in range(1,8):
        if c>=r and c<9-r:
            if (r%2==0 and c%2==0) or(r%2!=0 and c%2!=0):
                print('*',end='')
            else:
                print('_',end='')       
        else:
            print(' ',end='')     
    print()       
