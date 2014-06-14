import ar.edu.unlam.eduweb.Prueba
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_eduweb_prueba_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/prueba/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(hasErrors(bean: pruebaInstance, field: 'curso', 'error'))
printHtmlPart(1)
invokeTag('message','g',7,['code':("prueba.curso.label"),'default':("Curso")],-1)
printHtmlPart(2)
invokeTag('select','g',10,['id':("curso"),'name':("curso.id"),'from':(ar.edu.unlam.eduweb.Curso.list()),'optionKey':("id"),'required':(""),'value':(pruebaInstance?.curso?.id),'class':("many-to-one")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: pruebaInstance, field: 'nombre', 'error'))
printHtmlPart(4)
invokeTag('message','g',16,['code':("prueba.nombre.label"),'default':("Nombre")],-1)
printHtmlPart(5)
invokeTag('textField','g',19,['name':("nombre"),'value':(pruebaInstance?.nombre)],-1)
printHtmlPart(6)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1402166343000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
