# Olivanders Shop
Ollivander contrató a Dobbie para que le hiciese una app que gestionase el nuevo inventario, y tras los tristes aoontecimientos en los que se vió lamentablemente envuelto el pobrecico elfo, no tiene a nadie que pueda modificar el código para incluir nuevos productos
![dobby]("C:\Users\Raúl\Desktop\git")
Ha contratado a la consultora en la que trabajas para que adecúe la aplicación a las nuevas necesidades del inventario. Tu responsabilidad es refactorizar el código de acceso a datos, que ha dejado tiritando un ex-compañero que acaba de irse de España porque fuera le pagan por trabajar.
# Refactorización
Refactoriza el código para "sanear" la deuda técnica:
>En MEMORIA
['Backstage passes to a TAFKAL80ETC concert', =>' -25', =>' 0']
espacio en blanco más un elemento que no es integer. En el fichero ok, pero
en la capa de lógica habrá que incluir código para transformarlo, y eso
parece más una responsabilidad del código de acceso a datos.>
Lee el capítulo 13 del libro The Agile Samurai para comprender qué es y cómo puede pagarse y reducirse la deuda técnica.
Crea una rama para la refactorización hasta que el código pase los casos test.
La refactorización conduce a dos nuevas funciones, dos nuevas responsabilidades:
Transformar los string del fichero (fuente de datos) a integer para la capa de lógica.
Transformar los integer de memoria a string para volcarlos al fichero txt.
Estas funciones pueden vivir en un nuevo módulo dentro del componente Data Helpers / Utilities de la capa de acceso a datos.
MERGE de la rama refactorización con el master.
# Código
El código a documentar y refactorizar:
* https://mvpigs.slack.com/files/U796RMJQH/F87PSM7QA/codigo_acceso_a_datos_ollivander.py
* https://mvpigs.slack.com/files/U796RMJQH/F87Q485FC/casos_tets.txt
# Producto Final
* Un repositorio en tu GitHub con todas las funciones -tanto las que ya existen como las nuevas que programes- documentadas según PEP8.
* Contruye de nuevo el código de la capa de acceso a datos, intentando que sea SOLID y mantenga los estándares de calidad del código que hemos establecido en la empresa.
* El código ha de pasar los casos test, sobra decirlo
