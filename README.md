# Login

<p>
Esta es una aplicación de un login básico, en la cual, si el usuario ingresa los datos correctos, aparecerá una ventana de ventana, pero si estos no son correctos, nos arrojará un mensaje de error de usuario.
</p>

![Login](https://github.com/user-attachments/assets/870268f9-5cba-43d3-805e-44cc22544f1b)
![Captura de pantalla 2024-12-09 194149](https://github.com/user-attachments/assets/c1207331-8b85-4d34-bbe1-bf84af267cf4)

<p>
La aplicación está conectada a una base de datos local. Esta base de datos se comprende de una tabla llamada "login", la cual posee tres campos. El primer campo es el que tiene el código de cada registro, es de tipo entero, autoincremento y funciona como llave primaria.
</p>

## Pasos para la configuración de la base de datos

<p>
  1. Creamos una base de datos en el servidor local xampp. Esta base de datos se comprende de una tabla llamada "login" y la cual posee tres campos. El primer campo es el que tiene el código de cada registro, es de tipo entero, autoincremento y funciona como llave primaria.
</p>

<p>
  2. Como segundo paso, debemos descargar el archivo de conexión a la base de datos. Esto lo podemos hacer ingresando a la página: https://mvnrepository.com/artifact/mysql/mysql-connector-java
</p>

<p>
  3. Damos click en la versión más reciente y copiamos el código xml, luego nos dirigimos al archvi pom.xml y justo después de las etiquetas packaging damos enter y creamos una etiqueta llama <dependencies> y dentro de esta pegamos el codigo.
</p>

```xml
<dependencies>
  <!-- https://mvnrepository.com/artifact/mysql/mysql-connector-java -->
  <dependency>
    <groupId>mysql</groupId>
    <artifactId>mysql-connector-java</artifactId>
    <version>8.0.33</version>
  </dependency>
</dependencies>
```
<p>
  Si observamos en el IDE ha descargado automáticamente el archivo que hará la conexión con la base de datos.
</p>
