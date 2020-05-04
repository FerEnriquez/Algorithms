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
}/**
	PROBLEMA 1
_____________________________________________________________________________________________________________________________
	María Fernanda Hernándezm Enriquez
	A01329383
	Análisis y Diseño de Algoritmos
	Alberto Oliart Ros
*/
import java.util.*;
import java.util.Random;

public class Problema1{

	/*
		Contador de iteraciones de cuantas veces se hace una comparación.
	*/
	public static int nIteraciones = 0;

	public static void main (String args[]){
	/**
		ASCENDENTE
	*/

		System.out.println("** ASCENDENTE **");

		//TAMAÑO: 10
		System.out.println("________SIZE 10________");
		/*
			Se crea un arreglo de 10 enteros, en donde se llena sólo por medio de número del menor al mayor.
		*/
		int arrAscendente1[] = new int[10];
		for(int i = 0; i < arrAscendente1.length; i++){
			arrAscendente1[i] = i + 1;
		}

		/*
			Se invoca cada método de ordenamiento, reiniciando el contador de iteraciones.
		*/
		nIteraciones = 0;
		bubbleSort(arrAscendente1);

		nIteraciones = 0;
		mergeSort (arrAscendente1, 0,9);
		System.out.println("MergeSort: " + nIteraciones);
		
		nIteraciones = 0;
		quickSort(arrAscendente1, 0, 9);
		System.out.println("QuickSort: " + nIteraciones);

		nIteraciones = 0;
		heapSort(arrAscendente1);
		System.out.println("HeapSort: " + nIteraciones);

		//TAMAÑO: 100
		System.out.println("________SIZE 100_______");
		int arrAscendente2[] = new int[100];
		for(int i = 0; i < arrAscendente2.length; i++){
			arrAscendente2[i] = i + 1;
		}	
		nIteraciones = 0;	
		bubbleSort(arrAscendente2);
		nIteraciones = 0;
		mergeSort (arrAscendente2, 0, 99);
		System.out.println("MergeSort: " + nIteraciones);
		nIteraciones = 0;
		quickSort(arrAscendente2, 0, 99);
		System.out.println("QuickSort: " + nIteraciones);
		nIteraciones = 0;
		heapSort(arrAscendente2);
		System.out.println("HeapSort: " + nIteraciones);

		//TAMAÑO: 1000
		System.out.println("________SIZE 1000______");
		int arrAscendente3[] = new int[1000];
		for(int i = 0; i < arrAscendente3.length; i++){
			arrAscendente3[i] = i + 1;
		}	
		nIteraciones = 0;	
		bubbleSort(arrAscendente3);
		nIteraciones = 0;
		mergeSort (arrAscendente3, 0, 999);
		System.out.println("MergeSort: " + nIteraciones);
		nIteraciones = 0;
		quickSort(arrAscendente3, 0, 999);
		System.out.println("QuickSort: " + nIteraciones);
		nIteraciones = 0;
		heapSort(arrAscendente3);
		System.out.println("HeapSort: " + nIteraciones);

		//TAMAÑO: 10000
		System.out.println("________SIZE 10000_____");
		int arrAscendente4[] = new int[10000];
		for(int i = 0; i < arrAscendente4.length; i++){
			arrAscendente4[i] = i + 1;
		}		
		nIteraciones = 0;
		bubbleSort(arrAscendente4);
		nIteraciones = 0;
		mergeSort (arrAscendente4, 0, 9999);
		System.out.println("MergeSort: " + nIteraciones);
		nIteraciones = 0;
		quickSort(arrAscendente4, 0, 9999);
		System.out.println("QuickSort: " + nIteraciones);
		nIteraciones = 0;
		heapSort(arrAscendente4);
		System.out.println("HeapSort: " + nIteraciones);
	/**
		DESCENDENTE
	*/

		System.out.println("** DESCENDENTE **");

		//TAMAÑO: 10
		System.out.println("________SIZE 10________");
		/*
			Se crea un arreglo de 10 enteros, en donde se llena sólo por medio de número que van desde el mayor al menor.
		*/
		int arrDescendente1[] = new int[10];
		for(int i = 10; i < 0; i--){
			arrDescendente1[i] = i;
		}

		/*
			Se invoca cada método de ordenamiento, reiniciando el contador de iteraciones.
		*/
		nIteraciones = 0;
		bubbleSort(arrDescendente1);

		nIteraciones = 0;
		mergeSort (arrDescendente1, 0,9);
		System.out.println("MergeSort: " + nIteraciones);
		
		nIteraciones = 0;
		quickSort(arrDescendente1, 0, 9);
		System.out.println("QuickSort: " + nIteraciones);

		nIteraciones = 0;
		heapSort(arrDescendente1);
		System.out.println("HeapSort: " + nIteraciones);

		//TAMAÑO: 100
		System.out.println("________SIZE 100_______");
		int arrDescendente2[] = new int[100];
		for(int i = 100; i < 0; i--){
			arrDescendente2[i] = i;
		}		
		nIteraciones = 0;
		bubbleSort(arrDescendente2);
		nIteraciones = 0;
		mergeSort (arrDescendente2, 0, 99);
		System.out.println("MergeSort: " + nIteraciones);
		nIteraciones = 0;
		quickSort(arrDescendente2, 0, 99);
		System.out.println("QuickSort: " + nIteraciones);
		nIteraciones = 0;
		heapSort(arrDescendente2);
		System.out.println("HeapSort: " + nIteraciones);

		//TAMAÑO: 1000
		System.out.println("________SIZE 1000______");
		int arrDescendente3[] = new int[1000];
		for(int i = 1000; i < 0; i--){
			arrDescendente3[i] = i;
		}	
		nIteraciones = 0;	
		bubbleSort(arrDescendente3);
		nIteraciones = 0;
		mergeSort (arrDescendente3, 0, 999);
		System.out.println("MergeSort: " + nIteraciones);
		nIteraciones = 0;
		quickSort(arrDescendente3, 0, 999);
		System.out.println("QuickSort: " + nIteraciones);
		nIteraciones = 0;
		heapSort(arrDescendente3);
		System.out.println("HeapSort: " + nIteraciones);

		//TAMAÑO: 10000
		System.out.println("________SIZE 10000_____");
		int arrDescendente4[] = new int[10000];
		for(int i = 10000; i < 0; i--){
			arrDescendente4[i] = i;
		}		
		nIteraciones = 0;
		bubbleSort(arrDescendente4);
		nIteraciones = 0;
		mergeSort (arrDescendente4, 0, 9999);
		System.out.println("MergeSort: " + nIteraciones);
		nIteraciones = 0;
		quickSort(arrDescendente4, 0, 9999);
		System.out.println("QuickSort: " + nIteraciones);
		nIteraciones = 0;
		heapSort(arrDescendente4);
		System.out.println("HeapSort: " + nIteraciones);
		
	/**
		DESORDENADOS
	*/
		/*
			Crear un objeto random para poder llenar los arreglos con números aleatorios. 
			Para así tener un arreglo de número desordenaodos
		*/
		Random rn = new Random();

		System.out.println("** DESORDENADOS **");

		//TAMAÑO: 10
		System.out.println("________SIZE 10________");
		/*
			Se crea un arreglo de 10 enteros, en donde se llena sólo por medio de número aleatorios.
		*/
		int arr1[] = new int[10];
		for(int i = 0; i < arr1.length; i++){
			arr1[i] = rn.nextInt(50) + 1;
		}

		/*
			Se invoca cada método de ordenamiento, reiniciando el contador de iteraciones.
		*/
		nIteraciones = 0;
		bubbleSort(arr1);

		nIteraciones = 0;
		mergeSort (arr1, 0,9);
		System.out.println("MergeSort: " + nIteraciones);
		
		nIteraciones = 0;
		quickSort(arr1, 0, 9);
		System.out.println("QuickSort: " + nIteraciones);

		nIteraciones = 0;
		heapSort(arr1);
		System.out.println("HeapSort: " + nIteraciones);

		//TAMAÑO: 100
		System.out.println("________SIZE 100_______");
		int arr2[] = new int[100];
		for(int i = 0; i < arr2.length; i++){
			arr2[i] = rn.nextInt(100) + 1;
		}	
		nIteraciones = 0;	
		bubbleSort(arr2);
		nIteraciones = 0;
		mergeSort (arr2, 0, 99);
		System.out.println("MergeSort: " + nIteraciones);
		nIteraciones = 0;
		quickSort(arr2, 0, 99);
		System.out.println("QuickSort: " + nIteraciones);
		nIteraciones = 0;
		heapSort(arr2);
		System.out.println("HeapSort: " + nIteraciones);

		//TAMAÑO: 1000
		System.out.println("________SIZE 1000______");
		int arr3[] = new int[1000];
		for(int i = 0; i < arr3.length; i++){
			arr3[i] = rn.nextInt(1000) + 1;
		}	
		nIteraciones = 0;	
		bubbleSort(arr3);
		nIteraciones = 0;
		mergeSort (arr3, 0, 999);
		System.out.println("MergeSort: " + nIteraciones);
		nIteraciones = 0;
		quickSort(arr3, 0, 999);
		System.out.println("QuickSort: " + nIteraciones);
		nIteraciones = 0;
		heapSort(arr3);
		System.out.println("HeapSort: " + nIteraciones);

		//TAMAÑO: 10000
		System.out.println("________SIZE 10000_____");
		int arr4[] = new int[10000];
		for(int i = 0; i < arr4.length; i++){
			arr4[i] = rn.nextInt(10000) + 1;
		}	
		nIteraciones = 0;	
		bubbleSort(arr4);
		nIteraciones = 0;
		mergeSort (arr4, 0, 9999);
		System.out.println("MergeSort: " + nIteraciones);
		nIteraciones = 0;
		quickSort(arr4, 0, 9999);
		System.out.println("QuickSort: " + nIteraciones);
		nIteraciones = 0;
		heapSort(arr4);
		System.out.println("HeapSort: " + nIteraciones);

	} 
	/*
		Método para imprimir arreglos
	*/
	public static void printArr (int[] arr){
		for(int i = 0; i < arr.length; i++){
			System.out.print("|"+arr[i]+"|");
		}
		System.out.println("");
	}
	/*
		Método de ordenamiento : Bubble Sort
	*/
	public static void bubbleSort(int[] arr){
		for(int i = 0; i < arr.length - 1; i++){
			for(int j = 0; j < arr.length - i - 1; j++){
					if(arr[j] > arr[j+1]){
						int aux = arr[j];
						arr[j] = arr[j+1];
						arr[j+1] = aux;
						nIteraciones++;
					}
			}
		}
		System.out.println("BubbleSort: " + nIteraciones);
	}
	/*
		Método de ordenamiento : MergeSort
	*/
	public static void mergeSort(int[] arr, int init, int n){
		int n1;
		int n2;
		if(n > 1){
			n1 = n/2;
			n2 = n - n1;
			nIteraciones++;
			mergeSort(arr, init, n1);
			mergeSort(arr, init + n1, n2);
			merge(arr,init, n1, n2);
		}
		
	}
	public static void merge(int[] arr, int init, int n1, int n2){
		int[ ] aux = new int[n1+n2];
	    int temp = 0;
	    int temp1 = 0;
	    int temp2 = 0;
	    int i;
	    while ((temp1 < n1) && (temp2 < n2)){
	        if (arr[init + temp1] < arr[init + n1 + temp2]){
	            aux[temp++] = arr[init + (temp1++)];
	            nIteraciones++;
	        }else{
	            aux[temp++] = arr[init + n1 + (temp2++)];
	            nIteraciones++;
	        }
	    }
	    while (temp1 < n1){
	        aux[temp++] = arr[init + (temp1++)];
	        nIteraciones++;
	    }
	    while (temp2 < n2){
	        aux[temp++] = arr[init + n1 + (temp2++)];
	        nIteraciones++;
	    }
	    for (i = 0; i < n1+n2; i++){
	        arr[init + i] = aux[i];
    	}
	}

