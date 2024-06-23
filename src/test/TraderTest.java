package test;

import objectsandclasses.Account;
import objectsandclasses.Trade;
import objectsandclasses.Trader;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TraderTest {

    @Test
    public void testTrader(){
        Account account = new Account();
        account.setTotalValue(0);
        Trader trader = new Trader("Patrick" , account);
//        Trade trade1 = new Trade("T1", "AAPL", 10 ,5);
//        Trade trade2 = new Trade("T2", "SEM", 10 ,5);
//        trader.addTrade(trade1);
//        trader.addTrade(trade2);
        assertEquals(100, account.getTotalValue());
    }

}