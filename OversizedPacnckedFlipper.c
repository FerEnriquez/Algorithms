#include <stdio.h>
#include <string.h>
int main(){
	int t;
	scanf("%d", &t);
	fflush(stdin);
	int i;
	for(i = 0; i < t; i++){
		//Numero de panckes 
		char s[10];
		//Numero que se pueden voltear
		int k;
		int aux;
		aux = scanf("%s %d", s, &k);

		//Minimo de vueltas
		int result; 
		result = num(&s,k);
		if(result == -1){
			printf("Case #%d: IMPOSSIBLE \n", i+1);
		}
		else
			printf("Case #%d: %d \n", i+1, result);
	}

	return 0;
}
int num(char *s, int k){
	int n = 1;
	int size = strlen(s);
	//Si todos ya son felices
	int i;
	for(i=0; i<10; i++){
		if(s[i] == '-')
			break;
		else
			n = 0;
	}
	if(n == 0)
		return n;
	//Si es imposible
	int cond = 0;
	n = 0;	
	for(i=0; i<size; i++){
		if(s[i] == '-')
			cond++;
		else
			cond = 0;

		if(cond == k){
			n++;
			int j = i;
			int c = 0;
			while(c<k){
				s[j] = '+';
				j--;
				c++;
			}
		}
	}
	
	/*for (i = 0; i <size ; i++){
		printf("%c | ", s[i] );
	}*/

	if(cond == 0)
		return -1;
	//Demas casos
	for(i=k; i<size; i++){
		if(s[i] == '-'){
			int tmp = i-k;
			//printf("TMP: %d\n", tmp );
			if(s[tmp] == '-'){
				int j;
				for(j=tmp+1; j<i; j++){
					//printf("j: %d\n",j);
					if(s[j] == '+'){
						cond = 0;
					}
					else
						cond = 1;
						j+= size;
				}
			}
		}
		if(cond == 0){
			n = n+2;
		}
	}
	return n;
}