import Beans.Salvar;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.stage.Stage;

public class JavaFX extends Application{

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage arg0) throws Exception {
		int width = 500, height = 500;
		Canvas canvas = new Canvas(width, height);
		GraphicsContext grafico = canvas.getGraphicsContext2D();
		// grafico.fillOval(250, 250, 30, 30); // Desenhe uma bola
		
		Salvar s1 = Desenhos.le_arquivo("vaso");
		
		
		
		
		Group grupo = new Group(canvas);
		Scene cena = new Scene(grupo);
		
		arg0.setScene(cena);
		arg0.show();
	}

}
