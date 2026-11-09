# Escuela Politécnica Nacional
**Nombre:** Melva Suarez   
**Asignatura:** Programación Orientada A Objetos
---
### Deber Java: List, Set y Map con la clase Persona

Este repositorio contiene resolución de la siguiente actividad:  
- Aplicacion de las colecciones de Java (`List`, `Set` y `Map`)
- Implementación de validaciones de datos.  
---
### Objetivos 

- **Uso de `List`**: Implementación con `ArrayList` para almacenar y recorrer objetos de tipo `Persona`.
- **Uso de `Set`**: Implementación con `HashSet` para garantizar la unicidad de los datos (sin duplicados), comprendiendo la importancia de sobrescribir `equals()` y `hashCode()`.
- **Uso de `Map`**: Implementación con `HashMap` para asociar códigos únicos (claves) a objetos Persona.
- **Ingreso por consola**: Función `ingresoPersonas()` que permite al usuario registrar datos por teclado hasta presionar `0`.
- **Validaciones de entrada**: Métodos dedicados para validar que el nombre no esté vacío, la edad sea un número válido (entre 0 y 100) y la estatura sea decimal.

## 📂 Estructura del Proyecto

- `Persona.java`: Clase de dominio con atributos encapsulados. Incluye la sobrescritura de `equals()` y `hashCode()` para el correcto funcionamiento del `Set` y `Map`. Además, sus *setters* validan que no se ingresen valores negativos.
- `Main.java`: Clase principal que contiene el menú interactivo, los métodos de validación (`validarNombre`, `validarEdad`, `validarEstatura`) y la demostración de las colecciones.
---

### Descripción de las clases

#### `Persona.java`

| Miembro | Tipo | Descripción |
|--------|------|-------------|
| `nombre` | `String` | Nombre de la persona. |
| `edad` | `int` | Edad en años. |
| `estatura` | `float` | Estatura en metros. |
| `Persona()` | Constructor | Vacío (JavaBean). |
| `Persona(String)` | Constructor | Solo nombre. |
| `Persona(String,int,float)` | Constructor | Completo. |
| `equals()` / `hashCode()` | Override | Clave para el correcto funcionamiento de `Set`/`Map`. |
| `descripcion()` | Método | Cadena resumida de la persona. |
| `imprimirdatos()` | Método | Imprime el detalle con formato. |
| `copiar()` | Método | Copia **profunda** (nombre + edad + estatura). |

#### `Main.java`

| Método | Descripción |
|--------|-------------|
| `ingresarPersonas(Scanner)` | ⭐ Función principal: lee personas hasta que el usuario escribe `0`. |
| `leerEntero(Scanner, String)` | Helper: validación segura de `int`. |
| `leerFloat(Scanner, String)` | Helper: validación segura de `float` (acepta `,` o `.`). |
| `main(String[])` | Demostración de `List`, `Set` y `Map`. |

---

## Pasos para ejecutar

### Requisitos
- JDK 21 o superior.
- Terminal / IntelliJ IDEA / VS Code (opcional).

### Compilar y ejecutar desde consola

```bash
git clone https://github.com/TU-USUARIO/java-list-set-map-persona.git
cd java-list-set-map-persona

javac Persona.java Main.java
java Main
```
## Pasos para ejecutar el la actividad

1. Clona este repositorio o descárgalo.
2. Abrir proyecto en IntelliJ IDEA.
3. Ejecuta el archivo `Main.java`.
4. Sigue las instrucciones en consola para ingresar personas. Escribe `0` en el nombre para terminar el ingreso.

## Ejemplo de ejecución

```text
-------------------------List-------------------------
Ingrese nombre o 0 para terminar: 
Melva
Ingrese la edad: 
24
Ingrese la estatura: 
1.56
La persona fue registrada correctamente

Ingrese nombre o 0 para terminar: 
0
```
