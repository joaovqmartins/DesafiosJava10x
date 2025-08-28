package DesafiosIniciante;

public class Desafio01 {
    public static void main(String[] args) {


        String ninja1 = "Konohamaru";
        int idadeNinja1 = 10;
        String missaoNinja1 = "Capturar um gato";
        char rankMissaoNinja1 = 'D';
        String missaoStatus1 = "Em andamento";

        System.out.println("Ninja " + ninja1 + " tem " + idadeNinja1 + " de idade, e recebeu a missão de " + missaoNinja1 + " de Rank: " + rankMissaoNinja1 + ". Status: " + missaoStatus1 + "." );

        if (idadeNinja1 < 15) {
           if (rankMissaoNinja1 == 'C' || rankMissaoNinja1 == 'D') {
               missaoStatus1 = "Missão concluida!";
               System.out.println(missaoStatus1);
           } else {
               missaoStatus1 = "Missão não concluida!";
               System.out.println(missaoStatus1);
           }
        } else {
            missaoStatus1 = "Missão concluida!";
            System.out.println(missaoStatus1);
        }

        String ninja2 = "Naruto";
        int idadeNinja2 = 14;
        String missaoNinja2 = "Resgatar o Sasuke";
        char rankMissaoNinja2 = 'A';
        String missaoStatus2 = "Em andamento";

        System.out.println("Ninja " + ninja2 + " tem " + idadeNinja2 + " de idade, e recebeu a missão de " + missaoNinja2 + " de Rank: " + rankMissaoNinja2 + ". Status: " + missaoStatus2 + "." );

        if (idadeNinja2 < 15) {
            if (rankMissaoNinja2 == 'C' || rankMissaoNinja2 == 'D') {
                missaoStatus2 = "Missão concluida!";
                System.out.println(missaoStatus2);
            } else {
                missaoStatus2 = "Missão não concluida!";
                System.out.println(missaoStatus2);
            }
        } else {
            missaoStatus2 = "Missão concluida!";
            System.out.println(missaoStatus2);
        }

        String ninja3 = "Kakashi";
        int idadeNinja3 = 32;
        String missaoNinja3 = "Derrotar o Zabuza";
        char rankMissaoNinja3 = 'A';
        String missaoStatus3 = "Em andamento";


        System.out.println("Ninja " + ninja3 + " tem " + idadeNinja3 + " de idade, e recebeu a missão de " + missaoNinja3 + " de Rank: " + rankMissaoNinja3 + ". Status: " + missaoStatus3 + "." );

        if (idadeNinja3 < 15) {
            if (rankMissaoNinja3 == 'C' || rankMissaoNinja3 == 'D') {
                missaoStatus3 = "Missão concluida!";
                System.out.println(missaoStatus3);
            } else {
                missaoStatus2 = "Missão não concluida!";
                System.out.println(missaoStatus3);
            }
        } else {
            missaoStatus3 = "Missão concluida!";
            System.out.println(missaoStatus3);
        }







    }
}
