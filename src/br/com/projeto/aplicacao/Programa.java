package br.com.projeto.aplicacao;

import br.com.projeto.excessoes.ValoresException;
import br.com.projeto.modelos.Bootcamp;
import br.com.projeto.modelos.Curso;
import br.com.projeto.modelos.Desenvolvedor;
import br.com.projeto.modelos.Mentoria;
import java.time.LocalDate;
import java.time.Month;
import java.util.Scanner;

/**
 *
 * @author Katarine Albuquerque
 */

/*
*
+ Programa Bootcamp:
* 1 - Exibe os dados do Bootcamp e o menu;
* 2 - Seleciona o item de menu;
* 3 - Escolha as opções: 1 - Desenvolvedores/2 - Atividades/3 - Mentorias/4 - Sair;
* 4 - Repete a aplicação até teclar 4 (Sair);
* 5 - Selecione opção 4 (Sair);
* 6 - O programa exibe "Programa finalizado.".
*
*/
public class Programa {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        LocalDate dataInicio = LocalDate.of(2024, Month.MARCH, 20);
        LocalDate dataFinal = LocalDate.of(2024, Month.MAY, 30);

        Bootcamp bootcamp = new Bootcamp(dataInicio, dataFinal, "BACK-END Java", "Aprenda a programar com Java");

        Mentoria mentoria1 = new Mentoria(LocalDate.of(2024, Month.MARCH, 22), bootcamp, "Lançamento Bootcamp BACK-END Java", "Como participar do Bootcamp.");
        Mentoria mentoria2 = new Mentoria(LocalDate.of(2024, Month.MARCH, 25), bootcamp, "A Importância da Lógica no desenvolvimento", "Um pouco do uso da tecnologia por profissionais de tecnologia.");
        Mentoria mentoria3 = new Mentoria(LocalDate.of(2024, Month.MARCH, 26), bootcamp, "Gerenciamento de Tempo", "Como se preparar organizando o tempo.");
        Mentoria mentoria4 = new Mentoria(LocalDate.of(2024, Month.MARCH, 28), bootcamp, "Explorando IA na Produtividade", "Qual o seu uso no desenvolvimento?");
        Mentoria mentoria5 = new Mentoria(LocalDate.of(2024, Month.MAY, 1), bootcamp, "Como se Destacar para o Mercado de Trabalho", "Prepare os seus projetos na prática.");

        int ponto1 = mentoria1.valorDoPonto(1200);
        int ponto2 = mentoria2.valorDoPonto(1020);
        int ponto3 = mentoria3.valorDoPonto(1230);
        int ponto4 = mentoria4.valorDoPonto(1050);
        int ponto5 = mentoria5.valorDoPonto(1205);

        bootcamp.adicionarMentoria(mentoria1);
        bootcamp.adicionarMentoria(mentoria2);
        bootcamp.adicionarMentoria(mentoria3);
        bootcamp.adicionarMentoria(mentoria4);
        bootcamp.adicionarMentoria(mentoria5);

        Curso curso1 = new Curso(12, bootcamp, "Princípios do Desenvolvimento de Software", "Aprenda os principais conceitos.");
        Curso curso2 = new Curso(14, bootcamp, "Dominando a Linguagem de Programação Java", "Saba os principais conceitaos de Java");
        Curso curso3 = new Curso(16, bootcamp, "Programação Orientada a Objetos com Java", "Conheça o paradgma.");
        Curso curso4 = new Curso(15, bootcamp, "Testes de Software", "Como usar testes no desenvolvimento.");
        Curso curso5 = new Curso(12, bootcamp, "Banco de Dados", "Banco de dados SQL e NoSQL.");

        int ponto6 = curso1.valorDoPonto(903);
        int ponto7 = curso2.valorDoPonto(850);
        int ponto8 = curso3.valorDoPonto(1050);
        int ponto9 = curso4.valorDoPonto(1230);
        int ponto10 = curso5.valorDoPonto(950);

        bootcamp.adicionarCurso(curso1);
        bootcamp.adicionarCurso(curso2);
        bootcamp.adicionarCurso(curso3);
        bootcamp.adicionarCurso(curso4);
        bootcamp.adicionarCurso(curso5);

        Desenvolvedor desenvolvedor1 = new Desenvolvedor("Acácio Adom", bootcamp);
        Desenvolvedor desenvolvedor2 = new Desenvolvedor("Cirdan Darion", bootcamp);
        Desenvolvedor desenvolvedor3 = new Desenvolvedor("Corbin Clurgi", bootcamp);

        desenvolvedor1.progredir(2);
        desenvolvedor2.progredir(1);
        desenvolvedor3.progredir(3);

        desenvolvedor1.calcularTotalDePontos(ponto6, ponto1);
        desenvolvedor1.calcularTotalDePontos(ponto7, ponto2);

        desenvolvedor2.calcularTotalDePontos(ponto8, ponto3);
        desenvolvedor2.calcularTotalDePontos(ponto9, ponto4);
        desenvolvedor2.calcularTotalDePontos(ponto10, ponto5);

        desenvolvedor3.calcularTotalDePontos(ponto6, ponto1);
        desenvolvedor3.calcularTotalDePontos(ponto7, ponto2);
        desenvolvedor3.calcularTotalDePontos(ponto8, ponto3);

        desenvolvedor1.inscreverBootcamp();
        desenvolvedor2.inscreverBootcamp();
        desenvolvedor3.inscreverBootcamp();

        bootcamp.adicionarDesenvolvedor(desenvolvedor1);
        bootcamp.adicionarDesenvolvedor(desenvolvedor2);
        bootcamp.adicionarDesenvolvedor(desenvolvedor3);

        try {
            System.out.println(bootcamp);
            System.out.println("1 - Desenvolvedores");
            System.out.println("2 - Atividades");
            System.out.println("3 - Mentorias");
            System.out.println("4 - Sair\n");

            System.out.print("Escolha uma opção do Bootcamp: ");
            String opcao = sc.nextLine();

            System.out.println("");

            while (!opcao.equals("4")) {
                switch (opcao) {
                    case "1":
                        for (int i = 0; i < bootcamp.getDesenvolvedores().size(); i++) {
                            System.out.println((i + 1) + "º " + bootcamp.getDesenvolvedores().get(i));
                        }
                        break;
                    case "2":
                        System.out.println("2 - Atividades:\n");
                        for (Curso c : bootcamp.getCursos()) {
                            System.out.println(c + "\n");
                        }
                        System.out.println("");
                        break;
                    case "3":
                        System.out.println("3 - Mentorias:\n");
                        for (Mentoria m : bootcamp.getMentorias()) {
                            System.out.println(m);
                        }
                        break;
                    case "4":
                        System.out.println("\nPrograma finalizado.\n");
                        break;
                    default:
                        throw new ValoresException("Opção incorreta! Tente novamente.\n");
                }

                System.out.println("\nBootcamp:\n");
                System.out.println("1 - Desenvolvedores");
                System.out.println("2 - Atividades");
                System.out.println("3 - Mentorias");
                System.out.println("4 - Sair\n");

                System.out.print("Escolha uma opção do Bootcamp: ");
                opcao = sc.nextLine();
                
                System.out.println("");
            }

        } catch (ValoresException e) {
            System.err.println(e.getMessage());
        }
        
        System.out.println("Programa finalizado.\n");
        
        // Entrada de dados finalizada
        sc.close();
    }
}