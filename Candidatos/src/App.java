public class App {
    public static void main(String[] args) {
        analisarCandidatos(1900.0);
        analisarCandidatos(2000.0);
        analisarCandidatos(2200.0);
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
}