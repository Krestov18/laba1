import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Map;
import java.util.TreeMap;

public class Test3 {
    public static void main(String[] args) {

        System.out.print("1)Зашифровать. \n" + "2)Дешифровать. \n" + "3)Частотная таблица не шифрованного текста. \n" + "4)Частотная таблица шифрованного текста. \n" + "5)Дешифровать с помощью частотной таблицы. \n" + "0)Выход. \n");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        String text = "";
        char[] chars;

        TreeMap<String, Integer> treeMap = new TreeMap<>();
        TreeMap<String, Integer> four = new TreeMap<>();
        TreeMap<Integer, String> two = new TreeMap<>();
        TreeMap<Integer, String> three = new TreeMap<>();



        char[] low = {'а','б','в','г','д','е','ё','ж','з','и','й','к','л','м','н','о','п',
                'р','с','т','у','ф','х','ц','ч','ш','щ','ъ','ы','ь','э','ю','я'};

        while(a != 0) {
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
                    int k ;
                    int t = 1;
                    for (int i = 0; i < chars.length; i++) {
                        k = 1;
                        for(int j = 0; j < low.length; j++) {
                            if(j!=33 - t & k!=0) {
                                if (chars[i] == low[j]) {
                                    chars[i] = low[j + t];
                                    k = k-1;
                                }
                            }
                            if(j==33 - t & k!=0){
                                if (chars[i] == low[j]) {
                                    chars[i] = low[0];
                                    k = k - 1;
                                }
                            }
                        }
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
                        for(int j = 0; j < low.length; j++) {
                            if(chars[i] == low[j]) {
                                if(j!=32) {
                                    chars[i] = low[j + 1];
                                }else{
                                    chars[i] = low[0];
                                }
                            }
                        }
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
                        for(int j = 0; j < low.length; j++) {
                            if(g == low[j]) {
                                if (treeMap.containsKey(String.valueOf(g))) {
                                    treeMap.put(String.valueOf(g), treeMap.get(String.valueOf(g)) + 1);
                                } else {
                                    treeMap.put(String.valueOf(g), 1);
                                }
                            }
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
                        writer.write("------------------------"+lene);
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
                        for(int j = 0; j<low.length; j++) {
                            if(g == low[j]) {
                                if (four.containsKey(String.valueOf(g))) {
                                    four.put(String.valueOf(g), four.get(String.valueOf(g)) + 1);
                                } else {
                                    four.put(String.valueOf(g), 1);
                                }
                            }
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
                        writer.write("------------------------"+lene);
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
                    char[] c ;
                    char[] d ;
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
                    for (int i = 0; i < chars.length; i++){
                        for(int j = 0; j < d.length; j++){
                            if(chars[i] == d[j]){
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
            }
            System.out.print("1)Зашифровать. \n" + "2)Дешифровать. \n" + "3)Частотная таблица не шифрованного текста. \n" + "4)Частотная таблица шифрованного текста. \n" + "5)Дешифровать с помощью частотной таблицы. \n" + "0)Выход. \n");
            Scanner scan = new Scanner(System.in);
            a = scan.nextInt();
        }
    }
}

