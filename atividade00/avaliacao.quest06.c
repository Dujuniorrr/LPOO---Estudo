#include <stdio.h>
#include<stdlib.h>
#define TAM 10

int validacao(int num){
    int valor = 0;

    if(num >= -100 && num <= 100){
        if(num == 0){
            valor = 0;
        }
        else if(num > 0){
            valor = 1;
        }
        else if(num < 0){
            valor = 2;
        }
    }
    else{
        valor = -1;
    }

    return valor;
}

void mensagem(int valor){
    if(valor == -1){
        printf("\nO numero nao e valido.");
    }
    else if(valor == 0){
        printf("\nO numero e neutro.");
    }
    else if(valor == 1){
        printf("\nO numero e positivo.");
    }
    else if(valor == 2){
        printf("\nO numero e negativo.");
    }
}


int main(){
    int num, valor;

    printf("Digite um numero entre -100 e 100: ");
    scanf("%i", &num);
    valor = validacao(num);
    mensagem(valor);
}
