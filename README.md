# Sprint 1 - Tasca 2

##  Enunciat del exercici (original)

### Nivell 1
**Exercici 1 – Excepcions personalitzades i control d’errors**

Objectius  
Crear una excepció personalitzada i saber com es llença i es captura.  
Treballar amb col·leccions (ArrayList<Product>) i càlculs sobre dades.  
Detectar i gestionar errors habituals com IndexOutOfBoundsException.

Enunciat  
Imagina que estàs desenvolupant una petita aplicació per gestionar vendes. Cada venda pot incloure diversos productes, i el sistema ha de ser capaç de calcular el total. Ara bé, no tindria sentit fer aquest càlcul si encara no s'ha afegit cap producte. Per això, implementarem una comprovació per evitar-ho.

Comença definint una classe Product amb dos atributs: name i price. Aquesta classe representarà un producte individual dins la venda.

Després, crea una classe Sale, que ha de contenir una col·lecció de productes (per exemple, una ArrayList<Product>) i una variable per emmagatzemar el total (totalPrice). Aquesta classe inclourà un mètode calculateTotal() que:

- Comprovi si la col·lecció està buida.
- Si està buida, llenci una excepció personalitzada anomenada EmptySaleException, amb el missatge: "Per fer una venda primer has d’afegir productes".
- Si hi ha productes, sumi els preus i desi el total a l’atribut totalPrice.

La classe EmptySaleException ha de ser filla de Exception, i ha d’incloure aquest missatge en el seu constructor.

A més, afegeix una prova per generar una excepció IndexOutOfBoundsException, per exemple intentant accedir a una posició inexistent d'una llista, i captura-la mostrant el missatge d'error.

Per acabar, canvia la classe EmptySaleException perquè extengui d’una excepció en temps d’execució, com per exemple RuntimeException.

Saps què significa això? Quina diferència hi ha entre una excepció verificada (checked) i una no verificada (unchecked) com RuntimeException?

---

##  Functionality Implemented (Level 1)

This project implements a simple sales management system focused on exception handling in Java.

### Product Class
- Represents a product with:
    - `name`
    - `price`
- Encapsulated attributes.
- Constructor and getters implemented.

### Sale Class
- Contains:
    - A private `ArrayList<Product>` to store products.
    - A private `double totalPrice`.
- Includes:
    - Constructor that initializes the collection.
    - `addProduct(Product product)` method.
    - `calculateTotal()` method that:
        - Throws a custom exception if the sale is empty.
        - Calculates and stores the total price correctly.
        - Resets the total before recalculation to avoid accumulation errors.

### Custom Exception
- `EmptySaleException` implemented.
- Initially designed as a checked exception.
- Modified to extend `RuntimeException` (unchecked exception) as required by the exercise.

### Exception Handling in Main
The `Main` class demonstrates:

- Throwing and catching `EmptySaleException`.
- Provoking and catching `IndexOutOfBoundsException`.
- Proper error handling using `try-catch` blocks.
- Preventing the program from crashing due to runtime errors.

---

##  Technologies Used

- Java
- IntelliJ IDEA

---

##  Execution

Run the program from the `Main` class.

The output demonstrates:

- Custom exception handling when attempting to calculate the total of an empty sale.
- Handling of `IndexOutOfBoundsException` when accessing an invalid list index.

---

##  Level 2

##  Exercici 1 – Lectura segura des del teclat

---

###  Objectives

- Learn how to capture and manage exceptions when reading user input from the keyboard.
- Prevent the application from crashing due to invalid user input.
- Practice handling standard exceptions such as `InputMismatchException`.
- Create and use a custom exception for specific validation cases.
- Reinforce the use of static utility methods for reusable input handling.

---

### Enunciat del exercici (original)

Crea una classe utilitària anomenada ConsoleReader que permeti llegir diferents tipus de dades des del teclat de manera segura. Aquesta classe ha de gestionar els errors que poden aparèixer quan l’usuari/ària introdueix valors incorrectes, com per exemple text en comptes de números.

Per fer-ho, crea un únic objecte Scanner i defineix una sèrie de mètodes estàtics per llegir dades. Aquests mètodes han de mostrar un missatge personalitzat, llegir el valor i validar-lo. Si l’entrada és incorrecta, es mostrarà un missatge d’error (per exemple: “Error de format”) i es tornarà a demanar la dada fins que sigui vàlida.

Requeriments:

Tots els mètodes reben com a paràmetre un String amb el missatge que es vol mostrar.  
Tots gestionen errors i només retornen la dada quan és vàlida.  
El missatge s’ha de tornar a mostrar cada vegada que hi hagi un error.

Mètodes a implementar:

Amb tractament d'InputMismatchException:

public static byte readByte(String message);  
public static int readInt(String message);  
public static float readFloat(String message);  
public static double readDouble(String message);

Amb una excepció personalitzada:

public static char readChar(String message);  
// Només accepta un únic caràcter. Si se n’introdueix més d’un, llença una excepció personalitzada.

public static String readString(String message);  
// Llegeix una cadena tal com es rep, però podries validar longitud mínima o contingut si cal.

public static boolean readYesNo(String message);  
// Si l’usuari/ària introdueix “s” (minúscula), retorna true. Si introdueix “n”, retorna false.  
// Qualsevol altra entrada hauria de generar una excepció personalitzada.

---

##  Functionality Implemented

A utility class called `ConsoleReader` has been created to safely read different types of data from the keyboard.

###  Scanner Management

- A single static `Scanner` instance is used.
- All methods are static to allow easy reuse without creating objects.
- Input validation is handled inside `while(true)` loops to ensure the user is repeatedly prompted until valid data is entered.

---

###  Numeric Methods (Standard Exception Handling)

The following methods use `InputMismatchException` to validate incorrect numeric input:

- `readInt(String message)`
- `readDouble(String message)`
- `readByte(String message)`
- `readFloat(String message)`

If the user enters an invalid format (e.g., text instead of a number):

- An error message is displayed.
- The invalid input is cleared using `sc.nextLine()`.
- The user is prompted again.

---

###  Custom Exception

A custom exception named `InvalidInputException` was created to handle validation cases that are not covered by `InputMismatchException`.

It is used in the following methods:

- `readChar(String message)`
    - Accepts only a single character.
    - If more than one character is entered, an `InvalidInputException` is thrown.

- `readYesNo(String message)`
    - Accepts only `"s"` (returns `true`) or `"n"` (returns `false`).
    - Any other input triggers `InvalidInputException`.

- `readString(String message)`
    - Prevents empty input (after trimming spaces).
    - Throws `InvalidInputException` if the input is empty.

---

###  Error Handling Logic

Each method:

1. Displays a custom message.
2. Attempts to read the value.
3. Validates the input.
4. Catches the corresponding exception.
5. Displays a clear error message.
6. Repeats the process until valid input is provided.

This guarantees safe input handling and prevents the program from terminating due to user mistakes.

---

##  Key Concepts Practiced

- Difference between standard and custom exceptions.
- Use of `try-catch` blocks.
- Controlled repetition using infinite loops with safe exit conditions.
- Encapsulation of reusable logic in static utility methods.
- Defensive programming to improve application robustness.