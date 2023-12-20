package ecole3il.tdm6.exo11;

/**
 * La classe Triplet représente une structure contenant trois éléments du même type.
 *
 * @param <T> Le type des éléments stockés dans le triplet.
 * 
 * @author proussille
 */
public class Triplet<T> {
    
    /** Premier élément du triplet. */
    private T premier;
    
    /** Deuxième élément du triplet. */
    private T second;
    
    /** Troisième élément du triplet. */
    private T troisième;

    /**
     * Constructeur de la classe Triplet.
     *
     * @param premier   Le premier élément du triplet.
     * @param second    Le deuxième élément du triplet.
     * @param troisième Le troisième élément du triplet.
     */
    public Triplet(T premier, T second, T troisième) {
        this.premier = premier;
        this.second = second;
        this.troisième = troisième;
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
    public T getSecond() {
        return second;
    }

    /**
     * Retourne le troisième élément du triplet.
     *
     * @return Le troisième élément.
     */
    public T getTroisième() {
        return troisième;
    }

    /**
     * Affiche les éléments du triplet.
     */
    public void affiche() {
        System.out.println("Triplet [premier=" + premier + ", second=" + second + ", troisième=" + troisième + "]");
    }
}

