package Lesson3.View;

import Lesson3.Controller.SaveInfoAppController;

public class Response {
    private SaveInfoAppController saveInfoAppController;

    public Response(SaveInfoAppController saveInfoAppController) {
        this.saveInfoAppController = saveInfoAppController;
    }

    public String writeUser(String[] inputStrings) {
        if (saveInfoAppController.writeUser(inputStrings)) {
            return "Пользователь записан!";
        } else {
            return "Что то пошло не так!";
        }
    }
}
