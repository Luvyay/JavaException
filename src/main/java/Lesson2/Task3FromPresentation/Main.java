package Lesson2.Task3FromPresentation;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        InputStream inputStream;
        try {
            String[] string = {"asdf", "asdf"};
            String str = string[2];
            test();
            int a = 1 / 0;
            inputStream = new FileInputStream("sdafgdsaf");
        } catch (StackOverflowError error) {
            System.out.println("stack overflow error");
        } catch (Throwable e) {
            e.printStackTrace();
        } finally {
            System.out.println("Я все равно выполнился!");
        }
        System.out.println("Я жив!");
    }

    private static void test() throws IOException {
        File file = new File("1");
        file.createNewFile();
        FileReader reader = new FileReader(file);
        reader.read();
        test();
    }
}
