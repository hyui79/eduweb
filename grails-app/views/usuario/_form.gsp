<%@ page import="ar.edu.unlam.eduweb.Usuario" %>



<div class="fieldcontain ${hasErrors(bean: usuarioInstance, field: 'emailUsuario', 'error')} ">
	<label for="emailUsuario">
		<g:message code="usuario.emailUsuario.label" default="Email Usuario" />
		
	</label>
	<g:textField name="emailUsuario" value="${usuarioInstance?.emailUsuario}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: usuarioInstance, field: 'nombreUsuario', 'error')} ">
	<label for="nombreUsuario">
		<g:message code="usuario.nombreUsuario.label" default="Nombre Usuario" />
		
	</label>
	<g:textField name="nombreUsuario" value="${usuarioInstance?.nombreUsuario}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: usuarioInstance, field: 'usuarioTipo', 'error')} required">
	<label for="usuarioTipo">
		<g:message code="usuario.usuarioTipo.label" default="Usuario Tipo" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="usuarioTipo" name="usuarioTipo.id" from="${ar.edu.unlam.eduweb.TipoUsuario.list()}" optionKey="id" required="" value="${usuarioInstance?.usuarioTipo?.id}" class="many-to-one"/>

</div>

