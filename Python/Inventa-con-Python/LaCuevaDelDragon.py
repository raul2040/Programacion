import random
import time

print('Si has osado venir hasta aquí, por lo menos dime tu nombre.')
miNombre = input()
def mostrarIntroducción():
        print('Hola ' + miNombre + ' Bienvenido, a dragolandia')
        time.sleep(2)
        print('Estas en una tierra llena de dragones. Frente a tí')
        time.sleep(3)
        print('hay dos cuevas. En una de ellas, el dragón es ...')
        time.sleep(3)
        print('amigable y compartirá su tesoro contigo. El otro dragon es ...')
        time.sleep(3)
        print('codicioso y está hambriento, y te devorará inmediatamente.')
        time.sleep(3)
        print()


def elegirCueva():
        cueva = ''
        while cueva != '1' and cueva != '2':
                print('¿A qué cueva quieres entrar?(1 ó 2)')
                cueva = input()
        return cueva


def explorarCueva(cuevaElegida):
        print('Te aproximas a la cueva ... ')
        time.sleep(2)
        print('Es oscura y espeluznante ... ')
        time.sleep(2)
        print('¡Un gran dragon aparece súbitamente frente a tí! Abre sus fauces... Y ...')
        print()
        time.sleep(4)

        cuevaAmigable = random.randint(1, 2)

        if cuevaElegida == str(cuevaAmigable):
                print ('¡Te regala su tesoro!')
        else:
                print('Te engulle de un bocado!')

jugarDeNuevo = 'si'
while jugarDeNuevo =='si' or jugarDeNuevo == 's':

              mostrarIntroducción()

              numeroDeCueva = elegirCueva()

              explorarCueva(numeroDeCueva)

              print('¿Quieres jugar de nuevo? (si o no)')
              jugarDeNuevo = input()
