
import model.Empresa;
import model.Restaurante;

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
        Restaurante rest = new Restaurante();
        
        rest.lerDados();
        rest.imprimirDados();

    }
}
