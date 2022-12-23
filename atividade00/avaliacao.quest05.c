#include <stdio.h>
#include<stdlib.h>
#define TAM 10

int main(){
    int vetor[TAM];
    int primos[TAM];
    int x = 0;

    for(int i = 0; i < 10; i++){
        printf("Digite um numero: ");
        scanf("%i", &vetor[i]);
        if(vetor[i]%2 != 0 && vetor[i]%3 != 0 && vetor[i]%5 != 0){
            primos[x] = vetor[i];
            x++;
        }
    }
    printf("Numeros primos: ");
    for(int i = 0; i < x; i++){
        printf("\n%i", primos[i]);
    }
}
