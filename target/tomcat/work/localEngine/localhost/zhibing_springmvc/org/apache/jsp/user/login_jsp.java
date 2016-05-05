package org.apache.jsp.user;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\tvar loginDialog;\n");
      out.write("\tvar loginInputForm;\n");
      out.write("\tvar sessionInfo;\n");
      out.write("\t$(function() {\n");
      out.write("\n");
      out.write("\t\tloginInputForm = $('#loginInputForm').form({\n");
      out.write("\t\t\turl : '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/userController/doNotNeedSession_login',\n");
      out.write("\t\t\tsuccess : function(data) {\n");
      out.write("\t\t\t\tvar obj = jQuery.parseJSON(data);\n");
      out.write("\t\t\t\tif (obj.success) {\n");
      out.write("\t\t\t\t\tloginDialog.dialog('close');\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t$('#sessionInfoDiv').html(sy.fs(\n");
      out.write("\t\t\t\t\t\t'Welcome [<strong>{0}</strong>] [<strong>{1}</strong>]', obj.obj.loginName, obj.obj.ip)\n");
      out.write("\t\t\t\t\t);\t\t\t\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\tflashOnlineDatagrid();\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t\t$.messager.show({\n");
      out.write("\t\t\t\t\ttitle : 'Message',\n");
      out.write("\t\t\t\t\tmsg : obj.msg\n");
      out.write("\t\t\t\t});\n");
      out.write("\t\t\t}\n");
      out.write("\t\t});\n");
      out.write("\n");
      out.write("\t\tloginDialog = $('#loginDialog').show().dialog({\n");
      out.write("\t\t\tclosable : false,\n");
      out.write("\t\t\ttitle : 'Logon',\n");
      out.write("\t\t\tmodal : true,\n");
      out.write("\t\t\tbuttons : [ {\n");
      out.write("\t\t\t\ttext : 'Register',\n");
      out.write("\t\t\t\thandler : function() {\n");
      out.write("\t\t\t\t\tregDialog.val('');\n");
      out.write("\t\t\t\t\tregDialog.dialog('open');\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t}, {\n");
      out.write("\t\t\t\ttext : 'Login',\n");
      out.write("\t\t\t\thandler : function() {\n");
      out.write("\t\t\t\t\tloginInputForm.submit();\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t} ],\n");
      out.write("\t\t\tonOpen : function() {\n");
      out.write("\t\t\t\tvar t = $(this);\n");
      out.write("\t\t\t\twindow.setTimeout(function() {\n");
      out.write("\t\t\t\t\tt.find('input[name=cname]').focus();\n");
      out.write("\t\t\t\t}, 0);\n");
      out.write("\t\t\t}\n");
      out.write("\t\t});\n");
      out.write("\n");
      out.write("\t\t$('form input').bind('keyup', function(event) {/* enter to submit */\n");
      out.write("\t\t\tif (event.keyCode == '13') {\n");
      out.write("\t\t\t\t$(this).submit();\n");
      out.write("\t\t\t}\n");
      out.write("\t\t});\n");
      out.write("\n");
      out.write("\t\twindow.setTimeout(function() {\n");
      out.write("\t\t\t$('form input[name=cname]').focus();\n");
      out.write("\t\t}, 0);\n");
      out.write("\t\t\n");
      out.write("\t\tsessionInfo = {\n");
      out.write("\t\t\tuserId : '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionInfo.userId}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("',\n");
      out.write("\t\t\tloginName : '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionInfo.loginName}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("',\n");
      out.write("\t\t\tip : '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionInfo.ip}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("'\n");
      out.write("\t\t};\n");
      out.write("\t\tif (sessionInfo.userId) {/*if userId exists, the user has logoned*/\n");
      out.write("\t\t\twindow.setTimeout(function() {\n");
      out.write("\t\t\t\t$('div.validatebox-tip').remove();\n");
      out.write("\t\t\t}, 500);\n");
      out.write("\t\t\tloginDialog.dialog('close');\n");
      out.write("\t\t\tflashOnlineDatagrid();\n");
      out.write("\t\t}\n");
      out.write("\n");
      out.write("\t});\n");
      out.write("\n");
      out.write("\tfunction flashOnlineDatagrid() {/*refresh online user*/\n");
      out.write("\t\twindow.setTimeout(function() {\n");
      out.write("\t\t\tif ($('#onlineDatagrid').length > 0) {\n");
      out.write("\t\t\t\tonlineDatagrid.datagrid({\n");
      out.write("\t\t\t\t\tpagination : true,\n");
      out.write("\t\t\t\t\turl : '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/onlineController/doNotNeedSession_onlineDatagrid'\n");
      out.write("\t\t\t\t});\n");
      out.write("\t\t\t\tvar p = onlineDatagrid.datagrid('getPager');\n");
      out.write("\t\t\t\tp.pagination({\n");
      out.write("\t\t\t\t\tshowPageList : false,\n");
      out.write("\t\t\t\t\tshowRefresh : false,\n");
      out.write("\t\t\t\t\tbeforePageText : '',\n");
      out.write("\t\t\t\t\tafterPageText : '/{pages}',\n");
      out.write("\t\t\t\t\tdisplayMsg : ''\n");
      out.write("\t\t\t\t});\n");
      out.write("\t\t\t}\n");
      out.write("\t\t}, 3000);\n");
      out.write("\t}\n");
      out.write("</script>\n");
      out.write("<div id=\"loginDialog\" style=\"width:250px;height:160px;display: none;overflow: hidden;\">\n");
      out.write("\t<div style=\"color:blue;\">Default account: admin/admin</div>\n");
      out.write("\t<div id=\"loginTabs\" data-options=\"fit:true,border:false\">\n");
      out.write("\t\t<div align=\"center\">\n");
      out.write("\t\t\t<form id=\"loginInputForm\" method=\"post\">\n");
      out.write("\t\t\t\t<table>\n");
      out.write("\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t<th style=\"text-align: right;\">Username</th>\n");
      out.write("\t\t\t\t\t\t<td><input name=\"cname\" class=\"easyui-validatebox\" data-options=\"required:true,missingMessage:'Username required'\" value=\"admin\" style=\"width: 150px;\" /></td>\n");
      out.write("\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t<th style=\"text-align: right;\">Password</th>\n");
      out.write("\t\t\t\t\t\t<td><input name=\"cpwd\" type=\"password\" class=\"easyui-validatebox\" data-options=\"required:true,missingMessage:'Password required'\" value=\"admin\" style=\"width: 150px;\" /></td>\n");
      out.write("\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t</table>\n");
      out.write("\t\t\t</form>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
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
