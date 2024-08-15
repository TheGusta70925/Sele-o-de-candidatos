import java.util.concurrent.ThreadLocalRandom;
import java.util.Random;

public class App {
    public static void main(String[] args) {
        String [] candidatos = {"Felipe","Maria","Julia","Paulo","Augusto"};
        for (String candidato:candidatos) {
            entrandoEmContato(candidato);
        }
    }

    static void entrandoEmContato(String candidato) {
        int tentativasRealiazados = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;
        do {
            atendeu = atender();
            continuarTentando = !atendeu;
            if(continuarTentando) {
                tentativasRealiazados++;
            } else {
                System.out.println("Contato realizado com sucesso.");
            }
        }while(continuarTentando && tentativasRealiazados < 3);

        if (atendeu) {
            System.out.println("Conseguimos contato com " + candidato + " na " + tentativasRealiazados + " tentativa.");
        } else {
            System.out.println("Não conseguimos contato com " + candidato + ".");
        }
    }

    static void imprimirSelecionados() {
        String [] candidatos = {"Felipe","Maria","Julia","Paulo","Augusto"};

        System.out.println("Imprimindo lista de candidatos informando indice:");

        for (int indice = 0; indice < candidatos.length; indice++) {
            System.out.println("Nome do candidato: " + candidatos[indice] + "; Número do candidato: " + (indice + 1));
        }
        System.out.println("");
        for (String candidato:candidatos) {
            System.out.println("Candidato selecionado foi: " + candidato);
        }
    }

    static void selecaoCandidatos() {
        String [] candidatos = {"Felipe","Maria","Julia","Paulo","Augusto","Monica","Fabricio","Mirela","Daniela","Jorge"};

        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;
        while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato(a) " + candidato + " solicitou este valor de salário " + salarioPretendido);
            if (salarioBase > salarioPretendido) {
                System.out.println(candidato + " foi selecionado(a) para a vaga.");
                candidatosSelecionados++;
            }
            candidatoAtual++;
        }
    }

    static void analisarCandidatos(double salarioPretendido) {
        double salarioBase = 2000.0;
        if (salarioPretendido > salarioBase) {
            System.out.println("Aguardando resultado dos demais candidatos.");
        } else if (salarioPretendido == salarioBase) {
            System.out.println("Ligar para o candidato com contra proprosta.");
        } else {
            System.out.println("Ligar para candidato.");
        }
    }

    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static boolean atender() {
        return new Random().nextInt(3)==1;
    }
}