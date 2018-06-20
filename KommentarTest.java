

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Die Test-Klasse KommentarTest.
 *
 * @author  (Ihr Name)
 * @version (eine Versionsnummer oder ein Datum)
 */
public class KommentarTest
{
    private Produkt produkt1;
    private Produkt produkt2;

    /**
     * Konstruktor fuer die Test-Klasse KommentarTest
     */
    public KommentarTest()
    {
    }

    /**
     *  Setzt das Testgerüst fuer den Test.
     *
     * Wird vor jeder Testfall-Methode aufgerufen.
     */
    @Before
    public void setUp()
    {
        produkt1 = new Produkt("Motorrad", 2000);
        produkt2 = new Produkt("Dodo", 3);
    }

    /**
     * Gibt das Testgerüst wieder frei.
     *
     * Wird nach jeder Testfall-Methode aufgerufen.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void testMethode()
    {
        Produkt produkt1 = new Produkt("Fahrrad", 2094);
        assertEquals(true, produkt1.kommentarHinzufuegen("Patrick Tehmann", "Tolles Fahrrad", 5));
        assertEquals(true, produkt1.kommentarHinzufuegen("Marco Steinbrahm", "Hilft nicht falls das Haus brennt! Schlecht!", 1));
        assertEquals(2, produkt1.gibAnzahlKommentare());
    }

    @Test
    public void testnullPunkte()
    {
        assertEquals(false, produkt2.kommentarHinzufuegen("Niklas Nähmann", "Schrott!", 0));
    }

    @Test
    public void nullStimmenBewertung()
    {
    }
}



