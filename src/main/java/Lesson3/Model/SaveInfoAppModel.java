package Lesson3.Model;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


public class SaveInfoAppModel {
    private String path = "src/main/java/Lesson3/resources/";

    public boolean writeUser(String surname, String firstname, String patronymic,
                             String dateOfBirth, String phoneNumber, String sex) {
        String pathWrite = this.path + surname + ".txt";

        try (FileWriter fileWriter = new FileWriter(pathWrite, true);
        BufferedWriter out = new BufferedWriter(fileWriter)) {
            out.write(String.format("<%s><%s><%s><%s><%s><%s>\n",
                    surname, firstname, patronymic, dateOfBirth, phoneNumber, sex));
        } catch (IOException e) {
            e.printStackTrace();
        }

        return true;
    }
}
