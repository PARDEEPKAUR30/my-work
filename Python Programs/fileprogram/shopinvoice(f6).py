'''Program that calculate an invoice of a shop that specifying GST at center &
state level(CGST & SGST) and the total cost of the product'''

cost=eval(input('Enter the cost of the item: '))
print('-----------------------------------------------------------------------------')
print(format('INVOICE','>190s'),'\n')
print('Item',end='')
print(format(cost,'50.2f'),'/-')
print('CGST@5%',end='')
cgst=(5/100)*cost
print(format(cgst,'47.2f'),'/-')
print('SGST@5%',end='')
sgst=(5/100)*cost
print(format(sgst,'47.2f'),'/-')
print('-----------------------------------------------------------------------------')
print('Total',end='')
total=cost+cgst+sgst
print(format(total,'49.2f'),'/-')


