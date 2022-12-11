import models.*;

public class Main1 {
    public static void main(String[] args) {
        Cargo manager = new Cargo("Gerente");
        Cargo attendant = new Cargo("Atendente");

        Funcionario fManager = new Funcionario("Natalia", "13324468880", "11940028922", 5000.00, manager);
        Funcionario fAttendant = new Funcionario("Diego", "05296374122", "22987561354", 2000.00, attendant);

        System.out.print(fManager.toString());
        System.out.println("\n");
        System.out.print(fAttendant.toString());

        // System.out.println("Pq vc é assim Java?");
    }
}
