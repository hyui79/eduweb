package ar.edu.unlam.eduweb

class Curso {
	String nombre
	/*List <Usuario> profesor 
	List <Usuario> alumno*/
	static hasMany = [temasforo:TemaForo, cursousuarios:CursoUsuario, eventos: Evento, actividades: Actividad]
	
    static constraints = {
    }
}
