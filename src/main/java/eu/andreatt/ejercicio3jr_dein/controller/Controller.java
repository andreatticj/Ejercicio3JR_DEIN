package eu.andreatt.ejercicio3jr_dein.controller;

import eu.andreatt.ejercicio3jr_dein.bbdd.ConexionBD;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.view.JasperViewer;

import java.sql.Connection;
import java.util.HashMap;
import java.util.Map;

/**
 * Clase Controller que gestiona los eventos y la lógica para generar y visualizar reportes utilizando JasperReports.
 */
public class Controller {

    @FXML
    private Button btnGenerarGrafico;

    @FXML
    private Button btnGenerarProductos;

    @FXML
    private Button btnGenerarSecciones;

    @FXML
    private Button btnGenerarTabla;

    private ConexionBD conexionBD;

    /**
     * Función de inicialización que se ejecuta al cargar el controlador.
     * Establece la conexión a la base de datos.
     */
    @FXML
    public void initialize() {
        conexion();
    }

    /**
     * Función para inicializar la conexión a la base de datos.
     * Si ocurre un error, muestra un mensaje de alerta.
     */
    private void conexion() {
        try {
            conexionBD = new ConexionBD();
        } catch (Exception e) {
            generarVentana(Alert.AlertType.ERROR, "Error al conectar a la base de datos", "ERROR").show();
            System.out.println(e.getMessage());
        }
    }

    /**
     * Función genérica para cargar y mostrar un archivo JRXML.
     *
     * @param reportPath Ruta relativa del archivo JRXML dentro del classpath.
     */
    private void cargarReporte(String reportPath) {
        try {
            // Compila el archivo JRXML
            JasperReport report = JasperCompileManager.compileReport(getClass().getResourceAsStream(reportPath));

            // Obtiene la conexión a la base de datos
            Connection conn = conexionBD.getConexion();

            // Parámetros que se pasarán al reporte Jasper
            Map<String, Object> parameters = new HashMap<>();
            String imageBasePath = getClass().getResource("/eu/andreatt/ejercicio3jr_dein/images/").toString();
            parameters.put("REPORT_IMAGE", imageBasePath);

            // Llena el informe con los datos y los parámetros
            JasperPrint jprint = JasperFillManager.fillReport(report, parameters, conn);

            // Muestra el informe
            JasperViewer viewer = new JasperViewer(jprint, false);
            viewer.setVisible(true);
        } catch (Exception e) {
            generarVentana(Alert.AlertType.ERROR, "Ha ocurrido un error al abrir el reporte", "ERROR").show();
            e.printStackTrace();
        }
    }

    /**
     * Función para generar un cuadro de alerta con un mensaje personalizado.
     *
     * @param tipoDeAlerta Tipo de alerta (ERROR, INFORMATION, WARNING, etc.).
     * @param mensaje      Mensaje que se mostrará en la alerta.
     * @param title        Título de la alerta.
     * @return Objeto Alert configurado.
     */
    private Alert generarVentana(Alert.AlertType tipoDeAlerta, String mensaje, String title) {
        Alert alerta = new Alert(tipoDeAlerta);
        alerta.setContentText(mensaje);
        alerta.setHeaderText(null);
        alerta.setTitle(title);
        return alerta;
    }

    /**
     * Evento asociado al botón para generar un gráfico.
     *
     * @param event Evento ActionEvent del botón.
     */
    @FXML
    void handleGenerarGrafico(ActionEvent event) {
        cargarReporte("/eu/andreatt/ejercicio3jr_dein/reportes/ejercicio3_graficos.jrxml");
    }

    /**
     * Evento asociado al botón para generar un reporte de productos.
     *
     * @param event Evento ActionEvent del botón.
     */
    @FXML
    void handleGenerarProductos(ActionEvent event) {
        cargarReporte("/eu/andreatt/ejercicio3jr_dein/reportes/ejercicio3_prods.jrxml");
    }

    /**
     * Evento asociado al botón para generar un reporte de secciones.
     *
     * @param event Evento ActionEvent del botón.
     */
    @FXML
    void handleGenerarSecciones(ActionEvent event) {
        cargarReporte("/eu/andreatt/ejercicio3jr_dein/reportes/ejercicio3_secci.jrxml");
    }

    /**
     * Evento asociado al botón para generar un reporte en forma de tabla.
     *
     * @param event Evento ActionEvent del botón.
     */
    @FXML
    void handleGenerarTabla(ActionEvent event) {
        cargarReporte("/eu/andreatt/ejercicio3jr_dein/reportes/ejercicio3_tablas.jrxml");
    }
}
