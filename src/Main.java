import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
                Scanner resul = new Scanner(System.in);
        System.out.println("nhap chieu cao");
          double heigh = resul.nextDouble();
        System.out.println("nhap can nang");
        double with = resul.nextDouble();
            double BMI = with/(heigh*heigh);

        if(BMI < 18.5){
            System.out.println("gay qua !"+ BMI);
        }else if(BMI < 25){
            System.out.println("hoi gay !" + BMI);
        }else if(BMI < 30){
            System.out.println("binh thuong!" + BMI);
        }else if(BMI > 30){
            System.out.println("beo qua !" + BMI);
        }
    }
}
