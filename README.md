# Sprint 1 – Tasca 2

## Nivel 1 – Excepciones

En este ejercicio se implementa una venta (`Sale`) que calcula el total de sus productos.

Si se intenta calcular el total de una venta sin productos, el programa lanza una excepción personalizada (`EmptySaleException`).

Primero se implementa como una excepción verificada (`Exception`) y posteriormente se modifica para que herede de `RuntimeException`, mostrando la diferencia entre excepciones checked y unchecked.