''' program to print the following pattern:
   *
  *_*
 *_*_*
*_*_*_*
'''
for r in range(4,0,-1):
    for c in range(1,8):
        if c<r or c>8-r:
            print(' ',end='')     
        else:
             if(r%2==0 and c%2==0) or (r%2!=0 and c%2!=0):
                  print('*',end='') 
             else:
                 print('_',end='')             
    print()       
