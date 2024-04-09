/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal;

import model.*;
import javax.swing.JOptionPane;

public class principal {
    public static void main(String args[]){
       Restaurante res = new Restaurante();
       int opt = -1;
       
       while (opt != 23){
           opt = Integer.parseInt(JOptionPane.showInputDialog("1 - CEP\n"
                   + "2 - Nome\n"
                   + "3 - Phone\n"
                   + "4 - Destination\n"
                   + "5 - Cidade\n"
                   + "6 - Tipo da comida\n"
                   + "7 - Preço médio\n"
                   + "23 - Sair"));
           if (opt == 1){
               res.getCEP();
           }
           if (opt == 2){
               res.getNome();
           }
           if (opt == 3){
               res.getPhone();
           }
           if (opt == 4){
               res.getDestination();
           }
           if (opt == 5){
               res.getCidade();
           }
           if (opt == 6){
               res.getTipoComida();
           }
           if (opt == 7){
               res.getMediumPrice();
           }
           if (opt == 23){
               opt = 23;
           }
           
           
       }
    }
}
