package com.example.cointracker;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class WalletUnitTest {
  @Test
  public void createWallet() {
    // Create a new Wallet instance, with 42 EUR in it
    Wallet wallet = new Wallet(42);

    // Check that the wallet actually contains 42 EUR
    assertEquals(42, wallet.getContenu(), 0.001);
  }
  @Test
  public void depositMoney() {
    // Create a new Wallet instance, with 42 EUR in it
    Wallet wallet = new Wallet(0);
    wallet.remplit(10);

    // Check that the wallet actually contains 42 EUR
    assertEquals(10, wallet.getContenu(), 0.001);
  }
  @Test
  public void withdrawMoney() {
    // Create a new Wallet instance, with 42 EUR in it
    Wallet wallet = new Wallet(30);
    wallet.retire(10);

    // Check that the wallet actually contains 42 EUR
    assertEquals(20, wallet.getContenu(), 0.001);
  }

  @Test
  public void testToken() {
    //AuthActivity authActivity = new AuthActivity(); // Original remplacé par ligne suivante
    AuthActivity authActivity = mock(AuthActivity.class);//ajout pour Mockito
    when(authActivity.getJeton()).thenReturn("Jeton Bouchonné");//ajout pour Mockito
    String jeton = authActivity.getJeton();
    System.out.println(jeton);//ajout pour Mockito
  }
}