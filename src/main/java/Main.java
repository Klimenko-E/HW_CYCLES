import ru.netology.services.VacationService;

public class Main {

    public static void main(String[] args) {

        VacationService service = new VacationService();

        System.out.println(service.calculate(100_000, 60_000, 150_000));

    }
}