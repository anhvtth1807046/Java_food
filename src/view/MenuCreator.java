package view;

import controller.FoodController;

import java.util.Scanner;

public class MenuCreator {

    public void createMenu(){
        FoodController controller = new FoodController();
        Scanner scanner = new Scanner(System.in);
      while (true){
          System.out.println("————————Foodydi——————— \n 1. " +
                  "Thêm món ăn.\n 2. " +
                  "Hiển thị danh sách món ăn.\n " +
                  "3. Thoát chương trình." +
                  "\n ——————————————————— \n");

          int choice = scanner.nextInt();

          switch (choice){
              case 1:
                  controller.addFood();
                  break;
              case 2:
                  controller.printList();
                  break;
              case 3:
                  System.out.println("Hẹn gặp lại bạn sau...;.");
                  System.exit(0);
                  break;
              default:
                  break;

          }
      }
    }
}
