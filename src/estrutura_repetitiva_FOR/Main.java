package estrutura_repetitiva_FOR;
/*Objetivo:

Fazer um programa que lê um valor inteiro N e depois N números inteiros.

Ao final, mostra a soma dos N numeros lidos.

Exemplo:

for( inicio; condição; incremento){
		Comando 1
		Comando 2
}

Inicio:Executa somente na primeira vez.

Condição: V: executa e volta.
			F: pula Fora.
			
Incremento:Executa toda Vez depois de voltar

*/

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int soma = 0;
		for(int i=0;i<N;i=i+1) {
			int x = sc.nextInt();
			soma = soma + x;
			
			}
		System.out.println(soma);
		
		sc.close();
		}

	}


