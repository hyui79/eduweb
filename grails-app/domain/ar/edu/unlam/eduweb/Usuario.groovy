package ar.edu.unlam.eduweb

class Usuario {
	String nombreUsuario
	String emailUsuario
	TipoUsuario usuarioTipo 
	static hasMany = [cursousuarios:CursoUsuario]
    
	static constraints = {
    }
}
