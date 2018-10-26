import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Map;
import java.util.TreeMap;

public class Test2 {
    public static void main(String[] args) {

        System.out.print("1)Зашифровать. \n" + "2)Дешифровать. \n" + "3)Частотная таблица не шифрованного текста. \n" + "4)Частотная таблица шифрованного текста. \n" + "5)Дешифровать с помощью частотной таблицы. \n" + "6)Таблица биграмм шифрованного текста. \n" + "7)Таблица биграмм не шифрованного текста. \n" + "8)Расшифровка с помощью биграмм. \n" + "0)Выход. \n");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        String text = "";
        char[] chars;

        TreeMap<String, Integer> treeMap = new TreeMap<>();
        TreeMap<String, Integer> four = new TreeMap<>();
        TreeMap<Integer, String> two = new TreeMap<>();
        TreeMap<Integer, String> three = new TreeMap<>();

        TreeMap<String, Integer> vv = new TreeMap<>();
        TreeMap<String, Integer> hh = new TreeMap<>();
        TreeMap<Integer, String> hhh = new TreeMap<>();
        TreeMap<Integer, String> vvv = new TreeMap<>();

        while (a != 0) {
            switch (a) {
                case 1: //--------------------------------------------------------------------------------
                    //==
                    try (BufferedReader reader = new BufferedReader(new FileReader("D:/Test/123.txt"))) {
                        String str = null;
                        while ((str = reader.readLine()) != null) {
                            text = text + str;
                        }
                    } catch (IOException ex) {
                        System.out.println(ex.getMessage());
                    }
                    chars = text.toCharArray();
                    //==
                    for (int i = 0; i < chars.length; i++) {
                        chars[i] = (char) (chars[i] + 1);
                    }
                    try (FileWriter writer = new FileWriter("D:/Test/encode123.txt")) {
                        writer.write(chars);
                    } catch (IOException ex) {
                        System.out.println(ex.getMessage());
                    }
                    chars = null;
                    text = "";
                    break;
                case 2: //--------------------------------------------------------------------------------
                    //==
                    try (BufferedReader reader = new BufferedReader(new FileReader("D:/Test/encode123.txt"))) {
                        String str = null;
                        while ((str = reader.readLine()) != null) {
                            text = text + str;
                        }
                    } catch (IOException ex) {
                        System.out.println(ex.getMessage());
                    }
                    chars = text.toCharArray();
                    //==
                    for (int i = 0; i < chars.length; i++) {
                        chars[i] = (char) (chars[i] - 1);
                    }
                    try (FileWriter writer = new FileWriter("D:/Test/decode123.txt")) {
                        writer.write(chars);
                    } catch (IOException ex) {
                        System.out.println(ex.getMessage());
                    }
                    chars = null;
                    text = "";
                    break;
                case 3: //--------------------------------------------------------------------------------
                    //==
                    try (BufferedReader reader = new BufferedReader(new FileReader("D:/Test/123.txt"))) {
                        String str = null;
                        while ((str = reader.readLine()) != null) {
                            text = text + str;
                        }
                    } catch (IOException ex) {
                        System.out.println(ex.getMessage());
                    }
                    chars = text.toCharArray();
                    //==
                    for (int i = 0; i < chars.length; i++) {
                        char g = chars[i];
                        if (treeMap.containsKey(String.valueOf(g))) {
                            treeMap.put(String.valueOf(g), treeMap.get(String.valueOf(g)) + 1);
                        } else {
                            treeMap.put(String.valueOf(g), 1);
                        }
                    }
                    for (Map.Entry<String, Integer> entry : treeMap.entrySet()) {
                        three.put(entry.getValue(), entry.getKey());
                    }
                    try (FileWriter writer = new FileWriter("D:/Test/logs123.txt", false)) {
                        String lene = System.getProperty("line.separator");
                        for (Map.Entry<String, Integer> entry : treeMap.entrySet()) {
                            writer.write(entry.getKey() + " : " + entry.getValue() + lene);
                        }
                        writer.write("------------------------" + lene);
                        for (Map.Entry<Integer, String> entry : three.entrySet()) {
                            writer.write(entry.getKey() + " : " + entry.getValue() + lene);
                        }
                    } catch (IOException ex) {
                        System.out.println(ex.getMessage());
                    }
                    try (FileWriter writer = new FileWriter("D:/Test/logsNecode.txt", false)) {
                        for (Map.Entry<Integer, String> entry : three.entrySet()) {
                            writer.write(entry.getValue());
                        }
                    } catch (IOException ex) {
                        System.out.println(ex.getMessage());
                    }
                    chars = null;
                    text = "";
                    break;
                case 4: //--------------------------------------------------------------------------------
                    //==
                    try (BufferedReader reader = new BufferedReader(new FileReader("D:/Test/321.txt"))) {
                        String str = null;
                        while ((str = reader.readLine()) != null) {
                            text = text + str;
                        }
                    } catch (IOException ex) {
                        System.out.println(ex.getMessage());
                    }
                    chars = text.toCharArray();
                    //==
                    for (int i = 0; i < chars.length; i++) {
                        char g = chars[i];
                        if (four.containsKey(String.valueOf(g))) {
                            four.put(String.valueOf(g), four.get(String.valueOf(g)) + 1);
                        } else {
                            four.put(String.valueOf(g), 1);
                        }
                    }
                    for (Map.Entry<String, Integer> entry : four.entrySet()) {
                        two.put(entry.getValue(), entry.getKey());
                    }
                    try (FileWriter writer = new FileWriter("D:/Test/logs321.txt", false)) {
                        String lene = System.getProperty("line.separator");
                        for (Map.Entry<String, Integer> entry : four.entrySet()) {
                            writer.write(entry.getKey() + " : " + entry.getValue() + lene);
                        }
                        writer.write("------------------------" + lene);
                        for (Map.Entry<Integer, String> entry : two.entrySet()) {
                            writer.write(entry.getKey() + " : " + entry.getValue() + lene);
                        }
                    } catch (IOException ex) {
                        System.out.println(ex.getMessage());
                    }
                    try (FileWriter writer = new FileWriter("D:/Test/logsEncode.txt", false)) {
                        for (Map.Entry<Integer, String> entry : two.entrySet()) {
                            writer.write(entry.getValue());
                        }
                    } catch (IOException ex) {
                        System.out.println(ex.getMessage());
                    }
                    chars = null;
                    text = "";
                    break;
                case 5: //--------------------------------------------------------------------------------
                    char[] c;
                    char[] d;
                    try (BufferedReader reader = new BufferedReader(new FileReader("D:/Test/logsNecode.txt"))) {
                        String str = null;
                        while ((str = reader.readLine()) != null) {
                            text = text + str;
                        }
                    } catch (IOException ex) {
                        System.out.println(ex.getMessage());
                    }
                    c = text.toCharArray();
                    text = "";
//                    String y = String.valueOf(c);
//                    String k = new StringBuffer(y).reverse().toString();
//                    c = k.toCharArray();
                    try (BufferedReader reader = new BufferedReader(new FileReader("D:/Test/logsEncode.txt"))) {
                        String str = null;
                        while ((str = reader.readLine()) != null) {
                            text = text + str;
                        }
                    } catch (IOException ex) {
                        System.out.println(ex.getMessage());
                    }
                    d = text.toCharArray();
                    text = "";
//                    String f = String.valueOf(d);
//                    String p = new StringBuffer(f).reverse().toString();
//                    d = p.toCharArray();
                    try (BufferedReader reader = new BufferedReader(new FileReader("D:/Test/321.txt"))) {
                        String str = null;
                        while ((str = reader.readLine()) != null) {
                            text = text + str;
                        }
                    } catch (IOException ex) {
                        System.out.println(ex.getMessage());
                    }
//                    try (FileWriter writer = new FileWriter("D:/Test/logs333.txt", false)) {
//                        String lene = System.getProperty("line.separator");
//                        writer.write(Arrays.toString(c) + lene);
//                        writer.write("------------------------"+lene);
//                        writer.write(Arrays.toString(d) + lene);
//                    } catch (IOException ex) {
//                        System.out.println(ex.getMessage());
//                    }
                    chars = text.toCharArray();
                    for (int i = 0; i < chars.length; i++) {
                        for (int j = 0; j < d.length; j++) {
                            if (chars[i] == d[j]) {
                                chars[i] = c[j];
                            }
                        }
                    }
                    try (FileWriter writer = new FileWriter("D:/Test/finish.txt", false)) {
                        writer.write(chars);
                    } catch (IOException ex) {
                        System.out.println(ex.getMessage());
                    }
                    break;
                case 6:
                    int aa = -1;
                    try (BufferedReader reader = new BufferedReader(new FileReader("D:/Test/321.txt"))) {
                        String str = null;
                        while ((str = reader.readLine()) != null) {
                            text = text + str;
                        }
                    } catch (IOException ex) {
                        System.out.println(ex.getMessage());
                    }
                    chars = text.toCharArray();
                    //==
                    for (int i = 0; i < chars.length; i++) {
                        aa = aa + 1;
                    }
                    for (int i = 0; i < chars.length; i++) {
                        if ((i < aa) & (i != aa)) {
                            char g = chars[i];
                            char o = chars[i + 1];
                            // if(Character.isLetter(g) & Character.isLetter(o)) {
                            if (hh.containsKey(String.valueOf(g) + String.valueOf(o))) {
                                hh.put(String.valueOf(g) + String.valueOf(o), hh.get(String.valueOf(g) + String.valueOf(o)) + 1);
                            } else {
                                hh.put(String.valueOf(g) + String.valueOf(o), 1);
                            }
                            // }
                        }
                    }
                    for (Map.Entry<String, Integer> entry : hh.entrySet()) {
                        hhh.put(entry.getValue(), entry.getKey());
                    }
                    try (FileWriter writer = new FileWriter("D:/Test/BE/logs321.txt", false)) {
                        String lene = System.getProperty("line.separator");
                        for (Map.Entry<String, Integer> entry : hh.entrySet()) {
                            writer.write(entry.getKey() + " : " + entry.getValue() + lene);
                        }
                        writer.write("------------------------" + lene);
                        for (Map.Entry<Integer, String> entry : hhh.entrySet()) {
                            writer.write(entry.getKey() + " : " + entry.getValue() + lene);
                        }
                    } catch (IOException ex) {
                        System.out.println(ex.getMessage());
                    }
                    try (FileWriter writer = new FileWriter("D:/Test/BE/logsEncode.txt", false)) {
                        for (Map.Entry<Integer, String> entry : hhh.entrySet()) {
                            writer.write(entry.getValue());
                        }
                    } catch (IOException ex) {
                        System.out.println(ex.getMessage());
                    }
                    chars = null;
                    text = "";
                    break;
                case 7:
                    int bb = -1;
                    try (BufferedReader reader = new BufferedReader(new FileReader("D:/Test/123.txt"))) {
                        String str = null;
                        while ((str = reader.readLine()) != null) {
                            text = text + str;
                        }
                    } catch (IOException ex) {
                        System.out.println(ex.getMessage());
                    }
                    chars = text.toCharArray();
                    //==
                    for (int i = 0; i < chars.length; i++) {
                        bb = bb + 1;
                    }
                    for (int i = 0; i < chars.length; i++) {
                        if ((i < bb) & (i != bb)) {
                            char g = chars[i];
                            char o = chars[i + 1];
                            //if(Character.isLetter(g) & Character.isLetter(o)) {
                            if (vv.containsKey(String.valueOf(g) + String.valueOf(o))) {
                                vv.put(String.valueOf(g) + String.valueOf(o), vv.get(String.valueOf(g) + String.valueOf(o)) + 1);
                            } else {
                                vv.put(String.valueOf(g) + String.valueOf(o), 1);
                            }
                            //}
                        }
                    }
                    for (Map.Entry<String, Integer> entry : vv.entrySet()) {
                        vvv.put(entry.getValue(), entry.getKey());
                    }
                    try (FileWriter writer = new FileWriter("D:/Test/BE/logs123.txt", false)) {
                        String lene = System.getProperty("line.separator");
                        for (Map.Entry<String, Integer> entry : vv.entrySet()) {
                            writer.write(entry.getKey() + " : " + entry.getValue() + lene);
                        }
                        writer.write("------------------------" + lene);
                        for (Map.Entry<Integer, String> entry : vvv.entrySet()) {
                            writer.write(entry.getKey() + " : " + entry.getValue() + lene);
                        }
                    } catch (IOException ex) {
                        System.out.println(ex.getMessage());
                    }
                    try (FileWriter writer = new FileWriter("D:/Test/BE/logsNecode.txt", false)) {
                        for (Map.Entry<Integer, String> entry : vvv.entrySet()) {
                            writer.write(entry.getValue());
                        }
                    } catch (IOException ex) {
                        System.out.println(ex.getMessage());
                    }
                    chars = null;
                    text = "";
                    break;
                case 8:
                    int kk = -1;
                    int ll = -1;
                    int mm = -1;
                    c = null;
                    d = null;
                    try (BufferedReader reader = new BufferedReader(new FileReader("D:/Test/BE/logsNecode.txt"))) {
                        String str = null;
                        while ((str = reader.readLine()) != null) {
                            text = text + str;
                        }
                    } catch (IOException ex) {
                        System.out.println(ex.getMessage());
                    }
                    c = text.toCharArray();
                    text = "";

                    try (BufferedReader reader = new BufferedReader(new FileReader("D:/Test/BE/logsEncode.txt"))) {
                        String str = null;
                        while ((str = reader.readLine()) != null) {
                            text = text + str;
                        }
                    } catch (IOException ex) {
                        System.out.println(ex.getMessage());
                    }
                    d = text.toCharArray();
                    text = "";

                    try (BufferedReader reader = new BufferedReader(new FileReader("D:/Test/321.txt"))) {
                        String str = null;
                        while ((str = reader.readLine()) != null) {
                            text = text + str;
                        }
                    } catch (IOException ex) {
                        System.out.println(ex.getMessage());
                    }
                    String f = String.valueOf(d);
                    String p = new StringBuffer(f).reverse().toString();
                    d = p.toCharArray();

                    String y = String.valueOf(c);
                    String k = new StringBuffer(y).reverse().toString();
                    c = k.toCharArray();

                    chars = text.toCharArray();
                    for (int i = 0; i < chars.length; i++) {
                        kk = kk + 1;
                    }
                    for (int i = 0; i < d.length; i++) {
                        ll = ll + 1;
                    }
                    for (int i = 0; i < c.length; i++) {
                        mm = mm + 1;
                    }
                    ll = 11;
                    mm = 11;
                    for (int i = 0; i < chars.length; i++) {
                        if ((i < kk) & (i != kk)) {
                            for (int j = 0; j < d.length; j++) {
                                if ((j < ll) & (j != ll)) {
                                    if (chars[i] + chars[i + 1] == d[j] + d[j + 1]) {
                                        if ((j < mm) & (j != mm)) {
                                            chars[i] = c[j];
                                            chars[i + 1] = c[j + 1];
                                        }
                                    }
                                }
                                j++;
                            }
                        }
                        i++;
                    }
                    try (FileWriter writer = new FileWriter("D:/Test/BE/finish.txt", false)) {
                        writer.write(chars);
                    } catch (IOException ex) {
                        System.out.println(ex.getMessage());
                    }
                    break;
            }
            System.out.print("1)Зашифровать. \n" + "2)Дешифровать. \n" + "3)Частотная таблица не шифрованного текста. \n" + "4)Частотная таблица шифрованного текста. \n" + "5)Дешифровать с помощью частотной таблицы. \n" + "6)Таблица биграмм шифрованного текста. \n" + "7)Таблица биграмм не шифрованного текста. \n" + "8)Расшифровка с помощью биграмм. \n" + "0)Выход. \n");
            Scanner scan = new Scanner(System.in);
            a = scan.nextInt();
        }
    }
}
