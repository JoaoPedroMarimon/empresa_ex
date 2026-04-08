package model;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 10726112374
 */
import java.util.Scanner;

public class Restaurante {
    private String nome;
    private String endereco;
    private String cidade;
    private String estado;
    private String cep;
    private String fone;
    private String pedido;

    public Restaurante() {
        this.nome = "";
        this.endereco = "";
        this.cidade = "";
        this.estado = "";
        this.cep = "";
        this.fone = "";
        this.pedido = "";
        
    }

    public Restaurante(String nome, String endereco, String cidade, String estado, String cep, String fone,String pedido) {
        this.nome = nome;
        this.endereco = endereco;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
        this.fone = fone;
        this.fone = pedido;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }
    public void setPedido(String pedido) {
        this.pedido = pedido;
    }    

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getCidade() {
        return cidade;
    }

    public String getEstado() {
        return estado;
    }

    public String getCep() {
        return cep;
    }

    public String getFone() {
        return fone;
    }
    public String getPedido() {
        return pedido;
    }

    public void lerDados() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nome: ");
        this.nome = sc.nextLine();

        System.out.print("Endereço: ");
        this.endereco = sc.nextLine();

        System.out.print("Cidade: ");
        this.cidade = sc.nextLine();

        System.out.print("Estado: ");
        this.estado = sc.nextLine();

        System.out.print("CEP: ");
        this.cep = sc.nextLine();

        System.out.print("Telefone: ");
        this.fone = sc.nextLine();
        
        System.out.print("Pedido: ");
        this.pedido = sc.nextLine();
    }

    public void imprimirDados() {
        System.out.println("\n--- Dados da Empresa ---");
        System.out.println("Nome: " + nome);
        System.out.println("Endereço: " + endereco);
        System.out.println("Cidade: " + cidade);
        System.out.println("Estado: " + estado);
        System.out.println("CEP: " + cep);
        System.out.println("Telefone: " + fone);
        System.out.println("Pedido: " + pedido);
    }
}
