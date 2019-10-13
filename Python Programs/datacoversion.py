s='12'
#oct=O010
#hex=OxA
print('type function on\"',s,'\"before coversion of data type:',type(s))

s=int(s)
print('type function on\"',s,'\"after coversion of data type into integer:',type(s))
#print('type function on octal value\'',o,'\':',type(oct))
#print('type function on hexadecimal value\'',o,'\':',type(hex))

s=float(s)
print('type function on\"',s,'\"after coversion of data type into float:',type(s))

f=4.78
f1=2.34e2
print('\nfloat values:',f)
print(f1)
print('type function on float values',type(f))
print(type(f1))
print('if variable f assign float value in scientific notation: value of f is:',f1)

c=10+5j
print('\ncomplex value:',c)
print('type function on complex value',type(c))

b=True
print('\nboolean value:',b)
print('type function on boolean value',type(b))

str='h'
print('\nstring value:',str)
print('type function on boolean value',type(str))

#sc=str(10.24)
#print('\n type function on float value after conversion in string value:',type(sc))
str=str+'ello'
print('\nstring after concatination:',str)
