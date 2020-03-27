import instruments.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class PianoTest {

    Instrument piano;

    @Before
    public void before(){
        piano = new Piano(Materials.WOOD, Colours.BLACK, Types.KEYBOARD, 12.44, 13.67);
    }

    @Test
    public void hasMaterial(){
        assertEquals(Materials.WOOD, piano.getMaterial());
        assertEquals("Wood", piano.getMaterial().getValue());
    }

    @Test
    public void hasColour(){
        assertEquals(instruments.Colours.BLACK, piano.getColour());
        assertEquals("Black", piano.getColour().getValue());
    }

    @Test
    public void hasType(){
        assertEquals(Types.KEYBOARD, piano.getType());
        assertEquals("Keyboard", piano.getType().getValue());
    }

    @Test
    public void canPlayMusic(){
        assertEquals("Moonlight Sonata", piano.play());
    }

    @Test
    public void canSetBuyingPrice(){
        piano.setBuyingPrice(100);
        assertEquals(100, piano.getBuyingPrice(), 0);
    }

    @Test
    public void canSetSellingPrice(){
        piano.setSellingPrice(120.5);
        assertEquals(120.5, piano.getSellingPrice(), 0);
    }


    @Test
    public void canCalculateMarkup(){
        piano.setBuyingPrice(100);
        piano.setSellingPrice(125);
        assertEquals(25, piano.calculateMarkup(), 0);
    }



}
