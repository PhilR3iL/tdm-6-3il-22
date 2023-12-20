package ecole3il.tdm6.exo12;

/**
 * La classe TripletHeterogene représente une structure
 * contenant trois éléments de types différents.
 *
 * @param <T> Type du premier élément.
 * @param <U> Type du deuxième élément.
 * @param <V> Type du troisième élément.
 * 
 * @author proussille
 */
public class TripletHeterogene<T, U, V> {
    
    /** Premier élément du triplet. */
    private final T premier;
    
    /** Deuxième élément du triplet. */
    private final U second;
    
    /** Troisième élément du triplet. */
    private final V troisieme;

    /**
     * Constructeur de la classe TripletHeterogene.
     *
     * @param premier   Le premier élément du triplet.
     * @param second    Le deuxième élément du triplet.
     * @param troisieme Le troisième élément du triplet.
     */
    public TripletHeterogene(T premier, U second, V troisieme) {
        this.premier = premier;
        this.second = second;
        this.troisieme = troisieme;
    }

    /**
     * Retourne le premier élément du triplet.
     *
     * @return Le premier élément.
     */
    public T getPremier() {
        return premier;
    }

    /**
     * Retourne le deuxième élément du triplet.
     *
     * @return Le deuxième élément.
     */
    public U getSecond() {
        return second;
    }

    /**
     * Retourne le troisième élément du triplet.
     *
     * @return Le troisième élément.
     */
    public V getTroisieme() {
        return troisieme;
    }

    /**
     * Affiche les éléments du triplet.
     */
    public void affiche() {
        System.out.println("TripletHeterogene [premier=" + premier + ", second=" + second + ", troisieme=" + troisieme + "]");
    }
}
