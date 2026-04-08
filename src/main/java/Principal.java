
import model.Empresa;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 10726112374
 */
public class Principal {
    public static void main(String[] args) {

        Empresa emp1 = new Empresa();
        emp1.lerDados();
        emp1.imprimirDados();

        Empresa emp2 = new Empresa(
                "Tech Solutions",
                "Rua A, 123",
                "São Paulo",
                "SP",
                "01000-000",
                "(11) 99999-9999"
        );

        emp2.imprimirDados();
    }
}
