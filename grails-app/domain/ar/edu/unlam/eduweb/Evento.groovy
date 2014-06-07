package ar.edu.unlam.eduweb

class Evento {
	static belongsTo = Curso
	Date fechaHoraInicio
	Date fechaHoraFin
	String tituloEvento
	String descripcionEvento

    static constraints = {
    }
}
