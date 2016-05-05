package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE HTML >\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<title>SpringMVC+Spring+Hibernate</title>\n");
      out.write("<meta http-equiv=\"pragma\" content=\"no-cache\">\n");
      out.write("<meta http-equiv=\"cache-control\" content=\"no-cache\">\n");
      out.write("<meta http-equiv=\"expires\" content=\"0\">\n");
      out.write("<meta http-equiv=\"keywords\" content=\"keyword1,keyword2,keyword3\">\n");
      out.write("<meta http-equiv=\"description\" content=\"This is my page\">\n");
      out.write("<script type=\"text/javascript\" src=\"jslib/jquery-easyui-1.3.1/jquery-1.8.0.min.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"jslib/jquery-easyui-1.3.1/jquery.easyui.min.js\"></script>\n");
      out.write("<link rel=\"stylesheet\" href=\"jslib/jquery-easyui-1.3.1/themes/default/easyui.css\" type=\"text/css\"></link>\n");
      out.write("<link rel=\"stylesheet\" href=\"jslib/jquery-easyui-1.3.1/themes/icon.css\" type=\"text/css\"></link>\n");
      out.write("<script type=\"text/javascript\" src=\"jslib/myUtil.js\"></script>\n");
      out.write("\n");
      out.write("<style type=\"text/css\">\n");
      out.write("\t#myul ul {\n");
      out.write("\t\tlist-style:none;\n");
      out.write("\t}\n");
      out.write("\t#myul ul li {\n");
      out.write("\t\tmargin-left:-20px;\n");
      out.write("\t\tline-height:20px;\n");
      out.write("\t}\n");
      out.write("</style>\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body class=\"easyui-layout\">\n");
      out.write("\t<div data-options=\"region:'north'\" style=\"height:40px;\">\n");
      out.write("\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "layout/north.jsp", out, false);
      out.write("\n");
      out.write("\t</div>\n");
      out.write("\t<div data-options=\"region:'south'\" style=\"height:20px;\"></div>\n");
      out.write("\t<div data-options=\"region:'west'\" style=\"width:200px;\">\n");
      out.write("\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "layout/west.jsp", out, false);
      out.write("\n");
      out.write("\t</div>\n");
      out.write("\t<div data-options=\"region:'east',title:'Other',split:true\" style=\"width:220px;\">\n");
      out.write("\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "layout/east.jsp", out, false);
      out.write("\n");
      out.write("\t</div>\n");
      out.write("\t<div data-options=\"region:'center',title:'SpringMVC3.2.8+Spring3.2.8+Hibernate4.2.11+JQuery-EasyUI1.3.1+Oracle10g+Maven'\" style=\"overflow: hidden;\">\n");
      out.write("\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "layout/center.jsp", out, false);
      out.write("\n");
      out.write("\t</div>\n");
      out.write("\n");
      out.write("\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "user/login.jsp", out, false);
      out.write('\n');
      out.write('	');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "user/reg.jsp", out, false);
      out.write("\n");
      out.write("\t\n");
      out.write("</body>\n");
      out.write("</html>\n");
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
