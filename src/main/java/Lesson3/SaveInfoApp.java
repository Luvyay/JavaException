package Lesson3;

import Lesson3.Controller.SaveInfoAppController;
import Lesson3.Exception.SizeArrayLargerException;
import Lesson3.Exception.SizeArraySmallerException;
import Lesson3.Model.SaveInfoAppModel;
import Lesson3.View.Response;

import java.util.Scanner;

public class SaveInfoApp {
    public SaveInfoApp() {
        /*
        Информация для пользователя, сообщающая что делает данная программа.
         */
        System.out.println("Данное приложение принимает данные челловека и записывает их в файл.");
    }

    public void runApp() {
        /*
        Метод, который запрашивает у пользователя данные и производит первичную проверку на корректность данных.
        В случае не корректного ввода выбрасывает исключение.
        Если все корректно, то передает запрос на обработку и получает ответ обратно.
         */
        System.out.println("Введите данные в формате (\"Фамилия Имя Отчество датарождения номертелефона пол\")");
        System.out.print("Ввод: ");

        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().trim().split(" ");
        int sizeArrayAfterSplit = 6;

        if (input.length < sizeArrayAfterSplit) {
            throw new SizeArraySmallerException(sizeArrayAfterSplit);
        } else if (input.length > sizeArrayAfterSplit) {
            throw new SizeArrayLargerException(sizeArrayAfterSplit);
        }

        Response response = initial();

        System.out.println(response.writeUser(input));
    }

    private Response initial() {
        SaveInfoAppModel saveInfoAppModel = new SaveInfoAppModel();
        SaveInfoAppController saveInfoAppController = new SaveInfoAppController(saveInfoAppModel);

        return new Response(saveInfoAppController);
    }
}
