package ar.edu.unlam.eduweb

class Curso {
	String nombre
	List <Usuario> profesor // estas no se si no van en una clase aparte
	List <Usuario> alumno
	static hasMany = [temasforo:TemaForo, usuarios:Usuario, eventos: Evento, actividades: Actividad]
	
    static constraints = {
    }
}
