import java.time.DayOfWeek;
import java.time.OffsetDateTime;
/*  Crea un oggetto data da questa stringa 2023-03-01T13:00:00Z
    Ottieni l'anno
    Ottieni il mese
    Ottieni il giorno
    Ottieni il giorno della settimana
    Stampa i risultati sulla console -Crea dei test per questo esercizio */

public class Main {
    public static void main(String[] args) {
        OffsetDateTime data = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        int anno = getAnno(data);
        int mese = getMese(data);
        int giornoMese = getGiornoMese(data);
        DayOfWeek giornoSettimana = getGiornoSettimana(data);
        System.out.println("Anno: " + anno + "\nMese: " + mese + "\nGiorno: " + giornoMese + "\nGiorno della settimana: " + giornoSettimana);
    }

    // Metodo per ottenere l'anno
    static int getAnno(OffsetDateTime data) {
        return data.getYear();
    }
    // Metodo per ottenere il mese
    static int getMese(OffsetDateTime data) {
        return data.getMonthValue();
    }
    // Metodo per ottenere il giorno del mese
    static int getGiornoMese(OffsetDateTime data) {
        return data.getDayOfMonth();
    }
    // Metodo per ottenere il giorno della settimana
    static DayOfWeek getGiornoSettimana(OffsetDateTime data) {
        return data.getDayOfWeek();
    }
}