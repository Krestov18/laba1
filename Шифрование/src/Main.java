import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("1)Зашифровать. \n" + "2)Дешифровать. \n" + "3)Частотная таблица. \n");
        String text = "";

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        try (BufferedReader reader = new BufferedReader(new FileReader("C:/Users/Антон/Desktop/123.txt"))) {
            String str = null;
            while ((str = reader.readLine()) != null) {
                text = text + str;
            }

            //text.getBytes();

            char[] buf = new char[256];
            int c;
            while((c=reader.read(buf))>0){
                if (c<256){
                    buf = Arrays.copyOf(buf, c);
                }
                StringBuilder output = new StringBuilder();

                for (byte b =0; buf.length>b; b++){
                    switch(a){
                        case 1: buf[b] = (char) (buf[b]+1);
                            break;
                        case 2: buf[b] = (char) (buf[b]-1);
                            break;
                    }
                    //buf[b] = (char) (buf[b]+1);
                    output.append(buf[b]);
                }
                //System.out.println(output);
                FileWriter writer = new FileWriter("C:/Users/Антон/Desktop/logs.txt");
                writer.write(String.valueOf(output));
                writer.close();
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }


    }
}
