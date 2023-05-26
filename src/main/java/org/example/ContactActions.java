package org.example;
import java.util.HashMap;
import java.util.Map;

public class ContactActions {

    static Map<String, String> listaContatos = new HashMap<String, String>();

    public static String adicionarContato(String contato, String num) {
        listaContatos.put(contato, new String(num));
        return ("Contato Adicionado");
    }

    public static String removerContato(String contato) {
        try {
            listaContatos.remove(contato);
        } catch (Exception e) {
            return ("contato não removido" + e);
        }
        return ("Contato removido com sucesso");
    }

    public static void buscarContato(String contato){
        System.out.println("O telefone do contato é" + listaContatos.get(contato));
    }

    public static void listarContatos(){
        for (String nome : listaContatos.keySet()){
            String telefone = listaContatos.get(nome);
            System.out.println(nome + "||" + telefone);
        }
    }
}