'''A bag contains % white balls and 3 black balls and 2 balls are drawn at
random. What is the probability that both are of the same color.
case:i) 5 white, 3 black balls fixed value by programmer.
case:ii) take value of white and black balls from user.'''

white=5
black=3
drawn=2
total=white+black
probability=drawn/total
print('Proabability for both are white balls is:',white*probability)
print('Proabability for both are black balls is:',black*probability)

white=int(input('Enter no. of white balls: '))
balck=int(input('Enter no. of black balls: '))
total=white+black
probability=drawn/total
print('Proabability for both are white balls is:',white*probability)
print('Proabability for both are black balls is:',black*probability)
