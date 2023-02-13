package Quiz;

import java.util.Scanner;

public class Quiz {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int correctAnswers = 0;

    // Pergunta 1
    System.out.println("Pergunta 1: Quem é o maior artilheiro da história da Champions League");
    System.out.println("a) Cristano Ronaldo");
    System.out.println("b) Neymar");
    System.out.println("c) Pelé");
    System.out.println("d) Romário");
    System.out.println("e) Messi");
    System.out.print("Resposta: ");
    String answer1 = sc.nextLine();
    String correct1 = "a";
    if (answer1.equalsIgnoreCase(correct1)) {
    	System.out.println("Resposta correta! ");
    	correctAnswers++;
    }
    else {
    	System.out.println("Errou, a resposta correta é: " + correct1);
    }
    
    
    // Pergunta 2
    System.out.println("Pergunta 2: Quem tem mais gols em copas ?");
    System.out.println("a) Maradona");
    System.out.println("b) Ronaldo Fenômeno");
    System.out.println("c) Klose");
    System.out.println("d) Neymar");
    System.out.println("e) Pelé");
    System.out.print("Resposta: ");
    String answer2 = sc.nextLine();
    String correct2 = "c";
    if (answer2.equalsIgnoreCase(correct2)) {
    	System.out.println("Resposta correta! ");
    	correctAnswers++;
    }
    else {
    	System.out.println("Errou, a resposta correta é: " + correct2);
    }
    
 // Pergunta 3
    System.out.println("Pergunta 3: Messi fez 92 gols em qual ano ?");
    System.out.println("a) 2021");
    System.out.println("b) 2012");
    System.out.println("c) 2009");
    System.out.println("d) 2015");
    System.out.println("e) 2018");
    System.out.print("Resposta: ");
    String answer3 = sc.nextLine();
    String correct3 = "b";
    if (answer3.equalsIgnoreCase(correct3)) {
    	System.out.println("Resposta correta! ");
    	correctAnswers++;
    }
    else {
    	System.out.println("Errou, a resposta correta é: " + correct3);
    }
    
 // Pergunta 4
    System.out.println("Pergunta 4: Qual jogador tem mais assistências ?");
    System.out.println("a) Messi");
    System.out.println("b) Toni Kross");
    System.out.println("c) Ribamar");
    System.out.println("d) Casemiro");
    System.out.println("e) Ronaldinho");
    System.out.print("Resposta: ");
    String answer4 = sc.nextLine();
    String correct4 = "a";
    if (answer4.equalsIgnoreCase(correct4)) {
    	System.out.println("Resposta correta! ");
    	correctAnswers++;
    }
    else {
    	System.out.println("Errou, a resposta correta é: " + correct4);
    }
    
 // Pergunta 5
    System.out.println("Pergunta 5: Quantos copas do mundo pela Argentina Messi tem ?");
    System.out.println("a) 3");
    System.out.println("b) 2");
    System.out.println("c) 4");
    System.out.println("d) 1");
    System.out.println("e) 0");
    System.out.print("Resposta: ");
    String answer5 = sc.nextLine();
    String correct5 = "d";
    if (answer5.equalsIgnoreCase(correct5)) {
    	System.out.println("Resposta correta! ");
    	correctAnswers++;
    }
    else {
    	System.out.println("Errou, a resposta correta é: " + correct5);
    }
    
 // Pergunta 6
    System.out.println("Pergunta 6: Quantas bolas de ouro Messi, Ronaldo e Neymar têm juntos?");
    System.out.println("a) 14");
    System.out.println("b) 19");
    System.out.println("c) 6");
    System.out.println("d) 8");
    System.out.println("e) 11");
    System.out.print("Resposta: ");
    String answer6 = sc.nextLine();
    String correct6 = "e";
    if (answer6.equalsIgnoreCase(correct6)) {
    	System.out.println("Resposta correta! ");
    	correctAnswers++;
    }
    else {
    	System.out.println("Errou, a resposta correta é: " + correct6);
    }
    
 // Pergunta 7
    System.out.println("Pergunta 7: Quantos gols Pelé tem em sua carreira?");
    System.out.println("a) 1200-");
    System.out.println("b) 1200+");
    System.out.println("c) 800");
    System.out.println("d) 1000");
    System.out.println("e) 980");
    System.out.print("Resposta: ");
    String answer7 = sc.nextLine();
    String correct7 = "b";
    if (answer7.equalsIgnoreCase(correct7)) {
    	System.out.println("Resposta correta! ");
    	correctAnswers++;
    }
    else {
    	System.out.println("Errou, a resposta correta é: " + correct7);
    }
    
 // Pergunta 8
    System.out.println("Pergunta 8: Quantas copas do mundo a seleção brasileira tem ?");
    System.out.println("a) 3");
    System.out.println("b) 6");
    System.out.println("c) 4");
    System.out.println("d) 5");
    System.out.println("e) 2");
    System.out.print("Resposta: ");
    String answer8 = sc.nextLine();
    String correct8 = "d";
    if (answer8.equalsIgnoreCase(correct8)) {
    	System.out.println("Resposta correta! ");
    	correctAnswers++;
    }
    else {
    	System.out.println("Errou, a resposta correta é: " + correct8);
    }
    
