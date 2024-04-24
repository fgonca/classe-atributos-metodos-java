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

// Declaração de classe
class Pessoa 
{
	public int numero; // declaracão de atributo
	private String nome; // declaracão de atributo
	private	LocalDate dataNasc; // declaracão de atributo

	// declaração de método construtor
	public Pessoa(int numero, String nome, LocalDate dataNasc) 
	{
		this.numero = numero;  // atribuir o valor do parâmetro numero ao atributo numero
		this.nome = nome; // atribuir o valor do parâmetro nome ao atributo nome
		this.dataNasc = dataNasc; // ...
	}

	// declaração de método
	public int getNumero() {
		return numero;
	}

	// declaração de método
	public String getNome() {
		return nome;
	}

	// declaração de método
	public LocalDate getDataNasc() {
		return dataNasc;
	}
}
