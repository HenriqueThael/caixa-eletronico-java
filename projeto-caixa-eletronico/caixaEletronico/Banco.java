package caixaEletronico;

import java.util.Scanner;
public class Banco {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BancoUsuario u1 = new BancoUsuario();

        double deposito = 0, saque = 0, senha1 = 0;

        System.out.println("Digite o nome de usuário: ");
        u1.nome = sc.nextLine();
        System.out.println("Digite a senha: "); // 1243
        senha1 = sc.nextInt();

        if (senha1 == u1.senha) {
            System.out.println("Bem vindo " + u1.nome + "!");
            for (int j = 0; j != 4; ) {
                u1.menuBanco();
                int v = sc.nextInt();
                j = v;
                if (v == 1) {
                    System.out.println("Usuário: " + u1.nome + "\nsaldo: " + u1.saldo);
                } else if (v == 2) {
                    System.out.println("Depósito: ");
                    deposito = sc.nextDouble();
                    u1.saldo += deposito;
                } else if (v == 3) {
                    System.out.println("Saque: ");
                    saque = sc.nextDouble();
                    u1.saldo -= saque;
                } else if (v == 4) {
                    System.out.println("Finalizado!!");
                } else {
                    System.out.println("Senha incorreta!");
                }
            }
        }
    }
}

