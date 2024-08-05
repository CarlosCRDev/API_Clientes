# API Clientes

**Objetivo:** dar a conocer al usuario la puesta a punto de esta API para su correcto funcionamiento. 

## Creación de BD y de tabla Clientes
La aplicación por si sola tiene la capacidad de crear la base de datos **bdclientes** y la tabla **clientes**, 
por lo que únicamente hay que dirigirse al archivo **application.properties** de la aplicación y realizar los 
cambios correspodientes de los atributos **username, password y puerto** con la finalidad de mantener la 
comunicación del servidor Mysql.

## Consumo de los endpoints
Una vez que se ejecuta la aplicación, esta inserta 5 registros de prueba a la tabla **clientes**. A continuación enlisto 
los endpoints para poder consumir la información almacenada en la base de datos.

### (GET) http://localhost:8080/clientes
Devuelve el listado completo de los registros de los clientes.

### (GET) http://localhost:8080/clientes/M
Devuelve el listado de los clientes, filtrando la información por el sexo (M o F).

### (GET) http://localhost:8080/clientes/cliente/1
Devuelve el registro del cliente que coincida con el id enviado.

### (POST) http://localhost:8080/clientes
Permite realizar nuevos registros a la BD

### (PUT) http://localhost:8080/clientes
Permite actualizar los datos de un registro que ya se encuentra en la BD (permite validar que el registro exista).

### (DEL) http://localhost:8080/clientes/1
Permite eliminar el registro de un cliente que coincida con el id enviado, antes de hacerlo, valida que se encuentre en la BD.
