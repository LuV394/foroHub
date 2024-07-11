# Foro Hub Challenge

Foro Hub es una aplicación de foro diseñada para facilitar la comunicación y discusión entre usuarios. Esta aplicación permite a los usuarios crear tópicos, responder a los mismos y participar en discusiones.

## Información sobre el Desafío 🖥️

Un foro es un espacio donde todos los participantes de una plataforma pueden plantear sus preguntas sobre determinados tópicos. Aquí en Alura Latam, los estudiantes utilizan el foro para resolver sus dudas sobre los cursos y proyectos en los que participan. Este lugar mágico está lleno de mucho aprendizaje y colaboración entre estudiantes, profesores y moderadores.

### Descripción del Proyecto

Nuestro desafío, llamado ForoHub, consiste en replicar este proceso a nivel de backend, creando una API REST usando Spring. La API se centrará específicamente en los tópicos, permitiendo a los usuarios realizar las siguientes acciones:

- Crear un nuevo tópico.
- Mostrar todos los tópicos creados.
- Mostrar un tópico específico.
- Actualizar un tópico.
- Eliminar un tópico.

### Requisitos

Asegúrate de tener los siguientes programas, archivos y versiones instalados:

- **Java JDK**: versión 17 en adelante.
- **Maven**: versión 4 en adelante.
- **Spring Boot**: versión 3 en adelante.
  - [Spring Initializr](https://start.spring.io/)
- **MySQL**: versión 8 en adelante.
  - [Descargar MySQL Installer](https://dev.mysql.com/downloads/installer/)
- **IDE (IntelliJ IDEA)**: opcional.

### Configuración del Proyecto

Al crear el proyecto con Spring Initializr, utiliza las siguientes configuraciones:

- **Lenguaje**: Java (versión 17 en adelante)
- **Build System**: Maven (Initializr utiliza la versión 4)
- **Spring Boot**: versión 3 en adelante
- **Formato del Proyecto**: JAR

### Dependencias

Agrega las siguientes dependencias al crear el proyecto con Spring Initializr:

- Lombok
- Spring Web
- Spring Boot DevTools
- Spring Data JPA
- Flyway Migration
- MySQL Driver
- Validation
- Spring Security

### Diagrama de Base de Datos

Necesitarás una base de datos para almacenar la información de la aplicación. Para crear un tópico, necesitarás las siguientes informaciones:

- **id**: Identificador único del tópico.
- **título**: Título del tópico.
- **mensaje**: Contenido del mensaje.
- **fecha de creación**: Fecha en la que se creó el tópico.
- **status**: Estado del tópico.
- **autor**: Autor del tópico.
- **curso**: Curso relacionado con el tópico.

¡Buena suerte y feliz codificación!

