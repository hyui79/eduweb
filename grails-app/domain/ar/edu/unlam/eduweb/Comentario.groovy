package ar.edu.unlam.eduweb

class Comentario {
	Usuario autorComentario
	Date fechaComentario
	String mensajeComentario
	TemaForo temaComentario // a que tema del foro, pertenece
	
	
    static constraints = {
    }
}
