<%@ page import="ar.edu.unlam.eduweb.TipoUsuario" %>



<div class="fieldcontain ${hasErrors(bean: tipoUsuarioInstance, field: 'tipoUs', 'error')} ">
	<label for="tipoUs">
		<g:message code="tipoUsuario.tipoUs.label" default="Tipo Us" />
		
	</label>
	<g:textField name="tipoUs" value="${tipoUsuarioInstance?.tipoUs}"/>

</div>

