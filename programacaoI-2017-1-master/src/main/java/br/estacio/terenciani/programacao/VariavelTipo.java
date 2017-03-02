package br.estacio.terenciani.programacao;


public class VariavelTipo {

   

        
       public static void main(String[] args) {
        
        //imprime();
        //variavel inteira chamada "x" recebe o valor 10
        int x = 10;
        //variavel inteira chamada "y" recebe o valor 4
        int y = 4;
        
        int resultado;
        
        resultado = multiplica(x,y);
        
        System.out.println("O resultado eh: " + resultado);
        
    }
    
    public static int multiplica (int x, int y){
        return x * y;
    }
    
     public static void imprime(){
        System.out.println("-----");
        System.out.println("Teste");
        System.out.println("-----");
    }
   
    
}
