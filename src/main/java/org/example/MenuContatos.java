package org.example;

import java.util.Scanner;

public class MenuContatos extends ContactActions {
    public static String listMenu(int idMenu){
        String nome = null;
        String telefone = null;
        Scanner nomeInput = new Scanner(System.in);
        Scanner telImput = new Scanner(System.in);
        switch (idMenu){
            case 1:
                System.out.println("Informe o nome do contato que deseja adicionar:");
                nome = nomeInput.next();
                System.out.println("Informe o numero do contato que desenha adicionar:");
                telefone = telImput.next();

                adicionarContato(nome, telefone);
                break;
            case 2:
                System.out.println("Informe o nome do contato que deseja remover:");
                nome = nomeInput.next();

                removerContato(nome);
                break;
            case 3:
                System.out.println("Informe o nome do contato que deseja buscar:");
                nome = nomeInput.next();

                buscarContato(nome);
                break;
            case 4:
                listarContatos();
                break;
            case 5:
                System.out.println("SAINDO");
                break;
            default:
                System.out.println("OPCAO INVALIDA");
        }
        return ("OPÇAO INVALIDA");
    }
}
