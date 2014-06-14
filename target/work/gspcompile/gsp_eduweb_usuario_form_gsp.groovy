import ar.edu.unlam.eduweb.Usuario
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_eduweb_usuario_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/usuario/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(hasErrors(bean: usuarioInstance, field: 'emailUsuario', 'error'))
printHtmlPart(1)
invokeTag('message','g',7,['code':("usuario.emailUsuario.label"),'default':("Email Usuario")],-1)
printHtmlPart(2)
invokeTag('textField','g',10,['name':("emailUsuario"),'value':(usuarioInstance?.emailUsuario)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: usuarioInstance, field: 'nombreUsuario', 'error'))
printHtmlPart(4)
invokeTag('message','g',16,['code':("usuario.nombreUsuario.label"),'default':("Nombre Usuario")],-1)
printHtmlPart(2)
invokeTag('textField','g',19,['name':("nombreUsuario"),'value':(usuarioInstance?.nombreUsuario)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: usuarioInstance, field: 'usuarioTipo', 'error'))
printHtmlPart(5)
invokeTag('message','g',25,['code':("usuario.usuarioTipo.label"),'default':("Usuario Tipo")],-1)
printHtmlPart(6)
invokeTag('select','g',28,['id':("usuarioTipo"),'name':("usuarioTipo.id"),'from':(ar.edu.unlam.eduweb.TipoUsuario.list()),'optionKey':("id"),'required':(""),'value':(usuarioInstance?.usuarioTipo?.id),'class':("many-to-one")],-1)
printHtmlPart(7)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1402167594000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
