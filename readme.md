# Asignador random de ip :computer:

Lo primero que se necesita es tener la linea de comando de mysql y ejecutar la siguiente linea de mysql que crea un base nueva en base a las tablas definidas en la DB ya creada.

```
mysql -uroot -padmin ipDB < ipDB.sql
```

## Estructura del archivo

El proyecto consiste en una base de datos y un app java la cual se encarga de todas las instrucciones donde encontramos tres carpetas:


* **Controlador**
Esta se encarga de ejecutar la app por medio de un metodo main el cual inicia la interfaz gráfica.

* **logica**
En esta seccion encontraremos toda la logica la cual por medio de un boton nos genera un direccion ip totalmente aleatoria, una vez generada la direccion nos la muestra en una pequeña ventana donde ademas de generarla este mismo se encarga de hacer un push hacia la base de datos donde se iran almacenando conforme se vallan generando.

* **vistas**
Aquí se encuentra la interfaz grafica la cual contiene una ventana y un boton.


### Base de datos

Esta base de datos contiene una tabla que contiene los siguientes campos que son:

* id
* numero_computador
* ip


Lo que hace que a una computadora en especifico solo se le pueda asignar una ip para evitar que estas se repitan.



