# Examen UD4: Optimización y documentación. Mayo 2021
1.  Realiza un clone del repositorio. Las instrucciones están en este README, así como los códigos java (debidamente empaquetados) para trabajar desde Eclipse.  
   
2.  La entrega la harás en este mismo repositorio. Trabajarás con git con los comandos desde **gitBash** y con el flujo de trabajo **GitFlow**. Comienza creando la rama "develop" a partir de la maestra. Trabajarás en ella los cambios del código.


## Issue
3. A continuación aparecen distintos commits. En cualquiera de ellos ha de cerrarse un issue desde el mensaje. 
4. Para ello abre en este repositorio un nuevo issue con el mensaje/descripción adecuado. Debes indicar la **línea del código** a la que afecta. Etiqueta el issue con la **etiqueta** adecuada. Usa las menciones para que me llegue una notificación (**@lmagarin**). Lo cerrarás directamente desde el mensaje del commit.

## Refactorización
5. Crea la **rama "refactoring"** a partir de la rama "develop". Trabajarás en ella la refactorización
6. En la clase Gato haz las refactorizaciones que necesites para que "Miauuuuuuuuuuuuu" sea un campo estático de la clase. Deja el nombre propuesto

7. Realiza un commit con el mensaje "refactor: Miauuuuuuuuuuuuu - Nombre y Apellidos" 

8. Extrae una superclase "Mamifero" a partir de la clase "Gato". Deja sólo maullar() y "Miauuuuuuuuuuuuu" en Gato

9. Realiza un commit con el mensaje "refactor: Mamifero - Nombre y Apellidos"
10. Fusiona la rama "refactoring" en la rama "develop" 

## Documentación
11. Crea la **rama "documentation"** a partir de la rama "develop". Trabajarás en ella la documentación.
12. Escribe los comentarios Javadoc. Recuerda que debes documentar debidamente todos:

- Los paquetes 
- Las clases (incluidas las excepciones)
- Los constructores
- Los métodos
 
13. Realiza un commit con el mensaje "docs: comentarios javadoc - Nombre y Apellidos" 

12. En Eclipse, genera la documentación Javadoc en la carpeta **docs**

12. Realiza un commit con el mensaje "docs: documentación javadoc - Nombre y Apellidos" 

12. Fusiona la rama "documentation" en la rama "develop". 

12. Fusiona la rama "develop" en la rama maestra. 

## GitHub Pages

18. Sube el repositorio a GitHub y activa el hosting (GitHub Pages). Selecciona la carpeta docs como inicio

## BitBucket

19. Crea en tu servidor Bitbucket una copia del repositorio actual. Añade aquí la url. El mismo repositorio ha de estar en ambos servidores 
