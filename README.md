## AUTORES
 -Josue Gonzalez
 -Dennis Angamarca
- version 2.0.3
 -en el metodo validador de singo se crea la cadena a en un arreglo, luego se compara si el caracter a es un parentesis de apertura, se empuja la llave de cierre a la pila
 si caracter a es un corchete de apertura se empuja el de cierre a la pila
 si el corchete de apertura se lleva el corchete cierre a la pila
 luego si a es un caracter de cierre se procede a verificar si la pila esta vacia con el empty significa q no hay caracteres de apertura por lo que no es valida la cadena y se retorno un false y con el pop si no se obtiene el caracter de cierre tambien se retorno false,


en el metodo de sorting
Mientras la pila original no esté vacía
Se extrae el elemento superior de la pila original y se almacena en una variable temp.
Luego se lo coloca en la posición correcta
Mientras la pila auxiliar no esté vacía y el elemento en la cima de la pila auxiliar sea mayor que temp
despues se extrae el elemento de la pila auxiliar y se coloca de nuevo en la pila original.
Insertar temp en la pila auxiliar: Después de que se haya encontrado la posición correcta, se inserta temp en la pila auxiliar.
