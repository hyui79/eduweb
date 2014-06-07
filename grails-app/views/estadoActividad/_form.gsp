<%@ page import="ar.edu.unlam.eduweb.EstadoActividad" %>



<div class="fieldcontain ${hasErrors(bean: estadoActividadInstance, field: 'estadoAct', 'error')} ">
	<label for="estadoAct">
		<g:message code="estadoActividad.estadoAct.label" default="Estado Act" />
		
	</label>
	<g:textField name="estadoAct" value="${estadoActividadInstance?.estadoAct}"/>

</div>

