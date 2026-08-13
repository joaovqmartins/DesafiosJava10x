package intermediario.desafio04.src;

public class Main {
    public static void main(String[] args) {

        NinjaBasico Konohamaru = new NinjaBasico();
        Konohamaru.nome = "Konohamaru Sarutobi";
        Konohamaru.idade = 13;
        Konohamaru.habilidade = "Rasengam";

        System.out.println(Konohamaru.nome);
        System.out.println(Konohamaru.idade);
        System.out.println(Konohamaru.habilidade);


        NinjaAvancado Naruto= new NinjaAvancado();
        Naruto.nome = "Naruto Uzumaki";
        Naruto.idade = 17;
        Naruto.habilidade = "Rasengam";

        System.out.println(Naruto.nome);
        System.out.println(Naruto.idade);
        System.out.println(Naruto.habilidade);
        Naruto.espcialidade();





    }
}