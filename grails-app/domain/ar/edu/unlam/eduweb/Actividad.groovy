package ar.edu.unlam.eduweb

class Actividad {
	static belongsTo = Curso;
	Date fechaInicio
	Date fechaEntrega
	Nota nota 
	String titulo
	String consigna // como se define un string largo?
	EstadoActividad estado // esto sería corregido o no, esta bien asi o iria solo como un atributo booleano por ejemplo?
	
    static constraints = {
    }
}
