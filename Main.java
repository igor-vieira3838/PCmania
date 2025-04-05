import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        // Flag utilizada no input de dados (escolher promoção e
        // selecionar 0 para finalizar a compra)
        int flag = 0;
        float matricula = 776;

        Computador promocao1 = new Computador();
        Computador promocao2 = new Computador();
        Computador promocao3 = new Computador();

        promocao1.marca = "Apple";
        promocao1.preco = matricula;

        promocao2.marca = "Samsung";
        promocao2.preco = matricula+1234;

        promocao3.marca = "Dell";
        promocao3.preco = matricula+5678;

        // Memória USB
        promocao1.musb = new MemoriaUSB();
        promocao2.musb = new MemoriaUSB();
        promocao3.musb = new MemoriaUSB();

        promocao1.musb.nome = "Pen-drive";
        promocao1.musb.capacidade = 16;

        promocao2.musb.nome = "Pen-drive";
        promocao2.musb.capacidade = 32;

        promocao3.musb.nome = " HD externo";
        promocao3.musb.capacidade = 1000;

        // Processadores
        promocao1.HarBas[0].nome = "Pentium Core i3";
        promocao1.HarBas[0].capacidade = 2200; // MHz

        promocao2.HarBas[0].nome = "Pentium Core i5";
        promocao2.HarBas[0].capacidade = 3370; // MHz

        promocao3.HarBas[0].nome = "Pentium Core i7";
        promocao3.HarBas[0].capacidade = 4500; // MHz

        // Memória RAM
        promocao1.HarBas[1].capacidade = 8;  // GB
        promocao2.HarBas[1].capacidade = 16; // GB
        promocao3.HarBas[1].capacidade = 32; // GB

        // Armazenamento (HD)
        promocao1.HarBas[2].capacidade = 500;  // GB
        promocao2.HarBas[2].capacidade = 1000; // GB (1 TB)
        promocao3.HarBas[2].capacidade = 2000; // GB (2 TB)

        // Sistema Operacional
        promocao1.OS.nome = "Linux Ubuntu";
        promocao1.OS.tipo = 32;

        promocao2.OS.nome = "Windows 8";
        promocao2.OS.tipo = 64;

        promocao3.OS.nome = "Windows 10";
        promocao3.OS.tipo = 64;

        // Cliente
        Cliente clien1 = new Cliente();
        clien1.nome = "Igor";
        clien1.cpf = 1234456789;

        int repeticao = 0;

        do{
            promocao1.mostraPCConfigs();
            System.out.println("--------------------------------");
            promocao2.mostraPCConfigs();
            System.out.println("--------------------------------");
            promocao3.mostraPCConfigs();
            System.out.println("--------------------------------");

            System.out.println("Qual promoção desejas adicionar ao carrinho? ( 1 | 2 | 3 ) ou ( 0 ) para sair...");

            flag = scn.nextInt();

            if(flag == 1) clien1.comp[repeticao] = promocao1;

            if(flag == 2) clien1.comp[repeticao] = promocao2;

            if(flag == 3) clien1.comp[repeticao] = promocao3;

            repeticao++;
        }while(flag != 0 && repeticao != 3);

        if(repeticao == 3)
            System.out.println("Carrinho cheio!");

        scn.close();

        System.out.println("Checkout: " + clien1.calculaTotalCompra());

        System.out.println("Computadores adiquiridos: ");

        for(Computador i: clien1.comp){
            if(i == null)
                break;
            System.out.println(i.marca);
        }

    }
}