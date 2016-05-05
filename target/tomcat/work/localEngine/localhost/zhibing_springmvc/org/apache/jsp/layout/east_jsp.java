package org.apache.jsp.layout;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class east_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\tvar onlineDatagrid;\n");
      out.write("\tvar onlinePanel;\n");
      out.write("\tvar calendar;\n");
      out.write("\t$(function() {\n");
      out.write("\n");
      out.write("\t\tcalendar = $('#calendar').calendar({\n");
      out.write("\t\t\tfit : true,\n");
      out.write("\t\t\tcurrent : new Date(),\n");
      out.write("\t\t\tborder : false,\n");
      out.write("\t\t\tonSelect : function(date) {\n");
      out.write("\t\t\t\t$(this).calendar('moveTo', new Date());\n");
      out.write("\t\t\t}\n");
      out.write("\t\t});\n");
      out.write("\n");
      out.write("\t\tonlinePanel = $('#onlinePanel').panel({\n");
      out.write("\t\t\ttools : [ {\n");
      out.write("\t\t\t\ticonCls : 'icon-reload',\n");
      out.write("\t\t\t\thandler : function() {\n");
      out.write("\t\t\t\t\tif (onlineDatagrid.datagrid('options').url) {\n");
      out.write("\t\t\t\t\t\tonlineDatagrid.datagrid('load');\n");
      out.write("\t\t\t\t\t}\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t} ]\n");
      out.write("\t\t});\n");
      out.write("\n");
      out.write("\t\tonlineDatagrid = $('#onlineDatagrid').datagrid({\n");
      out.write("\t\t\turl : '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/onlineController/doNotNeedSession_onlineDatagrid',\n");
      out.write("\t\t\ttitle : '',\n");
      out.write("\t\t\ticonCls : '',\n");
      out.write("\t\t\tfit : true,\n");
      out.write("\t\t\tfitColumns : true,\n");
      out.write("\t\t\tpagination : false,\n");
      out.write("\t\t\tpageSize : 10,\n");
      out.write("\t\t\tpageList : [ 10 ],\n");
      out.write("\t\t\tnowarp : false,\n");
      out.write("\t\t\tborder : false,\n");
      out.write("\t\t\tidField : 'cid',\n");
      out.write("\t\t\tsortName : 'cdatetime',\n");
      out.write("\t\t\tsortOrder : 'desc',\n");
      out.write("\t\t\tfrozenColumns : [ [ {\n");
      out.write("\t\t\t\ttitle : 'ID',\n");
      out.write("\t\t\t\tfield : 'cid',\n");
      out.write("\t\t\t\twidth : 150,\n");
      out.write("\t\t\t\thidden : true\n");
      out.write("\t\t\t} ] ],\n");
      out.write("\t\t\tcolumns : [ [ {\n");
      out.write("\t\t\t\ttitle : 'Name',\n");
      out.write("\t\t\t\tfield : 'cname',\n");
      out.write("\t\t\t\twidth : 150,\n");
      out.write("\t\t\t\tsortable : true,\n");
      out.write("\t\t\t\tformatter : function(value, rowData, rowIndex) {\n");
      out.write("\t\t\t\t\treturn sy.fs('<span title=\"{0}\">{1}</span>', value, value);\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t}, {\n");
      out.write("\t\t\t\ttitle : 'IP',\n");
      out.write("\t\t\t\tfield : 'cip',\n");
      out.write("\t\t\t\twidth : 150,\n");
      out.write("\t\t\t\tsortable : true,\n");
      out.write("\t\t\t\tformatter : function(value, rowData, rowIndex) {\n");
      out.write("\t\t\t\t\treturn sy.fs('<span title=\"{0}\">{1}</span>', value, value);\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t}, {\n");
      out.write("\t\t\t\ttitle : 'Time',\n");
      out.write("\t\t\t\tfield : 'cdatetime',\n");
      out.write("\t\t\t\twidth : 150,\n");
      out.write("\t\t\t\tsortable : true,\n");
      out.write("\t\t\t\tformatter : function(value, rowData, rowIndex) {\n");
      out.write("\t\t\t\t\treturn sy.fs('<span title=\"{0}\">{1}</span>', value, value);\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t} ] ],\n");
      out.write("\t\t\tonLoadSuccess : function(data) {\n");
      out.write("\t\t\t\tonlinePanel.panel('setTitle', '(' + data.total + ') user online');\n");
      out.write("\t\t\t}\n");
      out.write("\t\t});\n");
      out.write("\n");
      out.write("\t});\n");
      out.write("</script>\n");
      out.write("<div class=\"easyui-layout\" data-options=\"fit:true,border:false\">\n");
      out.write("\t<div data-options=\"region:'north',border:false\" style=\"height:180px;overflow: hidden;\">\n");
      out.write("\t\t<div id=\"calendar\"></div>\n");
      out.write("\t</div>\n");
      out.write("\t<div data-options=\"region:'center',border:false\" style=\"overflow: hidden;\">\n");
      out.write("\t\t<div id=\"onlinePanel\" data-options=\"fit:true,border:false\" title=\"Online User\">\n");
      out.write("\t\t\t<table id=\"onlineDatagrid\"></table>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t<div data-options=\"region:'south',border:true\" style=\"height:180px;overflow: hidden;\">\t\n");
      out.write("\t\t<div style=\"margin-left:10px;margin-top:10px;line-height:20px;\"><strong>Link</strong>\n");
      out.write("\t\t\t<ul style=\"list-style:none;margin-left:-20px;margin-top:0px;\">\n");
      out.write("\t\t\t\t<li><a href='http://www.apache.org/'>Apache Foundation</a></li>\n");
      out.write("\t\t\t\t<li><a href='http://struts.apache.org/development/2.x/'>Apache Struts2</a></li>\n");
      out.write("\t\t\t\t<li><a href='http://projects.spring.io/spring-framework/'>Spring Framework</a></li>\n");
      out.write("\t\t\t\t<li><a href='http://hibernate.org/'>Hibernate Framework</a></li>\n");
      out.write("\t\t\t\t<li><a href='http://www.jeasyui.com/'>jQuery EasyUI</a></li>\n");
      out.write("\t\t\t</ul> \n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\n");
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
