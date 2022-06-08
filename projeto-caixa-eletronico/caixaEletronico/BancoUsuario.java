package caixaEletronico;

public class BancoUsuario {


    String nome = "";

    int senha = 1243;
    double saldo = 1000;


   public void menuBanco() {
        System.out.println("==========================");
        System.out.println("      BANCO DO BRASIL     ");
        System.out.println("==========================");
        System.out.println("[1] - Usuário\n[2] - Depósito\n[3] - Saque\n[4] - Sair");
    }
}
