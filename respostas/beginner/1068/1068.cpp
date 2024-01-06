/*
	@autor: Tadeu;
	@data: 09/10/2021;
	@nome: Balanço de Parênteses I;
*/

#include <stdio.h>
#include <string.h>
#include <stdbool.h>

bool verificaBalancoParenteses (char *);

int main ()
{

	char expressao[1100];

	while (scanf(" %s", expressao) != EOF)
	{

		if(verificaBalancoParenteses(expressao))
			printf("correct\n");
		else
			printf("incorrect\n");

	}

}

bool verificaBalancoParenteses(char *str)
{

	short qtsP = 0;


	if (*str == ')')
		return false;

	// Enquanto a string não acabar
	while ((*str) && (qtsP >= 0))
	{
		// incrementa variável;
		if (*str == '(')
			qtsP++;

		// decrementa;
		if (*str == ')')
			qtsP --;

		str++;

		// Irrecuperrável;

	}

	if (qtsP == 0)
		return true;
	else
		return false;

}