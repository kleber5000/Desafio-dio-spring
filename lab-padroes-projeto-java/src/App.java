import one.Facade.Facade;
import one.Singleton.SingletonEager;
import one.Singleton.SingletonLazy;
import one.Singleton.SingletonLazyHolder;
import one.Strategy.Comportamento;
import one.Strategy.ComportamentoAgressivo;
import one.Strategy.ComportamentoDefensivo;
import one.Strategy.ComportamentoNormal;
import one.Strategy.Robo;

public class App {
    public static void main(String[] args) throws Exception {

        //Singleton:
        
        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);

        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println(eager);
        eager = SingletonEager.getInstancia();
        System.out.println(eager);

        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);
        lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);

        //Strategy:

        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento normal = new ComportamentoNormal();
        Comportamento agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();
        robo.setComportamento(normal);

        robo.mover();
        robo.mover();
        

        //Facade:

        Facade facade = new Facade();
        facade.migrarCliente("Kleber", "49090000");
    }
}
