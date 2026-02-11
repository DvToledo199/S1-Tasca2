# Sprint 1 – Tasca 2

## Nivel 1 – Excepciones

En este ejercicio se implementa una venta (`Sale`) que calcula el total de sus productos.

Si se intenta calcular el total de una venta sin productos, el programa lanza una excepción personalizada (`EmptySaleException`).

Primero se implementa como una excepción verificada (`Exception`) y posteriormente se modifica para que herede de `RuntimeException`, mostrando la diferencia entre excepciones checked y unchecked.
# Sprint 1 – Nivel 2

## Excepciones

En este ejercicio se ha trabajado la gestión de excepciones en Java para evitar que el programa se cierre cuando el usuario introduce datos incorrectos.

Se ha implementado una clase utilitaria llamada `ConsoleReader`, cuyo objetivo es leer datos desde el teclado de forma segura, validando la entrada del usuario y repitiendo la petición hasta que el valor introducido sea correcto.

La clase utiliza un único objeto `Scanner` y métodos estáticos para facilitar su reutilización desde cualquier parte del programa.

### Funcionalidades implementadas

- Lectura segura de números enteros (`int`).
- Lectura segura de números decimales (`double` y `float`).
- Lectura segura de valores `byte`.
- Lectura de un único carácter (`char`), validando que solo se introduzca uno.
- Lectura de valores sí/no (`s` o `n`) devolviendo un valor booleano.
- Lectura de cadenas de texto no vacías.

Todos los métodos gestionan errores mediante excepciones y muestran mensajes claros al usuario cuando la entrada no es válida.

### Clase Main

Se ha creado una clase `Main` para probar el funcionamiento de todos los métodos de `ConsoleReader`.  
Desde esta clase se llaman a los distintos métodos y se comprueba que:

- El programa no se detiene ante errores de entrada.
- Los mensajes de error se muestran correctamente.
- Los valores válidos se devuelven y se utilizan con normalidad.