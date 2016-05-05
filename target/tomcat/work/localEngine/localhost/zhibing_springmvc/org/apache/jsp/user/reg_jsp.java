package org.apache.jsp.user;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class reg_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("\n");
      out.write("<script type=\"text/javascript\" charset=\"utf-8\">\n");
      out.write("\tvar regDialog;\n");
      out.write("\tvar regForm;\n");
      out.write("\t$(function() {\n");
      out.write("\n");
      out.write("\t\tregDialog = $('#regDialog').show().dialog({\n");
      out.write("\t\t\ttitle : 'Register',\n");
      out.write("\t\t\tmodal : true,\n");
      out.write("\t\t\tbuttons : [ {\n");
      out.write("\t\t\t\ttext : 'Register',\n");
      out.write("\t\t\t\thandler : function() {\n");
      out.write("\t\t\t\t\tregForm.submit();\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t} ],\n");
      out.write("\t\t\tonOpen : function() {\n");
      out.write("\t\t\t\t$(this).find('input[name=cname]').focus();\n");
      out.write("\t\t\t},\n");
      out.write("\t\t\tonClose : function() {\n");
      out.write("\t\t\t//\t$(this).find('input').val('');\n");
      out.write("\t\t\t\tloginDialog.find('input[name=cname]').focus();\n");
      out.write("\t\t\t}\n");
      out.write("\t\t}).dialog('close');\n");
      out.write("\n");
      out.write("\t\tregForm = regDialog.find('form').form({\n");
      out.write("\t\t\turl : '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/userController/doNotNeedSession_reg',\n");
      out.write("\t\t\tsuccess : function(data) {\n");
      out.write("\t\t\t\tvar obj = jQuery.parseJSON(data);\n");
      out.write("\t\t\t\tif (obj.success) {\n");
      out.write("\t\t\t\t\tregDialog.dialog('close');\n");
      out.write("\t\t\t\t} else {\n");
      out.write("\t\t\t\t\tregDialog.find('input[name=cname]').focus();\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t\t$.messager.show({\n");
      out.write("\t\t\t\t\ttitle : 'Message',\n");
      out.write("\t\t\t\t\tmsg : obj.msg\n");
      out.write("\t\t\t\t});\n");
      out.write("\t\t\t}\n");
      out.write("\t\t});\n");
      out.write("\t\t\n");
      out.write("\t\t$('form input').bind('keyup', function(event) {/* enter to submit */\n");
      out.write("\t\t\tif (event.keyCode == '13') {\n");
      out.write("\t\t\t\t$(this).submit();\n");
      out.write("\t\t\t}\n");
      out.write("\t\t});\n");
      out.write("\n");
      out.write("\t});\n");
      out.write("</script>\n");
      out.write("<div id=\"regDialog\" style=\"display: none;width:250px;padding: 5px;\">\n");
      out.write("\t<form method=\"post\">\n");
      out.write("\t\t<table class=\"tableForm\">\n");
      out.write("\t\t\t<tr>\n");
      out.write("\t\t\t\t<th style=\"width: 55px;\">Username</th>\n");
      out.write("\t\t\t\t<td><input name=\"cname\" class=\"easyui-validatebox\" data-options=\"required:'true',missingMessage:'Username required'\" value=\"admin\" /></td>\n");
      out.write("\t\t\t</tr>\n");
      out.write("\t\t\t<tr>\n");
      out.write("\t\t\t\t<th>Password</th>\n");
      out.write("\t\t\t\t<td><input name=\"cpwd\" type=\"password\" class=\"easyui-validatebox\" data-options=\"required:'true',missingMessage:'Password required'\" value=\"admin\" /></td>\n");
      out.write("\t\t\t</tr>\n");
      out.write("\t\t\t<tr>\n");
      out.write("\t\t\t\t<th>Reenter</th>\n");
      out.write("\t\t\t\t<td><input type=\"password\" class=\"easyui-validatebox\" data-options=\"required:'true',missingMessage:'Password required',validType:'eqPassword[\\'#regDialog input[name=cpwd]\\']'\" /></td>\n");
      out.write("\t\t\t</tr>\n");
      out.write("\t\t</table>\n");
      out.write("\t</form>\n");
      out.write("</div>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
