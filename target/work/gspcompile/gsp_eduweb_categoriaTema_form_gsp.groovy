import ar.edu.unlam.eduweb.CategoriaTema
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_eduweb_categoriaTema_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/categoriaTema/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(hasErrors(bean: categoriaTemaInstance, field: 'comentarios', 'error'))
printHtmlPart(1)
invokeTag('message','g',7,['code':("categoriaTema.comentarios.label"),'default':("Comentarios")],-1)
printHtmlPart(2)
invokeTag('select','g',10,['name':("comentarios"),'from':(ar.edu.unlam.eduweb.Comentario.list()),'multiple':("multiple"),'optionKey':("id"),'size':("5"),'value':(categoriaTemaInstance?.comentarios*.id),'class':("many-to-many")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: categoriaTemaInstance, field: 'nombreCategoria', 'error'))
printHtmlPart(4)
invokeTag('message','g',16,['code':("categoriaTema.nombreCategoria.label"),'default':("Nombre Categoria")],-1)
printHtmlPart(2)
invokeTag('textField','g',19,['name':("nombreCategoria"),'value':(categoriaTemaInstance?.nombreCategoria)],-1)
printHtmlPart(5)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1402166738000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
