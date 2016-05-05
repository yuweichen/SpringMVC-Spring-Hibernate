package org.apache.jsp.layout;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class west_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\tvar ctrlTree;\n");
      out.write("\t$(function() {\n");
      out.write("\n");
      out.write("\t\tctrlTree = $('#ctrlTree').tree({\n");
      out.write("\t\t\turl : '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/menuController/doNotNeedSession_tree',\n");
      out.write("\t\t\tlines : true,\n");
      out.write("\t\t\tonLoadSuccess : function(node, data){\t\t\t\n");
      out.write("\t\t\t\t$(this).tree('expandAll') \n");
      out.write("\t\t\t},\n");
      out.write("\t\t\tonClick : function(node) {\n");
      out.write("\t\t\t\tif (node.attributes.url) {\n");
      out.write("\t\t\t\t\taddTab(node);\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t},\n");
      out.write("\t\t\tonDblClick : function(node) {\n");
      out.write("\t\t\t\tif (node.state == 'closed') {\n");
      out.write("\t\t\t\t\t$(this).tree('expand', node.target);\n");
      out.write("\t\t\t\t} else {\n");
      out.write("\t\t\t\t\t$(this).tree('collapse', node.target);\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t}\n");
      out.write("\t\t});\n");
      out.write("\n");
      out.write("\t});\n");
      out.write("</script>\n");
      out.write("<div class=\"easyui-accordion\" data-options=\"fit:true,border:false\">\n");
      out.write("\t<div title=\"Menu\" data-options=\"isonCls:'icon-save'\">\n");
      out.write("\t\t<ul id=\"ctrlTree\" style=\"margin-top: 5px;\"></ul>\n");
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
