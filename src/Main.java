import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int n1,n2,islem,toplam = 0;
        Scanner input= new Scanner(System.in);
        System.out.print("Lütfen işlem yapmak istediğiniz ilk sayıyı girin: ");
        n1=input.nextInt();

        System.out.print("Lütfen işlem yapmak istediğiniz ikinci sayıyı girin: ");
        n2= input.nextInt();

        System.out.print("Yapmak istediğiniz işlem toplama ise 1 çıkarma ise 2 çarpma ise 3 bölme ise 4 yazın");
        islem=input.nextInt();
        switch (islem){
            case 1:
                toplam=n1+n2;
                break;
            case 2:
                toplam=n1-n2;
                break;
            case 3:
                toplam=n1*n2;
                break;
            case 4:
                if (n2 !=0)
                {toplam=n1/n2;
                    break;}
                else {
                    System.out.print("Bir sayı sıfıra bölünemez");
                }

            default:
                System.out.print("Hattalı işlem yaptınız!!!");
                break;


        }
        
        System.out.print("Yaptığınız işlemin sonucu: "+toplam);
    }
}