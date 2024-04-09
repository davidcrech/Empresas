
package model;

import javax.swing.JOptionPane;


public class empresa {
    private String nome;
    private String destination;
    private String cidade;
    private int CEP;
    private int phone;
    
    public empresa(){
        this("", "", "", 0, 0);
    }

    public empresa(String nome, String destination, String cidade, int CEP, int phone) {
        this.nome = nome;
        this.destination = destination;
        this.cidade = cidade;
        this.CEP = CEP;
        this.phone = phone;
    }

    public String getNome() {
        return nome;
    }

    public String getDestination() {
        return destination;
    }

    public String getCidade() {
        return cidade;
    }

    public int getCEP() {
        return CEP;
    }

    public int getPhone() {
        return phone;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public void setCEP(int CEP) {
        this.CEP = CEP;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }
    
    public static void main(String args[]){
        empresa emp1 = new empresa();
        
        int opt = -1;
        
        while (opt != 23){
            emp1.setCEP(Integer.parseInt(JOptionPane.showInputDialog("CEP: ")));
            emp1.setCidade(JOptionPane.showInputDialog("Cidade: "));
            emp1.setDestination(JOptionPane.showInputDialog("Destination: "));
            emp1.setNome(JOptionPane.showInputDialog("Nome: "));
            emp1.setPhone(Integer.parseInt(JOptionPane.showInputDialog("Phone: ")));
        }
    }
}
