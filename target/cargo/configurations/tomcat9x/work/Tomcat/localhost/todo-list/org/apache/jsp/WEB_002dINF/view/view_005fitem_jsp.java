/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.41
 * Generated at: 2021-12-23 19:31:31 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.marinel.util.Mappings;

public final class view_005fitem_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(3);
    _jspx_dependants.put("/WEB-INF/css/style.css", Long.valueOf(1640287827130L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1640287829032L));
    _jspx_dependants.put("jar:file:/C:/Users/megat/IdeaProjects/Maven%20Projects/todo-list-spring-mvc/target/cargo/configurations/tomcat9x/webapps/todo-list/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153374282000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("com.marinel.util.Mappings");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005furl_0026_005fvar_005fvalue_005fnobody;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvar_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvar_005fvalue_005fnobody.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<!-- import the taglib to use jstl tag in jsp file -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<title>View Single Item</title>\r\n");
      out.write("<style>");
      out.write("body {\r\n");
      out.write("    max-width: 1200px;\r\n");
      out.write("    background-color: #B5B5B5;\r\n");
      out.write("    margin: 0 auto;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("caption {\r\n");
      out.write("    height: 70px;\r\n");
      out.write("}\r\n");
      out.write(".entry_title {\r\n");
      out.write("    font-size: 3em;\r\n");
      out.write("    color: #ffffff;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".entry_title_2 {\r\n");
      out.write("    font-size: 2em;\r\n");
      out.write("    color: whitesmoke;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("table {\r\n");
      out.write("    width: 100%;\r\n");
      out.write("    min-width: 16.6%;\r\n");
      out.write("    border-collapse: collapse;\r\n");
      out.write("    border-spacing: 0;\r\n");
      out.write("    border: 1px solid #ddd;\r\n");
      out.write("}\r\n");
      out.write("th, td {\r\n");
      out.write("  padding: 8px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".tr_header {\r\n");
      out.write("    background-color: indigo;\r\n");
      out.write("    color: whitesmoke;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".small_th {\r\n");
      out.write("    width: 15px;\r\n");
      out.write("    text-align: center;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".td_medium_size {\r\n");
      out.write("    width: 80px;\r\n");
      out.write("    max-width: 80px;\r\n");
      out.write("    min-width: 80px;\r\n");
      out.write("}\r\n");
      out.write(".td_right {\r\n");
      out.write("    text-align: right;\r\n");
      out.write("    background-color: #FFFFFF;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".td_left {\r\n");
      out.write("    text-align: left;\r\n");
      out.write("    background-color: #FFFFFF;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".add_link {\r\n");
      out.write("    background-color: indigo;\r\n");
      out.write("    color: whitesmoke;\r\n");
      out.write("    padding: 6px;\r\n");
      out.write("    border-radius: 5px;\r\n");
      out.write("    font-weight: bold;\r\n");
      out.write("    text-decoration: none;\r\n");
      out.write("    opacity: 75%;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".add_link:hover {\r\n");
      out.write("    opacity: 100%;\r\n");
      out.write("    text-decoration: dotted;\r\n");
      out.write("    text-decoration-color: whitesmoke;\r\n");
      out.write("    transition: 0.4s;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".view_item_link {\r\n");
      out.write("    color: #000000;\r\n");
      out.write("    font-weight: bold;\r\n");
      out.write("    text-decoration: none;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".view_item_link:hover {\r\n");
      out.write("    color: indigo;\r\n");
      out.write("    text-decoration: underline;\r\n");
      out.write("    text-decoration_color: green;\r\n");
      out.write("    transition: 0.3s;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".edit_link {\r\n");
      out.write("    color: #000000;\r\n");
      out.write("    font-weight: bold;\r\n");
      out.write("    text-decoration: none;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".edit_link:hover {\r\n");
      out.write("    color: indigo;\r\n");
      out.write("    text-decoration: underline;\r\n");
      out.write("    text-decoration_color: green;\r\n");
      out.write("    transition: 0.3s;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".delete_link {\r\n");
      out.write("    color: #000000;\r\n");
      out.write("    font-weight: bold;\r\n");
      out.write("    text-decoration: none;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".delete_link:hover {\r\n");
      out.write("    color: red;\r\n");
      out.write("    text-decoration: underline;\r\n");
      out.write("    text-decoration-color: red;\r\n");
      out.write("    transition: 0.3s;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".white_background {\r\n");
      out.write("    background-color: #FFFFFF;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".bold {\r\n");
      out.write("   font-weight: bold;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".th_id_holder {\r\n");
      out.write("    color: indigo;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".textarea {\r\n");
      out.write("    width: 100%;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".center {\r\n");
      out.write("    text-align: center;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".right {\r\n");
      out.write("    text-align: right;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".vertical_and_horizontally_center {\r\n");
      out.write("    margin: 0;\r\n");
      out.write("    position: absolute;\r\n");
      out.write("    top: 50%;\r\n");
      out.write("    left: 50%;\r\n");
      out.write("    -ms-transform: translate(-50%, -50%);\r\n");
      out.write("    transform: translate(-50%, -50%);\r\n");
      out.write("    width: 1200px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".div_add_link_holder {\r\n");
      out.write("    background-color: #FFFFFF;\r\n");
      out.write("    width: 98.3%;\r\n");
      out.write("    min-width: 15%;\r\n");
      out.write("    padding-left: 20px;\r\n");
      out.write("    padding-top: 10px;\r\n");
      out.write("    padding-bottom: 10px;\r\n");
      out.write("    margin-top: 10;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".div_title_holder {\r\n");
      out.write("    width: 100%;\r\n");
      out.write("    min-width: 15%;\r\n");
      out.write("    background-color: indigo;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".input_title {\r\n");
      out.write("    width: 100%;\r\n");
      out.write("    min-width: 16.6%;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".submit_btn {\r\n");
      out.write("    background-color: indigo;\r\n");
      out.write("    color: whitesmoke;\r\n");
      out.write("    border: none;\r\n");
      out.write("    font-weight: bold;\r\n");
      out.write("    padding: 7.5px;\r\n");
      out.write("    border-radius: 5px;\r\n");
      out.write("    opacity: 75%;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".submit_btn:hover {\r\n");
      out.write("    opacity: 100%;\r\n");
      out.write("    transition: 0.3s;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".back_link {\r\n");
      out.write("    color: whitesmoke;\r\n");
      out.write("    background-color: indigo;\r\n");
      out.write("    padding: 7px;\r\n");
      out.write("    opacity: 75%;\r\n");
      out.write("    border-radius: 5px;\r\n");
      out.write("    font-weight: bold;\r\n");
      out.write("    text-decoration: none;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".back_link:hover {\r\n");
      out.write("    opacity: 100%;\r\n");
      out.write("    transition: 0.3s;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".back_div {\r\n");
      out.write("    text-align: right;\r\n");
      out.write("    font-weight: 900;\r\n");
      out.write("    background-color: whitesmoke;\r\n");
      out.write("    border: none;\r\n");
      out.write("    padding: 10px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".div_single_item {\r\n");
      out.write("    margin: 0;\r\n");
      out.write("    position: absolute;\r\n");
      out.write("    top: 50%;\r\n");
      out.write("    left: 50%;\r\n");
      out.write("    -ms-transform: translate(-50%, -50%);\r\n");
      out.write("    transform: translate(-50%, -50%);\r\n");
      out.write("    width: 1200px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".single_item_title_holder {\r\n");
      out.write("    background-color: indigo;\r\n");
      out.write("    text-align: center;\r\n");
      out.write("    color: whitesmoke;\r\n");
      out.write("    font-weight: bold;\r\n");
      out.write("    margin-bottom: 20px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".cancel_add_item_btn {\r\n");
      out.write("    background-color: indigo;\r\n");
      out.write("    color: whitesmoke;\r\n");
      out.write("    border: none;\r\n");
      out.write("    padding-bottom: 8px;\r\n");
      out.write("    padding-top: 5px;\r\n");
      out.write("    padding-left: 8px;\r\n");
      out.write("    padding-right: 8px;\r\n");
      out.write("    border-radius: 5px;\r\n");
      out.write("    text-decoration: none;\r\n");
      out.write("    opacity: 75%;\r\n");
      out.write("    font-weight: bold;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".cancel_add_item_btn:hover {\r\n");
      out.write("    opacity: 100%;\r\n");
      out.write("    transition: 0.3s;\r\n");
      out.write("}");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("    <div class=\"div_single_item\">\r\n");
      out.write("        <div class=\"single_item_title_holder\">\r\n");
      out.write("            <h2>");
      if (_jspx_meth_c_005fout_005f0(_jspx_page_context))
        return;
      out.write("</h2>\r\n");
      out.write("        </div>\r\n");
      out.write("        <table class=\"bold\" cellpadding=\"5\">\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td class=\"white_background td_medium_size\"><label>Id</label></td>\r\n");
      out.write("                <td class=\"white_background th_id_holder\">\r\n");
      out.write("                    ");
      if (_jspx_meth_c_005fout_005f1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                </td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td class=\"white_background td_medium_size\"><label>Title</label></td>\r\n");
      out.write("                <td class=\"white_background\">\r\n");
      out.write("                    ");
      if (_jspx_meth_c_005fout_005f2(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                </td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td class=\"white_background td_medium_size\"><label>Dead Line</label></td>\r\n");
      out.write("                <td class=\"white_background\">\r\n");
      out.write("                    ");
      if (_jspx_meth_c_005fout_005f3(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                </td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td class=\"white_background td_medium_size\"><label>Details</label</td>\r\n");
      out.write("                <td class=\"white_background\">\r\n");
      out.write("                    ");
      if (_jspx_meth_c_005fout_005f4(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                </td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td class=\"white_background td_medium_size\"><label>Action</label</td>\r\n");
      out.write("                <td class=\"white_background\">\r\n");
      out.write("                    <div class=\"back_div\">\r\n");
      out.write("                           ");
      if (_jspx_meth_c_005furl_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                           <a class=\"back_link\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${tableUrl}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">Back to Tasks</a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </td>\r\n");
      out.write("            </tr>\r\n");
      out.write("        </table>\r\n");
      out.write("    </div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005fout_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f0 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    boolean _jspx_th_c_005fout_005f0_reused = false;
    try {
      _jspx_th_c_005fout_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fout_005f0.setParent(null);
      // /WEB-INF/view/view_item.jsp(13,16) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fout_005f0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${todoItem.title}", java.lang.Object.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      int _jspx_eval_c_005fout_005f0 = _jspx_th_c_005fout_005f0.doStartTag();
      if (_jspx_th_c_005fout_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f0);
      _jspx_th_c_005fout_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fout_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fout_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f1 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    boolean _jspx_th_c_005fout_005f1_reused = false;
    try {
      _jspx_th_c_005fout_005f1.setPageContext(_jspx_page_context);
      _jspx_th_c_005fout_005f1.setParent(null);
      // /WEB-INF/view/view_item.jsp(19,20) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fout_005f1.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${todoItem.id}", java.lang.Object.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      int _jspx_eval_c_005fout_005f1 = _jspx_th_c_005fout_005f1.doStartTag();
      if (_jspx_th_c_005fout_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f1);
      _jspx_th_c_005fout_005f1_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fout_005f1, _jsp_getInstanceManager(), _jspx_th_c_005fout_005f1_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f2(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f2 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    boolean _jspx_th_c_005fout_005f2_reused = false;
    try {
      _jspx_th_c_005fout_005f2.setPageContext(_jspx_page_context);
      _jspx_th_c_005fout_005f2.setParent(null);
      // /WEB-INF/view/view_item.jsp(25,20) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fout_005f2.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${todoItem.title}", java.lang.Object.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      int _jspx_eval_c_005fout_005f2 = _jspx_th_c_005fout_005f2.doStartTag();
      if (_jspx_th_c_005fout_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f2);
      _jspx_th_c_005fout_005f2_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fout_005f2, _jsp_getInstanceManager(), _jspx_th_c_005fout_005f2_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f3(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f3 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    boolean _jspx_th_c_005fout_005f3_reused = false;
    try {
      _jspx_th_c_005fout_005f3.setPageContext(_jspx_page_context);
      _jspx_th_c_005fout_005f3.setParent(null);
      // /WEB-INF/view/view_item.jsp(31,20) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fout_005f3.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${todoItem.deadLine}", java.lang.Object.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      int _jspx_eval_c_005fout_005f3 = _jspx_th_c_005fout_005f3.doStartTag();
      if (_jspx_th_c_005fout_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f3);
      _jspx_th_c_005fout_005f3_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fout_005f3, _jsp_getInstanceManager(), _jspx_th_c_005fout_005f3_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f4(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f4 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    boolean _jspx_th_c_005fout_005f4_reused = false;
    try {
      _jspx_th_c_005fout_005f4.setPageContext(_jspx_page_context);
      _jspx_th_c_005fout_005f4.setParent(null);
      // /WEB-INF/view/view_item.jsp(37,20) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fout_005f4.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${todoItem.details}", java.lang.Object.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      int _jspx_eval_c_005fout_005f4 = _jspx_th_c_005fout_005f4.doStartTag();
      if (_jspx_th_c_005fout_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f4);
      _jspx_th_c_005fout_005f4_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fout_005f4, _jsp_getInstanceManager(), _jspx_th_c_005fout_005f4_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f0 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    boolean _jspx_th_c_005furl_005f0_reused = false;
    try {
      _jspx_th_c_005furl_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005furl_005f0.setParent(null);
      // /WEB-INF/view/view_item.jsp(44,27) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005furl_005f0.setVar("tableUrl");
      // /WEB-INF/view/view_item.jsp(44,27) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005furl_005f0.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${Mappings.ITEMS}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      int _jspx_eval_c_005furl_005f0 = _jspx_th_c_005furl_005f0.doStartTag();
      if (_jspx_th_c_005furl_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f0);
      _jspx_th_c_005furl_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005furl_005f0, _jsp_getInstanceManager(), _jspx_th_c_005furl_005f0_reused);
    }
    return false;
  }
}
