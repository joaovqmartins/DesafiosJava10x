package intermediario.desafio03.src;

public class Uchiha extends Ninja {
    String habilidadeEspecial;

    public void mostrarHabilidadeEspecial() {
        System.out.println(habilidadeEspecial);
    }

    public void mostrarInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Missão: " + missao);
        System.out.println("Nível de dificuldade: " + nivelDificuldade);
        System.out.println("Status da missão: " + statusMissao);
        System.out.println("Habilidade Especial é: " + habilidadeEspecial);
    }
}
