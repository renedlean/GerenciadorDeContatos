package org.example;

import java.util.Scanner;

public class Main extends MenuContatos {
    public static void main(String[] args) {
        int opcao = 0;
        while (opcao != 5 ) {
            opcao = 0;
            Scanner op = new Scanner(System.in);
            System.out.println("BEM VINDO A LISTA DE CONTATOS");
            System.out.println("1 - Para adicionar um novo contato");
            System.out.println("2 - Para remover um contato");
            System.out.println("3 - Para buscar um contato");
            System.out.println("4 - Para listar todos os contatos");
            System.out.println("5 - Para sair");
            opcao = Integer.parseInt(op.next());

            listMenu(opcao);
        }
    }
}