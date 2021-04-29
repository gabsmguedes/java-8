import java.time.*;
import java.time.format.DateTimeFormatter;

public class Datas {
    public static void main(String[] args) {
        LocalDate hoje = LocalDate.now();
        System.out.println("hoje: " + hoje);

        LocalDate olimpiada = LocalDate.of(2023, Month.JUNE, 5);
        int anos = olimpiada.getYear() - hoje.getYear();

        System.out.println("anos: " + anos);

        Period periodo = Period.between(hoje, olimpiada);
        System.out.println("periodo: " + periodo.getDays());

        LocalDate proximaOlimpiada = olimpiada.plusYears(4);
        System.out.println("proximo olimpiada" + proximaOlimpiada);

        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String proximaOlimpiadaFormatada = proximaOlimpiada.format(formatador);
        System.out.println("proxima Olimpiada Formatada: " + proximaOlimpiadaFormatada);

        DateTimeFormatter formatadorComHoras = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm");
        LocalDateTime agora = LocalDateTime.now();
        System.out.println("agora: " + agora.format(formatadorComHoras));

        LocalTime intervalo = LocalTime.of(15, 30);
        System.out.println("intervalo: " + intervalo);

    }
}
