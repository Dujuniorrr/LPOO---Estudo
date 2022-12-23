pay = 0
house = 1
quant = 1

while house <= 64:
     pay = pay + (house * quant)

     quant = quant * 2
     house = house + house

print(pay)