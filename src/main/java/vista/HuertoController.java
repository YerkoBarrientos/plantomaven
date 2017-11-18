package vista;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.text.Text;
import modelo.Grupo;

public class HuertoController {
	
	
	@FXML private TableView<Grupo> 					tablaPlantasHuerto;
	
	@FXML private TableColumn<Grupo, String> 		columnaNombre;
	@FXML private TableColumn<Grupo, Number> 		columnaNumero;
	@FXML private TableColumn<Grupo, Number> 		columnaGrupo;

	@FXML private Button 							botonAgregarPlantas;
	@FXML private Button 							botonEliminarPlantas;
	@FXML private Button 							botonEditarGrupo;
	@FXML private Button 							botonEliminarGrupo;
	
	
	@FXML private Text textoNombre;
	@FXML private Text textoNombreCient;
	
	@FXML private Text textoTiempoRestante;
	@FXML private Text textoFechaInicio;
	@FXML private Text textoFechaTermino;
	
	@FXML private ProgressBar barraProgreso;
	
	
	@FXML public void initialize() {
		columnaNombre.setCellValueFactory(celda -> celda.getValue().nombreProperty());
		columnaNumero.setCellValueFactory(celda -> celda.getValue().numPlantasProperty());
		columnaGrupo.setCellValueFactory(celda -> celda.getValue().grupoProperty());
		
		interacciones();
	}
	
	
	
	public void agregarItems(ObservableList<Grupo> grupo) {
		tablaPlantasHuerto.setItems(grupo);
	}
	
	public void mostrarGrupo(Grupo grupo) {
		
		if(grupo!=null) {
		
		long diasFinal = LocalDate.parse(grupo.getTiempoInicio()).until(LocalDate.parse(grupo.getTiempoInicio()).plusMonths(Integer.parseInt(grupo.getTiempo())), ChronoUnit.DAYS);
		long diasRestantes = LocalDate.now().until(LocalDate.parse(grupo.getTiempoInicio()).plusMonths(Integer.parseInt(grupo.getTiempo())), ChronoUnit.DAYS);
		
		double da = (double)diasFinal;
		double df = (double)diasRestantes;
		
		
			
			
			barraProgreso.setProgress(((da - df + 0) / 100.0) + 0.02);
			
			if(grupo.getNumPlantas()>1) {
				textoNombre.setText(grupo.getNumPlantas()+" "+grupo.getNombre()+"/s");
			} else { textoNombre.setText(grupo.getNumPlantas()+" "+grupo.getNombre()); }
			
			textoNombreCient.setText(grupo.getNombreCient());
			
			textoTiempoRestante.setText(diasRestantes+" días aprox.");
			textoFechaInicio.setText(grupo.getTiempoInicio());
			textoFechaTermino.setText(grupo.getTiempo()+" meses");
		}
	}
	
	public void interacciones() {
		
		tablaPlantasHuerto.getSelectionModel().selectedItemProperty().addListener(
	            (observable, oldValue, newValue) -> {
	            	mostrarGrupo(newValue);
	            	
	            });
	}
	

	
	

}
