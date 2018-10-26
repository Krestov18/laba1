import java.io.*;
import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        String input = "abcd";
        char[] chars = input.toCharArray();
        StringBuilder output = new StringBuilder();
        for (byte b = 1; chars.length > b; b++) {
            chars[b] = (char) (chars[b] + 1);
            output.append(chars[b]);
        }
        System.out.println(output);
    }
}
//char[] up = {'À','Á','Â','Ã','Ä','Å','¨','Æ','Ç','È','É','Ê','Ë','Ì','Í','Î','Ï',
//        'Ð','Ñ','Ò','Ó','Ô','Õ','Ö','×','Ø','Ù','Ú','Û','Ü','Ý','Þ','ß'};
//char[] low = {'à','á','â','ã','ä','å','¸','æ','ç','è','é','ê','ë','ì','í','î','ï',
//        'ð','ñ','ò','ó','ô','÷','ö','÷','ø','ù','ú','û','ü','ý','þ','ÿ'};

// FileWriter writer = new FileWriter("D:/Test/logs.txt");
// writer.write();
// writer.close();

//  treeMap.put(String.valueOf(chars[i]),k++);
//  for(int j = 0; j<chars.length; j++){
//      if(g == chars[j]){
//          k++;
//      }
//  }
//  treeMap.put(String.valueOf(chars[i]),k);
//  k=0;

// for(Map.Entry<String, Integer> entry: treeMap.entrySet()){
//     System.out.println(entry.getKey()+" : "+entry.getValue());
// }

//                for (int i = 0; i<chars.length; i++) {
//        chars[i] = (char) (chars[i] + 1);
//        }
//
//        for(int i = 0; i<chars.length; i++){
//        char g = chars[i];
//        if(Character.isLetter(g)) {
//        if (treeMap.containsKey(String.valueOf(g))) {
//        treeMap.put(String.valueOf(g), treeMap.get(String.valueOf(g)) + 1);
//        } else {
//        treeMap.put(String.valueOf(g), 1);
//        }
//        }
//        }
//        for(Map.Entry<String, Integer> entry: treeMap.entrySet()){
//        System.out.println(entry.getKey()+" : "+entry.getValue());
//        }
//        break;

//             for (int i = 0; i < chars.length; i++) {
//        char g = chars[i];
//        if (Character.isLetter(g)) {
//        if (four.containsKey(String.valueOf(g))) {
//        four.put(String.valueOf(g), four.get(String.valueOf(g)) + 1);
//        } else {
//        four.put(String.valueOf(g), 1);
//        }
//        }
//        }

//                    char[] h ;
//                    try (BufferedReader reader = new BufferedReader(new FileReader("D:/Test/logsNecode.txt"))) {
//                        String str = null;
//                        while ((str = reader.readLine()) != null) {
//                            text = text + str;
//                        }
//                    } catch (IOException ex) {
//                        System.out.println(ex.getMessage());
//                    }
//                    h = text.toCharArray();
//                    text = "";
//                    for(int i = 0; i<h.length; i++){
//                        for(int j= 0; j<h.length; j++){
//                            if (hh.containsKey(String.valueOf(h[i]+h[j]))) {
//                            } else {
//                                hh.put(String.valueOf(h[i]+h[j]), 0);
//                            }
//                        }
//                    }
