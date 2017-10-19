# Meetup Microservices Session2
### Clientes Service

Servicio encargado de las siguientes operaciones

* Mostrar todos los clientes

	http://localhost:15000/clientes/


* Mostrar información de un cliente en particular

	http://localhost:15000/cliente/rut/{rut}

*Para efectos de este meetup, todos los servicios son GET.*



La configuración de la aplicación se encuentra en el archivo:

	$RUTA_BASE/src/main/resources/application.yml

### Instalación ###
```console

[user@machine]$ cd $RUTA_BASE
[user@machine]$ mvn install

```

### Ejecución ###
```console

[user@machine]$ java -jar target/clientes-0.0.1-SNAPSHOT.jar

```
