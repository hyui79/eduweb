import ar.edu.unlam.eduweb.Curso
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_eduweb_cursoshow_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/curso/show.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
printHtmlPart(1)
createTagBody(1, {->
printHtmlPart(2)
invokeTag('captureMeta','sitemesh',6,['gsp_sm_xmlClosingForEmptyTag':(""),'name':("layout"),'content':("main")],-1)
printHtmlPart(2)
invokeTag('set','g',7,['var':("entityName"),'value':(message(code: 'curso.label', default: 'Curso'))],-1)
printHtmlPart(2)
createTagBody(2, {->
createTagBody(3, {->
invokeTag('message','g',8,['code':("default.show.label"),'args':([entityName])],-1)
})
invokeTag('captureTitle','sitemesh',8,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',8,[:],2)
printHtmlPart(3)
})
invokeTag('captureHead','sitemesh',9,[:],1)
printHtmlPart(3)
createTagBody(1, {->
printHtmlPart(4)
invokeTag('message','g',11,['code':("default.link.skip.label"),'default':("Skip to content&hellip;")],-1)
printHtmlPart(5)
expressionOut.print(createLink(uri: '/'))
printHtmlPart(6)
invokeTag('message','g',14,['code':("default.home.label")],-1)
printHtmlPart(7)
createTagBody(2, {->
invokeTag('message','g',15,['code':("default.list.label"),'args':([entityName])],-1)
})
invokeTag('link','g',15,['class':("list"),'action':("index")],2)
printHtmlPart(8)
createTagBody(2, {->
invokeTag('message','g',16,['code':("default.new.label"),'args':([entityName])],-1)
})
invokeTag('link','g',16,['class':("create"),'action':("create")],2)
printHtmlPart(9)
invokeTag('message','g',20,['code':("default.show.label"),'args':([entityName])],-1)
printHtmlPart(10)
if(true && (flash.message)) {
printHtmlPart(11)
expressionOut.print(flash.message)
printHtmlPart(12)
}
printHtmlPart(13)
if(true && (cursoInstance?.actividades)) {
printHtmlPart(14)
invokeTag('message','g',28,['code':("curso.actividades.label"),'default':("Actividades")],-1)
printHtmlPart(15)
for( a in (cursoInstance.actividades) ) {
printHtmlPart(16)
createTagBody(4, {->
expressionOut.print(a?.encodeAsHTML())
})
invokeTag('link','g',31,['controller':("actividad"),'action':("show"),'id':(a.id)],4)
printHtmlPart(17)
}
printHtmlPart(18)
}
printHtmlPart(19)
if(true && (cursoInstance?.eventos)) {
printHtmlPart(20)
invokeTag('message','g',39,['code':("curso.eventos.label"),'default':("Eventos")],-1)
printHtmlPart(15)
for( e in (cursoInstance.eventos) ) {
printHtmlPart(21)
createTagBody(4, {->
expressionOut.print(e?.encodeAsHTML())
})
invokeTag('link','g',42,['controller':("evento"),'action':("show"),'id':(e.id)],4)
printHtmlPart(17)
}
printHtmlPart(18)
}
printHtmlPart(19)
if(true && (cursoInstance?.nombre)) {
printHtmlPart(22)
invokeTag('message','g',50,['code':("curso.nombre.label"),'default':("Nombre")],-1)
printHtmlPart(23)
invokeTag('fieldValue','g',52,['bean':(cursoInstance),'field':("nombre")],-1)
printHtmlPart(24)
}
printHtmlPart(19)
if(true && (cursoInstance?.temasforo)) {
printHtmlPart(25)
invokeTag('message','g',59,['code':("curso.temasforo.label"),'default':("Temasforo")],-1)
printHtmlPart(15)
for( t in (cursoInstance.temasforo) ) {
printHtmlPart(26)
createTagBody(4, {->
expressionOut.print(t?.encodeAsHTML())
})
invokeTag('link','g',62,['controller':("temaForo"),'action':("show"),'id':(t.id)],4)
printHtmlPart(17)
}
printHtmlPart(18)
}
printHtmlPart(19)
if(true && (cursoInstance?.usuarios)) {
printHtmlPart(27)
invokeTag('message','g',70,['code':("curso.usuarios.label"),'default':("Usuarios")],-1)
printHtmlPart(15)
for( u in (cursoInstance.usuarios) ) {
printHtmlPart(28)
createTagBody(4, {->
expressionOut.print(u?.encodeAsHTML())
})
invokeTag('link','g',73,['controller':("usuario"),'action':("show"),'id':(u.id)],4)
printHtmlPart(17)
}
printHtmlPart(18)
}
printHtmlPart(29)
createTagBody(2, {->
printHtmlPart(30)
createTagBody(3, {->
invokeTag('message','g',82,['code':("default.button.edit.label"),'default':("Edit")],-1)
})
invokeTag('link','g',82,['class':("edit"),'action':("edit"),'resource':(cursoInstance)],3)
printHtmlPart(31)
invokeTag('actionSubmit','g',83,['class':("delete"),'action':("delete"),'value':(message(code: 'default.button.delete.label', default: 'Delete')),'onclick':("return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');")],-1)
printHtmlPart(32)
})
invokeTag('form','g',85,['url':([resource:cursoInstance, action:'delete']),'method':("DELETE")],2)
printHtmlPart(33)
})
invokeTag('captureBody','sitemesh',87,[:],1)
printHtmlPart(34)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1402166881000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
