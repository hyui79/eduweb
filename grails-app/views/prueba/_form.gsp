<%@ page import="ar.edu.unlam.eduweb.Prueba" %>



<div class="fieldcontain ${hasErrors(bean: pruebaInstance, field: 'curso', 'error')} required">
	<label for="curso">
		<g:message code="prueba.curso.label" default="Curso" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="curso" name="curso.id" from="${ar.edu.unlam.eduweb.Curso.list()}" optionKey="id" required="" value="${pruebaInstance?.curso?.id}" class="many-to-one"/>

</div>

<div class="fieldcontain ${hasErrors(bean: pruebaInstance, field: 'nombre', 'error')} ">
	<label for="nombre">
		<g:message code="prueba.nombre.label" default="Nombre" />
		
	</label>
	<g:textField name="nombre" value="${pruebaInstance?.nombre}"/>

</div>

