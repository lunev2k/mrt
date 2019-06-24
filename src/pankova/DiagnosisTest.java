package pankova;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;


public class DiagnosisTest {
    private Diagnosis diagnosis;

    @Before
    public void setUp() {
        diagnosis = new Diagnosis();
    }

    @Test
    public void calculate_defalt() {
        String result = diagnosis.calculate(0.0, 0.0, 0.0);

        assertEquals(result, "Не удалось произвести расчет");
    }

    @Test
    public void calculate_hnu_moreone() {
        String result = diagnosis.calculate(0.0, 0.0, 0.0);

        assertEquals(result, "Межпозвоночный диск разрушается");
    }

    @Test
    public void calculate_hny_moreone() {
        String result = diagnosis.calculate(0.0, 0.0, 0.0);

        assertEquals(result, "Позвонок разрушается");
    }
}