/**
	María Fernanda Hernández Enriquez
	A01329383
	Análisis y diseño de algoritmos
	Alberto Rios Oliart

	Esta clase implementa la interface Hash por medio de los métodos correspondientes.
	La tabla hash ya tiene un tamaño definido de 5003
*/
import java.util.Scanner;
class TablaHashString implements Hash{
	
	String [] table = new String[5003];

	/*
		MÉTODO hash
		Por cada letra se obtiene su valor ASCII, y además, lo multiplica por la
		posición en la que se encuentra. Se suman todos los valores de cada una
		de las letras de la cadena. Finalmente, esa suma modulo el tamaño de la
		tabla, es el hash.
	*/
	public int hash(String s){
		int value = 0;
		int pos = 0;
		for(int i = 0; i < s.length(); i++){
			pos = i * s.codePointAt(i);
			value = value + pos;
		}
		//int code = n%5003;
		return value;
	}
	/*
		MÉTODO doble hash
		Por cada letra se obtiene su valor ASCII, y además, ese valor se multiplica
		por la posición en la que se encuentra más dos. Se suman todos los valores de
		cada una de las letras de la cadena. Finalmente, esa suma módulo el 
		tamaño de la tabla, es el doble hash.
	*/
	public int dhash(String s){
		int value = 0;
		int pos = 0;
		for(int i = 0; i < s.length(); i++){
			pos = s.codePointAt(i) * (i + 2);
			value = value + pos;
		}
		//int code = n%5003;
		return value;
	}

	public int insertaSimple(String s){
		
		int code = hash(s);
		int pos = 0;
		int col = 0; 
		int mod = code%5003;
		boolean segundaVuelta = false;

		for(int i = 0; i < 5003; i++){
			if(i == mod){
				pos = i;
				while(table[pos] != null){
					col++;
					if(segundaVuelta == true && pos == mod){
						//System.out.println("No se pudo insertar:" + s);
						return col;
					}
					pos++;
					if(pos > 5003){
						pos = 0;
						pos = pos + mod;
						segundaVuelta = true;
					}
				}
				table[pos] = s;
				return col;
			}
		}
		return col;
	}
	
	public int insertaDoble(String s){	
		int code = dhash(s);
		int pos = 0;
		int col = 0; 
		int mod = code%5003;
		boolean segundaVuelta = false;

		for(int i = 0; i < 5003; i++){
			if(i == mod){
				pos = i;
				while(table[pos] != null){
					col++;
					if(segundaVuelta == true && pos == mod){
						//System.out.println("No se pudo insertar:" + s );
						return col;
					}
					pos = pos + mod;
					if(pos > 5003){
						pos = 0;
						pos = pos + mod;
						segundaVuelta = true;
					}
				}
				table[pos] = s;
				return col;
			}
		}
		return col;	
	}	
	public void imprimeIndices(){
		for(int i = 0; i < table.length; i++){
			if(table[i] != null)
				System.out.println("["+i+"] " + table[i]);
		}
	}
	public void imprime(int i){
		for(int j = 0; j < table.length; j++){
			if(j == i){
				System.out.println("["+i+"] " + table[i]);
				break;
			}
		}
	}
	public String newWord(){
		String word;
		int l=(int)(Math.random() * 10 + 1);
		char[] elements = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		char[] wordRes = new char[l];
		for(int i = 0; i < l; i++){
			int n = (int)(Math.random()*25);
			wordRes[i] = (char)elements[n];
		}
		return word = new String(wordRes);
	}
/*
	public static void main(String args[]){
		String line;
		int cont;
		
			//Tabla Hash SIMPLE
		
		TablaHashString simple = new TablaHashString();
		int colSimple = 0;
		cont = 0;
		while(cont != 1000){
			line = simple.newWord();
			colSimple = colSimple + simple.insertaSimple(line);
			cont++;
		}
		simple.imprimeIndices();
		System.out.println("Colsiones Simples: " + colSimple);
		
		
			//Tabla Hash DOBLE
		
		TablaHashString doble = new TablaHashString();
		int colDoble = 0;
		cont = 0;
		while(cont != 1000){
			line = doble.newWord();
			colDoble = colDoble + doble.insertaDoble(line);
			cont++;
		}
		doble.imprimeIndices();
		System.out.println("Colsiones Dobles: " + colDoble);

		//Ver por índice
		System.out.println("1) Simple 2) Doble");
		Scanner x = new Scanner(System.in);
		int option = x.nextInt();
		System.out.println("Indice:");
		int n = x.nextInt();
		if(option == 1){
			simple.imprime(n);
		}else
		doble.imprime(n);
	}
*/
}