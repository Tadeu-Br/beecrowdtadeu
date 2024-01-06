
#include <stdio.h>
#include <string.h>
#include <stdbool.h>

typedef struct{

	unsigned short numero;
	unsigned short posicao;

} pessoa;


void main ()
{

	unsigned short qtsPessoas, qtsPessoasSairam;
	unsigned short i, idPessoa;
	pessoa fila[51000];

	scanf("%hu", &qtsPessoas);

	memset(fila, 0, sizeof(fila));

	for (i = 0; i < qtsPessoas; i++)
	{
		scanf("%hu", &idPessoa);
		fila[i].numero = idPessoa;
		fila[idPessoa].posicao = i;

	}


	scanf("%hu", &qtsPessoasSairam);


	for (i = 0; i < qtsPessoasSairam; i++)
	{

		scanf("%hd", &idPessoa);
		fila[fila[idPessoa].posicao].numero = 0;

	}

	bool primEspaco = false;
	for (i = 0; i < qtsPessoas; i++)
		if (fila[i].numero)
		{
			if (primEspaco == true && i != qtsPessoas)
				printf(" ");

			primEspaco = true;
			printf("%hu", fila[i].numero);
		}

	printf("\n");
}