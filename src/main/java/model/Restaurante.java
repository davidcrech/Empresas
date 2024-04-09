
package model;
import javax.swing.JOptionPane;

public class Restaurante extends empresa{
    private String TipoComida;
    private double MediumPrice;
    
    public Restaurante(){
        this("", 0, "", "", "", 0, 0);
    }

    public Restaurante(String TipoComida, double MediumPrice, String nome, String destination, String cidade, int CEP, int phone) {
        super(nome, destination, cidade, CEP, phone);
        this.TipoComida = TipoComida;
        this.MediumPrice = MediumPrice;
    }

    public String getTipoComida() {
        return TipoComida;
    }

    public double getMediumPrice() {
        return MediumPrice;
    }

    public void setTipoComida(String TipoComida) {
        this.TipoComida = TipoComida;
    }

    public void setMediumPrice(double MediumPrice) {
        this.MediumPrice = MediumPrice;
    }
    
    public static void main(String args[]){
        Restaurante res1 = new Restaurante();
        
        res1.setTipoComida(JOptionPane.showInputDialog("Tipo da comida: "));
        res1.setMediumPrice(Double.parseDouble(JOptionPane.showInputDialog("Preço médio: ")));
    }
    
}
