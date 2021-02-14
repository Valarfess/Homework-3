package academy.belhard;

public class Main {

    public static void main(String[] args) {
        int month = 10;

        if (month == 12 || month == 1 || month == 2) {
            System.out.print("Зима");
        }
            else if (month == 3 || month == 4 || month == 5){
                System.out.print("Весна");
        }
        else if (month == 6 || month == 7 || month == 8) {
            System.out.print("Лето");
        }
        else if (month == 9 || month == 10 || month == 11) {
            System.out.print("Осень");
        }
	// write your code here
    }
}
