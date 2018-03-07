Está kata esta basada en el juego de dados Yatzy que es la versión libre de Yahtzee, que tiene un equivalente en hispanoamérica llamado Generala.
En casa, antes del kata del jueves
Lee las reglas del juego aquí Yatzy (en inglés), o aquí Generala (en castellano) o aquí README.MD.
Clona mi repo Python_ejercicios en Github si no lo has hecho antes. Si ya lo has clonado a un directorio de tu máquina, sitúate en dicho directorio y haz un git pull para hacerte con el código con el que trabajaremos (lo pongo en Slack también): https://github.com/dfleta/Python_ejercicios/tree/master/Poo/Yatzy_Refactoring_TDD_Kata
Podéis clonar el repo de Emily Bache y así tenéis el kata en todos los lenguajes:
https://github.com/emilybache/Yatzy-Refactoring-Kata
Instala el módulo Pytest siguiendo las instrucciones proporcionadas en: http://doc.pytest.org/en/latest/getting-started.html Si el comando pip no funciona en tu máquina, necesitarás instalar el gestor de módulos de Python pip. Sigue las instrucciones proporcionadas en cualquiera de estos sitios:
https://pip.pypa.io/en/stable/installing/
http://recursospython.com/guias-y-manuales/instalacion-y-utilizacion-de-pip-en-windows-linux-y-os-x/
http://diegorys.es/2016/09/01/como-instalar-el-gestor-de-paquetes-pip-en-windows-7/
En el capítulo 24 Refactoring del libro de Code Complete, échale un ojo a las checklist del capítulo 24 Refactoring donde se recogen de modo esquemático los puntos a chequear cuando te encuentras ante un código a refactorizar:
CHECKLIST: Summary of Refactorings
Data Level Refactorings
[ ] Replace a magic number with a named constant.
[ ] Rename a variable with a clearer or more informative name.
https://docs.google.com/document/d/1yAJAwCI_7gyP8AP3bET2DFOMOEcQGrpJfqITh2VL69Y
No hace falta que programes nada. Explicaremos en el Dojo cómo proceder y lo refactorizaremos mediante TDD -utilizando Pytest- y Programación por Parejas.
Puntos de discusión para la retrospectiva
Toma nota de los code smells que hayas identificado. Tienes una checklist con los code smells más habituales en el libro Code Complete, en el capítulo 24 Refactoring.
https://docs.google.com/document/d/1yAJAwCI_7gyP8AP3bET2DFOMOEcQGrpJfqITh2VL69Y
¡Asegúrate de que estos code smells no están presentes en tu código refactorizado! Vuelve a pasarle la checklist a tu código.
¿Cuánto código duplicado hay en tu solución? ¿Y en tus casos test?
¿Escribiste una lista de casos test antes de comenzar?
¿Cómo decidiste el orden en el que implementar los casos test?
Refactorización
Libro Code Complete cap. 24
QUÉ ES LA REFACTORIZACIÓN
Martin Fowler defines as “a change made to the internal structure of the software to make it easier to understand and cheaper to modify without changing its observable behavior”.
En nuestro caso particular:
A big refactoring is a recipe for disaster. —Kent Beck @Elmo
