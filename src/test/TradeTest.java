package test;

import exceptions.TradeIDException;
import inheritanceandinterfaces.BondTrade;
import org.testng.annotations.Test;
import objectsandclasses.Trade;


import static org.junit.jupiter.api.Assertions.*;

public class TradeTest {
    @Test
    public void testTrade() throws TradeIDException {
//        Trade trade = new Trade("T1", "AAPL", 100 ,4);
//        assertEquals(4, trade.getPrice());

        Trade trade1 = new BondTrade("T1", "AAPL", 100 ,4,2);
//        Trade trade2 = new BondTrade("T1", "AAIPL", 100 ,4,2);
        TradeIDException exception = assertThrows(TradeIDException.class,()->{new BondTrade("T1", "AAIPL", 100 ,4,2);});
        assertEquals("Trade Id EXists",exception.getMessage());



    }




}