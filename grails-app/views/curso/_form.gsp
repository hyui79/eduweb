<%@ page import="ar.edu.unlam.eduweb.Curso" %>



<div class="fieldcontain ${hasErrors(bean: cursoInstance, field: 'actividades', 'error')} ">
	<label for="actividades">
		<g:message code="curso.actividades.label" default="Actividades" />
		
	</label>
	<g:select name="actividades" from="${ar.edu.unlam.eduweb.Actividad.list()}" multiple="multiple" optionKey="id" size="5" value="${cursoInstance?.actividades*.id}" class="many-to-many"/>

</div>

<div class="fieldcontain ${hasErrors(bean: cursoInstance, field: 'eventos', 'error')} ">
	<label for="eventos">
		<g:message code="curso.eventos.label" default="Eventos" />
		
	</label>
	<g:select name="eventos" from="${ar.edu.unlam.eduweb.Evento.list()}" multiple="multiple" optionKey="id" size="5" value="${cursoInstance?.eventos*.id}" class="many-to-many"/>

</div>

<div class="fieldcontain ${hasErrors(bean: cursoInstance, field: 'nombre', 'error')} ">
	<label for="nombre">
		<g:message code="curso.nombre.label" default="Nombre" />
		
	</label>
	<g:textField name="nombre" value="${cursoInstance?.nombre}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: cursoInstance, field: 'temasforo', 'error')} ">
	<label for="temasforo">
		<g:message code="curso.temasforo.label" default="Temasforo" />
		
	</label>
	<g:select name="temasforo" from="${ar.edu.unlam.eduweb.TemaForo.list()}" multiple="multiple" optionKey="id" size="5" value="${cursoInstance?.temasforo*.id}" class="many-to-many"/>

</div>

<div class="fieldcontain ${hasErrors(bean: cursoInstance, field: 'usuarios', 'error')} ">
	<label for="usuarios">
		<g:message code="curso.usuarios.label" default="Usuarios" />
		
	</label>
	<g:select name="usuarios" from="${ar.edu.unlam.eduweb.Usuario.list()}" multiple="multiple" optionKey="id" size="5" value="${cursoInstance?.usuarios*.id}" class="many-to-many"/>

</div>

