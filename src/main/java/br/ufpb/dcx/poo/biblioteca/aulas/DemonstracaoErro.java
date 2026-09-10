package br.ufpb.dcx.poo.biblioteca.aulas;

import br.ufpb.dcx.poo.biblioteca.Fabrica;
import br.ufpb.dcx.poo.biblioteca.contrato.Biblioteca;
import br.ufpb.dcx.poo.biblioteca.contrato.ItemView;
import br.ufpb.dcx.poo.biblioteca.contrato.excecoes.BibliotecaException;

public class DemonstracaoErro {

    public static void main(String[] args) throws BibliotecaException {
        Biblioteca biblioteca = Fabrica.novaBiblioteca();
        biblioteca.acervo().cadastrarItem("L1", "POO em Java",
                "Ayla", "livro", 2020);
        String codigo = new StringBuilder("L").append(1).toString();

        System.out.println("Comparação usando equals: " + codigo.equals("L1"));
        System.out.println("Comparação usando ==: " + (codigo == "L1"));

        biblioteca.acervo().cadastrarItem(codigo, "Engenharia de Software Moderna",
                "Kleyton", "Livro", 2026);

        //for(ItemView)

    }
}