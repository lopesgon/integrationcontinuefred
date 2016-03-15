// Frédéric - Modification de l'en-tête pour le test du Fetch & Merge
package mvc;

/**
 *
 * @author fredericlopesgoncalvesmagalhaes
 */
public class Action {
  
  public static final int INSERT = 0, DELETE = 1, UPDATE = 2; // UPDATE NON UTILISE !
  
  private int act;
  private int ind;
  
  public Action(int act, int ind) {
    this.act = act;
    this.ind = ind;
  } // Constructeur
  
  public int getAct() {return act;} // getAct
  public int getInd() {return ind;} // getPos
  
 

}
//coucou les copains
//Voici ma modification 17:33:10
//Petite modif supplémentaire depuis GitHub pour tester la pull request depuis l'ordinateur personnel de nicolas
