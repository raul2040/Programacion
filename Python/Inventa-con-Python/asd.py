import random
import time
 
def mostrarIntroduccion():
	print('Estas en una tierra llena de dragones. Frente a tí')
	print('hay dos cuevas. En una de ellas, el dragón es generoso y')
	print('amigable y compartirá su teosoro contigo. El otro dragon')
	print('es codicioso y está hambriento, y te devorará inmediatamente.')

def elegircueva():
	cueva = ''
	while cueva != '1' and cueva!='2':
		

def ElegirCueva():
	cueva= ''
	while cueva!= '1' and cueva !='2':
		print(' A qué cueva quieres entrar? (1 ó 2)')
		cueva = input()
	return cueva

def explorarCueva(cuevaElegida):
	print('Te aproximas a la cueva ... ')
	time.sleep(2)
	print('Es oscura y espeluznante ... ')
	time.sleep(2)
	print('¡Un gran dragon aparece súbitamente fren a tí! Abre sus fauces ... ')
	print()
	time.sleep(2)
