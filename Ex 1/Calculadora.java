public class Calculadora {
    
    public static double somar(double num1, double num2){
        return num1 + num2;
    }

    public static double subtracao(double num1, double num2){
        return num1 - num2;
    }

    
    public static double multiplicacao(double num1, double num2){
        return num1 * num2;
    }

    public static double divisao(double num1, double num2){
        if (num2 == 0) 
        {
            System.err.println("Divisão por zero!");
            return Double.NaN; 
        }else 
        {
            return num1 / num2;
        }
    }
}