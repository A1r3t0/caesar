import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;

public class caesarShifr {
    public static void main(String[] args) throws IOException {
        BufferedReader reader1 = new BufferedReader(new InputStreamReader(System.in));
        char chars[] = new char[] {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', ',', '!', '-', '.', '?', ':', ';', '\"', '\'', ' '};

        System.out.println("Введите текст, который вы хотите зашифровать и нажмите Enter: ");
        String reader3 = reader1.readLine();
        StringReader reader = new StringReader(reader3);

        System.out.println("Введите шаг сдвига (число) и нажмите клавишу Enter: ");
        try {
            String reader2 = reader1.readLine();
            int key = Integer.parseInt(reader2);
            System.out.println(decode(reader, key, chars));
        }
        catch (Exception e) {
            System.out.println("Шаг сдвига пустой!!!");
        }



    }

    public static String decode(StringReader reader, int key, char chars[]) {

        try {
            BufferedReader br = new BufferedReader(reader);
            String s = br.readLine();

            char[] line = s.toCharArray();

            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < line.length; i++) {
                char z;
                z = (char) (line[i] + key);
                sb.append(z);
                for (char aChar : chars) {
                    if (line[i] == aChar) {
                        sb.deleteCharAt(i);
                        z = (line[i]);
                        sb.append(z);
                    }
                }

            }
            return sb.toString();
        }
        catch (Exception e) {
            System.out.println("Строка пустая!!!");
        }
        return "";
    }
}
