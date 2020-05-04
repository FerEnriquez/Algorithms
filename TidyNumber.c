#include <stdio.h>
#include <string.h>
#include <stdlib.h>
int main(){
	int t;
	scanf("%d", &t);
	fflush(stdin);
	int i;
	for(i = 0; i < t; i++){
		int n;
		scanf("%d", &n);
		int result; 
		result = num(n);
		printf("Case #%d: %d \n", i+1, result);
	}
	return 0;
}
int num(int n){
	if(n == 10 || n == 100 || n == 1000){
		n--;
		return n;
	}
	//n el numero que ingresa el usuario
	//numeber array para condiciones
	int cond = 1;
	while (cond != 0){
		//Se llena el arreglo con el numero que se manda
		char number[3];
		int aux = n;
		int i = 2;
		while(i >= 0){
			number[i] = aux%10;
			aux = aux/10;
			i--;
		}
		//Condiciones
		if(number[2]>=number[1] && number[1]>=number[0]){
			break;
		}
		else{
			n--;
		}
		/*printf("%d ",number[0]);
		printf("%d ",number[1]);
		printf("%d\n",number[2]);*/
	}
	return n;
}
