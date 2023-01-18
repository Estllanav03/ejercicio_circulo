import java.util.Scanner;

public class Circulo {

    private double radio;

    public Circulo(double radio){

        if(radio < 0){
            this.radio = 0;
        }else {
            this.radio = radio;
        }
    }

    public double getRadio(){
        return this.radio;
    }

    public double getArea(){
        return radio * radio * Math.PI;
    }
}

class Cilindro extends Circulo {

    private double altura;

    public Cilindro(double radio, double altura){
        super(radio);


        if (altura < 0){
            this.altura = 0;
        }else {
            this.altura = altura;
        }
    }

    public double getAltura(){
        return this.altura;
    }

    public double getVolume(){
        return getArea() * altura;
    }
}

class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el radio del círculo: ");
        double radio = sc.nextDouble();
        Circulo circulo = new Circulo(radio);

        System.out.println("El radio del circulo es: " + circulo.getRadio());
        System.out.println("El area del circulo es: " + circulo.getArea());

        System.out.println("Introduce la altura: ");
        double altura = sc.nextDouble();

        Cilindro  cilindro = new Cilindro(radio, altura);

        System.out.println("La altura del cilindro es: " + cilindro.getAltura());





    }
}




