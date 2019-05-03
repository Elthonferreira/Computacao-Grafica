package Projeto;
import Beans.Salvar;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class JavaFX extends Application{

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage arg0) throws Exception {
		int width = 1100, height = 650;
		Canvas canvas = new Canvas(width, height);
		GraphicsContext grafico = canvas.getGraphicsContext2D();
		// grafico.fillRect(250, 250, 30, 30); // Desenhe uma bola
		
		Salvar draw = Desenhos.le_arquivo("vaso");
		draw = Desenhos.normalizacao(draw, width, height);
		
		grafico.fillRect(0, 0, width, height); // Pintar um pixel gigante do tamanho da tela
		grafico.setFill(Color.WHITE);		   // Cor branca
		
		for(int i = 10; i < draw.pontos.size(); i++) { // Pintar tela
			grafico.fillRect(draw.pontos.get(i).x, draw.pontos.get(i).y, 50, 50); // Cords (x, y, largura pixel, altura pixel)
		}
				
		Group grupo = new Group(canvas);
		Scene cena = new Scene(grupo);
		
		arg0.setScene(cena);
		arg0.show();
	}

}
