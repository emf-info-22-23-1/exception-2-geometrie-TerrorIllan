package exercicegeometrieexception.ihm;

public interface IIhmCtrl {

    void demarrer();

    void afficheResultatCircle( String value );

    void afficheResultatRectangle( String value );

    void afficheMessage( String message );

    public String getTCircleAire();

    public String getTRectangleAire();

    public String getTRectangleLonguer();
}
