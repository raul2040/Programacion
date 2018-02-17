#este programa saluda y pregunta por mi nombre.
print("hola,bienvenido")
print ("¿Como te llamas?")
miNombre = input()
print("es un placer conocerte,"+ miNombre)
print("¿como estas?")
estado = input()
#Según el estado de animo que tengamos nos devolvera una cosa u otra
if estado == ("bien"):
        print("me alegro de que estes bien, recuerda que la vida puede ser maravillosa.")
else:
        print ("Un mal día no es una mala vida")
print("¿Que edad tienes " + miNombre + "?")
edad = input()
if edad >= ("18"):
    print("CARAMBA "+ miNombre + ", bien eres mayor de edad, ya puedes comprar alcohol legalmente")
else:
    print("¡Aun eres menor de edad!, ¿te piden el dni al entrar a las discotecas?snif,snif")
    
