import junit.framework.TestCase;

public class CongelamientoTest extends TestCase{
	private Pooglin unPooglin;
	private Congelamiento congelar;
	public void setUp(){
		unPooglin = new Pooglin(0,0);
		congelar = new Congelamiento();
	}

	public void testUtilizarPersonaje() {
		congelar.utilizar(unPooglin);
		assertFalse(unPooglin.estaVivo());
	}

	public void testUtilizarTerreno() {
	}

}
