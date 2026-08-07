package intermediario.desafio03.src;


public class Main {
    public static void main(String[] args) {

        Ninja ninja1 = new Ninja();
        ninja1.nome = "Naruto";
        ninja1.idade = 17;
        ninja1.missao = "Resgatar Sasuke";
        ninja1.nivelDificuldade = "Alta";
        ninja1.statusMissao = "Em andamento";

        Uchiha ninja2 = new Uchiha();
        ninja2.nome = "Sasuke";
        ninja2.idade = 17;
        ninja2.missao = "Investigar Orochimaru";
        ninja2.nivelDificuldade = "Muito Alta";
        ninja2.statusMissao = "Concluída";
        ninja2.habilidadeEspecial = "Sharingam";


        Ninja ninja3 = new Ninja();
        ninja3.nome = "Sakura";
        ninja3.idade = 17;
        ninja3.missao = "Curar feridos";
        ninja3.nivelDificuldade = "Média";
        ninja3.statusMissao = "Em andamento";

        Ninja ninja4 = new Ninja();
        ninja4.nome = "Kakashi";
        ninja4.idade = 31;
        ninja4.missao = "Treinar equipe 7";
        ninja4.nivelDificuldade = "Alta";
        ninja4.statusMissao = "Concluída";

        ninja1.mostrarInformacoes();
        System.out.println();

        ninja2.mostrarInformacoes();
        System.out.println();

        ninja3.mostrarInformacoes();
        System.out.println();

        ninja4.mostrarInformacoes();


    }
}