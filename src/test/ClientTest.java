package test;

import org.junit.Test;
import inheritanceandinterfaces.Client;
import enums.Membership;

public class ClientTest {

    @Test
    public void testClient(){
        Client  client1= new Client("Patrick","Asiedu",0, Membership.Bronze);
        System.out.println(client1);

    }

}