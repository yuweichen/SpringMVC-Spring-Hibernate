package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class role_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../include.jsp", out, false);
      out.write("\n");
      out.write("<script type=\"text/javascript\" charset=\"utf-8\">\n");
      out.write("\tvar datagrid;\n");
      out.write("\t$(function() {\n");
      out.write("\n");
      out.write("\t\tdatagrid = $('#datagrid').datagrid({\n");
      out.write("\t\t\turl : '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/roleController/datagrid',\n");
      out.write("\t\t\ttitle : '',\n");
      out.write("\t\t\ticonCls : 'icon-save',\n");
      out.write("\t\t\tpagination : true,\n");
      out.write("\t\t\tpageSize : 10,\n");
      out.write("\t\t\tpageList : [ 10, 20, 30, 40 ],\n");
      out.write("\t\t\tfit : true,\n");
      out.write("\t\t\tfitColumns : true,\n");
      out.write("\t\t\tnowrap : false,\n");
      out.write("\t\t\tborder : false,\n");
      out.write("\t\t\tidField : 'cid',\n");
      out.write("\t\t\tsortName : 'cname',\n");
      out.write("\t\t\tsortOrder : 'desc',\n");
      out.write("\t\t\tcheckOnSelect : false,\n");
      out.write("\t\t\tselectOnCheck : true,\n");
      out.write("\t\t\tfrozenColumns : [ [ {\n");
      out.write("\t\t\t\ttitle : 'ID',\n");
      out.write("\t\t\t\tfield : 'cid',\n");
      out.write("\t\t\t\twidth : 150,\n");
      out.write("\t\t\t\tsortable : true,\n");
      out.write("\t\t\t\tcheckbox : true\n");
      out.write("\t\t\t}, {\n");
      out.write("\t\t\t\ttitle : 'Role',\n");
      out.write("\t\t\t\tfield : 'cname',\n");
      out.write("\t\t\t\twidth : 150,\n");
      out.write("\t\t\t\tsortable : true\n");
      out.write("\t\t\t} ] ],\n");
      out.write("\t\t\tcolumns : [ [ {\n");
      out.write("\t\t\t\ttitle : 'Note',\n");
      out.write("\t\t\t\tfield : 'cdesc',\n");
      out.write("\t\t\t\twidth : 150\n");
      out.write("\t\t\t}, {\n");
      out.write("\t\t\t\ttitle : 'Auth ID',\n");
      out.write("\t\t\t\tfield : 'authIds',\n");
      out.write("\t\t\t\twidth : 300,\n");
      out.write("\t\t\t\thidden : true\n");
      out.write("\t\t\t}, {\n");
      out.write("\t\t\t\ttitle : 'Authority',\n");
      out.write("\t\t\t\tfield : 'authNames',\n");
      out.write("\t\t\t\twidth : 300\n");
      out.write("\t\t\t} ] ],\n");
      out.write("\t\t\ttoolbar : [ {\n");
      out.write("\t\t\t\ttext : 'Add',\n");
      out.write("\t\t\t\ticonCls : 'icon-add',\n");
      out.write("\t\t\t\thandler : function() {\n");
      out.write("\t\t\t\t\tappend();\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t}, '-', {\n");
      out.write("\t\t\t\ttext : 'Delete',\n");
      out.write("\t\t\t\ticonCls : 'icon-remove',\n");
      out.write("\t\t\t\thandler : function() {\n");
      out.write("\t\t\t\t\tremove();\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t}, '-', {\n");
      out.write("\t\t\t\ttext : 'Edit',\n");
      out.write("\t\t\t\ticonCls : 'icon-edit',\n");
      out.write("\t\t\t\thandler : function() {\n");
      out.write("\t\t\t\t\tedit();\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t}, '-', {\n");
      out.write("\t\t\t\ttext : 'Unselect',\n");
      out.write("\t\t\t\ticonCls : 'icon-undo',\n");
      out.write("\t\t\t\thandler : function() {\n");
      out.write("\t\t\t\t\tdatagrid.datagrid('unselectAll');\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t}, '-' ],\n");
      out.write("\t\t\tonRowContextMenu : function(e, rowIndex, rowData) {\n");
      out.write("\t\t\t\te.preventDefault();\n");
      out.write("\t\t\t\t$(this).datagrid('unselectAll');\n");
      out.write("\t\t\t\t$(this).datagrid('selectRow', rowIndex);\n");
      out.write("\t\t\t\t$('#menu').menu('show', {\n");
      out.write("\t\t\t\t\tleft : e.pageX,\n");
      out.write("\t\t\t\t\ttop : e.pageY\n");
      out.write("\t\t\t\t});\n");
      out.write("\t\t\t}\n");
      out.write("\t\t});\n");
      out.write("\n");
      out.write("\t});\n");
      out.write("\n");
      out.write("\tfunction append() {\n");
      out.write("\t\tvar p = parent.sy.dialog({\n");
      out.write("\t\t\ttitle : 'Add role',\n");
      out.write("\t\t\thref : '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/roleController/roleAdd',\n");
      out.write("\t\t\twidth : 460,\n");
      out.write("\t\t\theight : 260,\n");
      out.write("\t\t\tbuttons : [ {\n");
      out.write("\t\t\t\ttext : 'Add',\n");
      out.write("\t\t\t\thandler : function() {\n");
      out.write("\t\t\t\t\tvar f = p.find('form');\n");
      out.write("\t\t\t\t\tf.form('submit', {\n");
      out.write("\t\t\t\t\t\turl : '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/roleController/add',\n");
      out.write("\t\t\t\t\t\tsuccess : function(d) {\n");
      out.write("\t\t\t\t\t\t\tvar json = $.parseJSON(d);\n");
      out.write("\t\t\t\t\t\t\tif (json.success) {\n");
      out.write("\t\t\t\t\t\t\t\tdatagrid.datagrid('reload');\n");
      out.write("\t\t\t\t\t\t\t\tp.dialog('close');\n");
      out.write("\t\t\t\t\t\t\t}\n");
      out.write("\t\t\t\t\t\t\tparent.sy.messagerShow({\n");
      out.write("\t\t\t\t\t\t\t\tmsg : json.msg,\n");
      out.write("\t\t\t\t\t\t\t\ttitle : 'Message'\n");
      out.write("\t\t\t\t\t\t\t});\n");
      out.write("\t\t\t\t\t\t}\n");
      out.write("\t\t\t\t\t});\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t} ],\n");
      out.write("\t\t\tonLoad : function() {\n");
      out.write("\t\t\t\tvar f = p.find('form');\n");
      out.write("\t\t\t\tvar authIds = f.find('input[name=authIds]');\n");
      out.write("\t\t\t\tvar authIdsTree = authIds.combotree({\n");
      out.write("\t\t\t\t\tlines : true,\n");
      out.write("\t\t\t\t\turl : '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/authController/doNotNeedSession_treeRecursive',\n");
      out.write("\t\t\t\t\tcheckbox : true,\n");
      out.write("\t\t\t\t\tmultiple : true\n");
      out.write("\t\t\t\t});\n");
      out.write("\t\t\t}\n");
      out.write("\t\t});\n");
      out.write("\t}\n");
      out.write("\t\n");
      out.write("\tfunction edit() {\n");
      out.write("\t\tvar rows = datagrid.datagrid('getSelections');\n");
      out.write("\t\tif (rows.length == 1) {\n");
      out.write("\t\t\tvar p = parent.sy.dialog({\n");
      out.write("\t\t\t\ttitle : 'Edit role',\n");
      out.write("\t\t\t\thref : '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/roleController/roleEdit',\n");
      out.write("\t\t\t\twidth : 460,\n");
      out.write("\t\t\t\theight : 260,\n");
      out.write("\t\t\t\tbuttons : [ {\n");
      out.write("\t\t\t\t\ttext : 'Edit',\n");
      out.write("\t\t\t\t\thandler : function() {\n");
      out.write("\t\t\t\t\t\tvar f = p.find('form');\n");
      out.write("\t\t\t\t\t\tf.form('submit', {\n");
      out.write("\t\t\t\t\t\t\turl : '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/roleController/edit',\n");
      out.write("\t\t\t\t\t\t\tsuccess : function(d) {\n");
      out.write("\t\t\t\t\t\t\t\tvar json = $.parseJSON(d);\n");
      out.write("\t\t\t\t\t\t\t\tif (json.success) {\n");
      out.write("\t\t\t\t\t\t\t\t\tdatagrid.datagrid('reload');\n");
      out.write("\t\t\t\t\t\t\t\t\tp.dialog('close');\n");
      out.write("\t\t\t\t\t\t\t\t}\n");
      out.write("\t\t\t\t\t\t\t\tparent.sy.messagerShow({\n");
      out.write("\t\t\t\t\t\t\t\t\tmsg : json.msg,\n");
      out.write("\t\t\t\t\t\t\t\t\ttitle : 'Message'\n");
      out.write("\t\t\t\t\t\t\t\t});\n");
      out.write("\t\t\t\t\t\t\t}\n");
      out.write("\t\t\t\t\t\t});\n");
      out.write("\t\t\t\t\t}\n");
      out.write("\t\t\t\t} ],\n");
      out.write("\t\t\t\tonLoad : function() {\n");
      out.write("\t\t\t\t\tvar f = p.find('form');\n");
      out.write("\t\t\t\t\tvar authIds = f.find('input[name=authIds]');\n");
      out.write("\t\t\t\t\tvar authIdsTree = authIds.combotree({\n");
      out.write("\t\t\t\t\t\tlines : true,\n");
      out.write("\t\t\t\t\t\turl : '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/authController/doNotNeedSession_treeRecursive',\n");
      out.write("\t\t\t\t\t\tcheckbox : true,\n");
      out.write("\t\t\t\t\t\tmultiple : true,\n");
      out.write("\t\t\t\t\t\tonLoadSuccess : function() {\n");
      out.write("\t\t\t\t\t\t\tparent.$.messager.progress('close');\n");
      out.write("\t\t\t\t\t\t}\n");
      out.write("\t\t\t\t\t});\n");
      out.write("\t\t\t\t\tf.form('load', {\n");
      out.write("\t\t\t\t\t\tcid : rows[0].cid,\n");
      out.write("\t\t\t\t\t\tcname : rows[0].cname,\n");
      out.write("\t\t\t\t\t\tcdesc : rows[0].cdesc,\n");
      out.write("\t\t\t\t\t\tauthIds : sy.getList(rows[0].authIds)\n");
      out.write("\t\t\t\t\t});\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t});\n");
      out.write("\t\t} else {\n");
      out.write("\t\t\tparent.sy.messagerAlert('Message', 'Please select one to edit', 'error');\n");
      out.write("\t\t}\n");
      out.write("\t}\n");
      out.write("\n");
      out.write("\tfunction remove() {\n");
      out.write("\t\tvar rows = datagrid.datagrid('getChecked');\n");
      out.write("\t\tvar ids = [];\n");
      out.write("\t\tif (rows.length > 0) {\n");
      out.write("\t\t\tparent.sy.messagerConfirm('Confirm', 'Are you sure to delete?', function(r) {\n");
      out.write("\t\t\t\tif (r) {\n");
      out.write("\t\t\t\t\tfor ( var i = 0; i < rows.length; i++) {\n");
      out.write("\t\t\t\t\t\tids.push(rows[i].cid);\n");
      out.write("\t\t\t\t\t}\n");
      out.write("\t\t\t\t\t$.ajax({\n");
      out.write("\t\t\t\t\t\turl : '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/roleController/delete',\n");
      out.write("\t\t\t\t\t\tdata : {\n");
      out.write("\t\t\t\t\t\t\tids : ids.join(',')\n");
      out.write("\t\t\t\t\t\t},\n");
      out.write("\t\t\t\t\t\tdataType : 'json',\n");
      out.write("\t\t\t\t\t\tsuccess : function(d) {\n");
      out.write("\t\t\t\t\t\t\tdatagrid.datagrid('load');\n");
      out.write("\t\t\t\t\t\t\tdatagrid.datagrid('unselectAll');\n");
      out.write("\t\t\t\t\t\t\tparent.sy.messagerShow({\n");
      out.write("\t\t\t\t\t\t\t\ttitle : 'Message',\n");
      out.write("\t\t\t\t\t\t\t\tmsg : d.msg\n");
      out.write("\t\t\t\t\t\t\t});\n");
      out.write("\t\t\t\t\t\t}\n");
      out.write("\t\t\t\t\t});\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t});\n");
      out.write("\t\t} else {\n");
      out.write("\t\t\tparent.sy.messagerAlert('Message', 'Please select one to delete', 'error');\n");
      out.write("\t\t}\n");
      out.write("\t}\n");
      out.write("</script>\n");
      out.write("</head>\n");
      out.write("<body class=\"easyui-layout\" data-options=\"fit:true\">\n");
      out.write("\t<div data-options=\"region:'center',border:false\" style=\"overflow: hidden;\">\n");
      out.write("\t\t<table id=\"datagrid\"></table>\n");
      out.write("\t</div>\n");
      out.write("\n");
      out.write("\t<div id=\"menu\" class=\"easyui-menu\" style=\"width:120px;display: none;\">\n");
      out.write("\t\t<div onclick=\"append();\" data-options=\"iconCls:'icon-add'\">Add</div>\n");
      out.write("\t\t<div onclick=\"remove();\" data-options=\"iconCls:'icon-remove'\">Delete</div>\n");
      out.write("\t\t<div onclick=\"edit();\" data-options=\"iconCls:'icon-edit'\">Edit</div>\n");
      out.write("\t</div>\n");
      out.write("</body>\n");
      out.write("</html>");
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
