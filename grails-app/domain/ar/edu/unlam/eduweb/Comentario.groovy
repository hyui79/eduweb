package ar.edu.unlam.eduweb

class Comentario {
	Usuario autorComentario
	Date fechaComentario
	String mensajeComentario
	static belongsTo = TemaForo,CategoriaTema; // a que tema del foro, pertenece

    static constraints = {
    }
}
