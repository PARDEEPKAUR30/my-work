''' program to print the following pattern:
   *
  *_*
 *_*_*
*_*_*_*
'''
for r in range(4,0,-1):
    for c in range(1,5):
        if c<r:
            print(' ',end='')     
        else:
            print('* ',end='')             
    print()       
