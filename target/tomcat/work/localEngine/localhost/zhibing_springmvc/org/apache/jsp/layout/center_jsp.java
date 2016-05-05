package org.apache.jsp.layout;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class center_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<script type=\"text/javascript\" charset=\"utf-8\">\n");
      out.write("\tvar centerTabs;\n");
      out.write("\tvar tabsMenu;\n");
      out.write("\t$(function() {\n");
      out.write("\t\t\n");
      out.write("\t\tcenterTabs = $('#centerTabs').tabs({\n");
      out.write("\t\t\tfit : true,\n");
      out.write("\t\t\tborder : false,\n");
      out.write("\t\t\tonContextMenu : function(e, title) {\n");
      out.write("\t\t\t\te.preventDefault();\n");
      out.write("\t\t\t\ttabsMenu.menu('show', {\n");
      out.write("\t\t\t\t\tleft : e.pageX,\n");
      out.write("\t\t\t\t\ttop : e.pageY\n");
      out.write("\t\t\t\t}).data('tabTitle', title);\n");
      out.write("\t\t\t}\n");
      out.write("\t\t});\n");
      out.write("\t\t\n");
      out.write("\t\ttabsMenu = $('#tabsMenu').menu({\n");
      out.write("\t\t\tonClick : function(item) {\n");
      out.write("\t\t\t\tvar curTabTitle = $(this).data('tabTitle');\n");
      out.write("\t\t\t\tvar type = $(item.target).attr('type');\n");
      out.write("\n");
      out.write("\t\t\t\tif (type === 'refresh') {\n");
      out.write("\t\t\t\t\trefreshTab(curTabTitle);\n");
      out.write("\t\t\t\t\treturn;\n");
      out.write("\t\t\t\t}\n");
      out.write("\n");
      out.write("\t\t\t\tif (type === 'close') {\n");
      out.write("\t\t\t\t\tvar t = centerTabs.tabs('getTab', curTabTitle);\n");
      out.write("\t\t\t\t\tif (t.panel('options').closable) {\n");
      out.write("\t\t\t\t\t\tcenterTabs.tabs('close', curTabTitle);\n");
      out.write("\t\t\t\t\t}\n");
      out.write("\t\t\t\t\treturn;\n");
      out.write("\t\t\t\t}\n");
      out.write("\n");
      out.write("\t\t\t\tvar allTabs = centerTabs.tabs('tabs');\n");
      out.write("\t\t\t\tvar closeTabsTitle = [];\n");
      out.write("\n");
      out.write("\t\t\t\t$.each(allTabs, function() {\n");
      out.write("\t\t\t\t\tvar opt = $(this).panel('options');\n");
      out.write("\t\t\t\t\tif (opt.closable && opt.title != curTabTitle && type === 'closeOther') {\n");
      out.write("\t\t\t\t\t\tcloseTabsTitle.push(opt.title);\n");
      out.write("\t\t\t\t\t} else if (opt.closable && type === 'closeAll') {\n");
      out.write("\t\t\t\t\t\tcloseTabsTitle.push(opt.title);\n");
      out.write("\t\t\t\t\t}\n");
      out.write("\t\t\t\t});\n");
      out.write("\n");
      out.write("\t\t\t\tfor ( var i = 0; i < closeTabsTitle.length; i++) {\n");
      out.write("\t\t\t\t\tcenterTabs.tabs('close', closeTabsTitle[i]);\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t}\n");
      out.write("\t\t});\n");
      out.write("\t\t\n");
      out.write("\t});\n");
      out.write("\t\n");
      out.write("\tfunction addTab(node) {\n");
      out.write("\t\tif (centerTabs.tabs('exists', node.text)) {\n");
      out.write("\t\t\tcenterTabs.tabs('select', node.text);\n");
      out.write("\t\t} else {\n");
      out.write("\t\t\tif (node.attributes.url && node.attributes.url.length > 0) {\t\t\t\n");
      out.write("\t\t\t\tcenterTabs.tabs('add', {\n");
      out.write("\t\t\t\t\ttitle : node.text,\n");
      out.write("\t\t\t\t\tclosable : true,\n");
      out.write("\t\t\t\t\ticonCls : node.iconCls,\n");
      out.write("\t\t\t\t\tcontent : '<iframe src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("' + node.attributes.url + '\" frameborder=\"0\" style=\"border:0;width:100%;height:99.4%;\"></iframe>',\n");
      out.write("\t\t\t\t\ttools : [ {\n");
      out.write("\t\t\t\t\t\ticonCls : 'icon-mini-refresh',\n");
      out.write("\t\t\t\t\t\thandler : function() {\n");
      out.write("\t\t\t\t\t\t\trefreshTab(node.text);\n");
      out.write("\t\t\t\t\t\t}\n");
      out.write("\t\t\t\t\t} ]\n");
      out.write("\t\t\t\t});\n");
      out.write("\t\t\t} \n");
      out.write("\t\t}\n");
      out.write("\t}\n");
      out.write("\t\n");
      out.write("\tfunction refreshTab(title) {\n");
      out.write("\t\tvar tab = centerTabs.tabs('getTab', title);\n");
      out.write("\t\tcenterTabs.tabs('update', {\n");
      out.write("\t\t\ttab : tab,\n");
      out.write("\t\t\toptions : tab.panel('options')\n");
      out.write("\t\t});\n");
      out.write("\t}\n");
      out.write("</script>\n");
      out.write("<div id=\"centerTabs\">\n");
      out.write("\t<div title=\"Home\" data-options=\"border:false\" style=\"overflow: hidden;\">\n");
      out.write("\t\t<div style=\"margin-left:10px;margin-top:5px;line-height:20px;\"><strong style=\"color:blue;\">Frameworks and Tools</strong>\n");
      out.write("\t\t\t<ul style=\"list-style:none;margin-left:-20px;margin-top:0px;\">\n");
      out.write("\t\t\t\t<li>Java&IDE: JDK6 MyEclipse2013</li>\n");
      out.write("\t\t\t\t<li>Backend:  SpringMVC3.2.8 Spring3.2.8 Hibernate4.2.11 (Configured by annotation)</li>\n");
      out.write("\t\t\t\t<li>Frontend: JQuery-EasyUI1.3.1 Javascript JQuery Ajax (Client-side and server-side communicated by JSON)</li>\n");
      out.write("\t\t\t\t<li>Database: Oracle10g</li>\n");
      out.write("\t\t\t\t<li>Web Server: Tomcat 7</li>\n");
      out.write("\t\t\t\t<li>Build Tool: Maven</li>\n");
      out.write("\t\t\t\t<li>Linux：CentoOS 6.4</li>\n");
      out.write("\t\t\t\t<li>Other: Druid JUnit Log4j Jackson FastJson JFreeChart POI</li>\n");
      out.write("\t\t\t</ul>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<hr/>\n");
      out.write("\t\t<div style=\"margin-left:10px;margin-top:0px;line-height:20px;\"><strong style=\"color:blue;\">System Features</strong>\n");
      out.write("\t\t\t<ul style=\"list-style:none;margin-left:-20px;margin-top:0px;\">\t\n");
      out.write("\t\t\t\t<li>Migrate the application of Struts2.3+Spring3+Hibernate4 from Struts2 to SpringMVC</li>\n");
      out.write("\t\t\t\t<li>Convert database connection pool from C3P0 to Druid</li>\n");
      out.write("\t\t\t\t<br/>\n");
      out.write("\t\t\t\t<li>Management of user, role, authority, equipment and document</li>\t\t\n");
      out.write("\t\t\t\t<li>Export equipment list to Excel file using POI</li>\n");
      out.write("\t\t\t\t<li>Chart display of user statistics using JFreeChart</li>\n");
      out.write("\t\t\t\t<li>User access logs based on Spring AOP</li>\n");
      out.write("\t\t\t</ul>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<hr/>\n");
      out.write("\t\t<div style=\"margin-left:10px;margin-top:0px;line-height:20px;\"><strong style=\"color:blue;\">About</strong>\n");
      out.write("\t\t\t<ul style=\"list-style:none;margin-left:-20px;margin-top:0px;\">\n");
      out.write("\t\t\t\t<li><a href='https://github.com/ZhibingXie'>Github link</a></li>\n");
      out.write("\t\t\t\t<li><a href='http://ca.linkedin.com/in/zhibingxie'>Linkedin link</a></li>\n");
      out.write("\t\t\t</ul>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<hr/>\n");
      out.write("\t\t<div style=\"margin-left:10px;margin-top:0px;line-height:20px;\"><strong style=\"color:blue;\">Contact</strong>\n");
      out.write("\t\t\t<ul style=\"list-style:none;margin-left:-20px;margin-top:0px;\">\n");
      out.write("\t\t\t\t<li>Zhibing Xie (Downtown, Toronto, Ontario, Canada)</li>\n");
      out.write("\t\t\t\t<li>Email: zhibing.x@gmail.com</li>\n");
      out.write("\t\t\t</ul>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<hr/>\t\n");
      out.write("\t</div>\n");
      out.write("</div>\n");
      out.write("<div id=\"tabsMenu\" style=\"width: 120px;display:none;\">\n");
      out.write("\t<div type=\"refresh\">Refresh</div>\n");
      out.write("\t<div class=\"menu-sep\"></div>\n");
      out.write("\t<div type=\"close\">Close</div>\n");
      out.write("\t<div type=\"closeOther\">Close other</div>\n");
      out.write("\t<div type=\"closeAll\">Close all</div>\n");
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
