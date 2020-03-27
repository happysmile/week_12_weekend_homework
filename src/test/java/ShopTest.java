import instruments.*;
import items.GuitarString;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;
    Piano piano;
    Guitar guitar;
    GuitarString guitarString;

    @Before
    public void before(){
        shop = new Shop("Francesca's Shop");
        piano = new Piano(Materials.WOOD, Colours.BLACK, Types.KEYBOARD, 1236.44, 1399.67);
        guitar = new Guitar(Materials.PLASTIC, Colours.BROWN, Types.GUITAR, 457.99, 609.78);
        guitarString = new GuitarString("string A", "guitar string", 12.55, 15.99);
    }

    @Test
    public void hasName(){
        assertEquals("Francesca's Shop", shop.getName());
    }

    @Test
    public void startsWithEmptyStock(){
        assertEquals(0, shop.numberOfItemsInStock());
    }

    @Test
    public void canAddItemsToStock(){
        assertEquals(0, shop.numberOfItemsInStock());
        shop.addItem(piano);
        assertEquals(1, shop.numberOfItemsInStock());
    }

    @Test
    public void canRemoveItemsFromStock(){
        shop.addItem(piano);
        shop.addItem(guitarString);
        assertEquals(2, shop.numberOfItemsInStock());
        shop.removeItem(piano);
        assertEquals(1, shop.numberOfItemsInStock());
    }

    @Test
    public void canCalculateTotalProfit(){
        shop.addItem(piano);
        shop.addItem(guitarString);
        shop.addItem(guitar);
        assertEquals(163.23, piano.calculateMarkup(), 0.01);
        assertEquals(151.79, guitar.calculateMarkup(), 0.01);
        assertEquals(3.44, guitarString.calculateMarkup(), 0.01);
        assertEquals(318.46, shop.totalProfit(), 0.01);
    }



}
