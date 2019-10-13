'''program that calculate the area of a circle and using format function
to display the result'''
radius=eval(input('Enter the radius of the circle:'))
pi=3.14
area=pi*radius*radius
print('Area of circle without using formating function is:',area)

print("\nFloat Formatting:")
print('Area of circle with using formating function that diplay output with upto "3 numbers after decimal point" is:',format(area,'.2f'))
print('Area of circle with using formating function that dispaly output with "10 nunmbers before decimal point" is:',format(area,'10.2f'))
print('Area of circle with using formating function that dispaly output with "left justify" is:',format(area,'<10.2f'))

area=int(area)
print('\nArea of circle without using formating function is:',area)
print("Integer Formatting:")
print('Area of circle with using formating function that diplay output with "Hexadecimal Formatting" is:',format(area,'7x'))
print('Area of circle with using formating function that diplay output with "Octal Formatting" is:',format(area,'7o'))
print('Area of circle with using formating function that diplay output with "Decimal Formatting" is:',format(area,'7d'))
print('Area of circle with using formating function that dispaly output with "left justify" is:',format(area,'<7x'))
print('Area of circle with using formating function that dispaly output with "with format \'7\'" is:',format(area,'7'))
