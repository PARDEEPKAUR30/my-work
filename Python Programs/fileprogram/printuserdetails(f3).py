'''Program that display the name,age,gender and height of user. Using eval function where
neccessary or required'''
name=input('Enter your name: ')
age=int(input('Enter your age: '))
gender=input('Enter your gender: ')
height=eval(input('Enter your height: '))
print(name,'\nYour age is \"',age,'\"\nYour gender is \"',gender,'\"\nAnd your height is \"',height,'\"')