 // Pergunta 9
    System.out.println("Pergunta 9: Quantas libertadores o Santos venceu?");
    System.out.println("a) 3");
    System.out.println("b) 2");
    System.out.println("c) 1");
    System.out.println("d) 4");
    System.out.println("e) Nenhuma");
    System.out.print("Resposta: ");
    String answer9 = sc.nextLine();
    String correct9 = "a";
    if (answer9.equalsIgnoreCase(correct9)) {
    	System.out.println("Resposta correta! ");
    	correctAnswers++;
    }
    else {
    	System.out.println("Errou, a resposta correta é: " + correct9);
    }
    
 // Pergunta 10
    System.out.println("Pergunta 10: Qual destes clubes tem mais Paulistões?");
    System.out.println("a) São Paulo");
    System.out.println("b) Palmeiras");
    System.out.println("c) Corinthians");
    System.out.println("d) Santos");
    System.out.println("e) Vasco");
    System.out.print("Resposta: ");
    String answer10 = sc.nextLine();
    String correct10 = "c";
    if (answer10.equalsIgnoreCase(correct10)) {
    	System.out.println("Resposta correta! ");
    	correctAnswers++;
    }
    else {
    	System.out.println("Errou, a resposta correta é: " + correct10);
    }
    
 // Pergunta 11
    System.out.println("Pergunta 11: Quem foi o primeiro campeão brasileiro?");
    System.out.println("a) Santos");
    System.out.println("b) Atlético Mineiro");
    System.out.println("c) Botafogo");
    System.out.println("d) Bahia");
    System.out.println("e) Sport");
    System.out.print("Resposta: ");
    String answer11 = sc.nextLine();
    String correct11 = "d";
    if (answer11.equalsIgnoreCase(correct11)) {
    	System.out.println("Resposta correta! ");
    	correctAnswers++;
    }
    else {
    	System.out.println("Errou, a resposta correta é: " + correct11);
    }
    
 // Pergunta 12
    System.out.println("Pergunta 12: Palmeiras tem quantos títulos do Paulista?");
    System.out.println("a) 24");
    System.out.println("b) 23");
    System.out.println("c) 25");
    System.out.println("d) 22");
    System.out.println("e) 23");
    System.out.print("Resposta: ");
    String answer12 = sc.nextLine();
    String correct12 = "a";
    if (answer12.equalsIgnoreCase(correct12)) {
    	System.out.println("Resposta correta! ");
    	correctAnswers++;
    }
    else {
    	System.out.println("Errou, a resposta correta é: " + correct12);
    }
    
 // Pergunta 13
    System.out.println("Pergunta 13: Quual foi a maior goleada do Brasileirão:");
    System.out.println("a) Palmeiras 7x1 Vitória");
    System.out.println("b) Cruzeiro 8x0 Juventude");
    System.out.println("c) Corinthians 10x1 Tiradentes-Pi");
    System.out.println("d) Bahia 14x2 Manaus");
    System.out.println("e) Santos 9x3 Palmeiras");
    System.out.print("Resposta: ");
    String answer13 = sc.nextLine();
    String correct13 = "c";
    if (answer13.equalsIgnoreCase(correct13)) {
    	System.out.println("Resposta correta! ");
    	correctAnswers++;
    }
    else {
    	System.out.println("Errou, a resposta correta é: " + correct13);
    }
    
 // Pergunta 14
    System.out.println("Pergunta 14: Campeão carioca de 2022?");
    System.out.println("a) Vasco");
    System.out.println("b) Fluminense");
    System.out.println("c) Botafogo");
    System.out.println("d) Flamengo");
    System.out.println("e) Bangu");
    System.out.print("Resposta: ");
    String answer14 = sc.nextLine();
    String correct14 = "b";
    if (answer14.equalsIgnoreCase(correct14)) {
    	System.out.println("Resposta correta! ");
    	correctAnswers++;
    }
    else {
    	System.out.println("Errou, a resposta correta é: " + correct14);
    }
    
 // Pergunta 15
    System.out.println("Pergunta 15: Quantas copas o Brasil ganhou no século XX?");
    System.out.println("a) 3");
    System.out.println("b) 2");
    System.out.println("c) 4");
    System.out.println("d) 5");
    System.out.println("e) 1");
    System.out.print("Resposta: ");
    String answer15 = sc.nextLine();
    String correct15 = "c";
    if (answer15.equalsIgnoreCase(correct15)) {
    	System.out.println("Resposta correta! ");
    	correctAnswers++;
    }
    else {
    	System.out.println("Errou, a resposta correta é: " + correct15);
    }
    
    System.out.println("Parabéns, você acertou: " + correctAnswers + " de 15 questões!");

  }
}