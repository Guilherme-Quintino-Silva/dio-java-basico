package edu.quintino.segundasemana;
public class MinhaClasse {
    public static void main(String[] args) {
        String name = "Guilherme";
        String lastName = "Quintino";
        String completeName = nomeCompleto(name, lastName);
        System.out.println(completeName);
    }

    public static String nomeCompleto(String primeiroNome, String segundoNome) {
       return "Resultado do método " + primeiroNome.concat(" ").concat(segundoNome);
    }
}
