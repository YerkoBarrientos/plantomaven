package modelo;

import java.time.LocalDate;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Grupo {
	
	
	private final StringProperty id, nombre, nombreCient, epocaSiembra, luz, tipoPlantac, profund, distanciaEntre, tiempo, tiempoInicio;
	private final IntegerProperty numPlantas, grupo;
	
	public Grupo(int numPlantas, int grupo, String id, String nom, String nomCient, String epoca, String l, String tipoP, String prof, String dist, String tmp) {
		
		
		
		this.numPlantas = new SimpleIntegerProperty(numPlantas);
		this.grupo = new SimpleIntegerProperty(grupo);
		this.tiempoInicio = new SimpleStringProperty(LocalDate.now().toString());
		
		this.id = new SimpleStringProperty(id);
		nombre = new SimpleStringProperty(nom);
		nombreCient = new SimpleStringProperty(nomCient);
		epocaSiembra = new SimpleStringProperty(epoca);
		luz = new SimpleStringProperty(l);
		tipoPlantac = new SimpleStringProperty(tipoP);
		profund = new SimpleStringProperty(prof);
		distanciaEntre = new SimpleStringProperty(dist);
		tiempo = new SimpleStringProperty(tmp);
	}
	
	public final IntegerProperty numPlantasProperty() {
		return this.numPlantas;
	}
	


	public final int getNumPlantas() {
		return this.numPlantasProperty().get();
	}
	


	public final void setNumPlantas(final int numPlantas) {
		this.numPlantasProperty().set(numPlantas);
	}
	
	public final IntegerProperty grupoProperty() {
		return this.grupo;
	}
	


	public final int getGrupo() {
		return this.grupoProperty().get();
	}
	


	public final void setGrupo(final int grupo) {
		this.grupoProperty().set(grupo);
	}


	public final StringProperty nombreProperty() {
		return this.nombre;
	}
	


	public final String getNombre() {
		return this.nombreProperty().get();
	}
	


	public final void setNombre(final String nombre) {
		this.nombreProperty().set(nombre);
	}
	


	public final StringProperty nombreCientProperty() {
		return this.nombreCient;
	}
	


	public final String getNombreCient() {
		return this.nombreCientProperty().get();
	}
	


	public final void setNombreCient(final String nombreCient) {
		this.nombreCientProperty().set(nombreCient);
	}
	


	public final StringProperty epocaSiembraProperty() {
		return this.epocaSiembra;
	}
	


	public final String getEpocaSiembra() {
		return this.epocaSiembraProperty().get();
	}
	


	public final void setEpocaSiembra(final String epocaSiembra) {
		this.epocaSiembraProperty().set(epocaSiembra);
	}
	


	public final StringProperty luzProperty() {
		return this.luz;
	}
	


	public final String getLuz() {
		return this.luzProperty().get();
	}
	


	public final void setLuz(final String luz) {
		this.luzProperty().set(luz);
	}
	


	public final StringProperty tipoPlantacProperty() {
		return this.tipoPlantac;
	}
	


	public final String getTipoPlantac() {
		return this.tipoPlantacProperty().get();
	}
	


	public final void setTipoPlantac(final String tipoPlantac) {
		this.tipoPlantacProperty().set(tipoPlantac);
	}
	


	public final StringProperty profundProperty() {
		return this.profund;
	}
	


	public final String getProfund() {
		return this.profundProperty().get();
	}
	


	public final void setProfund(final String profund) {
		this.profundProperty().set(profund);
	}
	


	public final StringProperty distanciaEntreProperty() {
		return this.distanciaEntre;
	}
	


	public final String getDistanciaEntre() {
		return this.distanciaEntreProperty().get();
	}
	


	public final void setDistanciaEntre(final String distanciaEntre) {
		this.distanciaEntreProperty().set(distanciaEntre);
	}
	


	public final StringProperty tiempoProperty() {
		return this.tiempo;
	}
	


	public final String getTiempo() {
		return this.tiempoProperty().get();
	}
	


	public final void setTiempo(final String tiempo) {
		this.tiempoProperty().set(tiempo);
	}


	public final StringProperty idProperty() {
		return this.id;
	}
	


	public final String getId() {
		return this.idProperty().get();
	}
	


	public final void setId(final String id) {
		this.idProperty().set(id);
	}
	
	public final StringProperty tiempoInicioProperty() {
		return this.tiempoInicio;
	}
	


	public final String getTiempoInicio() {
		return this.tiempoInicioProperty().get();
	}
	


	public final void setTiempoInicio(final String tiempoInicio) {
		this.tiempoInicioProperty().set(tiempoInicio);
	}
	
	


	@Override
	public String toString() {
		return "Planta [id=" + id + ", nombre=" + nombre + ", nombreCient=" + nombreCient + ", epocaSiembra="
				+ epocaSiembra + ", luz=" + luz + ", tipoPlantac=" + tipoPlantac + ", profund=" + profund
				+ ", distanciaEntre=" + distanciaEntre + ", tiempo=" + tiempo + "]";
	}

}
