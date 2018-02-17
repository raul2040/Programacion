
def accesoCasosTexttest(matrizCasosTest, rutaAccesoFichero):
    """ La función recibe como parametros dos atributos,(string, string)
        Comprueba que la (rutaAccesoFichero) sea una tring, en caso contrario devuelve un raise definido por nosotros como ValueError.
        En el caso de que si sea una string, se abrira el archivo en modo lectura.
        Si cuando se abre la ruta de acceso no encuentra el fichero, lanzará una excepción ("Fichero no encontrado").
        Si el fichero no es una string nos lanzará una excepcion que nos dice ("El nombre del fichero ha de ser un string")
        
        Si no se lanza ninguna excepció continuaremos al siguiente bloque de código.
        Aquí se crea una lista llamada (matrizCasosTest) y asigna un valor a una variable llamada (numeroPropiedadesItem).
        Luego utilizamos un for para recorrer el fichero linea a linea.
        Hacemos un if que busca la string ("day") sino esta en la posición -1 crea una lista llamada(casosTestDia).
        En  el caso de que encuentre un salto de linea, añade (casosTestDia)
        Si encuentra la string ("name") sino esta en la posición -1 le asigna a (numeroPropiedasItem) el numero de elementos que contiene separados por ","
        Sino se cumple ninguna de las condiciones anteriores, a item le asignamos los valores de la derecha, separados por una "," hasta que 
        encuentre el numero maximo de propiedades de item que son 3.
        Cuando esto ha finalizado,cierra el fichero y devuelve la lista (matrizCasosTest)
      """

    try:
        if type(rutaAccesoFichero) != str:
            raise ValueError
        fichero = open(rutaAccesoFichero, 'r')
    except FileNotFoundError:
        print("Fichero no encontrado")
        return []
    except ValueError:
        print("El nombre del fichero ha de ser un string")
        return []
    else:
        matrizCasosTest = []
        numeroPropiedadesItem = 0
        for linea in fichero:
            if linea.find("day") != -1:
                casosTestDia = []
            elif linea == "\n":
                matrizCasosTest.append(casosTestDia)
            elif linea.find("name") != -1:
                numeroPropiedadesItem = len(linea.split(','))
            else:
                item = linea.rstrip().rsplit(',', maxsplit=numeroPropiedadesItem - 1)
                casosTestDia.append(item)
                for item in casosTestDia:
                        item = 0
                    if type(item) == str:
                        return str
                    else: 
                        return int
        fichero.close()
        return matrizCasosTest


def crearFicheroCasosTest(ficheroVolcadoCasosTest, matrizCasosTest):
    
    """ La función crearFicherosCasosTest recibe dos parametros como atributos que son de tipo (string, lista).
        Primero comprueba que (ficheroVolcadoCasosTest) sea una string en caso contrario lanza un mensaje de (ValueError).
        Si es un string el fichero se abre en modo escritura, y recibe los atributos de (ficheroVolcadoCasosTest)
        Si la ruta de acceso al fichero no es un string lanza una expceción (ValueError)
        
        Seguimos hasta el bloque else el cual recorre la lista (matrizCasosTest)
        Se abre el fichero en modo escritura y se crea un encabezado con una estructura similar a esta (----- dia 1 ----- /n)
        Cuando se ha creado el encabezado, recorre la lista (casosTestDia) y lo abre en modo escritura, se añaden los elementos 
        separados por comas y un salto de linea.

        Luego se cierra el fichero.

    """

    try:
        if not isinstance(ficheroVolcadoCasosTest, str):
            raise ValueError
        stdout = open(ficheroVolcadoCasosTest, 'w')
    except ValueError:
            print("La ruta de acceso al fichero ha de ser un string")
    else:
        for (offset, casosTestDia) in enumerate(matrizCasosTest):
            stdout.write('-' * 5 + " Dia %d: " % offset + '-' * 5 + '\n')
            for item in casosTestDia:
                stdout.write(','.join(item) + '\n')
        stdout.close()


def mostrarCasosTest(matrizCasosTest):
     """Matriz con los elementos de la tienda separados por "," 
        recorremos la lista e imprime en pantalla la siguiente estructura (-----dia-----)
        por cada elemento que encuentra en (casosTestDia) imprime el elemento en pantalla """

for (offset, casosTestDia) in enumerate(matrizCasosTest):
     print('-' * 5 + " Dia %d: " % offset + '-' * 5)
     for item in casosTestDia:
        print(item)


if __name__ == "__main__":
    """ Se inicia una lista llamada (matrizCasosTest) donde se almacenaran las matrices
        Luego (matrizCasosTest) llama a la función accesoCasosTexttest con los parametros siguientes(matrizCasosTest, rutaAccesoFichero
        Luego llamamos a la función (mostrarCasosTest), que contiene los casos test.
        Finalmente llamamos a la función (crearFicheroCasosTest) que recibe dos parametros (ficheroVolcadoCasosTest) y (matrizCasosTest)
        Esto dará como resultado un fichero nuevo"""

    rutaAccesoFichero = "./stdout.gr"
    # rutaAccesoFichero = "stdout_bug_conjured.gr"

    matrizCasosTest = []

    matrizCasosTest = accesoCasosTexttest(matrizCasosTest, rutaAccesoFichero)

    mostrarCasosTest(matrizCasosTest)

    ficheroVolcadoCasosTest = "./stdout.txt"

    crearFicheroCasosTest(ficheroVolcadoCasosTest, matrizCasosTest)
