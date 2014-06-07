<%@ page import="ar.edu.unlam.eduweb.CategoriaTema" %>



<div class="fieldcontain ${hasErrors(bean: categoriaTemaInstance, field: 'comentarios', 'error')} ">
	<label for="comentarios">
		<g:message code="categoriaTema.comentarios.label" default="Comentarios" />
		
	</label>
	<g:select name="comentarios" from="${ar.edu.unlam.eduweb.Comentario.list()}" multiple="multiple" optionKey="id" size="5" value="${categoriaTemaInstance?.comentarios*.id}" class="many-to-many"/>

</div>

<div class="fieldcontain ${hasErrors(bean: categoriaTemaInstance, field: 'nombreCategoria', 'error')} ">
	<label for="nombreCategoria">
		<g:message code="categoriaTema.nombreCategoria.label" default="Nombre Categoria" />
		
	</label>
	<g:textField name="nombreCategoria" value="${categoriaTemaInstance?.nombreCategoria}"/>

</div>

