import ru.netology.jproject_3_06.services.SQRService;

public class Main {
    public static void main(String[] args) {
        SQRService count = new SQRService();
        System.out.println(count.countOfSquares(100, 9801));

    }
}
