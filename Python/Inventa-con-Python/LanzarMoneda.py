
import random
print ('Lanzaré una moneda 1000 veces. Adivina cuantas veces caerá Cara o cruz') 
print ('Presiona enter para comenzar')
input()
lanzamientos = 0
caras = 0
cruz = 1
while lanzamientos <1100:
    if random.randint(0,1) == 1:
        caras = caras + 1
    if random.randint(0,1) == 0:
        cruz = cruz + 1
    lanzamientos = lanzamientos + 1

    if lanzamientos == 1000:
        print('1000 lanzamientos y hubo '+ str(caras) + ' caras ' + 'y ' + str(cruz) + ' cruzes')
print ('¿Estuviste cerca?')

    