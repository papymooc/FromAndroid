package com.example.cointracker;

/**
 * CoinTracker Créé par Papy
 */
public class Wallet {
  public int mContenu;
  public Wallet (int contenu){
    mContenu = contenu;
  }

  public int getContenu() {
    return mContenu;
  }
  public void remplit(int valeur) {
    mContenu += valeur;
    return;
  }
  public void retire(int valeur) {
    mContenu -= valeur;
    return;
  }
}
