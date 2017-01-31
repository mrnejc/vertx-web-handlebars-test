import io.vertx.core.Vertx;
import io.vertx.ext.web.Router;
import io.vertx.ext.web.handler.TemplateHandler;
import io.vertx.ext.web.templ.HandlebarsTemplateEngine;

public class HandlebarsTest {

    public static void main(String[] args) {
        try {
            Vertx vertx = Vertx.vertx();
            Router router = Router.router(vertx);
            router.route().handler(TemplateHandler.create(HandlebarsTemplateEngine.create()));
            vertx.createHttpServer().requestHandler(router::accept).listen(8080);
        } catch (Exception ignore) {}
    }
}