	/*
		Método de ordenamiento : QuickSort
	*/
	public static void quickSort(int arr[], int a, int b){
		arr = new int[arr.length];
		int aux;
		int ini = a;
		int end = b;
		int pivot = arr[(ini + end) / 2];
		do{
			while(arr[ini] < pivot){
				ini++;
				nIteraciones++;
			}
			while(arr[end] > pivot){
				end--;
				nIteraciones++;
			}
			if(ini <= end){
				aux = arr[ini];
				arr[ini] = arr[end];
				arr[ini] = aux;
				ini++;
				end--;
				nIteraciones++;
			}
		}while(ini <= end);
		if(a < end){
			nIteraciones++;
			quickSort(arr, a, end);
		}
		if(ini < b){
			nIteraciones++;
			quickSort(arr, ini, b);
		}
	}

	/*
		Método de ordenamiento : HeapSort
	*/
	public static void heapSort(int arr[]){
		int length = arr.length;

		for(int i = length / 2 - 1; i >= 0; i--)
			heaping(arr, length, i);
		for(int i = length - 1; i >= 0; i--){
			int aux = arr[0];
			arr[0] = arr[i];
			arr[i] = aux;
			heaping(arr, i, 0);
		}
	}
	public static void heaping(int[] arr, int n, int i){
		int end = i;
		int izq = 2*i + 1;
		int der = 2*i + 2;

		if(izq < n && arr[izq] > arr[end]){
			end = izq;
			nIteraciones++;
		}
		if(der < n && arr[der] > arr[end]){
			end = der;
			nIteraciones++;
		}
		if(end != i){
			int swap = arr[i];
			arr[i] = arr[end];
			arr[end] = swap;
			nIteraciones++;
			heaping(arr, n, end);
		}
	}
}