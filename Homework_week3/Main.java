import java.util.Scanner;

public class Main {
    static Scanner input =new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("isminiz ne");
        String isim;
        isim =input.next();
        System.out.println("soy isminizi giriniz");
        String soyisim;
        soyisim=input.next();
        if((isim.equals("yusuf"))&&(soyisim.equals("mermertas")))
        {
            System.out.println("isim ve soyisim dogru");
        }
        else
        {
            System.out.println("isim ve soyisim dogru degil");
        }
        System.out.println(isim +" " +soyisim);
    }}
