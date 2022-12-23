#include  <stdio.h>
#include <stdlib.h>

int main(){
    int age;
    float height;

    printf("Digite sua idade: ");
    scanf("%i", &age);
    printf("\nDigite sua altura: ");
    scanf("%f", &height);

    if(age >= 16 && height >= 1.75){
        printf("\nVoce podera competir no jogo de basquete.");
    }
    else{
        printf("\nVoce nao atendeu as condicoes. Nao podera competir no jogo de basquete.");
    }

    return 0;
}
