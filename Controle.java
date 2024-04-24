/**
 * FUNDAMENTOS DE ENGENHARIA DE SOFTWARE
 * - Classes
 * - Atributos: visibilidade, nome, e tipo
 * - Métodos: visibilidade, nome, parâmetros e tipo-de-retorno
 * 
 * @author Francisco Pedro Morais Gonçalves
 * https://github.com/fgonca
 */

package fundamentos.classes; // pacote

import java.time.LocalDate; // reutilização da classe LocalDate do pacote java.time
import java.util.Scanner; // reutilização da classe Scanner do pacote java.util

//Declaração de classe
public class Controle 
{
	// declaração do método main
	public static void main(String[] args) 
	{
		/* 
		 * 1- criar um teclado:
		 * (invocação dum método constructor da classe Scanner com o parâmetro System.in, 
		 * seguida da atribuição duma referência do resultado - um objecto de tipo
		 *  Scanner - à variável teclado) 
		 */
		Scanner teclado = new Scanner(System.in);	
		
		/*
		 * 2- pedir ao usuário o nome:
		 * (invocação do método print do objecto referenciado pelo atributo out da classe
		 * System, com o parâmetro "Digite o nome: ")
		 */		
		System.out.print("Nome: ");
		
		/*
		 * 3- ler o nome:
		 * (invocação do método next do objecto referenciado pela variável teclado,  
		 * seguida da atribuição duma referência do resultado da invocação - um objecto 
		 * de tipo String - à variável nome)
		 */	
		String nome = teclado.next();
		
		// 4- pedir ao usuário a data de nascimento
		System.out.print("Data de nascimento (aaaa-mm-dd): ");
		
		// 5- ler a data de nascimento
		String dataNascString = teclado.next();
		
		// tranformar a data de nascimento
		String[] dataNascStringArray = dataNascString.split("-"); //separar dia, mês e ano
		int ano = Integer.parseInt(dataNascStringArray[0]); // converter String para int
		int mes = Integer.parseInt(dataNascStringArray[1]); // converter String para int
		int dia = Integer.parseInt(dataNascStringArray[2]); // converter String para int
		
		/*
		 * 6- definir a data de nascimento:
		 * (invocação o método of da classe LocalDate, com os parâmetros ano, mes e dia, 
		 * seguida da atribuição duma referência do resultado da invocação - um objecto 
		 * de tipo LocalDate - à variável dataNasc)
		 */
		LocalDate dataNasc = LocalDate.of(ano, mes, dia);
		
		/*
		 * definir o número:
		 * (atribuição dum número inteiro à variável numero)
		 */
		int numero = 1;
		
		/* 
		 * 7- criar uma pessoa:
		 * (invocação dum método constructor da classe Pessoa com os parâmetros numero, 
		 * nome e dataNasc, seguida da atribuição duma referência do resultado da 
		 * invocação - um objecto de tipo Pessoa - à variável pessoa) 
		 */
		Pessoa pessoa = new Pessoa(numero, nome, dataNasc);
		
		/*
		 * 8- obter o número da pessoa:
		 * invocação do método getNumero do objecto referenciado pela variável pessoa, 
		 * seguida da atribuição do resultado da invocação - um número inteiro - à 
		 * variável numeroS
		 */
		int numeroS = pessoa.getNumero();
		
		/*
		 * 9- obter o nome da pessoa:
		 * invocação do método getNome do objecto referenciado pela variável pessoa, 
		 * seguida da atribuição do resultado da invocação - um objecto 
		 * de tipo String - à variável nomeS
		 */
		String nomeS = pessoa.getNome();
		
		// 10- obter o nome da pessoa:
		LocalDate dataNascS = pessoa.getDataNasc();
		
		// 11- apresentar os dados da pessoa
		System.out.printf("Número: %d, %s, %s\n", numeroS, nomeS, dataNascS);
		
		/*
		 * obter o número da pessoa:
		 * (atribuição do valor do atributo numero do objecto referenciado pela variável 
		 * pessoa - um número inteiro - à variável numeroPessoa)
		 */	
		int numeroPessoa = pessoa.numero;
		
		// 12- apresentar o número da pessoa
		System.out.println("Número: " + numeroPessoa);	
		
		/*
		 * 13- fechar o teclado:
		 * (invocação do método close do objecto referenciado pela variável teclado) 
		 */
		teclado.close();
	}
}
