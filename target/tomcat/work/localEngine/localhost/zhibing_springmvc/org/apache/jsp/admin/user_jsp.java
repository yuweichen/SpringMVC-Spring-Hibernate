package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class user_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("/userController/datagrid',\n");
      out.write("\t\t\ttitle : 'Userlist',\n");
      out.write("\t\t\ticonCls : 'icon-save',\n");
      out.write("\t\t\tpagination : true,\n");
      out.write("\t\t\tpagePosition : 'bottom',\n");
      out.write("\t\t\tpageSize : 10,\n");
      out.write("\t\t\tpageList : [ 10, 20, 30, 40 ],\n");
      out.write("\t\t\tfit : true,\n");
      out.write("\t\t\tfitColumns : false,\n");
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
      out.write("\t\t\t\ttitle : 'Username',\n");
      out.write("\t\t\t\tfield : 'cname',\n");
      out.write("\t\t\t\twidth : 150,\n");
      out.write("\t\t\t\tsortable : true\n");
      out.write("\t\t\t} ] ],\n");
      out.write("\t\t\tcolumns : [ [ {\n");
      out.write("\t\t\t\ttitle : 'Password',\n");
      out.write("\t\t\t\tfield : 'cpwd',\n");
      out.write("\t\t\t\twidth : 100,\n");
      out.write("\t\t\t\tformatter : function(value, rowData, rowIndex) {\n");
      out.write("\t\t\t\t\treturn '******';\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t}, {\n");
      out.write("\t\t\t\ttitle : 'Created datetime',\n");
      out.write("\t\t\t\tfield : 'ccreatedatetime',\n");
      out.write("\t\t\t\tsortable : true,\n");
      out.write("\t\t\t\twidth : 150\n");
      out.write("\t\t\t}, {\n");
      out.write("\t\t\t\ttitle : 'Modified datetime',\n");
      out.write("\t\t\t\tfield : 'cmodifydatetime',\n");
      out.write("\t\t\t\tsortable : true,\n");
      out.write("\t\t\t\twidth : 150\n");
      out.write("\t\t\t}, {\n");
      out.write("\t\t\t\ttitle : 'RoleID',\n");
      out.write("\t\t\t\tfield : 'roleIds',\n");
      out.write("\t\t\t\twidth : 150,\n");
      out.write("\t\t\t\thidden : true\n");
      out.write("\t\t\t}, {\n");
      out.write("\t\t\t\ttitle : 'Role',\n");
      out.write("\t\t\t\tfield : 'roleNames',\n");
      out.write("\t\t\t\twidth : 150\n");
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
      out.write("\t\t\t\ttext : 'Batch edit role',\n");
      out.write("\t\t\t\ticonCls : 'icon-edit',\n");
      out.write("\t\t\t\thandler : function() {\n");
      out.write("\t\t\t\t\teditRole();\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t}, '-', {\n");
      out.write("\t\t\t\ttext : 'Unselect',\n");
      out.write("\t\t\t\ticonCls : 'icon-undo',\n");
      out.write("\t\t\t\thandler : function() {\n");
      out.write("\t\t\t\t\tdatagrid.datagrid('clearSelections');\n");
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
      out.write("\t\n");
      out.write("\tfunction append() {\n");
      out.write("\t\tvar p = parent.sy.dialog({\n");
      out.write("\t\t\ttitle : 'Add user',\n");
      out.write("\t\t\thref : '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/userController/userAdd',\n");
      out.write("\t\t\twidth : 500,\n");
      out.write("\t\t\theight : 200,\n");
      out.write("\t\t\tbuttons : [ {\n");
      out.write("\t\t\t\ttext : 'Add',\n");
      out.write("\t\t\t\thandler : function() {\n");
      out.write("\t\t\t\t\tvar f = p.find('form');\n");
      out.write("\t\t\t\t\tf.form('submit', {\n");
      out.write("\t\t\t\t\t\turl : '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/userController/add',\n");
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
      out.write("\t\t\t\tvar roleIds = f.find('input[name=roleIds]');\n");
      out.write("\t\t\t\tvar roleIdsCombobox = roleIds.combobox({\n");
      out.write("\t\t\t\t\turl : '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/roleController/doNotNeedSession_combobox',\n");
      out.write("\t\t\t\t\tvalueField : 'cid',\n");
      out.write("\t\t\t\t\ttextField : 'cname',\n");
      out.write("\t\t\t\t\tmultiple : true,\n");
      out.write("\t\t\t\t\teditable : false,\n");
      out.write("\t\t\t\t\tpanelHeight : 'auto'\n");
      out.write("\t\t\t\t});\n");
      out.write("\t\t\t}\n");
      out.write("\t\t});\n");
      out.write("\t}\n");
      out.write("\t\n");
      out.write("\tfunction edit() {\n");
      out.write("\t\tvar rows = datagrid.datagrid('getSelections');\n");
      out.write("\t\tif (rows.length == 1) {\n");
      out.write("\t\t\tvar p = parent.sy.dialog({\n");
      out.write("\t\t\t\ttitle : 'Edit user',\n");
      out.write("\t\t\t\thref : '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/userController/userEdit',\n");
      out.write("\t\t\t\twidth : 500,\n");
      out.write("\t\t\t\theight : 200,\n");
      out.write("\t\t\t\tbuttons : [ {\n");
      out.write("\t\t\t\t\ttext : 'Edit',\n");
      out.write("\t\t\t\t\thandler : function() {\n");
      out.write("\t\t\t\t\t\tvar f = p.find('form');\n");
      out.write("\t\t\t\t\t\tf.form('submit', {\n");
      out.write("\t\t\t\t\t\t\turl : '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/userController/edit',\n");
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
      out.write("\t\t\t\t\tvar roleIds = f.find('input[name=roleIds]');\n");
      out.write("\t\t\t\t\tvar roleIdsCombobox = roleIds.combobox({\n");
      out.write("\t\t\t\t\t\turl : '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/roleController/doNotNeedSession_combobox',\n");
      out.write("\t\t\t\t\t\tvalueField : 'cid',\n");
      out.write("\t\t\t\t\t\ttextField : 'cname',\n");
      out.write("\t\t\t\t\t\tmultiple : true,\n");
      out.write("\t\t\t\t\t\teditable : false,\n");
      out.write("\t\t\t\t\t\tpanelHeight : 'auto',\n");
      out.write("\t\t\t\t\t\tonLoadSuccess : function() {\n");
      out.write("\t\t\t\t\t\t\tparent.$.messager.progress('close');\n");
      out.write("\t\t\t\t\t\t}\n");
      out.write("\t\t\t\t\t});\n");
      out.write("\t\t\t\t\tf.form('load', {\n");
      out.write("\t\t\t\t\t\tcid : rows[0].cid,\n");
      out.write("\t\t\t\t\t\tcname : rows[0].cname,\n");
      out.write("\t\t\t\t\t\troleIds : sy.getList(rows[0].roleIds),\n");
      out.write("\t\t\t\t\t\tccreatedatetime : rows[0].ccreatedatetime,\n");
      out.write("\t\t\t//\t\t\tcmodifydatetime : rows[0].cmodifydatetime\n");
      out.write("\t\t\t\t\t});\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t});\n");
      out.write("\t\t} \n");
      out.write("\t\telse {\n");
      out.write("\t\t\tparent.sy.messagerAlert('Message', 'Please select one to edit', 'error');\n");
      out.write("\t\t}\n");
      out.write("\t}\n");
      out.write("\t\n");
      out.write("\tfunction remove() {\n");
      out.write("\t\tvar rows = datagrid.datagrid('getChecked');\n");
      out.write("\t\tvar ids = [];\n");
      out.write("\t\tif (rows.length > 0) {\n");
      out.write("\t\t\tparent.sy.messagerConfirm('Confirm', 'Are you sure to delete', function(r) {\n");
      out.write("\t\t\t\tif (r) {\n");
      out.write("\t\t\t\t\tfor ( var i = 0; i < rows.length; i++) {\n");
      out.write("\t\t\t\t\t\tids.push(rows[i].cid);\n");
      out.write("\t\t\t\t\t}\n");
      out.write("\t\t\t\t\t$.ajax({\n");
      out.write("\t\t\t\t\t\turl : '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/userController/delete',\n");
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
      out.write("\t\n");
      out.write("\tfunction editRole() {\n");
      out.write("\t\tvar rows = datagrid.datagrid('getSelections');\n");
      out.write("\t\tvar ids = [];\n");
      out.write("\t\tif (rows.length > 0) {\n");
      out.write("\t\t\tfor ( var i = 0; i < rows.length; i++) {\n");
      out.write("\t\t\t\tids.push(rows[i].cid);\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\tvar p = parent.sy.dialog({\n");
      out.write("\t\t\t\ttitle : 'Batch edit role',\n");
      out.write("\t\t\t\thref : '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/userController/userRoleEdit',\n");
      out.write("\t\t\t\twidth : 250,\n");
      out.write("\t\t\t\theight : 130,\n");
      out.write("\t\t\t\tbuttons : [ {\n");
      out.write("\t\t\t\t\ttext : 'Edit',\n");
      out.write("\t\t\t\t\thandler : function() {\n");
      out.write("\t\t\t\t\t\tvar f = p.find('form');\n");
      out.write("\t\t\t\t\t\tf.form('submit', {\n");
      out.write("\t\t\t\t\t\t\turl : '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/userController/roleEdit',\n");
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
      out.write("\t\t\t\t\tvar idsInput = f.find('input[name=ids]');\n");
      out.write("\t\t\t\t\tvar roleIds = f.find('input[name=roleIds]');\n");
      out.write("\t\t\t\t\tvar roleIdsCombobox = roleIds.combobox({\n");
      out.write("\t\t\t\t\t\turl : '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/roleController/doNotNeedSession_combobox',\n");
      out.write("\t\t\t\t\t\tvalueField : 'cid',\n");
      out.write("\t\t\t\t\t\ttextField : 'cname',\n");
      out.write("\t\t\t\t\t\tmultiple : true,\n");
      out.write("\t\t\t\t\t\teditable : false,\n");
      out.write("\t\t\t\t\t\tpanelHeight : 'auto',\n");
      out.write("\t\t\t\t\t\tonLoadSuccess : function() {\n");
      out.write("\t\t\t\t\t\t\tf.form('load', {\n");
      out.write("\t\t\t\t\t\t\t\tids : ids.join(',')\n");
      out.write("\t\t\t\t\t\t\t});\n");
      out.write("\t\t\t\t\t\t}\n");
      out.write("\t\t\t\t\t});\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t});\n");
      out.write("\t\t} else {\n");
      out.write("\t\t\tparent.sy.messagerAlert('Message', 'Please select one to edit', 'error');\n");
      out.write("\t\t}\n");
      out.write("\t}\n");
      out.write("\t\n");
      out.write("\tfunction userSearch() {\n");
      out.write("\t\tdatagrid.datagrid('load', sy.serializeObject($('#searchForm')));\n");
      out.write("\t}\n");
      out.write("\t\n");
      out.write("\tfunction clearAndSearch() {\n");
      out.write("\t\tdatagrid.datagrid('load', {});\n");
      out.write("\t\t$('#searchForm input').val('');\n");
      out.write("\t}\n");
      out.write("</script>\n");
      out.write("</head>\n");
      out.write("<body class=\"easyui-layout\" data-options=\"fit:true\">\n");
      out.write("\t<div data-options=\"region:'north',border:false,title:'Search'\" style=\"height: 60px;overflow: hidden;\" align=\"left\">\n");
      out.write("\t\t<form id=\"searchForm\">\n");
      out.write("\t\t\t<strong style=\"margin-left:10px;\"> Username: </strong><input name=\"cname\" style=\"width:100px;\" /></td>\n");
      out.write("\t\t\t<a href=\"javascript:void(0);\" class=\"easyui-linkbutton\" data-options=\"iconCls:'icon-search',plain:true\" onclick=\"userSearch();\">Search</a>\n");
      out.write("\t\t\t<a href=\"javascript:void(0);\" class=\"easyui-linkbutton\" data-options=\"iconCls:'icon-cancel',plain:true\" onclick=\"clearAndSearch();\">Clear</a>\n");
      out.write("\t\t</form>\n");
      out.write("\t</div>\n");
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