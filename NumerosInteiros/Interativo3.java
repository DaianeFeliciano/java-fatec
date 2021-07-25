/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula3;
//import javax.swing.*; quando coloca * traz tudo que tem la dentro
import javax.swing.JOptionPane; // PODE USAR O SCANNER TB
/**
 *
 * @author daian
 */
public class Interativo3 {
    //Atributos
    public String nome; //atributos de acesso publico, todo mundo pode acessar 
    public double peso;
    public double altura;
    public double imc;
    
    // métodos # 3 tipos de submotivos
    public void leitura(){
    
        nome = JOptionPane.showInputDialog(null, "Digite o nome: ");
        
        peso = 
                Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o peso: ")); // jpane quando digite tudo nele ele converte p/ tezto
         
        altura = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a altura: ")); // tem que converte para número         
      
    };//leitura
    
    public void calcular(){
    
        imc = peso / Math.pow(altura, 2); 
        JOptionPane.showMessageDialog(null,"Calculo IMC feito com sucesso");// classe math faz parte do java lang n precisa dar import
    } //calculo
    
    public void imprimir (){
        
        String msg;
        if ( imc < 18)
        { msg = "Você está abaixo do peso"; 
        }
        else if ( imc <= 24.9)
        {    
         msg = "Você está com peso normal";
        }
        else 
             msg = "Você está acima do peso";
        
        JOptionPane.showMessageDialog(null, msg,"Situação do IMC", JOptionPane.INFORMATION_MESSAGE);
    } //mostrar // saida
    
    public static void main(String[] args) {
        Interativo3 obj1 = new Interativo3 (); // executa na memoria o objetivo, fez estanciamento
        obj1.leitura();
        obj1.calcular();
        obj1.imprimir();
    }
    
}
