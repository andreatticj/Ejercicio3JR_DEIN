package eu.andreatt.ejercicio3jr_dein.application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

/**
 * Clase principal de la aplicación JavaFX.
 * Representa el punto de entrada para la aplicación "Supermercado Andrea".
 */
public class Ejercicio3 extends Application {

    /**
     * Función principal para inicializar y configurar la interfaz gráfica de usuario (GUI).
     *
     * @param stage La ventana principal de la aplicación.
     * @throws IOException Si ocurre un error al cargar el archivo FXML.
     */
    @Override
    public void start(Stage stage) throws IOException {
        // Carga el archivo FXML que define la interfaz de usuario
        FXMLLoader fxmlLoader = new FXMLLoader(Ejercicio3.class.getResource("/eu/andreatt/ejercicio3jr_dein/fxml/supermercado.fxml"));

        // Crea una escena con el contenido cargado desde el archivo FXML
        Scene scene = new Scene(fxmlLoader.load());

        // Configura las propiedades de la ventana
        stage.setMinHeight(400); // Altura mínima de la ventana
        stage.setMinWidth(600); // Anchura mínima de la ventana
        stage.setResizable(false); // Impide que la ventana sea redimensionada
        stage.setTitle("Supermercado Andrea"); // Título de la ventana principal
        stage.setScene(scene); // Establece la escena para la ventana principal
        stage.show(); // Muestra la ventana principal
    }

    /**
     * Función principal que lanza la aplicación.
     *
     * @param args Argumentos de línea de comandos.
     */
    public static void main(String[] args) {
        launch(); // Lanza la aplicación JavaFX
    }
}
