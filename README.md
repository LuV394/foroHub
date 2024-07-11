Foro Hub Challenge
Foro Hub es una aplicación de foro diseñada para facilitar la comunicación y discusión entre usuarios. Permite a los usuarios crear tópicos, responder a los mismos y participar en discusiones.

Desafío
El objetivo del proyecto “ForoHub” es replicar el proceso de un foro a nivel de backend. Para lograrlo, crearemos una API REST utilizando Spring. La API se centrará específicamente en los tópicos y debe permitir a los usuarios:

Crear un nuevo tópico.
Mostrar todos los tópicos creados.
Mostrar un tópico específico.
Actualizar un tópico.
Eliminar un tópico.
Requisitos
Asegúrate de tener los siguientes programas, archivos y versiones instalados:

Java JDK: versión 17 en adelante. Puedes descargar la última versión LTS de Java de forma gratuita.
Maven: versión 4 en adelante.
Spring Boot: versión 3 en adelante. Puedes crear tu proyecto utilizando Spring Initializr.
MySQL: versión 8 en adelante. Descarga el instalador de MySQL para Windows.
IDE (Entorno de desarrollo integrado): IntelliJ IDEA (opcional, pero recomendado).
Configuración del proyecto
Al crear el proyecto con Spring Initializr, asegúrate de seleccionar las siguientes opciones:

Java: versión 17 en adelante.
Maven: Utiliza la versión 4.
Spring Boot.
Proyecto en formato JAR.
Dependencias
Agrega las siguientes dependencias al crear el proyecto con Spring Initializr:

Lombok
Spring Web
Spring Boot DevTools
Spring Data JPA
Flyway Migration
MySQL Driver
Validation
Spring Security
Diagrama de Base de Datos
Para almacenar la información de la aplicación, necesitarás utilizar una base de datos. Los datos necesarios para crear un tópico son:

id
título
mensaje
fecha de creación
estado del tópico
autor
curso
