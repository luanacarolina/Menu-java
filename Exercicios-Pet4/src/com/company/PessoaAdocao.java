package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class PessoaAdocao extends Pessoa {

    Scanner leia = new Scanner(System.in);

    public PessoaAdocao(String nome, String sobrenome, String genero, int idade, String cpf, String telefone,
                        String endereco) {
        super(nome, sobrenome, genero, idade, cpf, telefone, endereco);

        {
            ArrayList<String> animais = new ArrayList();
            animais.add("Cachorro");
            animais.add("Gato");

            boolean mainLoop = true;
            int x;
            while (mainLoop) {
                try {

                    System.out.println("Selecione a op��o desejava: ");
                    System.out.println("\n 1. Doa��o.");
                    System.out.println("\n 2. Ado��o.");
                    System.out.println("\n 0. Sair do sistema.");
                    x = leia.nextInt();


                    switch (x) {

                        case 1:

                            leia.nextLine();
                            mainLoop=false;
                            System.out.println("\n=== Doa��o === ");
                            System.out.println("\nInforme em sequencia os dados: nome do animal, idade e g�nero do animal: ");
                            String animal = leia.next();
                            animais.add(animal);
                            System.out.println("\nParab�ns" + nome
                                    + ", voc� acaba de nos passar os dados do seu animal para doar! Para confirmar sua doa��o entre em contato atrav�s do n�mero (11) 4002-8922.");
                            break;

                        case 2:
                            mainLoop=false;
                            System.out.println("\n=== Ado��o === ");
                            System.out.println("\nConfira aqui os animais dispon�veis para ado��o:: ");
                            System.out.println("\n" + animais);
                            System.out.println("\nParab�ns" + nome
                                    + ", voc� acaba de escolher o Pet4U! Para confirmar sua ado��o entre em contato atrav�s do n�mero (11) 4002-8922.");
                            break;

                        default:
                            System.out.println("Op��o inv�lida.");

                    }


                } catch (Exception e) {

                    System.err.println("\nERRO: " + e + "\n");
                    System.out.println("\nDIGITE APENAS Uma das Opções");
                    leia.nextLine();
                }


            }
        }
    }
}
