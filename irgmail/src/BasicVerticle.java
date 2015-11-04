import io.vertx.core.AbstractVerticle;

public class BasicVerticle extends AbstractVerticle{
	
	@Override
	public void start() {
		System.out.println("Verticle created.");
	}
	
	@Override
	public void stop() {
		System.out.println("Verticle stopped.");
	}
}
