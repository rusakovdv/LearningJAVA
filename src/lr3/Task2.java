package lr3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        System.out.println("Выберите версию программы:\n" +
                "1 - на основе вложенных условных операторов\n " +
                "2 - на основе оператора выбора switch");
        Scanner in = new Scanner(System.in);
        int ver = in.nextInt();


        switch (ver){
            case 1:
                System.out.println("Введите название дня недели");
                String nday;
                Scanner inn = new Scanner(System.in);
                nday = inn.nextLine();
                if (nday.equals("понедельник")){
                    System.out.println("Порядковый номер понедельника - 1");
                } else if (nday.equals("вторник")) {
                    System.out.println("Порядковый номер вторника - 2");
                }else if (nday.equals("среда")) {
                    System.out.println("Порядковый номер среды - 3");
                }else if (nday.equals("четверг")) {
                    System.out.println("Порядковый номер четверга - 4");
                }else if (nday.equals("пятница")) {
                    System.out.println("Порядковый номер пятницы - 5");
                }else if (nday.equals("суббота")) {
                    System.out.println("Порядковый номер субботы - 6");
                }else if (nday.equals("воскресенье")) {
                    System.out.println("Порядковый номер воскресенья - 7");
                }else {
                    System.out.println("Такого дня нет");

            }
                break;
            case 2:
                System.out.println("Введите название дня недели");
                Scanner innn = new Scanner(System.in);
                String nameday = innn.nextLine();
                switch (nameday){
                    case "понедельник":
                        System.out.println("Порядковый номер понедельника - 1");
                        break;
                    case "вторник":
                        System.out.println("Порядковый номер вторника - 2");
                        break;
                    case "среда":
                        System.out.println("Порядковый номер среды - 3");
                        break;
                    case "четверг":
                        System.out.println("Порядковый номер четверга - 4");
                        break;
                    case "пятница":
                        System.out.println("Порядковый номер пятницы - 5");
                        break;
                    case "суббота":
                        System.out.println("Порядковый номер субботы - 6");
                        break;
                    case "воскресенье":
                        System.out.println("Порядковый номер воскресенья - 7");
                        break;
                    default:
                        System.out.println("Такого дня нет");
                        break;
                }
            default:
                System.out.println("Такой версии нет");

            }
        }
    }

