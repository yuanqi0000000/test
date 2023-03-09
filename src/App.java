import java.time.LocalDate;
public class App {
    public static void main(String[] args) throws Exception {
        String str1 = "2022-02-01";
        LocalDate date = LocalDate.parse(str1);
        System.out.println(date);
    }
}
