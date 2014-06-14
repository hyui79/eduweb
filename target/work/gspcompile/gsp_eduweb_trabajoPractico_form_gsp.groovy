import ar.edu.unlam.eduweb.TrabajoPractico
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_eduweb_trabajoPractico_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/trabajoPractico/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(hasErrors(bean: trabajoPracticoInstance, field: 'archivo', 'error'))
printHtmlPart(1)
invokeTag('message','g',7,['code':("trabajoPractico.archivo.label"),'default':("Archivo")],-1)
printHtmlPart(2)
invokeTag('textField','g',10,['name':("archivo"),'value':(trabajoPracticoInstance?.archivo)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: trabajoPracticoInstance, field: 'consigna', 'error'))
printHtmlPart(4)
invokeTag('message','g',16,['code':("trabajoPractico.consigna.label"),'default':("Consigna")],-1)
printHtmlPart(2)
invokeTag('textField','g',19,['name':("consigna"),'value':(trabajoPracticoInstance?.consigna)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: trabajoPracticoInstance, field: 'estado', 'error'))
printHtmlPart(5)
invokeTag('message','g',25,['code':("trabajoPractico.estado.label"),'default':("Estado")],-1)
printHtmlPart(6)
invokeTag('select','g',28,['id':("estado"),'name':("estado.id"),'from':(ar.edu.unlam.eduweb.EstadoActividad.list()),'optionKey':("id"),'required':(""),'value':(trabajoPracticoInstance?.estado?.id),'class':("many-to-one")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: trabajoPracticoInstance, field: 'fechaEntrega', 'error'))
printHtmlPart(7)
invokeTag('message','g',34,['code':("trabajoPractico.fechaEntrega.label"),'default':("Fecha Entrega")],-1)
printHtmlPart(6)
invokeTag('datePicker','g',37,['name':("fechaEntrega"),'precision':("day"),'value':(trabajoPracticoInstance?.fechaEntrega)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: trabajoPracticoInstance, field: 'fechaInicio', 'error'))
printHtmlPart(8)
invokeTag('message','g',43,['code':("trabajoPractico.fechaInicio.label"),'default':("Fecha Inicio")],-1)
printHtmlPart(6)
invokeTag('datePicker','g',46,['name':("fechaInicio"),'precision':("day"),'value':(trabajoPracticoInstance?.fechaInicio)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: trabajoPracticoInstance, field: 'mensajeTp', 'error'))
printHtmlPart(9)
invokeTag('message','g',52,['code':("trabajoPractico.mensajeTp.label"),'default':("Mensaje Tp")],-1)
printHtmlPart(2)
invokeTag('textField','g',55,['name':("mensajeTp"),'value':(trabajoPracticoInstance?.mensajeTp)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: trabajoPracticoInstance, field: 'nota', 'error'))
printHtmlPart(10)
invokeTag('message','g',61,['code':("trabajoPractico.nota.label"),'default':("Nota")],-1)
printHtmlPart(6)
invokeTag('select','g',64,['id':("nota"),'name':("nota.id"),'from':(ar.edu.unlam.eduweb.Nota.list()),'optionKey':("id"),'required':(""),'value':(trabajoPracticoInstance?.nota?.id),'class':("many-to-one")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: trabajoPracticoInstance, field: 'titulo', 'error'))
printHtmlPart(11)
invokeTag('message','g',70,['code':("trabajoPractico.titulo.label"),'default':("Titulo")],-1)
printHtmlPart(2)
invokeTag('textField','g',73,['name':("titulo"),'value':(trabajoPracticoInstance?.titulo)],-1)
printHtmlPart(12)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1402167470000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
