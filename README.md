# Ejercicio OrdenarObjetos

**Ordenar objetos personalizados por diferentes criterios
Problema:
Dada una lista de objetos (por ejemplo, estudiantes), ordenarlos según
diferentes atributos, como el nombre o la edad.**

Para hacer este ejercicio, voy a crear una clase Estudiante que tiene atributos diferentes como edad, nombre y nota.
Despues, en clase principal, declaro un ArrayList de Estudiantes. 

Ahora, para ordenar objetos utilizo un metodo de ArrayList *.sort*. Dentro de este metodo, voy a utilizar comparator y su metodo *.comparing()*.
Por ejemplo, *lista.sort(Comparator.comparing(e -> e.getNombre()))* permite ordenar la lista por nombres, donde *e* es un objeto Estudiante y digo al comparator que lo ordenamos por el metodo *.getNombre()*.
