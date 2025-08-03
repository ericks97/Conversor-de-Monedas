# 🪙 Conversor de Monedas | Challenge Alura Latam

Este es un programa de consola interactivo desarrollado en Java como parte del Challenge de Alura Latam. Funciona como un conversor de divisas, permitiendo a los usuarios realizar conversiones entre el Dólar Estadounidense y varias monedas de América Latina, obteniendo las tasas de cambio de una API externa para asegurar que los cálculos sean precisos y actuales.

---
## ✨ Características Principales

* **Conversión Múltiple**: Soporta 8 tipos de conversiones directas entre el Dólar Estadounidense (USD) y las siguientes divisas:
    * Peso Argentino (ARS)
    * Real Brasileño (BRL)
    * Peso Colombiano (COP)
    * Peso Chileno (CLP)
* **Menú Interactivo**: Interfaz de línea de comandos fácil de usar que guía al usuario a través de las opciones de forma clara.
* **Validación de Entradas Robusta**: El programa está diseñado para manejar errores del usuario de forma elegante:
    * **Entrada Numérica**: Si el usuario ingresa texto donde se espera un número, el programa muestra un mensaje de error claro en lugar de fallar.
    * **Opciones de Menú**: Valida que la opción seleccionada por el usuario esté dentro del rango permitido (1-9).
    * **Confirmación de Continuación**: Incluye un bucle de validación para la pregunta `(Y/N)`, asegurando que solo se acepten estas respuestas.
* **Diseño Modular**: El código está organizado siguiendo principios de responsabilidad única para facilitar su mantenimiento y escalabilidad.
    * `Principal`: Maneja toda la interacción con el usuario.
    * `ServicioDeConversion`: Se encarga de la lógica de negocio para realizar los cálculos de conversión.

---
##  Cómo Usar

### Requisitos

* Tener el **JDK (Java Development Kit)** instalado en tu sistema (versión 17 o superior recomendada).
* Un **IDE** (como IntelliJ IDEA, Eclipse, VS Code) para una fácil compilación y ejecución, o usar la línea de comandos.

### Compilación y Ejecución

1.  Abre una terminal en el directorio raíz de tu proyecto.
2.  **Compila** los archivos `.java`. Usando la estructura de paquetes, el comando sería:
    ```sh
    javac com/challenge/conversordemonedas/main/Principal.java com/challenge/conversordemonedas/servicio/ServicioDeConversion.java
    ```
3.  Una vez compilado, **ejecuta** la clase principal:
    ```sh
    java com.challenge.conversordemonedas.main.Principal
    ```
4.  ¡Listo! Sigue las instrucciones que aparecen en el menú de la consola para realizar las conversiones.
