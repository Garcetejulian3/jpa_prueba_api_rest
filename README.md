# API REST con Spring Boot: Persona y Mascota

Este proyecto es una *API REST sencilla* desarrollada con *Spring Boot*, que implementa operaciones CRUD básicas y una relación *OneToMany* entre las entidades `Persona` y `Mascota`.

---

# Descripción del Proyecto

La API permite gestionar personas y sus mascotas a través de endpoints REST.  
El objetivo principal fue *aprender y practicar conceptos fundamentales de Spring Boot, JPA y relaciones entre entidades*.

##Estructura principal

- *Persona*: Entidad principal con operaciones CRUD completas (crear, leer, actualizar, eliminar).  
- *Mascota*: Entidad secundaria relacionada con Persona mediante una relación **OneToMany**.  
  Solo permite la creación para asociar una nueva mascota a una persona existente.

---

# Tecnologías utilizadas

- **Java 17**
- **Spring Boot 3**
- **Spring Data JPA**
- **MySQL**
- **Maven**
- **Postman** (para pruebas de endpoints)

---

## Relación entre entidades

### Persona
```java
@OneToMany
private List<Mascota> listaMascotas;

| Método | Endpoint          | Descripción                     |
| ------ | ----------------  | ------------------------------- |
| GET    | `/personas`       | Obtiene todas las personas      |
| POST   | `/personas/crear` | Crea una nueva persona          |
| PUT    | `/personas/editar`| Actualiza una persona existente |
| DELETE | `/personas/{id}`  | Elimina una persona             |


| Método | Endpoint         | Descripción                                   |
| ------ | -----------      | --------------------------------------------- |
| POST   | `/mascota/crear` | Crea una nueva mascota asociada a una persona |

Conceptos aplicados

Arquitectura basada en Controlador - Servicio - Repositorio

Inyección de dependencias

Relaciones OneToMany y ManyToOne

Mapeo de entidades con JPA

Uso de Postman para testear endpoints

Persistencia de datos en base MySQL

Julian Garcete
Backend Developer en formación | Apasionado por aprender y construir proyectos con Java y Spring Boot
LinkedIn
https://www.linkedin.com/in/julian-garcete-685738370/
