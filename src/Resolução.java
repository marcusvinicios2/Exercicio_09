import java.lang.Math;
import java.util.Locale;

void main() {
    Locale.setDefault(Locale.US);

    Scanner sc = new Scanner(System.in);


    double altura;
    double peso;

    System.out.println("Digite sua altura(utilize .): ");
    altura=sc.nextDouble();

    System.out.println("Digite seu peso: ");
    peso=sc.nextDouble();

     //Fórmula do IMC = Peso/(altura)²//

    double Imc = (peso/ Math.pow(altura,2));
    System.out.printf("Seu Imc %.2f%n ", Imc);

    if (Imc < 18.5){
        System.out.println("Abaixo do Peso");
    }else if (Imc <=24.9){
        System.out.println("Peso normal ");
    } else if (Imc <=29.9) {
        System.out.println("Acima do Peso");
        
    } else if (Imc <= 34.9) {
        System.out.println("Obesidade grau 1 ");
        
    } else if (Imc <=39.9) {
        System.out.println("Obesidade Grau 2 ");
        
    }else {
        System.out.println("Obesidade Grau 3 ");
    }

}
