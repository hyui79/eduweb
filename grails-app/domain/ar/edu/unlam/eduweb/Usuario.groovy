package ar.edu.unlam.eduweb

class Usuario {
	static belongsTo = Curso
	String nombreUsuario
	String emailUsuario
	TipoUsuario usuarioTipo // ver esto como es con sprint security
    
	static constraints = {
    }
}
