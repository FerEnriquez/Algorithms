/* Interfaz para la tarea 3 para el grupo de Análisis y Diseño de Algoritmos
 * del semestre 201811 en el ITESM Puebla y CCV.
 *
 * Se deben implementar los métodos indicados más abajo en una clase llamada
 * "TablaHashString". Esto debe implementar tablas de hash usando dos tipos
 * diferentes de políticas de resolución de colisiones.
 */

public interface Hash {

    /* Método que calcula el valor de hash de una cadena de texto */

    int hash(String s);

    /* Método que calcula el hash doble en caso de que se use la política de
     * direccionamiento abierto con hash doble */

    int dhash(String s);

    /* Método que inserta una cadena de texto en el caso de usar
     * direccionamiento abierto simple. Debe devolver el número de colisiones
     * que hayan ocurrido al intentar insertar la cadena. */

    int insertaSimple(String s);

    /* Método que inserta una cadena de texto en el caso de usar
     * direccionamiento abierto con hash doble. Debe devolver el número de
     * colisiones que hayan ocurrido al intentar insertar la cadena. */

    int insertaDoble(String s);

    /* Método que imprime los índices de la tabla donde haya alguna cadena de
     * texto guardada */

    void imprimeIndices();

    /* Método que imprime la cadena guardada en el espacio indicado por i o
     * NULL si no hay cadena guardada allí */

    void imprime(int i);
}