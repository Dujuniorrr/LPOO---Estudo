#include <stdio.h>
#include<stdlib.h>
#define TAM 100

int main(){
    int valid, quant, media, total;
    int num[TAM];
    quant = 0;
    total = 0;
    valid = 0;

    while(valid != 1){
        quant++;
        printf("Digite valores numericos: ");
        scanf(" %i", &num[quant]);
        if(num[quant] < 0){
            valid = 1;
        }
        else{
            if(num[quant]%2 != 0 && num[quant] >= 0 ){
                total = num[quant] + total;
                media = total / quant;
            }
        }
    }

    printf("Media dos numeros positivos impares digitados %i", media);
}
