import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TEST4 {
    public static void main (String[] args){
        double A;
        int Y1;
        int Y2;
        int P;
        double x1;
        double x2;
        int Z1;
        int Z2;
        int t;
        Scanner scanner = new Scanner(System.in);

        System.out.print("P : ");
        P = scanner.nextInt();
        System.out.print("A меньше Р : ");
        A = scanner.nextInt();
        System.out.print("х1 : ");
        x1 = scanner.nextInt();
        System.out.print( "х2 : ");
        x2 = scanner.nextInt();

        for(double i = 1; i<P-1; i++){
            t = (int) Math.pow(A, i) % P;
            if(!(1<t) & !(t<P-1)){
                System.out.print("Ошибка");
                System.exit(1);
            }
        }

        Y1 = (int) Math.pow(A, x1) % P;
        Y2 = (int) Math.pow(A, x2) % P;

        Z1 = (int) Math.pow(Y2, x1) % P;
        Z2 = (int) Math.pow(Y1, x2) % P;

        String fileName = "C:/Users/Антон/Desktop/LOG.txt";
        File file = new File(fileName);
        if (file.exists()) {
            file.delete();
        } else {
            System.out.println("файл не найден");
        }

        try (FileWriter writer = new FileWriter(fileName, false)) {
            String lene = System.getProperty("line.separator");
            writer.write("Алиса зашифровала Y1 = "+Y1 +lene);
            writer.write("Боб зашифровал Y2 = "+Y2+lene);
            writer.write("Алиса нашла обший ключ Z = " + Z1+lene);
            writer.write("Боб нашёл общий ключ Z = " +Z2+lene);

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }


        System.out.println("Ответ Y1 = "+Y1);
        System.out.println("Ответ Y2 = "+Y2);
        System.out.println("Ответ Z1 = "+Z1);
        System.out.println("Ответ Z2 = "+Z2);
    }
}
