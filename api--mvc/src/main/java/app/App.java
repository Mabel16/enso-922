package app;

import io.jooby.Jooby;

public class App extends Jooby {

  {

    mvc(new Controller());
    mvc(new Soma());
    mvc(new Divisao());
    mvc(new Subtracao());
    mvc(new Multiplicacao());

  }

  public static void main(final String[] args) {
    runApp(args, App::new);
  }

}
