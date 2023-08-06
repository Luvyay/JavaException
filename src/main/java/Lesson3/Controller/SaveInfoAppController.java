package Lesson3.Controller;

import Lesson3.Model.SaveInfoAppModel;

public class SaveInfoAppController {
    private SaveInfoAppModel saveInfoAppModel;

    public SaveInfoAppController(SaveInfoAppModel saveInfoAppModel) {
        this.saveInfoAppModel = saveInfoAppModel;
    }

    public boolean writeUser(String[] inputStrings) {
        CheckInfo checkInfo = new CheckInfo(inputStrings);
        if (checkInfo.CheckInfoResponse()) {
            // inputStrings = [Фамилия, Имя, Отчество, датарождения, номертелефона, пол]
            String surname = inputStrings[0];
            String firstname = inputStrings[1];
            String patronymic = inputStrings[2];
            String dateOfBirth = inputStrings[3];
            String phoneNumber = inputStrings[4];
            String sex = inputStrings[5];

            saveInfoAppModel.writeUser(surname, firstname, patronymic, dateOfBirth, phoneNumber, sex);
            return true;
        } else {
            return false;
        }
    }
}
