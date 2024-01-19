#include <stdio.h>
#include <stdlib.h>

/*Crie um programa que lê 6 valores inteiros e, em seguida, mostre na tela os valores lidos*/

int main()
{
    int vet[6], i;

    for(i = 0; i < 6; i++)
    {
        printf("Digite o valor %d: ", i);
        scanf("%d", &vet[i]);
    }

    for(i = 0; i < 6; i++)
    {
        printf("Valores: %d\n", vet[i]);
    }

    return 0;
}
