/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1;


        

/**
 *
 * @author joaok
 */
public class JavaApplication1 {

    private static double calcularPorcentagem(double total, double valor){
        double porc = (valor *100) / total;
        return porc;
    }
    
    
    public static void main(String[] args){
        System.out.println("Questão 2");
        System.out.println("-------------------------------------");
        int n1 = 0, n2 =1 , n3= 0, i;
        i = 2584; //Definir aqui o numero
        while (i>n3){
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
        }
        if( i == n3){
            System.out.println("o numero " + i + " pertence a sequencia");
        }
        else{
           System.out.println("o numero " + i + " nao pertence a sequencia");
        }
        //
        System.out.println("");
        System.out.println("Questão 3");
        System.out.println("-------------------------------------");
        int diasUteis =0;
        double total=0;
        double media=0;
        double maior=0;
        int diasMaiores=0;
        double valores[] = {31490.7866,37277.9400,37708.4303,0,0,17934.2269,0,6965.1262,
        24390.9374,14279.6481,0,0,39807.6622,27261.6304,39775.6434,29797.6232,17216.5017,
        0,0,12974.2000,28490.9861,8748.0937,8889.0023,17767.5583,0,0,3071.3283,48275.2994,
        10299.6761,39874.1073};
        double menor=valores[0];
        
        for(int cont = 0; cont<valores.length;cont++){
            if(valores[cont]!= 0){
                diasUteis++;
                total = total + valores[cont];
            }
        }
        media = total/diasUteis;
        for(int cont = 0; cont<valores.length;cont++){
            if(valores[cont] > maior){
                maior = valores[cont];
            }
            else if((valores[cont] < menor)&&(valores[cont]!= 0)){
                menor = valores[cont];
            }
            if (valores[cont] > media){
                diasMaiores++;
            }
        }
        System.out.println("o maior valor do mes foi R$ " + maior);
        System.out.println("o menor valor do mes foi R$ " + menor);
        System.out.println("o numero de dias com faturamento maior que a media foi " + diasMaiores);
        //
        System.out.println("");
        System.out.println("Questão 4");
        System.out.println("-------------------------------------");
        double sp = 67836.43;
        double rj = 36678.66;
        double mg = 29229.88;
        double es = 27165.48;
        double outros = 19849.53;
        double totalEstados = sp + rj + mg + es + outros;
        System.out.println("SP = " + calcularPorcentagem(totalEstados, sp) + "%");
        System.out.println("RJ = " + calcularPorcentagem(totalEstados, rj)+ "%");
        System.out.println("MG = " + calcularPorcentagem(totalEstados, mg)+ "%");
        System.out.println("ES = " + calcularPorcentagem(totalEstados, es)+ "%");
        System.out.println("Outros = " + calcularPorcentagem(totalEstados, outros)+ "%");
        
        //
        System.out.println("");
        System.out.println("Questão 5");
        System.out.println("-------------------------------------");
        String paraInverter = "cachorro"; //string a ser invertida
        String invertida ="";
        for(int aux = paraInverter.length()-1;aux>=0;aux--){
            invertida= invertida + paraInverter.charAt(aux);
        }
        System.out.println(invertida);
	}
   
        
    
}
