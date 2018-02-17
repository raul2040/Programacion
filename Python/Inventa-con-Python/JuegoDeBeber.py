#He creado un minijuego que consite en que adivines mi numero e,e
import random

intentosRealizados = 0

print('¡Hola! ¿Cómo te llamas?')
miNombre = input()
miNombre = (miNombre.lower())
if miNombre == ("alicia"):
    print("¿Te encontré en la basura?")
elif miNombre == ("pram"):
    print("vaya, mira quien tenemos por aquí el fiestero nº1 de España")
elif miNombre == ("raul"):
    print("hola mi amo todo poderoso, guapo hermoso, PAPASITO")
elif miNombre == ("papotico"):
    print ("Bienvenida mi papotico, guapa, maziza, e,e")
elif miNombre == ("noe"):
    print ("Vaya ha venido el tio del arca, ¿donde te has dejado el arca amarrada tronco?")
elif miNombre == ("victor"):
    print("vaya vaya, el pesado de clase")
elif miNombre == ("jose"):
    print("el terminator de la programacion, el leo messi de python")
    
número = random.randint(1, 10)
print('¿Estas preparado ' + miNombre + ' ?')
Estado = input()
if Estado == ("si"):
    
        print('pues como díria jack el destripador, vamos por partes')
elif Estado == ("tal vez"):
        print(' Mi madre me dijo que no jugara con fuego y fuego se quedo sin amigos. NO quieras ser como fuego, vamos  a jugar YA')
elif  Estado == ("no"):
        print('vaya... '+ miNombre + ' quieres que llame a tu mama?')
else:
        print('me da igual lo que quieras, vamos a jugar igual, eso dice mi madre, que esta MUERTAAAAAAAAAA')
        
print('Bueno, ' + miNombre + ', estoy pensando en un número entre 1 y 10 tienes tres oportunidades.')

while intentosRealizados < 3:
    print('Intenta Adivinarlo.')
    estimación = input()
    estimación = int(estimación)

    intentosRealizados = intentosRealizados + 1

    if estimación < número:
        print('Piensa en un número más alto')
    if estimación > número:
        print('Piensa en un número más bajo')
        
if estimación == número:
    intentosRealizados = str(intentosRealizados)
    print('¡Buen trabajo, ' + miNombre + '! ¡ Has adivinado mi número en ' +
          intentosRealizados + ' intentos!' + 'te has salvado de beberte un chupito :O')

if estimación != número:
        número = str(número)
        print('te has quedado sin oportunidades, el número que tenía en mente era ' + número + ' por lo tanto te toca beberte un CHUPITO, SUUUUUUUHHH')

print('bueno...¿te parece que te cuente un chiste mientras te emborracho?')
respuesta = input()
print(respuesta.lower())
ChistesMalos = ['¿Cómo se dice suegra en ruso? Storvo', 'Mamá, mamá, en el cole me tiran migas de pan. -No les hagas caso, Paloma','¿Por qué en el circo las focas miran siempre hacia arriba?.Porque arriba están los focos.','¿Cómo se dice papel higiénico en japonés?-Yoshikito Kakita','Oye,¿viste el señor de los anillos? - Síi, pero no le compré nada']
if respuesta == ('si'):
    print (random.choice(ChistesMalos))
else:
    print ('eres adoptado ' + miNombre + ' no te lo quería decir :/')




