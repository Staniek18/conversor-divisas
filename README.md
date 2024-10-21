# Conversor de Divisas

## Descripción

Este proyecto es un **Conversor de Divisas** básico implementado en Java. Permite a los usuarios convertir entre varias monedas como el dólar estadounidense (USD), peso argentino (ARS), real brasileño (BRL) y peso colombiano (COP). El programa se ejecuta en la consola, donde el usuario selecciona las monedas de origen y destino, ingresa una cantidad, y recibe el resultado de la conversión.

## Características

- Conversión entre las siguientes divisas:
  - Dólar (USD) a Peso Argentino (ARS)
  - Peso Argentino (ARS) a Dólar (USD)
  - Dólar (USD) a Real Brasileño (BRL)
  - Real Brasileño (BRL) a Dólar (USD)
  - Dólar (USD) a Peso Colombiano (COP)
  - Peso Colombiano (COP) a Dólar (USD)
- Manejo de excepciones para entradas inválidas.
- Interfaz en consola fácil de usar.

##Uso del Programa
Al ejecutar el programa, verás un menú con varias opciones de conversión de divisas.
Ingresa el número correspondiente a la opción de conversión que deseas.
Ingresa la cantidad de dinero que deseas convertir.
El programa te mostrará la cantidad convertida según la tasa de cambio definida en el código.

###Ejemplo de Uso
**********************************************
BIENVENIDO
Por favor Selecciona una de las siguiente OPCIONES para la conversion de divisas:
1.Dólar(USD) -> Peso Argentino(ARS)
2.Peso Argentino(ARS) -> Dólar(USD)
3.Dólar(USD) -> Real Brasileño(BRL)
4.Real Brasileño(BRL) -> Dólar(USD)
5.Dólar(USD) -> Peso Colombiano(COP)
6.Peso Colombiano(COP) -> Dólar(USD)
7.Salir

Opcion: 1
Ingresa la cantidad: 100
Cantidad convertida: 29,300.00 ARS

##Estructura del Código
MonedaPrincipal.java: Es el archivo principal que contiene la lógica del menú y el manejo de entradas del usuario.
ConversionDeDivisas.java:  Aquí estaría la clase que maneja la lógica de conversión entre diferentes monedas.
ConsultaDeDivisas.java:  Aquí estaría la clase que maneja la consulta de divisas desde una API para realizar la respectiva conversión.
Monedas.java: Permite extraer los parametros deseados para las divisas requeridas del objeto Json entregado por la API.

##Manejo de Errores
El programa tiene manejo de excepciones para entradas inválidas:

Si el usuario ingresa una opción fuera del rango (1-7), se le pedirá que ingrese una opción válida.
Si el usuario ingresa un valor no numérico al pedir la cantidad de dinero, el programa solicitará que ingrese una cantidad correcta.
