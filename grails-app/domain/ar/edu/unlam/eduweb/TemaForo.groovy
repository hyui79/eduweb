package ar.edu.unlam.eduweb

class TemaForo {
	String titulo
	String mensaje
	Date fecha
	Usuario autorTema
	CategoriaTema categoriaForo
	Curso temaCurso // a que curso pertenece
	//static hasMany = [Comentario: Comentario]
	
    static constraints = {
    }
}
