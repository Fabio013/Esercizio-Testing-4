import org.junit.jupiter.api.Test;
import java.time.DayOfWeek;
import java.time.OffsetDateTime;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {

    @Test
    public void testGetAnno() {
        // Crea un oggetto OffsetDateTime dalla data richiesta
        OffsetDateTime data = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        // Chiama il metodo del Main getAnno() e lo associa alla variabile
        int anno = Main.getAnno(data);
        // Verifica che l'anno ottenuto sia 2023
        assertEquals(2023, anno);
    }

    @Test
    public void testGetMese() {
        OffsetDateTime data = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        int mese = Main.getMese(data);
        assertEquals(3, mese);
    }

    @Test
    public void testGetGiornoMese() {
        OffsetDateTime data = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        int giornoMese = Main.getGiornoMese(data);
        assertEquals(1, giornoMese);
    }

    @Test
    public void testGetGiornoSettimana() {
        OffsetDateTime data = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        DayOfWeek giornoSettimana = Main.getGiornoSettimana(data);
        assertEquals(DayOfWeek.WEDNESDAY, giornoSettimana);
    }
}